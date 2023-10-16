package com.ruoyi.netmanager.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Link extends BaseEntity {
    private Long fromNode;
    private Long toNode;
    private String state;
}
