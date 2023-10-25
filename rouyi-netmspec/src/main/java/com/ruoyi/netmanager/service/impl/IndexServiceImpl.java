package com.ruoyi.netmanager.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.netmanager.domain.asset.Index;
import com.ruoyi.netmanager.mapper.IndexMapper;
import com.ruoyi.netmanager.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 指标Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
@Service
public class IndexServiceImpl implements IIndexService
{
    @Autowired
    private IndexMapper indexMapper;

    /**
     * 查询指标
     * 
     * @param indexId 指标主键
     * @return 指标
     */
    @Override
    public Index selectIndexByIndexId(Long indexId)
    {
        return indexMapper.selectIndexByIndexId(indexId);
    }

    /**
     * 查询指标列表
     * 
     * @param index 指标
     * @return 指标
     */
    @Override
    public List<Index> selectIndexList(Index index)
    {
        return indexMapper.selectIndexList(index);
    }

    /**
     * 新增指标
     * 
     * @param index 指标
     * @return 结果
     */
    @Override
    public int insertIndex(Index index)
    {
        index.setCreateTime(DateUtils.getNowDate());
        return indexMapper.insertIndex(index);
    }

    /**
     * 修改指标
     * 
     * @param index 指标
     * @return 结果
     */
    @Override
    public int updateIndex(Index index)
    {
        index.setUpdateTime(DateUtils.getNowDate());
        return indexMapper.updateIndex(index);
    }

    /**
     * 批量删除指标
     * 
     * @param indexIds 需要删除的指标主键
     * @return 结果
     */
    @Override
    public int deleteIndexByIndexIds(Long[] indexIds)
    {
        return indexMapper.deleteIndexByIndexIds(indexIds);
    }

    /**
     * 删除指标信息
     * 
     * @param indexId 指标主键
     * @return 结果
     */
    @Override
    public int deleteIndexByIndexId(Long indexId)
    {
        return indexMapper.deleteIndexByIndexId(indexId);
    }
}
