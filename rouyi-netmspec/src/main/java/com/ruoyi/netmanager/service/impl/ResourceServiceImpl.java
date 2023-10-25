package com.ruoyi.netmanager.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.netmanager.domain.asset.Resource;
import com.ruoyi.netmanager.mapper.ResourceMapper;
import com.ruoyi.netmanager.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 资源Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
@Service
public class ResourceServiceImpl implements IResourceService
{
    @Autowired
    private ResourceMapper resourceMapper;

    /**
     * 查询资源
     * 
     * @param resourceId 资源主键
     * @return 资源
     */
    @Override
    public Resource selectResourceByResourceId(Long resourceId)
    {
        return resourceMapper.selectResourceByResourceId(resourceId);
    }

    /**
     * 查询资源列表
     * 
     * @param resource 资源
     * @return 资源
     */
    @Override
    public List<Resource> selectResourceList(Resource resource)
    {
        return resourceMapper.selectResourceList(resource);
    }

    /**
     * 新增资源
     * 
     * @param resource 资源
     * @return 结果
     */
    @Override
    public int insertResource(Resource resource)
    {
        resource.setCreateTime(DateUtils.getNowDate());
        return resourceMapper.insertResource(resource);
    }

    /**
     * 修改资源
     * 
     * @param resource 资源
     * @return 结果
     */
    @Override
    public int updateResource(Resource resource)
    {
        resource.setUpdateTime(DateUtils.getNowDate());
        return resourceMapper.updateResource(resource);
    }

    /**
     * 批量删除资源
     * 
     * @param resourceIds 需要删除的资源主键
     * @return 结果
     */
    @Override
    public int deleteResourceByResourceIds(Long[] resourceIds)
    {
        return resourceMapper.deleteResourceByResourceIds(resourceIds);
    }

    /**
     * 删除资源信息
     * 
     * @param resourceId 资源主键
     * @return 结果
     */
    @Override
    public int deleteResourceByResourceId(Long resourceId)
    {
        return resourceMapper.deleteResourceByResourceId(resourceId);
    }
}
