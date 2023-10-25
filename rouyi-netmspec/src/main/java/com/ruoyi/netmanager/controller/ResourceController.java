package com.ruoyi.netmanager.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.netmanager.domain.asset.Resource;
import com.ruoyi.netmanager.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 资源Controller
 *
 * @author ruoyi
 * @date 2023-10-24
 */
@RestController
@RequestMapping("/netmanager/resource")
public class ResourceController extends BaseController {
    @Autowired
    private IResourceService resourceService;

    /**
     * 查询资源列表
     */
    @PreAuthorize("@ss.hasPermi('netmanager:resource:list')")
    @GetMapping("/list")
    public TableDataInfo list(Resource resource) {
        startPage();
        List<Resource> list = resourceService.selectResourceList(resource);
        return getDataTable(list);
    }

    /**
     * 导出资源列表
     */
    @PreAuthorize("@ss.hasPermi('netmanager:resource:export')")
    @Log(title = "资源", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Resource resource) {
        List<Resource> list = resourceService.selectResourceList(resource);
        ExcelUtil<Resource> util = new ExcelUtil<Resource>(Resource.class);
        util.exportExcel(response, list, "资源数据");
    }

    /**
     * 获取资源详细信息
     */
    @PreAuthorize("@ss.hasPermi('netmanager:resource:query')")
    @GetMapping(value = "/{resourceId}")
    public AjaxResult getInfo(@PathVariable("resourceId") Long resourceId) {
        return success(resourceService.selectResourceByResourceId(resourceId));
    }

    /**
     * 新增资源
     */
    @PreAuthorize("@ss.hasPermi('netmanager:resource:add')")
    @Log(title = "资源", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Resource resource) {
        return toAjax(resourceService.insertResource(resource));
    }

    /**
     * 修改资源
     */
    @PreAuthorize("@ss.hasPermi('netmanager:resource:edit')")
    @Log(title = "资源", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Resource resource) {
        return toAjax(resourceService.updateResource(resource));
    }

    /**
     * 删除资源
     */
    @PreAuthorize("@ss.hasPermi('netmanager:resource:remove')")
    @Log(title = "资源", businessType = BusinessType.DELETE)
    @DeleteMapping("/{resourceIds}")
    public AjaxResult remove(@PathVariable Long[] resourceIds) {
        return toAjax(resourceService.deleteResourceByResourceIds(resourceIds));
    }
}
