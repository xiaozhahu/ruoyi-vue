package com.ruoyi.netmanager.service;

import com.ruoyi.common.core.redis.RedisCache;
import com.ruoyi.netmanager.constant.NetmCacheKey;
import com.ruoyi.netmanager.domain.vo.StatisticUtilizationVo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author old.lazy.sexy
 * @description 统计服务
 * @date 2023-10-07
 */
@Service
public class StatisticService {

    @Autowired
    private RedisCache redisCache;

    @PostConstruct
    public void mockData() {
        String cpuKey = NetmCacheKey.STATISTIC_UTILIZATION_MAP_KEY.get("cpu");
        redisCache.addZSet(cpuKey, "192.168.0.1", 23.1);
        redisCache.addZSet(cpuKey, "192.168.0.100", 21.0);
        redisCache.addZSet(cpuKey, "192.168.0.101", 33.8);
        redisCache.addZSet(cpuKey, "192.168.0.102", 4.1);
        redisCache.addZSet(cpuKey, "192.168.0.103", 7.5);

        String memoryKey = NetmCacheKey.STATISTIC_UTILIZATION_MAP_KEY.get("memory");
        redisCache.addZSet(memoryKey, "192.168.0.1", 26.1);
        redisCache.addZSet(memoryKey, "192.168.0.100", 16.0);
        redisCache.addZSet(memoryKey, "192.168.0.101", 37.8);
        redisCache.addZSet(memoryKey, "192.168.0.102", 59.1);
        redisCache.addZSet(memoryKey, "192.168.0.103", 7.5);

        String bandwidthKey = NetmCacheKey.STATISTIC_UTILIZATION_MAP_KEY.get("bandwidth");
        redisCache.addZSet(bandwidthKey, "192.168.0.1", 16.1);
        redisCache.addZSet(bandwidthKey, "192.168.0.100", 6.0);
        redisCache.addZSet(bandwidthKey, "192.168.0.101", 17.8);
        redisCache.addZSet(bandwidthKey, "192.168.0.102", 39.1);
        redisCache.addZSet(bandwidthKey, "192.168.0.103", 47.5);

        String throughputKey = NetmCacheKey.STATISTIC_UTILIZATION_MAP_KEY.get("throughput");
        redisCache.addZSet(throughputKey, "192.168.0.1", 16.1);
        redisCache.addZSet(throughputKey, "192.168.0.100", 6.0);
        redisCache.addZSet(throughputKey, "192.168.0.101", 17.8);
        redisCache.addZSet(throughputKey, "192.168.0.102", 39.1);
        redisCache.addZSet(throughputKey, "192.168.0.103", 47.5);
    }

    public Map<String, Object> base() {
        Map<String, Object> dataMap = new HashMap<>();

        dataMap.put("networks", 10);
        dataMap.put("resources", 10);

        dataMap.put("devices", 10);
        dataMap.put("offlineDevices", 1);

        dataMap.put("links", 10);
        dataMap.put("brokenLinks", 1);

        dataMap.put("alarms", 10);
        dataMap.put("unconfirmedAlarms", 0);

        dataMap.put("jobs", 10);
        dataMap.put("exceptionJobs", 10);
        return dataMap;
    }

    public Map<String, Object> networkHeath() {
        Map<String, Object> dataMap = new HashMap<>();

        dataMap.put("deviceOnlineRate", 100);
        dataMap.put("deviceHealthyRate", 10);
        dataMap.put("linkableRate", 10);

        return dataMap;
    }

    public List<DeviceCategoryCounter> deviceTypes() {
        List<DeviceCategoryCounter> counters = new ArrayList<>();
        counters.add(DeviceCategoryCounter.builder().deviceType("服务器").count(5L).build());
        counters.add(DeviceCategoryCounter.builder().deviceType("路由器").count(2L).build());
        counters.add(DeviceCategoryCounter.builder().deviceType("交换机").count(1L).build());
        return counters;
    }

    public List<ResourceCategoryCounter> resourceTypes() {
        List<ResourceCategoryCounter> counters = new ArrayList<>();
        counters.add(ResourceCategoryCounter.builder().resourceType("网络接口").count(40L).build());
        counters.add(ResourceCategoryCounter.builder().resourceType("处理器").count(8L).build());
        counters.add(ResourceCategoryCounter.builder().resourceType("内存").count(8L).build());
        counters.add(ResourceCategoryCounter.builder().resourceType("系统").count(8L).build());
        return counters;
    }

    public List<AlarmLevelCounter> alarmLevels() {
        List<AlarmLevelCounter> counters = new ArrayList<>();
        counters.add(AlarmLevelCounter.builder().alarmLevel("离线").count(2L).build());
        counters.add(AlarmLevelCounter.builder().alarmLevel("严重").count(0L).build());
        counters.add(AlarmLevelCounter.builder().alarmLevel("主要").count(1L).build());
        counters.add(AlarmLevelCounter.builder().alarmLevel("次要").count(4L).build());
        counters.add(AlarmLevelCounter.builder().alarmLevel("未知").count(3L).build());
        return counters;
    }

    public Map<String, Map<String, Double>> performance(StatisticUtilizationVo condition) {
        HashMap<String, Map<String, Double>> performanceMap = new HashMap<>();
        condition.getIndexes()
                .stream()
                .forEach(index -> performanceMap.put(index,
                        redisCache.getZSetReverseRange(NetmCacheKey.STATISTIC_UTILIZATION_MAP_KEY.get(index), 1L, condition.getRank())
                        .stream()
                        .collect(Collectors.toMap( ZSetOperations.TypedTuple::getValue,
                                ZSetOperations.TypedTuple::getScore))));

        return performanceMap;
    }

    @Getter
    @Setter
    @Builder
    private class DeviceCategoryCounter {
        private String deviceType;
        private Long count;
    }

    @Getter
    @Setter
    @Builder
    private class ResourceCategoryCounter {
        private String resourceType;
        private Long count;
    }

    @Getter
    @Setter
    @Builder
    private class AlarmLevelCounter {
        private String alarmLevel;
        private Long count;
    }
}
