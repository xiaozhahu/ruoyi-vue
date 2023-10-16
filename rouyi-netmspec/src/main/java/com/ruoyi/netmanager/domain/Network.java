package com.ruoyi.netmanager.domain;


import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class Network extends BaseEntity {
    @NotBlank(message = "网络名称不能为空")
    private String name;

    private Long[] nodes;

    private Long[] links;
}
