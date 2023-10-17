package com.ruoyi.netmanager.domain.topo;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Link extends BaseEntity {
    private Long fromNode;
    private Long toNode;
    /**  连通|断开|未知 */
    private String status;
    /**  所属网络 */
    private String network;
}
