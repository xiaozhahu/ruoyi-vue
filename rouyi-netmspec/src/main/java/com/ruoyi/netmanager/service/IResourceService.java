package com.ruoyi.netmanager.service;

import com.ruoyi.netmanager.domain.asset.Resource;

import java.util.List;

/**
 * 资源Service接口
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
public interface IResourceService 
{
    /**
     * 查询资源
     * 
     * @param resourceId 资源主键
     * @return 资源
     */
    public Resource selectResourceByResourceId(Long resourceId);

    /**
     * 查询资源列表
     * 
     * @param resource 资源
     * @return 资源集合
     */
    public List<Resource> selectResourceList(Resource resource);

    /**
     * 新增资源
     * 
     * @param resource 资源
     * @return 结果
     */
    public int insertResource(Resource resource);

    /**
     * 修改资源
     * 
     * @param resource 资源
     * @return 结果
     */
    public int updateResource(Resource resource);

    /**
     * 批量删除资源
     * 
     * @param resourceIds 需要删除的资源主键集合
     * @return 结果
     */
    public int deleteResourceByResourceIds(Long[] resourceIds);

    /**
     * 删除资源信息
     * 
     * @param resourceId 资源主键
     * @return 结果
     */
    public int deleteResourceByResourceId(Long resourceId);
}
