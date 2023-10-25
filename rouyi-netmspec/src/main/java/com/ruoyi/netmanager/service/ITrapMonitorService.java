package com.ruoyi.netmanager.service;

import com.ruoyi.netmanager.domain.asset.TrapMonitor;

import java.util.List;

/**
 * Trap监视器Service接口
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
public interface ITrapMonitorService 
{
    /**
     * 查询Trap监视器
     * 
     * @param monitorId Trap监视器主键
     * @return Trap监视器
     */
    public TrapMonitor selectTrapMonitorByMonitorId(Long monitorId);

    /**
     * 查询Trap监视器列表
     * 
     * @param trapMonitor Trap监视器
     * @return Trap监视器集合
     */
    public List<TrapMonitor> selectTrapMonitorList(TrapMonitor trapMonitor);

    /**
     * 新增Trap监视器
     * 
     * @param trapMonitor Trap监视器
     * @return 结果
     */
    public int insertTrapMonitor(TrapMonitor trapMonitor);

    /**
     * 修改Trap监视器
     * 
     * @param trapMonitor Trap监视器
     * @return 结果
     */
    public int updateTrapMonitor(TrapMonitor trapMonitor);

    /**
     * 批量删除Trap监视器
     * 
     * @param monitorIds 需要删除的Trap监视器主键集合
     * @return 结果
     */
    public int deleteTrapMonitorByMonitorIds(Long[] monitorIds);

    /**
     * 删除Trap监视器信息
     * 
     * @param monitorId Trap监视器主键
     * @return 结果
     */
    public int deleteTrapMonitorByMonitorId(Long monitorId);
}
