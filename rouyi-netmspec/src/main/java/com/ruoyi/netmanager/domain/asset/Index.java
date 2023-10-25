package com.ruoyi.netmanager.domain.asset;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 指标对象 netm_index
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
public class Index extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long indexId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String category;

    /** 指标单位 */
    @Excel(name = "指标单位")
    private String unit;

    /** 过滤规则 */
    @Excel(name = "过滤规则")
    private String alarmFilter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String param;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** 指标关键程度 */
    @Excel(name = "指标关键程度")
    private Long priority;

    /** 指标数值类型 */
    @Excel(name = "指标数值类型")
    private String valueType;

    /** 指标描述 */
    @Excel(name = "指标描述")
    private String desc;

    public void setIndexId(Long indexId) 
    {
        this.indexId = indexId;
    }

    public Long getIndexId() 
    {
        return indexId;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setAlarmFilter(String alarmFilter) 
    {
        this.alarmFilter = alarmFilter;
    }

    public String getAlarmFilter() 
    {
        return alarmFilter;
    }
    public void setParam(String param) 
    {
        this.param = param;
    }

    public String getParam() 
    {
        return param;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPriority(Long priority) 
    {
        this.priority = priority;
    }

    public Long getPriority() 
    {
        return priority;
    }
    public void setValueType(String valueType) 
    {
        this.valueType = valueType;
    }

    public String getValueType() 
    {
        return valueType;
    }
    public void setDesc(String desc) 
    {
        this.desc = desc;
    }

    public String getDesc() 
    {
        return desc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("indexId", getIndexId())
            .append("category", getCategory())
            .append("unit", getUnit())
            .append("alarmFilter", getAlarmFilter())
            .append("param", getParam())
            .append("name", getName())
            .append("priority", getPriority())
            .append("valueType", getValueType())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("desc", getDesc())
            .append("remark", getRemark())
            .toString();
    }
}
