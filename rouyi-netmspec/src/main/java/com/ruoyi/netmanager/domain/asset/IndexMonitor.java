package com.ruoyi.netmanager.domain.asset;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 指标监视器对象 netm_index_monitor
 * 
 * @author ruoyi
 * @date 2023-10-24
 */
public class IndexMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long monitorId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** 监视器描述 */
    @Excel(name = "监视器描述")
    private String desc;

    /** 资源类型 */
    @Excel(name = "资源类型")
    private String resource;

    /** 监控的指标 */
    @Excel(name = "监控的指标")
    private String index;

    /** 监控算法 */
    @Excel(name = "监控算法")
    private String monitorWay;

    /** 监控目标 */
    @Excel(name = "监控目标")
    private String targetParam;

    /** 运算表达式 */
    @Excel(name = "运算表达式")
    private String expression;

    /** 监控周期 */
    @Excel(name = "监控周期")
    private Long interval;

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

    /** 处理建议 */
    @Excel(name = "处理建议")
    private String advice;

    /** 解析表达式 */
    @Excel(name = "解析表达式")
    private String parser;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer autoRun;

    /** 是否需要计数 */
    @Excel(name = "是否需要计数")
    private Integer counter;

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
    public void setDesc(String desc) 
    {
        this.desc = desc;
    }

    public String getDesc() 
    {
        return desc;
    }
    public void setResource(String resource) 
    {
        this.resource = resource;
    }

    public String getResource() 
    {
        return resource;
    }
    public void setIndex(String index) 
    {
        this.index = index;
    }

    public String getIndex() 
    {
        return index;
    }
    public void setMonitorWay(String monitorWay) 
    {
        this.monitorWay = monitorWay;
    }

    public String getMonitorWay() 
    {
        return monitorWay;
    }
    public void setTargetParam(String targetParam) 
    {
        this.targetParam = targetParam;
    }

    public String getTargetParam() 
    {
        return targetParam;
    }
    public void setExpression(String expression) 
    {
        this.expression = expression;
    }

    public String getExpression() 
    {
        return expression;
    }
    public void setInterval(Long interval) 
    {
        this.interval = interval;
    }

    public Long getInterval() 
    {
        return interval;
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
    public void setAdvice(String advice) 
    {
        this.advice = advice;
    }

    public String getAdvice() 
    {
        return advice;
    }
    public void setParser(String parser) 
    {
        this.parser = parser;
    }

    public String getParser() 
    {
        return parser;
    }
    public void setAutoRun(Integer autoRun) 
    {
        this.autoRun = autoRun;
    }

    public Integer getAutoRun() 
    {
        return autoRun;
    }
    public void setCounter(Integer counter) 
    {
        this.counter = counter;
    }

    public Integer getCounter() 
    {
        return counter;
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
            .append("desc", getDesc())
            .append("resource", getResource())
            .append("index", getIndex())
            .append("monitorWay", getMonitorWay())
            .append("targetParam", getTargetParam())
            .append("expression", getExpression())
            .append("interval", getInterval())
            .append("operator", getOperator())
            .append("seriousThreshold", getSeriousThreshold())
            .append("primaryThreshold", getPrimaryThreshold())
            .append("secondaryThreshold", getSecondaryThreshold())
            .append("cause", getCause())
            .append("advice", getAdvice())
            .append("parser", getParser())
            .append("autoRun", getAutoRun())
            .append("counter", getCounter())
            .append("enabled", getEnabled())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}
