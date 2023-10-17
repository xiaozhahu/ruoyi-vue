package com.ruoyi.netmanager.domain.asset;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author old.lazy.sexy
 * @description 设备类型: 服务器|交换机|路由器 等
 * @date 2023-10-17
 */
@Getter
@Setter
public class DeviceCategory extends BaseEntity {

    private String deviceType;
}
