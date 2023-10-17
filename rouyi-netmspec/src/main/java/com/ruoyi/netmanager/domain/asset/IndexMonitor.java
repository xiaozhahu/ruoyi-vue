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
public class IndexMonitor extends BaseEntity {

    private String name;

    /**  故障监视器|性能监视器|状态监视器 */
    private String monitorType;

    private String resourceType;

    private String index;

    /**  运算式 */
    private String expression;

    /**  监视周期: 每*秒 */
    private String cron;

    private String oid;
}
