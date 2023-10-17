package com.ruoyi.netmanager.domain.vo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

/**
 * @author old.lazy.sexy
 * @description 数据分析-资源使用率
 * @date 2023-10-17
 */
@Getter
@Setter
public class StatisticUtilizationVo implements Serializable {

    /**  cpu|memory|bandwidth|throughput */
    @NotEmpty
    private List<String> indexes;

    /**  top | last */
    private String trend = "top";

    @Max(20)
    private Long rank = 5L;

}
