package com.ruoyi.netmanager.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

@Getter
@Setter
public class Node extends BaseEntity {
    @Pattern(regexp = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$")
    private String ip;
    private String deviceType;
    private String desc;

    private BigDecimal cpu;
    private BigDecimal memory;
    private BigDecimal storage;
}
