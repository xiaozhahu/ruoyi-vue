package com.ruoyi.netmanager.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.netmanager.domain.asset.TrapMonitor;
import com.ruoyi.netmanager.service.ITrapMonitorService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * Trap监视器Controller
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
@RestController
@RequestMapping("/netmanager/trapmonitor")
public class TrapMonitorController extends BaseController
{
    @Autowired
    private ITrapMonitorService trapMonitorService;

    /**
     * 查询Trap监视器列表
     */
    @PreAuthorize("@ss.hasPermi('netmanager:trapmonitor:list')")
    @GetMapping("/list")
    public TableDataInfo list(TrapMonitor trapMonitor)
    {
        startPage();
        List<TrapMonitor> list = trapMonitorService.selectTrapMonitorList(trapMonitor);
        return getDataTable(list);
    }

    /**
     * 导出Trap监视器列表
     */
    @PreAuthorize("@ss.hasPermi('netmanager:trapmonitor:export')")
    @Log(title = "Trap监视器", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TrapMonitor trapMonitor)
    {
        List<TrapMonitor> list = trapMonitorService.selectTrapMonitorList(trapMonitor);
        ExcelUtil<TrapMonitor> util = new ExcelUtil<TrapMonitor>(TrapMonitor.class);
        util.exportExcel(response, list, "Trap监视器数据");
    }

    /**
     * 获取Trap监视器详细信息
     */
    @PreAuthorize("@ss.hasPermi('netmanager:trapmonitor:query')")
    @GetMapping(value = "/{monitorId}")
    public AjaxResult getInfo(@PathVariable("monitorId") Long monitorId)
    {
        return success(trapMonitorService.selectTrapMonitorByMonitorId(monitorId));
    }

    /**
     * 新增Trap监视器
     */
    @PreAuthorize("@ss.hasPermi('netmanager:trapmonitor:add')")
    @Log(title = "Trap监视器", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TrapMonitor trapMonitor)
    {
        return toAjax(trapMonitorService.insertTrapMonitor(trapMonitor));
    }

    /**
     * 修改Trap监视器
     */
    @PreAuthorize("@ss.hasPermi('netmanager:trapmonitor:edit')")
    @Log(title = "Trap监视器", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TrapMonitor trapMonitor)
    {
        return toAjax(trapMonitorService.updateTrapMonitor(trapMonitor));
    }

    /**
     * 删除Trap监视器
     */
    @PreAuthorize("@ss.hasPermi('netmanager:trapmonitor:remove')")
    @Log(title = "Trap监视器", businessType = BusinessType.DELETE)
	@DeleteMapping("/{monitorIds}")
    public AjaxResult remove(@PathVariable Long[] monitorIds)
    {
        return toAjax(trapMonitorService.deleteTrapMonitorByMonitorIds(monitorIds));
    }
}
