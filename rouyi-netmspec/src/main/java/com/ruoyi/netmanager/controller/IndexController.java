package com.ruoyi.netmanager.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.netmanager.domain.asset.Index;
import com.ruoyi.netmanager.service.IIndexService;
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
 * 指标Controller
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
@RestController
@RequestMapping("/netmanager/index")
public class IndexController extends BaseController
{
    @Autowired
    private IIndexService indexService;

    /**
     * 查询指标列表
     */
    @PreAuthorize("@ss.hasPermi('netmanager:index:list')")
    @GetMapping("/list")
    public TableDataInfo list(Index index)
    {
        startPage();
        List<Index> list = indexService.selectIndexList(index);
        return getDataTable(list);
    }

    /**
     * 导出指标列表
     */
    @PreAuthorize("@ss.hasPermi('netmanager:index:export')")
    @Log(title = "指标", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Index index)
    {
        List<Index> list = indexService.selectIndexList(index);
        ExcelUtil<Index> util = new ExcelUtil<Index>(Index.class);
        util.exportExcel(response, list, "指标数据");
    }

    /**
     * 获取指标详细信息
     */
    @PreAuthorize("@ss.hasPermi('netmanager:index:query')")
    @GetMapping(value = "/{indexId}")
    public AjaxResult getInfo(@PathVariable("indexId") Long indexId)
    {
        return success(indexService.selectIndexByIndexId(indexId));
    }

    /**
     * 新增指标
     */
    @PreAuthorize("@ss.hasPermi('netmanager:index:add')")
    @Log(title = "指标", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Index index)
    {
        return toAjax(indexService.insertIndex(index));
    }

    /**
     * 修改指标
     */
    @PreAuthorize("@ss.hasPermi('netmanager:index:edit')")
    @Log(title = "指标", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Index index)
    {
        return toAjax(indexService.updateIndex(index));
    }

    /**
     * 删除指标
     */
    @PreAuthorize("@ss.hasPermi('netmanager:index:remove')")
    @Log(title = "指标", businessType = BusinessType.DELETE)
	@DeleteMapping("/{indexIds}")
    public AjaxResult remove(@PathVariable Long[] indexIds)
    {
        return toAjax(indexService.deleteIndexByIndexIds(indexIds));
    }
}
