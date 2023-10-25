package com.ruoyi.netmanager.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.netmanager.domain.asset.IndexMonitor;
import com.ruoyi.netmanager.mapper.IndexMonitorMapper;
import com.ruoyi.netmanager.service.IIndexMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 指标监视器Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
@Service
public class IndexMonitorServiceImpl implements IIndexMonitorService
{
    @Autowired
    private IndexMonitorMapper indexMonitorMapper;

    /**
     * 查询指标监视器
     * 
     * @param monitorId 指标监视器主键
     * @return 指标监视器
     */
    @Override
    public IndexMonitor selectIndexMonitorByMonitorId(Long monitorId)
    {
        return indexMonitorMapper.selectIndexMonitorByMonitorId(monitorId);
    }

    /**
     * 查询指标监视器列表
     * 
     * @param indexMonitor 指标监视器
     * @return 指标监视器
     */
    @Override
    public List<IndexMonitor> selectIndexMonitorList(IndexMonitor indexMonitor)
    {
        return indexMonitorMapper.selectIndexMonitorList(indexMonitor);
    }

    /**
     * 新增指标监视器
     * 
     * @param indexMonitor 指标监视器
     * @return 结果
     */
    @Override
    public int insertIndexMonitor(IndexMonitor indexMonitor)
    {
        indexMonitor.setCreateTime(DateUtils.getNowDate());
        return indexMonitorMapper.insertIndexMonitor(indexMonitor);
    }

    /**
     * 修改指标监视器
     * 
     * @param indexMonitor 指标监视器
     * @return 结果
     */
    @Override
    public int updateIndexMonitor(IndexMonitor indexMonitor)
    {
        indexMonitor.setUpdateTime(DateUtils.getNowDate());
        return indexMonitorMapper.updateIndexMonitor(indexMonitor);
    }

    /**
     * 批量删除指标监视器
     * 
     * @param monitorIds 需要删除的指标监视器主键
     * @return 结果
     */
    @Override
    public int deleteIndexMonitorByMonitorIds(Long[] monitorIds)
    {
        return indexMonitorMapper.deleteIndexMonitorByMonitorIds(monitorIds);
    }

    /**
     * 删除指标监视器信息
     * 
     * @param monitorId 指标监视器主键
     * @return 结果
     */
    @Override
    public int deleteIndexMonitorByMonitorId(Long monitorId)
    {
        return indexMonitorMapper.deleteIndexMonitorByMonitorId(monitorId);
    }
}
