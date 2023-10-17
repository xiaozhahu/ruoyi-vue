package com.ruoyi.netmanager.domain.asset;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author old.lazy.sexy
 * @description 指标实例: cup使用率|内存使用率 等
 * @date 2023-10-17
 */
@Getter
@Setter
public class Index extends BaseEntity {

    private String name;

    private String resourceType;

    private String oid;
}
