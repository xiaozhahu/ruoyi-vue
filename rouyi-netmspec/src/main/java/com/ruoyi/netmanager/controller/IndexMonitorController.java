package com.ruoyi.netmanager.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.netmanager.domain.asset.IndexMonitor;
import com.ruoyi.netmanager.service.IIndexMonitorService;
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
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 指标监视器Controller
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
@RestController
@RequestMapping("/netmanager/indexmonitor")
public class IndexMonitorController extends BaseController
{
    @Autowired
    private IIndexMonitorService indexMonitorService;

    /**
     * 查询指标监视器列表
     */
    @PreAuthorize("@ss.hasPermi('netmanager:indexmonitor:list')")
    @GetMapping("/list")
    public TableDataInfo list(IndexMonitor indexMonitor)
    {
        startPage();
        List<IndexMonitor> list = indexMonitorService.selectIndexMonitorList(indexMonitor);
        return getDataTable(list);
    }

    /**
     * 导出指标监视器列表
     */
    @PreAuthorize("@ss.hasPermi('netmanager:indexmonitor:export')")
    @Log(title = "指标监视器", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IndexMonitor indexMonitor)
    {
        List<IndexMonitor> list = indexMonitorService.selectIndexMonitorList(indexMonitor);
        ExcelUtil<IndexMonitor> util = new ExcelUtil<IndexMonitor>(IndexMonitor.class);
        util.exportExcel(response, list, "指标监视器数据");
    }

    /**
     * 获取指标监视器详细信息
     */
    @PreAuthorize("@ss.hasPermi('netmanager:indexmonitor:query')")
    @GetMapping(value = "/{monitorId}")
    public AjaxResult getInfo(@PathVariable("monitorId") Long monitorId)
    {
        return success(indexMonitorService.selectIndexMonitorByMonitorId(monitorId));
    }

    /**
     * 新增指标监视器
     */
    @PreAuthorize("@ss.hasPermi('netmanager:indexmonitor:add')")
    @Log(title = "指标监视器", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IndexMonitor indexMonitor)
    {
        return toAjax(indexMonitorService.insertIndexMonitor(indexMonitor));
    }

    /**
     * 修改指标监视器
     */
    @PreAuthorize("@ss.hasPermi('netmanager:indexmonitor:edit')")
    @Log(title = "指标监视器", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IndexMonitor indexMonitor)
    {
        return toAjax(indexMonitorService.updateIndexMonitor(indexMonitor));
    }

    /**
     * 删除指标监视器
     */
    @PreAuthorize("@ss.hasPermi('netmanager:indexmonitor:remove')")
    @Log(title = "指标监视器", businessType = BusinessType.DELETE)
	@DeleteMapping("/{monitorIds}")
    public AjaxResult remove(@PathVariable Long[] monitorIds)
    {
        return toAjax(indexMonitorService.deleteIndexMonitorByMonitorIds(monitorIds));
    }
}
