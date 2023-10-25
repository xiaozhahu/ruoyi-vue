package com.ruoyi.netmanager.mapper;

import com.ruoyi.netmanager.domain.asset.Device;

import java.util.List;

/**
 * 设备Mapper接口
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
public interface DeviceMapper 
{
    /**
     * 查询设备
     * 
     * @param deviceId 设备主键
     * @return 设备
     */
    public Device selectDeviceByDeviceId(Long deviceId);

    /**
     * 查询设备列表
     * 
     * @param device 设备
     * @return 设备集合
     */
    public List<Device> selectDeviceList(Device device);

    /**
     * 新增设备
     * 
     * @param device 设备
     * @return 结果
     */
    public int insertDevice(Device device);

    /**
     * 修改设备
     * 
     * @param device 设备
     * @return 结果
     */
    public int updateDevice(Device device);

    /**
     * 删除设备
     * 
     * @param deviceId 设备主键
     * @return 结果
     */
    public int deleteDeviceByDeviceId(Long deviceId);

    /**
     * 批量删除设备
     * 
     * @param deviceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDeviceByDeviceIds(Long[] deviceIds);
}
