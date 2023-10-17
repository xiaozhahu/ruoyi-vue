package com.ruoyi.netmanager.domain.asset;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author old.lazy.sexy
 * @description 指标: cup使用率|内存使用率 等
 * @date 2023-10-17
 */
@Getter
@Setter
public class TrapMonitor extends BaseEntity {

    private String name;

    private String trapOid;

    private String formatter;

    /**  输出方式: 告警|事件 */
    private String outType;

    /**  trap事件类型: 认证相关|授权相关|内核相关 等*/
    private String eventType;

    /**  时间优先级: 低级|中级|高级|紧急 */
    private String eventPriority;

    private String index;

    /**  运算式 */
    private String expression;

    /**  监视周期: 每*秒 */
    private String cron;

    private String oid;
}
