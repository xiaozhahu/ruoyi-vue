package com.ruoyi.netmanager.mapper;

import com.ruoyi.netmanager.domain.asset.IndexMonitor;

import java.util.List;

/**
 * 指标监视器Mapper接口
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
public interface IndexMonitorMapper 
{
    /**
     * 查询指标监视器
     * 
     * @param monitorId 指标监视器主键
     * @return 指标监视器
     */
    public IndexMonitor selectIndexMonitorByMonitorId(Long monitorId);

    /**
     * 查询指标监视器列表
     * 
     * @param indexMonitor 指标监视器
     * @return 指标监视器集合
     */
    public List<IndexMonitor> selectIndexMonitorList(IndexMonitor indexMonitor);

    /**
     * 新增指标监视器
     * 
     * @param indexMonitor 指标监视器
     * @return 结果
     */
    public int insertIndexMonitor(IndexMonitor indexMonitor);

    /**
     * 修改指标监视器
     * 
     * @param indexMonitor 指标监视器
     * @return 结果
     */
    public int updateIndexMonitor(IndexMonitor indexMonitor);

    /**
     * 删除指标监视器
     * 
     * @param monitorId 指标监视器主键
     * @return 结果
     */
    public int deleteIndexMonitorByMonitorId(Long monitorId);

    /**
     * 批量删除指标监视器
     * 
     * @param monitorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIndexMonitorByMonitorIds(Long[] monitorIds);
}
