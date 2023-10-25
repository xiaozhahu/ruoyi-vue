package com.ruoyi.netmanager.domain.asset;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * Trap监视器对象 netm_trap_monitor
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
public class TrapMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long monitorId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String trapOid;

    /** 监视器描述 */
    @Excel(name = "监视器描述")
    private String desc;

    /** trap消息模板 */
    @Excel(name = "trap消息模板")
    private String formatter;

    /** 展现方式 */
    @Excel(name = "展现方式")
    private String displayMode;

    /** 时间类型 */
    @Excel(name = "时间类型")
    private String eventType;

    /** 事件优先级 */
    @Excel(name = "事件优先级")
    private String priority;

    /** trap版本 */
    @Excel(name = "trap版本")
    private String trapVersion;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String v1StandardType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String v1PrivateType;

    /** 资源类型 */
    @Excel(name = "资源类型")
    private String resource;

    /** trap消息中对应的资源oid */
    @Excel(name = "trap消息中对应的资源oid")
    private String resourceOid;

    /** trap消息中监视的值oid */
    @Excel(name = "trap消息中监视的值oid")
    private String valueOid;

    /** trap消息中对应的描述iod */
    @Excel(name = "trap消息中对应的描述iod")
    private String descOid;

    /** 监控的指标 */
    @Excel(name = "监控的指标")
    private String index;

    /** 判断条件操作符 */
    @Excel(name = "判断条件操作符")
    private String operator;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long seriousThreshold;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long primaryThreshold;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long secondaryThreshold;

    /** 故障原因设定 */
    @Excel(name = "故障原因设定")
    private String cause;

    /** 是否需要特殊解析器 */
    @Excel(name = "是否需要特殊解析器")
    private Integer specialParser;

    /** 特殊解析器算法 */
    @Excel(name = "特殊解析器算法")
    private String parserProcessor;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer enabled;

    public void setMonitorId(Long monitorId) 
    {
        this.monitorId = monitorId;
    }

    public Long getMonitorId() 
    {
        return monitorId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setTrapOid(String trapOid) 
    {
        this.trapOid = trapOid;
    }

    public String getTrapOid() 
    {
        return trapOid;
    }
    public void setDesc(String desc) 
    {
        this.desc = desc;
    }

    public String getDesc() 
    {
        return desc;
    }
    public void setFormatter(String formatter) 
    {
        this.formatter = formatter;
    }

    public String getFormatter() 
    {
        return formatter;
    }
    public void setDisplayMode(String displayMode) 
    {
        this.displayMode = displayMode;
    }

    public String getDisplayMode() 
    {
        return displayMode;
    }
    public void setEventType(String eventType) 
    {
        this.eventType = eventType;
    }

    public String getEventType() 
    {
        return eventType;
    }
    public void setPriority(String priority) 
    {
        this.priority = priority;
    }

    public String getPriority() 
    {
        return priority;
    }
    public void setTrapVersion(String trapVersion) 
    {
        this.trapVersion = trapVersion;
    }

    public String getTrapVersion() 
    {
        return trapVersion;
    }
    public void setV1StandardType(String v1StandardType) 
    {
        this.v1StandardType = v1StandardType;
    }

    public String getV1StandardType() 
    {
        return v1StandardType;
    }
    public void setV1PrivateType(String v1PrivateType) 
    {
        this.v1PrivateType = v1PrivateType;
    }

    public String getV1PrivateType() 
    {
        return v1PrivateType;
    }
    public void setResource(String resource) 
    {
        this.resource = resource;
    }

    public String getResource() 
    {
        return resource;
    }
    public void setResourceOid(String resourceOid) 
    {
        this.resourceOid = resourceOid;
    }

    public String getResourceOid() 
    {
        return resourceOid;
    }
    public void setValueOid(String valueOid) 
    {
        this.valueOid = valueOid;
    }

    public String getValueOid() 
    {
        return valueOid;
    }
    public void setDescOid(String descOid) 
    {
        this.descOid = descOid;
    }

    public String getDescOid() 
    {
        return descOid;
    }
    public void setIndex(String index) 
    {
        this.index = index;
    }

    public String getIndex() 
    {
        return index;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }
    public void setSeriousThreshold(Long seriousThreshold) 
    {
        this.seriousThreshold = seriousThreshold;
    }

    public Long getSeriousThreshold() 
    {
        return seriousThreshold;
    }
    public void setPrimaryThreshold(Long primaryThreshold) 
    {
        this.primaryThreshold = primaryThreshold;
    }

    public Long getPrimaryThreshold() 
    {
        return primaryThreshold;
    }
    public void setSecondaryThreshold(Long secondaryThreshold) 
    {
        this.secondaryThreshold = secondaryThreshold;
    }

    public Long getSecondaryThreshold() 
    {
        return secondaryThreshold;
    }
    public void setCause(String cause) 
    {
        this.cause = cause;
    }

    public String getCause() 
    {
        return cause;
    }
    public void setSpecialParser(Integer specialParser) 
    {
        this.specialParser = specialParser;
    }

    public Integer getSpecialParser() 
    {
        return specialParser;
    }
    public void setParserProcessor(String parserProcessor) 
    {
        this.parserProcessor = parserProcessor;
    }

    public String getParserProcessor() 
    {
        return parserProcessor;
    }
    public void setEnabled(Integer enabled) 
    {
        this.enabled = enabled;
    }

    public Integer getEnabled() 
    {
        return enabled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("monitorId", getMonitorId())
            .append("name", getName())
            .append("trapOid", getTrapOid())
            .append("desc", getDesc())
            .append("formatter", getFormatter())
            .append("displayMode", getDisplayMode())
            .append("eventType", getEventType())
            .append("priority", getPriority())
            .append("trapVersion", getTrapVersion())
            .append("v1StandardType", getV1StandardType())
            .append("v1PrivateType", getV1PrivateType())
            .append("resource", getResource())
            .append("resourceOid", getResourceOid())
            .append("valueOid", getValueOid())
            .append("descOid", getDescOid())
            .append("index", getIndex())
            .append("operator", getOperator())
            .append("seriousThreshold", getSeriousThreshold())
            .append("primaryThreshold", getPrimaryThreshold())
            .append("secondaryThreshold", getSecondaryThreshold())
            .append("cause", getCause())
            .append("specialParser", getSpecialParser())
            .append("parserProcessor", getParserProcessor())
            .append("enabled", getEnabled())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
