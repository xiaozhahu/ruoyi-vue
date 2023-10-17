package com.ruoyi.netmanager.domain.asset;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author old.lazy.sexy
 * @description  资源实例: 光翔系统|光翔内存|光翔处理器 等
 * @date 2023-10-17
 */
@Getter
@Setter
public class Resource extends BaseEntity {
    private String name;
    private String desc;
    private String resourceType;
}
