package com.ruoyi.netmanager.domain.asset;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 资源对象 netm_resource
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
public class Resource extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long resourceId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String icon;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String category;

    /** 资源识别码,暂时仅支持oid */
    @Excel(name = "资源识别码,暂时仅支持oid")
    private String code;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String protocol;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String discoveryWay;

    /** 资源名称 */
    @Excel(name = "资源名称")
    private String paramName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String paramValue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String paramDesc;

    /** 父资源 */
    @Excel(name = "父资源")
    private String parent;

    /** 不可管理资源是否需要特殊显示 */
    @Excel(name = "不可管理资源是否需要特殊显示")
    private Integer unManagedStyle;

    /** 是否支持连接 */
    @Excel(name = "是否支持连接")
    private Integer linkable;

    /** 是否提升为设备 */
    @Excel(name = "是否提升为设备")
    private Integer deviceImproved;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer enabled;

    /** 是否显示图层靠前 */
    @Excel(name = "是否显示图层靠前")
    private Integer upperLayer;

    public void setResourceId(Long resourceId) 
    {
        this.resourceId = resourceId;
    }

    public Long getResourceId() 
    {
        return resourceId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setProtocol(String protocol) 
    {
        this.protocol = protocol;
    }

    public String getProtocol() 
    {
        return protocol;
    }
    public void setDiscoveryWay(String discoveryWay) 
    {
        this.discoveryWay = discoveryWay;
    }

    public String getDiscoveryWay() 
    {
        return discoveryWay;
    }
    public void setParamName(String paramName) 
    {
        this.paramName = paramName;
    }

    public String getParamName() 
    {
        return paramName;
    }
    public void setParamValue(String paramValue) 
    {
        this.paramValue = paramValue;
    }

    public String getParamValue() 
    {
        return paramValue;
    }
    public void setParamDesc(String paramDesc) 
    {
        this.paramDesc = paramDesc;
    }

    public String getParamDesc() 
    {
        return paramDesc;
    }
    public void setParent(String parent) 
    {
        this.parent = parent;
    }

    public String getParent() 
    {
        return parent;
    }
    public void setUnManagedStyle(Integer unManagedStyle) 
    {
        this.unManagedStyle = unManagedStyle;
    }

    public Integer getUnManagedStyle() 
    {
        return unManagedStyle;
    }
    public void setLinkable(Integer linkable) 
    {
        this.linkable = linkable;
    }

    public Integer getLinkable() 
    {
        return linkable;
    }
    public void setDeviceImproved(Integer deviceImproved) 
    {
        this.deviceImproved = deviceImproved;
    }

    public Integer getDeviceImproved() 
    {
        return deviceImproved;
    }
    public void setEnabled(Integer enabled) 
    {
        this.enabled = enabled;
    }

    public Integer getEnabled() 
    {
        return enabled;
    }
    public void setUpperLayer(Integer upperLayer) 
    {
        this.upperLayer = upperLayer;
    }

    public Integer getUpperLayer() 
    {
        return upperLayer;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("resourceId", getResourceId())
            .append("name", getName())
            .append("icon", getIcon())
            .append("category", getCategory())
            .append("code", getCode())
            .append("protocol", getProtocol())
            .append("discoveryWay", getDiscoveryWay())
            .append("paramName", getParamName())
            .append("paramValue", getParamValue())
            .append("paramDesc", getParamDesc())
            .append("parent", getParent())
            .append("unManagedStyle", getUnManagedStyle())
            .append("linkable", getLinkable())
            .append("deviceImproved", getDeviceImproved())
            .append("enabled", getEnabled())
            .append("upperLayer", getUpperLayer())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}
