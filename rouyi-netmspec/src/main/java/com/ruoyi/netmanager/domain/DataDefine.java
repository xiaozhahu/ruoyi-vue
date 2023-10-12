package com.ruoyi.netmanager.domain;

import com.zhtelecom.common.snmp.SNMPTarget;
import com.zhtelecom.common.snmp.trap.TrapMessageInfo;
import com.zhtelecom.nms.framework.discover.DeviceInfo;
import com.zhtelecom.nms.framework.discover.DeviceTypeInfo;
import com.zhtelecom.nms.framework.discover.LinkInfo;
import com.zhtelecom.nms.framework.discover.ResourceSearchMothType;

import java.io.File;

/**
 * 数据库和数据对象中的常量信息。
 */
public class DataDefine
{
	/**
	 * 网络图标路径
	 */
	public static final String TOPONETWORKIMAGEPATH = "topoNetworkImage/" ; //$NON-NLS-1$

	/**
	 * 网络背景图标路径
	 */
	public static final String TOPONETWORKBGIMAGEPATH = "topoNetworkBgImage/" ; //$NON-NLS-1$

	/**
	 * 设备图标路径
	 */
	public static final String TOPONODEIMAGEPATH = "topoNodeImage/"; //$NON-NLS-1$

	/**
	 * 设备背景图标路径
	 */
	public static final String TOPONODEBGIMAGEPATH = "topoNodeBgImage/" ; //$NON-NLS-1$

	/**
	 * 资源图标路径
	 */
	public static final String TOPORESOURCEIMAGEPATH = "topoResourceImage/" ; //$NON-NLS-1$

	/**
	 * 软件客户端使用图片路径
	 */
	public static final String NMSIMAGEPATH = "clientImage/" ; //$NON-NLS-1$

	/**
	 * 安管装饰器插件路径
	 */
	public static final String TEMPLATEFORMATPARAM = "templateFormatParam/" ; //$NON-NLS-1$
	/**
	 * WEB子菜单图标路径
	 */
	public static final String MENUIMG = "menuImg/" ; //$NON-NLS-1$
	/**
	 * WEB父菜单图标路径
	 */
	public static final String PARENTMENUIMG = "parentMenuImg/" ; //$NON-NLS-1$

	/**
	 * 超出限制标识
	 */
	public static final int EXP_LIMIT_SIGN = -2;

	// 临时区域
	public static final String GroupNetwork_TempNet = "自动发现临时区域"; //$NON-NLS-1$

	/**
	 * SNMP管理协议
	 */
	public static final String NodeManagerProtocol_SNMP = "SNMP"; //$NON-NLS-1$

	/**
	 * 非SNMP管理协议
	 */
	public static final String NodeManagerProtocol_NOSNMP = "非SNMP"; //$NON-NLS-1$

	/**
	 * snmpv1版本
	 */
	public static final int NodeSNMPVersion_V1 = SNMPTarget.VERSION1;

	/* snmpv2c版本 */
	public static final int NodeSNMPVersion_V2C = SNMPTarget.VERSION2C;

	// snmpv3版本
	public static final int NodeSNMPVersion_V3 = SNMPTarget.VERSION3;

	// V1 TRAP
	public static final int TrapVersionV1 = TrapMessageInfo.TrapVersionV1;

	// V2 TRAP
	public static final int TrapVersionV2 = TrapMessageInfo.TrapVersionV2;

	// 逻辑类型-交换类型
	public static final String NodeLogic_Switch = DeviceTypeInfo.SwitchType
			.getDeviceProductType();

	// 逻辑类型-路由类型
	public static final String NodeLogic_Router = DeviceTypeInfo.RouterType
			.getDeviceProductType();

	// 逻辑类型-路由交换类型
	public static final String NodeLogic_RouterSwitch = DeviceTypeInfo.RouterSwitchType
			.getDeviceProductType();

	// 逻辑类型-终端设备类型
	public static final String NodeLogic_Computer = DeviceTypeInfo.ComputerType
			.getDeviceProductType();

	// 逻辑类型-其他
	public static final String NodeLogic_Unkown = DeviceTypeInfo.UnkownType
			.getDeviceProductType();

	// 未知连接端口号
	public static final int LinkPort_UnknownPort = LinkInfo.UnknownPort;

	// 连接类型-内连接
	public static final String LinkType_Inbound = LinkInfo.LinkTypeInbound;

	// 连接类型-外连接
	public static final String LinkType_Outbound = LinkInfo.LinkTypeOutbound;

	/**
	 * 重启状态，未重启
	 */
	public static final int UPBACK_RESULT_UNRESTART = -1;

	/**
	 * 升级/备份/恢复 空闲状态
	 */
	public static final int UPBACK_RESULT_IDLE = 0;

	/**
	 * 升级/备份/恢复进行中
	 */
	public static final int UPBACK_RESULT_LOADING = 1;

	/**
	 * 升级/备份/恢复成功
	 */
	public static final int UPBACK_RESULT_SUCCESS = 2;

	/**
	 * 升级/备份/恢复失败
	 */
	public static final int UPBACK_RESULT_FAIL = 3;

	/**
	 * 升级/备份/恢复未知
	 */
	public static final int UPBACK_RESULT_UNKOWN = 4;

	/**
	 * 设备升级/备份/恢复命令发送失败
	 */
	public static final int UPBACK_SENDCOMMAND_FAIL = 5;

	/**
	 * 设备升级/备份/恢复命令发送成功
	 */
	public static final int UPBACK_SENDCOMMAND_SUCCESS = 6;

	/**
	 * 设备升级/备份/恢复
	 */
	public static final int UPBACK_SENDCOMMAND_UNSUPPORT = 7;

	/**
	 * 文件比较结果-未知
	 */
	public static final int UPBACK_COMPARE_UNKNOW = -1;

	/**
	 * 文件比较结果-未开始
	 */
	public static final int UPBACK_COMPARE_IDLE = 0;

	/**
	 * 文件比较结果-进行中
	 */
	public static final int UPBACK_COMPARE_LOADING = 1;

	/**
	 * 文件比较结果-相同
	 */
	public static final int UPBACK_COMPARE_SAME = 2;

	/**
	 * 文件比较结果-不同
	 */
	public static final int UPBACK_COMPARE_DIFFERENT = 3;

	/**
	 * 服务端产生文件名标识
	 */
	public static final String FILENAME_SERVER_CREATE = "serverCreate"; //$NON-NLS-1$

	/**
	 * snmp管理协议
	 */
	public static final String DeviceProtocolSNMP = DeviceInfo.DeviceProtocolSNMP;

	/**
	 * ping管理协议
	 */
	public static final String DeviceProtocolPing = DeviceInfo.DeviceProtocolPing;

	/**
	 * telnet管理协议
	 */
	public static final String DeviceProtocolTelnet = DeviceInfo.DeviceProtocolTelnet;

	/**
	 * ssh管理协议
	 */
	public static final String DeviceProtocolSSH = DeviceInfo.DeviceProtocolSSH;

	/**
	 * wmi管理协议
	 */
	public static final String DeviceProtocolWMI = DeviceInfo.DeviceProtocolWMI;
	/**
	 * ipmi管理协议
	 */
	public static final String DeviceProtocolIPMI = DeviceInfo.DeviceProtocolIPMI;
	/**
	 * netconf管理协议
	 */
	public static final String DeviceProtocolNetConf = DeviceInfo.DeviceProtocolNetCONF;
	/**
	 * onvif管理协议
	 */
	public static final String DeviceProtocolOnvif = "Onvif";
	
	/**
	 * ipmi管理协议
	 */
	public static final String DeviceProtocolWEB = "WEB";
	
	
	/**
	 * JDBC/TCP管理协议
	 */
	public static final String DeviceProtocolJDBCTCP = "JDBC/TCP";

	/**
	 * JDBC/TCP管理协议
	 */
	public static final String DeviceProtocolJedisTCP = "Jedis/TCP";

	public static final String DeviceProtocolGRPC = "GRPC";
	
	/**
	 * JMX/TCP管理协议
	 */
	public static final String DeviceProtocolJMXTCP = "JMX/TCP";

	public static final String DataBaseType_MySql = "MySql";
	
	public static final String DataBaseType_ORACLE = "ORACLE";
	
	public static final String DataBaseType_SQLServer = "SQLServer";
	
	public static final String DataBaseType_DB2 = "DB2";

	/**
	 * HTTP管理协议
	 */
	public static final String DeviceProtocolHTTP = "HTTP";
	/**
	 * 空的管理协议
	 */
	public static final String DeviceProtocolNULL = DeviceInfo.DeviceProtocolNULL;

	/** 资源的基础技术类型 **/

	/**
	 * snmp表类型资源
	 */
	public static final String ResouceBaseTechType_SNMPTable = ResourceSearchMothType.ResouceBaseTypeSNMPTable;

	/**
	 * snmp组类型资源
	 */
	public static final String ResouceBaseTechType_SNMPGroup = ResourceSearchMothType.ResouceBaseTypeSNMPGroup;

	/**
	 * tcp端口类型资源
	 */
	public static final String ResouceBaseTechType_TCPPort = ResourceSearchMothType.ResouceBaseTypeTCPServer;

	/**
	 * 系统类型System资源
	 */
	public static final String ResouceBaseTechType_System = ResourceSearchMothType.ResouceBaseTypeSystem;

	/**
	 * 数据库类型
	 */
	public static final String ResouceBaseTypeSQL = ResourceSearchMothType.ResouceBaseTypeSQL;

	/**
	 * wmi类型资源
	 */
	public static final String ResouceBaseTypeWMI = ResourceSearchMothType.ResouceBaseTypeWMI;

	/**
	 * jmx类型资源
	 */
	public static final String ResouceBaseTypeJMX = ResourceSearchMothType.ResouceBaseTypeJMX;

	/**
	 * telnet或ssh类型资源
	 */
	public static final String ResouceBaseTypeTelnetSSH = ResourceSearchMothType.ResouceBaseTypeTelnetSSH;

	/**
	 * HTTP类型资源
	 */
	public static final String ResouceBaseTypeHTTP = ResourceSearchMothType.ResouceBaseTypeHttp;

	/**
	 * URL类型资源
	 */
	public static final String ResouceBaseTypeURL = "URL";

	/**
	 * FTP类型资源
	 */
	public static final String ResouceBaseTypeFTP = "FTP";

	/**
	 * TFTP类型资源
	 */
	public static final String ResouceBaseTypeTFTP = "TFTP";

	/**
	 * POP3/IMAP类型资源
	 */
	public static final String ResouceBaseTypePOP3AndIMAP = "POP3/IMAP";

	/**
	 * LDAP类型资源
	 */
	public static final String ResouceBaseTypeLDAP = "LDAP";

	/**
	 * WMI、JMX、Telnet/SSH、数据库监视器对应的监视名常量
	 */
	/**
	 * wmi监视器名
	 */
	public static final String MonitorProcessName_WMI = "WMI Monitor"; //$NON-NLS-1$

	/**
	 * jmx监视器名
	 */
	public static final String MonitorProcessName_JMX = "JMX Monitor"; //$NON-NLS-1$

	/**
	 * telnet/ssh监视器名
	 */
	public static final String MonitorProcessName_TELENT_SSH = "Telnet/SSH Monitor"; //$NON-NLS-1$

	/**
	 * 数据库监视器名
	 */
	public static final String MonitorProcessName_SQL = "SQL Monitor"; //$NON-NLS-1$

	/**
	 * URL监视器名
	 */
	public static final String MonitorProcessName_URL = "URL Monitor";

	/**
	 * FTP监视器名
	 */
	public static final String MonitorProcessName_FTP = "FTP Monitor";

	/**
	 * TFTP监视器名
	 */
	public static final String MonitorProcessName_TFTP = "TFTP Monitor";

	/**
	 * POP3/IMAP监视器
	 */
	public static final String MonitorProcessName_POP3_IMAP = "POP3/IMAP Monitor";

	/**
	 * LDAP监视器
	 */
	public static final String MonitorProcessName_LDAP = "LDAP Monitor";

	/**
	 * wmi监视存在性监视器名
	 */
	public static final String MonitorProcessName_WMIEXIST = "WMI Exist Monitor"; //$NON-NLS-1$

	/**
	 * 连通性判断监视器
	 */
	public static final String MonitorProcessName_Connection = "Connection Monitor"; //$NON-NLS-1$
	
	/**
	 * 多IP设备连通性判断监视器
	 */
	public static final String MonitorProcessName_MultipleIPsConnection = "Multiple IPs Connection Monitor"; //$NON-NLS-1$
	
	/**
	 * 设备连通性判断结果，设备连通
	 */
	public static int NodeConnectionStatus_OK = 1;

	/**
	 * 设备连通性判断结果，设备不连通
	 */
	public static int NodeConnectionStatus_ERROR = 0;
	
	/**
	 * 历史性能总分表数量
	 */
	public static int MonitorData_Table_Num = 366;

	/**
	 * wmi、telnet/ssh资源发现方法名
	 */
	public static final String ResourceDiscoverMethodName_WMI = "WMI Method"; //$NON-NLS-1$

	public static final String ResourceDiscoverMethodName_TELNET_SSH = "Telnet/SSH Method"; //$NON-NLS-1$

	public static final String ResourceDiscoverMethodName_JMX = "JMX Method"; //$NON-NLS-1$

	public static final String ResourceDiscoverMethodName_SQL = "SQL Method"; //$NON-NLS-1$

	/**
	 * 资源自动发现和检测时的状态。
	 */
	public static final String ResourceCheckStatus_New = "新发现"; //$NON-NLS-1$

	public static final String ResourceCheckStatus_Exist = "已存在"; //$NON-NLS-1$

	public static final String ResourceCheckStatus_NoExist = "不存在"; //$NON-NLS-1$

	/**
	 * 系统有一个默认的系统资源类型，并且每个设备有一个默认的系统资源对象。其在数据库中名称定义如下：
	 */
	public static final String ResouceTypeName_System = "系统资源"; //$NON-NLS-1$

	public static final String ResourceTypeName_SystemString = "System"; //$NON-NLS-1$

	public static final String ClearStatus_Clear = "已清除"; //$NON-NLS-1$

	public static final String ClearStatus_NoClear = "未清除"; //$NON-NLS-1$

	public static final String ConfirmStatus_Yes = "是"; //$NON-NLS-1$

	public static final String ConfirmStatus_No = "否"; //$NON-NLS-1$

	/**
	 * 任务运行状态
	 */
	public static final String TaskLastRunStatsMsg_NeverRun = "从未运行"; //$NON-NLS-1$

	public static final String TaskLastRunStatsMsg_RunOK = "正常运行"; //$NON-NLS-1$

	// 监视器类型。故障监视器
	public static final int ActionType_Alarm = 0;

	// 性能监视器
	public static final int ActionType_Perf = 1;

	// 状态监视器
	public static final int ActionType_Status = 2;

	// 既是故障监视器也是性能监视器
	public static final int ActionType_PerfAndAlarm = 3;

	// Trap监视器,生成告警类型
	public static final int TrapActionType_GenAlarm = 1;

	// Trap监视器,生成事件类型
	public static final int TrapActionType_GenPerf = 0;

	// 权限类型- admin
	public static final String PermType_Admin = "SystemManager"; //$NON-NLS-1$

	public static final String PermType_Admin_Display = "系统管理员"; //$NON-NLS-1$

	// 权限类型 普通
	public static final String PermType_Normal = "NormalManager"; //$NON-NLS-1$

	public static final String PermType_Normal_Display = "普通管理员"; //$NON-NLS-1$

	// 权限类型查看
	public static final String PermType_Reader = "NormalReader"; //$NON-NLS-1$

	public static final String PermType_Reader_Display = "只读管理员"; //$NON-NLS-1$

	public static final String PermType_User = "用户"; //$NON-NLS-1$

	// 当前状态的类型 工作状态
	public static final String CurrentStatusType_Alarm = "工作状态"; //$NON-NLS-1$

	// 当前状态的类型 Trap工作状态类型
	public static final String CurrentStatusType_TrapAlarm = "Trap状态"; //$NON-NLS-1$

	// 告警当前状态的类型 连通性类型
	public static final String CurrentStatusType_Connection = "Connection Status"; //$NON-NLS-1$

	// 告警当前状态类型，显示状态
	public static final String CurrentStatusType_Status = "Show Status"; //$NON-NLS-1$

	// 不锁定设备和资源
	public static final int NodeDevice_Lockxy_None = 0;

	// 仅锁定设备
	public static final int NodeDevice_Lockxy_Node = 1;

	// 仅锁定资源
	public static final int NodeDevice_Lockxy_Resource = 2;

	// 同时锁定设备和资源
	public static final int NodeDevice_Lockxy_All = 3;
	
	//设备发现状态，0-默认，即与本次发现无关
	public static final int NodeDevice_CheckStatus_Default = 0;
	
	//设备发现状态，1-新发现
	public static final int NodeDevice_CheckStatus_New = 1;
	
	//设备发现状态，2-发现但已存在
	public static final int NodeDevice_CheckStatus_Exist = 2;

	// 接收email。已放在管理员信息里面。系统参数不需要设置。为编译通过保留。
	public static final String Param_Name_AlarmEmailReciver = "alarmEmailReciver"; //$NON-NLS-1$
	
	// 告警信息推送模板
	public static final String DefaultAlarmTemplate = "{nodeDisName}_{ipAddress}设备的{resourceName}资源发生{perceivedSeverity}告警({typeName}_{alarmReason})"; //$NON-NLS-1$
	
	// 告警信息推送模板
	public static final String Param_Name_AlarmTemplate = "alarmTemplateParam"; //$NON-NLS-1$
	
	// 不同告警选择的通知方式
	public static final String Param_Name_AlarmEvent = "alarmEvent"; //$NON-NLS-1$
	/**
	 * 接收故障级别。已放在管理员信息里面。系统参数不需要设置。为编译通过保留。
	 */
	public static final String Param_Name_AlarmEmailReciverLevel = "alarmEmailReciverLevel"; //$NON-NLS-1$

	// 邮件服务器地址
	public static final String Param_Name_AlarmEmailSmtpServer = "alarmEmailSmtpServer"; //$NON-NLS-1$

	// 邮件服务器是否需要SSL加密 。 1-支持 0-不支持
	public static final String Param_Name_AlarmEmailSmtpSSL = "alarmEmailSmtpSSL"; //$NON-NLS-1$

	// 邮件服务器端口。默认值25
	public static final String Param_Name_AlarmEmailSmtpServerPort = "alarmEmailSmtpServerPort"; //$NON-NLS-1$

	// 使用邮件服务器的邮件账号
	public static final String Param_Name_AlarmFromEmailAddress = "alarmFromEmailAddress"; //$NON-NLS-1$

	/**
	 * SMTP服务器是否需要认证
	 */
	public static final String Param_Name_AlarmSMTPIsAuth = "alarmSMTPIsAuth"; //$NON-NLS-1$

	/**
	 * 认证帐号
	 */
	public static final String Param_Name_AlarmEmailSmtpUser = "alarmEmailSmtpUser"; //$NON-NLS-1$

	/**
	 * 认证密码
	 */
	public static final String Param_Name_AlarmEmailSmtpPwd = "alarmEmailSmtpPwd"; //$NON-NLS-1$

	/**
	 * 是否启用邮件服务器
	 */
	public static final String Param_Name_AlarmSMTPIsStart = "alarmSMTPIsStart"; //$NON-NLS-1$
	
	/**
     * 是否启用归档数据备份功能
     */
    public static final String Param_Name_EnableBackupMonitorData = "enableBackupMonitorData"; //$NON-NLS-1$

	/**
	 * 拓扑图根视图的背景图文件名。
	 */
	public static final String Param_Name_Topo_Root_Backgroup_Image = "topoRootBackgroupImage"; //$NON-NLS-1$

	/**
	 * 链接当前性能监控器
	 */
	public static final String NmsSystemParam_CurrentMonitorName = "CurrentMonitorName"; //$NON-NLS-1$

	/**
	 * 短信服务名，用来区分不同的公司短信服务器，目前只支持两家公司
	 */
	public static final String NmsSystemParam_SmsServerName = "SmsServerName"; //$NON-NLS-1$

	/**
	 * 短信发送服务器的注册用户名
	 */
	public static final String NmsSystemParam_SmsUserName = "SmsUserName"; //$NON-NLS-1$

	/**
	 * 短信发送服务器的密码
	 */
	public static final String NmsSystemParam_SmsPassword = "SmsPassword"; //$NON-NLS-1$
	
	/**
	 * 短信发送内容模板
	 */
	public static final String NmsSystemParam_Template = "SmsTemplate"; //$NON-NLS-1$
	/**
	 * 是否启动短信服务器
	 */
	public static final String NmsSystemParam_SmsIsStart = "SmsIsStart"; //$NON-NLS-1$
	/**
	 * 软件第一次运行时间
	 */
	public static final String NmsSystemParam_FirstRunTime = "FirstRunTime";
	/**
	 * 拓扑节点是否闪烁，1-是，0-否
	 */
	public static final String NmsSystemParam_NodeColorFlashing = "enableNodeAlarmColorFlashing";

	public static final int NmsSystemParam_NodeColorFlashing_Yes = 1;

	public static final int NmsSystemParam_NodeColorFlashing_No = 0;

	//是否启用二次告警通知   1 启用    0 不启用，默认：不启用
	public static final String NmsSystemParam_StartSecondAlarmNotice = "StartSecondAlarmNotice";
	//二次告警通知的通知人   填写系统用户ID，多个用户之间用英文逗号区分
	public static final String NmsSystemParam_SecondNoticeUser = "SecondNoticeUser";
	//触发二次告警的时长（指当前告警多久处于未确认状态下触发二次告警） 单位： 小时   默认给定：48小时
	public static final String NmsSystemParam_SecondNoticeDuration = "SecondNoticeDuration";

	/**
	 * 报表发布时间，0-周，1-月，2-季度
	 */

	public static final String NmsSystemParam_Report = "reportIssueTime";

	public static final String NmsSystemParam_ReportTime_Week = "reportWeekTime";

	public static final String NmsSystemParam_ReportTime_Month = "reportMonthTime";

	public static final String NmsSystemParam_ReportTime_Quarter = "reportQuarterTime";
	public static final String NmsSystemParam_ReportTime_Day = "reportDayTime";

	public static final int NmsSystemParam_Report_Week = 0;

	public static final int NmsSystemParam_Report_Month = 1;

	public static final int NmsSystemParam_Report_Quarter = 2;
	
	/**
	 * 全网告警事件表最大显示记录数量
	 */
	public static final String NmsSystemParam_AllAlarmEventMaxNumber = "AllAlarmEventMaxNumber";

	/**
	 * MonitorData表删除天数
	 */
	public static final String MonitorData_DelDays = "monitorDataDelDays"; //$NON-NLS-1$

	/**
	 * MonitorDataSumReport表删除月数
	 */
	public static final String MonitorDataSR_DelMonths = "monitorDataSRDelMonths"; //$NON-NLS-1$

	/**
	 * UserLog表删除月数
	 */
	public static final String UserLog_DelMonths = "userLogDelMonths"; //$NON-NLS-1$

	/**
	 * commandLog表删除日数
	 */
	public static final String CommandLog_DelMonths = "commandLogDelMonths"; //$NON-NLS-1$
	/**
	 * HistoryAlarm表删除月数
	 */
	public static final String HistoryAlarm_DelMonths = "historyAlarmDelMonths"; //$NON-NLS-1$

	/**
	 * NodeEvent表删除月数
	 */
	public static final String NodeEvent_DelMonths = "nodeEventDelMonths"; //$NON-NLS-1$

	/**
	 * mapip表删除月数
	 */
	public static final String MacIP_DelDays = "macIPDelDays"; //$NON-NLS-1$
	
	
	/**
	 * commandLog表删除日数
	 */
	public static final String Log_Save_Path = "logSavePath"; //$NON-NLS-1$

	/**
	 * MonitorDataSumReport历史性能数据的汇总统计策略
	 */
	public static final String MonitorDataSumMethod_AddUp = "汇总累计"; //$NON-NLS-1$

	public static final String MonitorDataSumMethod_AddAVG = "加权平均"; //$NON-NLS-1$

	public static final String MonitorDataSumMethod_CURRENTVALUE = "当前值"; //$NON-NLS-1$
	
	public static final String MonitorDataSumMethod_Max = "最大值"; //$NON-NLS-1$
	
	public static final String MonitorDataSumMethod_Min = "最小值"; //$NON-NLS-1$

	/**
	 * 设备为可管理设备1,不可管理设备为0,未配置为2
	 */
	public static final int IsManagerNode_Yes = 1;

	public static final int IsManagerNode_No = 0;
	
	public static final int IsManagerNode_UnConfigured = 2;

	/**
	 * 设备是否启用代理,启用为1,禁用为0
	 */
	public static final int IsEnableSNMPProxy_Yes = 1;

	public static final int IsEnableSNMPProxy_No = 0;

	/**
	 * 设备显示名称是否用IP,是为1,否为0
	 */
	public static final String DeviceNode_DiaplayByIP = "deviceNodeDiaplayByIP"; //$NON-NLS-1$

	public static final int DeviceNode_DiaplayByIP_Yes = 1;

	public static final int DeviceNode_DiaplayByIP_No = 0;

	/**
	 * 资源图名称是否显示,显示为1,不显示为0
	 */
	public static final String IsResourceNameDisplay = "isResourceNameDisplay"; //$NON-NLS-1$

	public static final int IsResourceNameDisplay_Yes = 1;

	public static final int IsResourceNameDisplay_No = 0;

	/**
	 * 设备资源视图背景图片是否显示,显示为1,不显示为0
	 */
	public static final String IsDeviceBgImageDisplay = "isDeviceBgImageDisplay"; //$NON-NLS-1$

	public static final int IsDeviceBgImageDisplay_Yes = 1;

	public static final int IsDeviceBgImageDisplay_No = 0;

	/**
	 * Syslog服务器所监听的端口
	 */
	public static final String SyslogPort = "syslogPort";//$NON-NLS-1$

	public static final int SyslogPort_default = 514;

	/**
	 * Syslog服务器所使用的协议
	 */
	public static final String SyslogProtocol = "syslogProtocol";//$NON-NLS-1$

	public static final String SyslogProtocol_Udp = "udp";//$NON-NLS-1$

	public static final String SyslogProtocol_Tcp = "tcp";//$NON-NLS-1$

	/**
	 * Syslog服务器开关，1为开，0为关
	 */
	public static final String SyslogSwitchStatus = "syslogSwitchStatus";//$NON-NLS-1$

	public static final int SyslogSwitchStatus_On = 1;

	public static final int SyslogSwitchStatus_Off = 0;

	/**
	 * ftp server
	 */
	public static final String FtpServerStatus = "FtpServerStatus"; //$NON-NLS-1$

	public static final int FtpServerStatus_On = 1;

	public static final int FtpServerStatus_Off = 0;

	/**
	 * ntp server port
	 */
	public static final String NtpServerPort = "NtpServerPort"; //$NON-NLS-1$

	public static final int NtpServerPort_Default = 123;
	
	/**
     * ntp server
     */
    public static final String NtpServerStatus = "NtpServerStatus"; //$NON-NLS-1$

    public static final int NtpServerStatus_On = 1;

    public static final int NtpServerStatus_Off = 0;
    
    /**
     * 系统时间同步的服务类型ntp/sntp
     */
    public static final String SysTimeSync_ServerType_Name = "SysTimeSyncServerType";
    /**
     * ntp
     */
    public static final String SysTimeSync_ServerType_Ntp = "ntp";
    /**
     * sntp
     */
    public static final String SysTimeSync_ServerType_Sntp = "sntp";
    /**
     * 系统时间同步是否启动
     */
    public static final String SysTimeSync_IsStart_Name = "SysTimeSyncIsStart";
    /**
     * 系统时间同步是否启动-是
     */
    public static final int SysTimeSync_IsStart_Yes = 1;
    /**
     * 系统时间同步是否启动-否
     */
    public static final int SysTimeSync_IsStart_No = 0;
    /**
     * 系统时间同步的ntp/sntp服务器IP
     */
    public static final String SysTimeSync_ServerIP_Name = "SysTimeSyncServerIP";
    /**
     * 系统时间同步的ntp/sntp服务器端口
     */
    public static final String SysTimeSync_SeverPort_Name = "SysTimeSyncServerPort";
    
    /**
     * 系统时间同步周期
     */
    public static final String SysTimeSync_Interval = "SysTimeSyncInterval";
    
    public static final String SysTimeSync_IntervalType_Month = "month";
    public static final String SysTimeSync_IntervalType_Day = "day";
    public static final String SysTimeSync_IntervalType_Hour = "hour";
    public static final String SysTimeSync_IntervalType_Minute = "minute";
    

    /**
     * ftp server port
     */
    public static final String FtpServerPort = "FtpServerPort"; //$NON-NLS-1$

    public static final int FtpServerPort_Default = 21;

	/**
	 * tftp server
	 */
	public static final String TftpServerStatus = "TftpServerStatus"; //$NON-NLS-1$

	public static final int TftpServerStatus_On = 1;

	public static final int TftpServerStatus_Off = 0;

	/**
	 * tftp server port
	 */
	public static final String TftpServerPort = "TftpServerPort"; //$NON-NLS-1$

	public static final int TftpServerPort_Default = 69;

	public static final String FilterListSwitch = "FilterListSwitch"; //$NON-NLS-1$
	
	public static final String FilterListTime = "FilterListSwitchTime"; //$NON-NLS-1$


	/**
	 * NodeType,是否锁定位置,1-锁定,0-不锁定
	 */
	public static final int NodeTypeIsResourceLockedXY_Yes = 1;

	public static final int NodeTypeIsResourceLockedXY_No = 0;

	/**
	 * NodeType,是否显示资源名,1-显示,0-不显示
	 */
	public static final int NodeTypeIsResourceNameDisplay_Yes = 1;

	public static final int NodeTypeIsResourceNameDisplay_No = 0;

	/**
	 * NodeType,是否启用,1-启用,0-禁用
	 */
	public static final int NodeTypeIsEnabled_Yes = 1;

	public static final int NodeTypeIsEnabled_No = 0;
	
	/**
     * NodeType,是否显示在图例中,1-显示,0-不显示
     */
    public static final int NodeTypeIsLegend_Yes = 1;

    public static final int NodeTypeIsLegend_No = 0;

	/* NodeType,资源发现方法的选择：0-搜索方式（默认），1-静态模板，2-动态模板，3-插件方式, 4-嵌套模板, 5-组合模板 */
	public static final int NodeTypeResourceFindMethodUsed_Search = 0;

	public static final int NodeTypeResourceFindMethodUsed_StaticTemplate = 1;

	public static final int NodeTypeResourceFindMethodUsed_DynamicTemplate = 2;

	public static final int NodeTypeResourceFindMethodUsed_Plugin = 3;
	
	public static final int NodeTypeResourceFindMethodUsed_NestedTemplate = 4;
	
	public static final int NodeTypeResourceFindMethodUsed_CombinationTemplate = 5;

	/**
	 * ResourceType,启用/禁用,1-启用,0-禁用
	 */
	public static int ResourceTypeIsEnabled_Yes = 1;

	public static int ResourceTypeIsEnabled_No = 0;

	/**
	 * ResourceType,是否支持连接点,1-支持,0-不支持
	 */
	public static int ResourceTypeIsSupportLink_Yes = 1;

	public static int ResourceTypeIsSupportLink_No = 0;

	/**
	 * ResourceType,是提升为设备,1-否,0-是
	 */
	public static int ResourceTypeIsDefaultType_Yes = 1;

	public static int ResourceTypeIsDefaultType_No = 0;
	
	/**
	 * ResourceType,非管理资源图标区分,1-是,0-否
	 */
	public static int ResourceTypeManagerImageShow_Yes = 1;

	public static int ResourceTypeManagerImageShow_No = 0;

	/**
	 * ResourceType,资源图是否显示在前端,1-是,0-否
	 */
	public static int ResourceTypeIsMapFrontDisplay_Yes = 1;

	public static int ResourceTypeIsMapFrontDisplay_No = 0;

	/**
	 * MonitorAction,是否是计数器类型,1-是,0-不是
	 */
	public static int MonitorActionIsCounterType_Yes = 1;

	public static int MonitorActionIsCounterType_No = 0;

	/**
	 * MonitorAction,启用/禁用,1-启用,0-禁用
	 */
	public static int MonitorActionIsEnabled_Yes = 1;

	public static int MonitorActionIsEnabled_No = 0;

	/**
	 * MonitorAction，自动运行，0-否，1-是，2-有link时运行
	 */
	public static int MonitorActionDefaultRun_NotRun = 0;

	public static int MonitorActionDefaultRun_Run = 1;

	public static int MonitorActionDefaultRun_LinkRun = 2;

	/**
	 * TrapAction,启用/禁用,1-启用,0-禁用
	 */
	public static int TrapActionIsEnabled_Yes = 1;

	public static int TrapActionIsEnabled_No = 0;

	/**
	 * TrapAction,是否特殊解析器,1-是,0-否
	 */
	public static int TrapActionIsSpecialTrapParser_Yes = 1;

	public static int TrapActionIsSpecialTrapParser_No = 0;

	/**
	 * NodeLink,连线类型,1-直线,2-转折线,3-曲折线
	 */
	public static int NodeLinkLineType_StraightLine = 1;

	public static int NodeLinkLineType_TurningLine = 2;

	public static int NodeLinkLineType_WaveLine = 3;

	/**
	 * NodeLink,虚实类型,1-实线,2-虚线
	 */
	public static int NodeLinkVirtualType_SolidLine = 1;

	public static int NodeLinkVirtualType_DottedLine = 2;

	/**
	 * NodeLink,精细(宽度),分为1-5
	 */
	public static int NodeLinkLineWidth_One = 1;

	public static int NodeLinkLineWidth_Two = 2;

	public static int NodeLinkLineWidth_Three = 3;

	public static int NodeLinkLineWidth_Four = 4;

	public static int NodeLinkLineWidth_Five = 5;

	/**
	 * NodeLink,箭头方向,0-双向,1-起点,2-终点，3-无箭头
	 */
	public static int NodeLinkIsResourceLink_DoubleArrow = 0;

	public static int NodeLinkIsResourceLink_BeginArrow = 1;

	public static int NodeLinkIsResourceLink_EndArrow = 2;

	public static int NodeLinkIsResourceLink_NoneArrow = 3;

	/**
	 * 箭头类型，0-无箭头，1-暂无，2-暂无，4-暂无，5-暂无，7-暂无，8-阻塞，9-聚合
	 */
	public static final int NodeLinkArrowType_NONE = 0;

	public static final int NodeLinkArrowType_CLASSIC = 1;

	public static final int NodeLinkArrowType_TECHNICAL = 2;

	public static final int NodeLinkArrowType_SIMPLE = 4;

	public static final int NodeLinkArrowType_CIRCLE = 5;

	public static final int NodeLinkArrowType_LINE = 7;

	public static final int NodeLinkArrowType_DOUBLELINE = 8;

	public static final int NodeLinkArrowType_DIAMOND = 9;

	/**
	 * NodeLink,相对/绝对位置显示,1-相对位置,0-绝对位置
	 */
	public static int NodeLinkIsRelativePosition_Yes = 1;

	public static int NodeLinkIsRelativePosition_No = 0;
	
	//链路发现状态，0-默认，即与本次发现无关
    public static final int NodeLinkCheckStatus_Default = 0;
    
    //链路发现状态，1-新发现
    public static final int NodeLinkCheckStatus_New = 1;
    
    //链路发现状态，2-发现但已存在
    public static final int NodeLinkCheckStatus_Exist = 2;

	/**
	 * ManagerUser,启用/禁用,1-启用,0-禁用
	 */
	public static int ManagerUserIsEnabled_Yes = 1;

	public static int ManagerUserIsEnabled_No = 0;
	
	/**
     * ManagerUser, 是否限制重复登录(同一用户不能同时登录多次)，0-否，1-是
     */
    public static int ManagerUserIsLoginSingle_Yes = 1;

    public static int ManagerUserIsLoginSingle_No = 0;
    
    /**
     * ManagerUser, 是否启用微信消息服务
     */
    public static int ManagerUserIsEnableWechat_Yes = 1;

    public static int ManagerUserIsEnableWechat_No = 0;
    
	/**
	 * NodeDevice,SNMP V3安全级别,1-noAuth,noPriv;2-auth,noPriv;3-auth,priv
	 */
	public static int NodeDeviceSnmpV3SecurityLevel_NoAuthNoPriv = 1;

	public static int NodeDeviceSnmpV3SecurityLevel_AuthNoPriv = 2;

	public static int NodeDeviceSnmpV3SecurityLevel_AuthPriv = 3;

	/**
	 * NodeDevice,SNMP V3认证协议
	 */
	public static String NodeDeviceSnmpV3AuthProtocol_MD5 = "MD5"; //$NON-NLS-1$

	public static String NodeDeviceSnmpV3AuthProtocol_SHA = "SHA"; //$NON-NLS-1$

	/**
	 * NodeDevice,SNMP V3加密协议
	 */
	public static final String NodeDeviceSnmpV3EncryptProtocol_DES = "DES"; //$NON-NLS-1$
	/**
	 * NodeDevice,SNMP V3加密协议
	 */
	public static final String NodeDeviceSnmpV3EncryptProtocol_DESEDE = "DESEDE"; //$NON-NLS-1$
	/**
	 * NodeDevice,SNMP V3加密协议
	 */
	public static final String NodeDeviceSnmpV3EncryptProtocol_AES128 = "AES128"; //$NON-NLS-1$
	/**
	 * NodeDevice,SNMP V3加密协议
	 */
	public static final String NodeDeviceSnmpV3EncryptProtocol_AES192 = "AES192"; //$NON-NLS-1$
	/**
	 * NodeDevice,SNMP V3加密协议
	 */
	public static final String NodeDeviceSnmpV3EncryptProtocol_AES256 = "AES256"; //$NON-NLS-1$

	/**
	 * NodeDevice,设备支持协议,1-wmi,2-telnet,3-ssh
	 */
	public static int NodeDeviceProtocolType_WMI = 1;

	public static int NodeDeviceProtocolType_TELNET = 2;

	public static int NodeDeviceProtocolType_SSH = 3;

	/**
	 * FilterList,名单类型,0-禁用 1-白名单,2-黑名单,3-ipmac
	 */
	public static int FilterListFilterType_NullList = 0;
	public static int FilterListFilterType_WhiteList = 1;

	public static int FilterListFilterType_BlackList = 2;
	
	public static int FilterListFilterType_MacIPList = 3;

	/**
	 * 故障节点闪烁值，0保持不变，1闪烁，-1不闪烁
	 */
	public static int CurrentAlarmColorFlashingValue_Flash = 1;

	public static int CurrentAlarmColorFlashingValue_Unflash = -1;

	public static int CurrentAlarmColorFlashingValue_Constant = 0;

	/**
	 * 用户日志的操作结果，1-成功，-1-失败
	 */
	public static int UserLogOperateResult_Success = 1;

	public static int UserLogOperateResult_Fail = -1;

	/**
	 * 任务是否运行，1-运行，0-停止
	 */
	public static int NodeMonitorTaskIsRun_Yes = 1;

	public static int NodeMonitorTaskIsRun_No = 0;

	/**
	 * mac-ip列表，最新记录-1
	 */
	public static int MacIPStatus_Latest = 1;

	/**
	 * mac-ip列表，上一次记录-0
	 */
	public static int MacIPStatus_last = 0;
	/**
	 * mac-ip列表，历史记录--1
	 */
	public static int MacIPStatus_History = -1;

	/**
	 * 资产状态，库存中
	 */
	public static int AssetStatus_Store = 0;

	public static String AssetStatus_Store_Display = "库存"; //$NON-NLS-1$

	/**
	 * 资产状态，领用
	 */
	public static int AssetStatus_Use = 1;

	public static String AssetStatus_Use_Display = "领用"; //$NON-NLS-1$

	/**
	 * 资产状态，退还
	 */
	public static int AssetStatus_Return = 2;

	public static String AssetStatus_Return_Display = "退还"; //$NON-NLS-1$

	/**
	 * 统计报表发送邮件服务器是否启动
	 */
	public static final String Statistic_SendServerIsStart = "StatisticSendServerIsStart"; //$NON-NLS-1$

	public static final int Statistic_SendServerIsStart_No = 0; // 否

	public static final int Statistic_SendServerIsStart_Yes = 1; // 是

	/**
	 * 统计报表发送周期
	 */
	public static final String Statistic_SendTimeInterval = "StatisticSendTimeInterval"; //$NON-NLS-1$

	/**
	 * 发送周期类型，按天、周、月
	 */
	public static final int Statistic_SendTimeIntervalType_Day = 1;

	public static final int Statistic_SendTimeIntervalType_Week = 2;

	public static final int Statistic_SendTimeIntervalType_Month = 3;

	/**
	 * 用户是否接收统计报表邮件
	 */
	public static final int Statistic_ManageUserReceive_No = 0; // 否

	public static final int Statistic_ManageUserReceive_Yes = 1; // 是

	/**
	 * 资源是否可管理，1-是，0-否
	 */
	public static final int ResourceManageable_Yes = 1;

	public static final int ResourceManageable_No = 0;

	/**
	 * 资源是否可管理对应的字符串常量
	 */
	public static final String ResourceManageableString_Yes = "可管理"; //$NON-NLS-1$

	public static final String ResourceManageableString_No = "不可管理"; //$NON-NLS-1$

	/**
	 * 端口up状态值
	 */
	public static final int IFStatus_UP = 1;

	/**
	 * 端口down状态值
	 */
	public static final int IFStatus_DOWN = 2;

	/**
     * 端口testing状态值
     */
    public static final int IFStatus_TESTING = 3;
    
	/**
	 * 文件服务器类型
	 */
	public static final String FileServerType = "FileServerType"; //$NON-NLS-1$

	/**
	 * ftp服务器
	 */
	public static final String FileServerType_FTP = "ftp"; //$NON-NLS-1$

	/**
	 * tftp服务器
	 */
	public static final String FileServerType_TFTP = "tftp"; //$NON-NLS-1$

	/**
	 * 文件服务器的ip地址
	 */
	public static final String FileServerIP = "FileServerIP"; //$NON-NLS-1$

	/**
	 * 文件服务器的端口号
	 */
	public static final String FileServerPort = "FileServerPort"; //$NON-NLS-1$

	/**
	 * 文件服务器用户名
	 */
	public static final String FileServerUser = "FileServerUser"; //$NON-NLS-1$

	/**
	 * 文件服务器密码
	 */
	public static final String FileServerPwd = "FileServerPwd"; //$NON-NLS-1$

	/**
	 * 系统软件所在文件服务器的子目录
	 */
	public static final String FileServerSysSoftDir = "FileServerSysSoftDir"; //$NON-NLS-1$

	/**
	 * 配置文件所在文件服务器的子目录
	 */
	public static final String FileServerConfFileDir = "FileServerConfFileDir"; //$NON-NLS-1$

	/**
	 * 文件服务器是否使用
	 */
	public static final String FileServerEnabled = "FileServerEnabled"; //$NON-NLS-1$

	/**
	 * 配置文件类型
	 */
	public static final int File_Type_config = 0;

	/**
	 * 系统文件类型
	 */
	public static final int File_Type_System = 1;

	/**
	 * 使用文件服务器
	 */
	public static final int FileServerEnabled_Yes = 1;

	/**
	 * 不使用文件服务器
	 */
	public static final int FileServerEnabled_No = 0;

	/**
	 * 设备连接状态-在线
	 */
	public static final String Connection_OnlineDisplay = "在线"; //$NON-NLS-1$

	/**
	 * 设备连接状态-离线
	 */
	public static final String Connection_OfflineDisplay = "掉线"; //$NON-NLS-1$

	/**
	 * 设备连接状态-未知
	 */
	public static final String Connection_UnknownDisplay = "未知"; //$NON-NLS-1$

	/**
	 * 资产字段默认未知标识
	 */
	public static final String Asset_UnKown_Fields = "Unkown"; //$NON-NLS-1$

	/**
	 * 网格模板不是边框线条标识
	 */
	public static final int GridTemplate_Edge_No = 0;

	/**
	 * 网格模板是边框线条标识
	 */
	public static final int GridTemplate_Edge_Yes = 1;

	/**
	 * 边缘设备在状态状态，1-在线
	 */
	public static final int PeerDevice_Status_Online = 1;

	/**
	 * 边缘设备在状态状态，-1-掉线
	 */
	public static final int PeerDevice_Status_Offline = -1;

	/**
	 * 边缘设备在状态状态，0-未知
	 */
	public static final int PeerDevice_Status_Unknown = 0;

	public static final String PeerDevice_Source_AUTO = "自动";

	/**
	 * 链路发现标识
	 */
	public static final String PeerDeviceMethod_LinkCommon = "LinkCommonPeerDeviceMethod";

	/**
	 * EOC发现标识
	 */
	public static final String PeerDeviceMethod_Eoc = "EocPeerDeviceMethod";

	/**
	 * 菜单栏
	 */
	public static final int Menus_MenusType_Menubar = 0;

	/**
	 * 右键根网络空白
	 */
	public static final int Menus_MenusType_RootNetBlank = 1;

	/**
	 * 右键网络
	 */
	public static final int Menus_MenusType_Network = 2;

	/**
	 * 右键网络空白
	 */
	public static final int Menus_MenusType_NetBlank = 3;

	/**
	 * 右键设备
	 */
	public static final int Menus_MenusType_Device = 4;

	/**
	 * 右键资源
	 */
	public static final int Menus_MenusType_Resource = 5;

	/**
	 * 右键资源空白
	 */
	public static final int Menus_MenusType_ResBlank = 6;

	/**
	 * 右键资源空白
	 */
	public static final int Menus_MenusType_Link = 7;

	/**
	 * 右键资源空白
	 */
	public static final int Menus_MenusType_Tool = 8;

	/**
	 * 标准菜单
	 */
	public static final String Menus_MenusParam_Norm = "0";

	/**
	 * 菜单分割线
	 */
	public static final String Menus_MenusParam_Line = "1";

	/**
	 * 当设备为可管理时菜单显示标识
	 */
	public static final int Menus_isManager_Yes = 1;

	/**
	 * 当设备为snmp和非snmp协议时菜单显示标识
	 */
	public static final int Menus_Protocol_SNMPAndNOSNMP = 1;

	public static final String Report_TaskType_Day = "日任务";
	/**
	 * 报表任务类型：周
	 */
	public static final String Report_TaskType_Week = "周任务";

	/**
	 * 报表任务类型：月
	 */
	public static final String Report_TaskType_Month = "月任务";

	/**
	 * 报表任务类型：季度
	 */
	public static final String Report_TaskType_Quarter = "季度任务";

	public static final String Report_ExportPath_Day = "report" + File.separator + "dayReport";
	/**
	 * 周报表路径
	 */
	public static final String Report_ExportPath_Week = "report" + File.separator + "weekReport";

	/**
	 * 月报表路径
	 */
	public static final String Report_ExportPath_Month = "report" + File.separator + "monthReport";

	/**
	 * 季度报表路径
	 */
	public static final String Report_ExportPath_Quarter = "report" + File.separator + "quarterReport";

	/**
	 * 传递action值
	 */
	public static final String ActionWrite = "ActionWrite";

	/**
	 * 传递menu值
	 */
	public static final String MenuWrite = "MenuWrite";

	/**
	 * 通用模型标识
	 */
	public static final String CommomType_Model_Flag = "CommomTypeModel";

	/**
	 * 磁盘资源类型的逻辑类型常量
	 */
	public static final String ResourceType_LogicalType_Disk = "Disk";

	/**
	 * Cpu资源类型的逻辑类型常量
	 */
	public static final String ResourceType_LogicalType_Cpu = "Cpu";

	/**
	 * 内存资源类型的逻辑类型常量
	 */
	public static final String ResourceType_LogicalType_Memory = "Memory";

	/**
	 * 接口资源类型的逻辑类型常量
	 */
	public static final String ResourceType_LogicalType_Interface = "Interface";

	/**
	 * 中间件资源类型的逻辑类型常量
	 */
	public static final String ResourceType_LogicalType_Middleware = "Middleware";

	/**
	 * 数据库资源类型的逻辑类型常量
	 */
	public static final String ResourceType_LogicalType_DB = "Database";
	
	/**
     * jvm内存池资源类型的逻辑类型常量
     */
    public static final String ResourceType_LogicalType_JVMMemoryPool = "JVMMemoryPool";
    /**
     * jvm GC逻辑类型常量
     */
    public static final String ResourceType_LogicalType_JVMGC = "JVMGC";
    /**
     * jvm NioBufferPool逻辑类型常量
     */
    public static final String ResourceType_LogicalType_JVMNIOBufferPool = "JVMNIOBufferPool";
    
    /**
     * 设备上槽位资源 逻辑类型常量
     * add @ 2020.07.02
     */
    public static final String ResourceType_LogicalType_CardSlot = "CardSlot";
    /**
     * 板卡 逻辑类型常量
     * add @ 2020.07.02
     */
    public static final String ResourceType_LogicalType_BoardCard = "BoardCard";
    
    /**
     * jvm 虚拟机逻辑类型常量
     */
    public static final String ResourceType_LogicalType_JVMRuntime = "JVMRuntime";

	/**
	 * 进程资源类型的逻辑类型常量
	 */
	public static final String ResourceType_LogicalType_Process = "Process";

	/**
	 * 服务资源类型的逻辑类型常量
	 */
	public static final String ResourceType_LogicalType_Service = "Service";
	
	/**
     * 虚拟机 虚拟系统资源 类型的逻辑类型常量
     */
    public static final String ResourceType_LogicalType_VMOS = "VMOS";

    /**
     * 拓扑数据导入导出，数据库版本key
     */
    public static final String TopoDataDBVersion_Key = "TopoDataDBVersion";
    
    /** 
     * 拓扑数据导入导出，网络key 
     */
    public static final String TopoDataGroupNetworkList_Key = "TopoDataGroupNetworkList";
    
    /**
     * 拓扑数据导入导出，设备key
     */
    public static final String TopoDataNodeDeviceList_Key = "TopoDataNodeDeviceList";
    
    /**
     * 拓扑数据导入导出，链路key
     */
    public static final String TopoDataNodeLinkList_Key = "TopoDataNodeLinkList";
    
    /**
     * 拓扑数据导入导出，资源key
     */
    public static final String TopoDataNodeResourceObjectList_Key =
        "TopoDataNodeResourceObjectList";
    
    /**
     * 拓扑数据导入导出，任务key
     */
    public static final String TopoDataNodeMonitorTaskList_Key = "TopoDataNodeMonitorTaskList";
    
    /**
     * 链接信息信息名称
     */
    public static final String displayLinkInfo = "displaylinkinfo";
    /**
     * 显示链接信息
     */
    public static final int displayLinkInfo_YES = 1;
    
    /**
     * 不显示链接信息
     */
    public static final int displayLinkInfo_NO = 0;

    public static final String configFileUrl= "/share";
    
    /**
     * 用户操作日志
     */
    public static final int LOGTYPE_OPERATE = 1;
    
    /**
     * 发现日志
     */
    public static final int LOGTYPE_DISCOVER = 2;
    
    /**
     * 上线日志
     */
    public static final int LOGTYPE_ONLINE = 3;
    
    /**
     * 升级日志
     */
    public static final int LOGTYPE_UPGRADE = 4;
    
    /**
     * 成功
     */
    public static final int LOG_RESULT_SUCCESS = 1;
    
    /**
     * 失败
     */
    public static final int LOG_RESULT_FAIL = -1;
    
    /**
     * 无方向
     */
    public static final int Business_Direction_None =0;
    
    /**
     * 单向
     */
    public static final int Business_Direction_Single =1;
    
    /**
     * 双向
     */
    public static final int Business_Direction_Double =2;
    
    
    /**
     * 未激活
     */
    public static final int Business_Status_No =0;
    
    /**
     * 激活
     */
    public static final int Business_Status_Yes =1;
    
    /**
     * 设备类型
     */
    public static final String AlarmFilterList_FilterType_NodeType ="设备类型";
    /**
     * 资源类型
     */
    public static final String AlarmFilterList_FilterType_ResoureType ="资源类型";
    /**
     * 设备
     */
    public static final String AlarmFilterList_FilterType_NodeDevice ="设备";
    
    /**
     * 资源
     */
    public static final String AlarmFilterList_FilterType_NodeResourceObject ="资源";
    
    /**
     * 告警
     */
    public static final String AlarmFilterList_FilterType_CurrentAlarm ="告警";
    
    /**
     * 自动发现job
     */
    public static final String AUTOSEARCH_JOB ="AUTOSEARCH_JOB";
    
    /**
     * 自动发现job
     */
    public static final String AUTOSEARCH_TRIGGER ="AUTOSEARCH_TRIGGER";
    
    /**
     * 自动发现job
     */
    public static final String AUTOSEARCH_GROUP ="AUTOSEARCH_GROUP";
    
    /**
     * 钉钉告警服务  机器人参数 webhook
     */
	public static final String NmsSystemParam_DingWebhook = "DingWebhook";
	/**
     * 钉钉告警服务  机器人参数 secret
     */
	public static final String NmsSystemParam_DingSecret = "DingSecret";
	/**
     * 钉钉告警服务 是否开启
     */
	public static final String NmsSystemParam_DingIsStart = "DingIsStart";
	
	/**
     * 企业微信告警服务是否开启
     */
	public static final String NmsSystemParam_WorkWechatIsStart = "WeChatIsStart";
	
	
	/**
     * 企业微信告警服务参数企业ID   CorpId
     */
	public static final String NmsSystemParam_WorkWechatCorpId = "WorkWeChatCorpId";
	
	/**
     * 企业微信告警服务参数   agentid
     */
	public static final String NmsSystemParam_WorkWechatAgentId = "WorkWeChatAgentId";
	
	
	/**
     * 企业微信告警服务参数   secret
     */
	public static final String NmsSystemParam_WorkWechatSecret = "WorkWeChatSecret";
    /**
     * 设备命令 XML格式文件路径
     */
    public static String COMMANDXML_PATH="";
    
    static{
    		//开发工具启动的路径
//			COMMANDXML_PATH = ".." + File.separator + "sugarnms" + File.separator + "resources" + File.separator + "commandXML" + File.separator;//projectFile.getCanonicalPath()+File.separator+
			//脚本直接启动时 使用的路径
			COMMANDXML_PATH="resources/commandXML/" ;
    }
   /**
    * 备份文件的保存位置
    */
    public static String BACKUPFILE_PATH="resources/backUpFiles";
    
    
	/**
	 * 事件过滤方式，按网络条件过滤
	 */
    public static int EventFilter_Type_Group = 1; 
	
	/**
	 * 事件过滤方式，按设备条件过滤
	 */
    public static int EventFilter_Type_Node = 2; 
	/**
	 * 事件过滤方式（Syslog）
	 */
    public static int EventFilter_EventType_Syslog = 1; 
	
	/**
	 * 事件过滤类型（Trap）
	 */
    public static int EventFilter_EventType_Trap = 2; 
	/**
	 * 事件过滤参数类型（事件优先级）
	 */
    public static int EventFilterParam_Type_EventPriority = 1; 
	
	/**
	 * 事件过滤参数类型（事件类型）
	 */
    public static int EventFilterParam_Type_EventType = 2; 
	/**
	 * 事件过滤参数类型（事件标题）
	 */
    public static int EventFilterParam_Type_EventTitle = 3; 
	/**
	 * 事件过滤参数类型（事件内容）
	 */
    public static int EventFilterParam_Type_EventContent = 4; 
	/**
	 * 事件过滤参数类型（Trap OID）
	 */
    public static int EventFilterParam_Type_TripOID = 5; 
    
	/**
	 * 事件过滤参数条件（等于）
	 */
    public static int EventFilterParam_Type_Equal = 1; 
	/**
	 * 事件过滤参数条件（不等于）
	 */
    public static int EventFilterParam_Type_NotEqual = 2; 
	/**
	 * 事件过滤参数条件（包含）
	 */
    public static int EventFilterParam_Type_Contain = 3; 
	/**
	 * 事件过滤参数条件（不包含）
	 */
    public static int EventFilterParam_Type_NotContain = 4;

	/**
	 * 是否启用：启用
	 */
	public static int IsEnabled_Yes = 1;
	/**
	 * 是否启用：禁用
	 */
	public static int IsEnabled_No = 0;

	/**
	 *MAC-IP自动刷新参数
	 */
	public static final String MACIP_TIME = "maciptimerconfig";
}
