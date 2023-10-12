package com.ruoyi.netmanager.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 逻辑类型
 * @author  
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {
    /**
     * 逻辑类型名称
     */
    private String categoryName = "";
    
    /**
     * 显示名称
     */
    private String displayName = "";

    @Override
    public String toString() {
        return displayName;
    }
}
