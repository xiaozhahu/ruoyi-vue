package com.ruoyi.netmanager.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.netmanager.domain.asset.TrapMonitor;
import com.ruoyi.netmanager.mapper.TrapMonitorMapper;
import com.ruoyi.netmanager.service.ITrapMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Trap监视器Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
@Service
public class TrapMonitorServiceImpl implements ITrapMonitorService
{
    @Autowired
    private TrapMonitorMapper trapMonitorMapper;

    /**
     * 查询Trap监视器
     * 
     * @param monitorId Trap监视器主键
     * @return Trap监视器
     */
    @Override
    public TrapMonitor selectTrapMonitorByMonitorId(Long monitorId)
    {
        return trapMonitorMapper.selectTrapMonitorByMonitorId(monitorId);
    }

    /**
     * 查询Trap监视器列表
     * 
     * @param trapMonitor Trap监视器
     * @return Trap监视器
     */
    @Override
    public List<TrapMonitor> selectTrapMonitorList(TrapMonitor trapMonitor)
    {
        return trapMonitorMapper.selectTrapMonitorList(trapMonitor);
    }

    /**
     * 新增Trap监视器
     * 
     * @param trapMonitor Trap监视器
     * @return 结果
     */
    @Override
    public int insertTrapMonitor(TrapMonitor trapMonitor)
    {
        trapMonitor.setCreateTime(DateUtils.getNowDate());
        return trapMonitorMapper.insertTrapMonitor(trapMonitor);
    }

    /**
     * 修改Trap监视器
     * 
     * @param trapMonitor Trap监视器
     * @return 结果
     */
    @Override
    public int updateTrapMonitor(TrapMonitor trapMonitor)
    {
        trapMonitor.setUpdateTime(DateUtils.getNowDate());
        return trapMonitorMapper.updateTrapMonitor(trapMonitor);
    }

    /**
     * 批量删除Trap监视器
     * 
     * @param monitorIds 需要删除的Trap监视器主键
     * @return 结果
     */
    @Override
    public int deleteTrapMonitorByMonitorIds(Long[] monitorIds)
    {
        return trapMonitorMapper.deleteTrapMonitorByMonitorIds(monitorIds);
    }

    /**
     * 删除Trap监视器信息
     * 
     * @param monitorId Trap监视器主键
     * @return 结果
     */
    @Override
    public int deleteTrapMonitorByMonitorId(Long monitorId)
    {
        return trapMonitorMapper.deleteTrapMonitorByMonitorId(monitorId);
    }
}
