package com.ruoyi.netmanager.domain.vo;

import java.io.Serializable;

/**
 * @author old.lazy.sexy
 * @description
 * @date 2023-10-17
 */
public class IndexVo implements Serializable {

    /**  表示几个标准的资源类型: cpu|memory|band|data */
    private String resource;

    private String interval;

    private String fromDate;

    private String toDate;

    private String aggregation;

    private Long rows;
}
