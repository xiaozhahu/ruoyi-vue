package com.ruoyi.netmanager.domain.asset;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备对象 netm_device
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
public class Device extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long deviceId;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String name;

    /** 描述信息 */
    @Excel(name = "描述信息")
    private String desc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String model;

    /** 设备类别 */
    @Excel(name = "设备类别")
    private String category;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String firmwareSuffix;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String icon;

    /** 资源发现方法 */
    @Excel(name = "资源发现方法")
    private String discoveryWay;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String backgroundImage;

    /** 监控协议 */
    @Excel(name = "监控协议")
    private String protocol;

    /** web访问地址 */
    @Excel(name = "web访问地址")
    private String webUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sysOid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer enabled;

    /** 是否锁定在拓扑图中的位置 */
    @Excel(name = "是否锁定在拓扑图中的位置")
    private Integer topoLocked;

    /** 是否在拓扑图中显示资源名称 */
    @Excel(name = "是否在拓扑图中显示资源名称")
    private Integer topoShowName;

    /** 是否在全屏模式下显示该设备类型 */
    @Excel(name = "是否在全屏模式下显示该设备类型")
    private Integer topoFullScreen;

    /** 系统描述包含匹配 */
    @Excel(name = "系统描述包含匹配")
    private String descContainMatcher;

    public void setDeviceId(Long deviceId) 
    {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() 
    {
        return deviceId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDesc(String desc) 
    {
        this.desc = desc;
    }

    public String getDesc() 
    {
        return desc;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setFirmwareSuffix(String firmwareSuffix) 
    {
        this.firmwareSuffix = firmwareSuffix;
    }

    public String getFirmwareSuffix() 
    {
        return firmwareSuffix;
    }
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }
    public void setDiscoveryWay(String discoveryWay) 
    {
        this.discoveryWay = discoveryWay;
    }

    public String getDiscoveryWay() 
    {
        return discoveryWay;
    }
    public void setBackgroundImage(String backgroundImage) 
    {
        this.backgroundImage = backgroundImage;
    }

    public String getBackgroundImage() 
    {
        return backgroundImage;
    }
    public void setProtocol(String protocol) 
    {
        this.protocol = protocol;
    }

    public String getProtocol() 
    {
        return protocol;
    }
    public void setWebUrl(String webUrl) 
    {
        this.webUrl = webUrl;
    }

    public String getWebUrl() 
    {
        return webUrl;
    }
    public void setSysOid(String sysOid) 
    {
        this.sysOid = sysOid;
    }

    public String getSysOid() 
    {
        return sysOid;
    }
    public void setEnabled(Integer enabled) 
    {
        this.enabled = enabled;
    }

    public Integer getEnabled() 
    {
        return enabled;
    }
    public void setTopoLocked(Integer topoLocked) 
    {
        this.topoLocked = topoLocked;
    }

    public Integer getTopoLocked() 
    {
        return topoLocked;
    }
    public void setTopoShowName(Integer topoShowName) 
    {
        this.topoShowName = topoShowName;
    }

    public Integer getTopoShowName() 
    {
        return topoShowName;
    }
    public void setTopoFullScreen(Integer topoFullScreen) 
    {
        this.topoFullScreen = topoFullScreen;
    }

    public Integer getTopoFullScreen() 
    {
        return topoFullScreen;
    }
    public void setDescContainMatcher(String descContainMatcher) 
    {
        this.descContainMatcher = descContainMatcher;
    }

    public String getDescContainMatcher() 
    {
        return descContainMatcher;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deviceId", getDeviceId())
            .append("name", getName())
            .append("desc", getDesc())
            .append("model", getModel())
            .append("category", getCategory())
            .append("firmwareSuffix", getFirmwareSuffix())
            .append("icon", getIcon())
            .append("discoveryWay", getDiscoveryWay())
            .append("backgroundImage", getBackgroundImage())
            .append("protocol", getProtocol())
            .append("webUrl", getWebUrl())
            .append("sysOid", getSysOid())
            .append("enabled", getEnabled())
            .append("topoLocked", getTopoLocked())
            .append("topoShowName", getTopoShowName())
            .append("topoFullScreen", getTopoFullScreen())
            .append("descContainMatcher", getDescContainMatcher())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
