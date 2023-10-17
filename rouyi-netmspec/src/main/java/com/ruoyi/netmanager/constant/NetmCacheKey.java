package com.ruoyi.netmanager.constant;

import java.util.Map;

/**
 * @author old.lazy.sexy
 * @description
 * @date 2023-10-17
 */
public class NetmCacheKey {

    public static final Map<String, String> STATISTIC_UTILIZATION_MAP_KEY = Map.of(
            "cpu", "NETM:STATISTIC:CPU:UTILIZATION",
            "memory", "NETM:STATISTIC:MEMORY:UTILIZATION",
            "bandwidth", "NETM:STATISTIC:BANDWIDTH:UTILIZATION",
            "throughput", "NETM:STATISTIC:THROUGHPUT:UTILIZATION"
    );
}
