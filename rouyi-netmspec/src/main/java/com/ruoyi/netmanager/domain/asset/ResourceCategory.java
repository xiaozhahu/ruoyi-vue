package com.ruoyi.netmanager.domain.asset;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author old.lazy.sexy
 * @description 资源类型: 系统|内存|处理器 等
 * @date 2023-10-17
 */
@Getter
@Setter
public class ResourceCategory extends BaseEntity {

    private String resourceType;
}
