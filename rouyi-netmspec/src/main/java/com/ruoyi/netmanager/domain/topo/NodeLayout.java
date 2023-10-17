package com.ruoyi.netmanager.domain.topo;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

@Getter
@Setter
public class NodeLayout extends BaseEntity {
    private Long nodeId;
    private BigDecimal cpu;
    private BigDecimal memory;
    private BigDecimal storage;
}
