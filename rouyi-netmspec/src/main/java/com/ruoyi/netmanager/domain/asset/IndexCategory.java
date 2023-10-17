package com.ruoyi.netmanager.domain.asset;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author old.lazy.sexy
 * @description 指标类型: 运行状态|流量 等
 * @date 2023-10-17
 */
@Getter
@Setter
public class IndexCategory extends BaseEntity {

    private String name;

    private String resourceType;

    private String oid;
}
