package com.ruoyi.netmanager.mapper;

import com.ruoyi.netmanager.domain.asset.Index;

import java.util.List;

/**
 * 指标Mapper接口
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
public interface IndexMapper 
{
    /**
     * 查询指标
     * 
     * @param indexId 指标主键
     * @return 指标
     */
    public Index selectIndexByIndexId(Long indexId);

    /**
     * 查询指标列表
     * 
     * @param index 指标
     * @return 指标集合
     */
    public List<Index> selectIndexList(Index index);

    /**
     * 新增指标
     * 
     * @param index 指标
     * @return 结果
     */
    public int insertIndex(Index index);

    /**
     * 修改指标
     * 
     * @param index 指标
     * @return 结果
     */
    public int updateIndex(Index index);

    /**
     * 删除指标
     * 
     * @param indexId 指标主键
     * @return 结果
     */
    public int deleteIndexByIndexId(Long indexId);

    /**
     * 批量删除指标
     * 
     * @param indexIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIndexByIndexIds(Long[] indexIds);
}
