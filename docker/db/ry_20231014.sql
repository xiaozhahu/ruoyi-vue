SET NAMES 'utf8';

-- ----------------------------
-- 1、部门表
-- ----------------------------
drop table if exists sys_dept;
create table sys_dept (
  dept_id           bigint(20)      not null auto_increment    comment '部门id',
  parent_id         bigint(20)      default 0                  comment '父部门id',
  ancestors         varchar(50)     default ''                 comment '祖级列表',
  dept_name         varchar(30)     default ''                 comment '部门名称',
  order_num         int(4)          default 0                  comment '显示顺序',
  leader            varchar(20)     default null               comment '负责人',
  phone             varchar(11)     default null               comment '联系电话',
  email             varchar(50)     default null               comment '邮箱',
  status            char(1)         default '0'                comment '部门状态（0正常 1停用）',
  del_flag          char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time 	    datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (dept_id)
) engine=innodb auto_increment=200 comment = '部门表';

-- ----------------------------
-- 初始化-部门表数据
-- ----------------------------
insert into sys_dept values(100,  0,   '0',          '若依科技',   0, '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', sysdate(), '', null);
insert into sys_dept values(101,  100, '0,100',      '深圳总公司', 1, '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', sysdate(), '', null);
insert into sys_dept values(102,  100, '0,100',      '长沙分公司', 2, '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', sysdate(), '', null);
insert into sys_dept values(103,  101, '0,100,101',  '研发部门',   1, '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', sysdate(), '', null);
insert into sys_dept values(104,  101, '0,100,101',  '市场部门',   2, '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', sysdate(), '', null);
insert into sys_dept values(105,  101, '0,100,101',  '测试部门',   3, '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', sysdate(), '', null);
insert into sys_dept values(106,  101, '0,100,101',  '财务部门',   4, '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', sysdate(), '', null);
insert into sys_dept values(107,  101, '0,100,101',  '运维部门',   5, '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', sysdate(), '', null);
insert into sys_dept values(108,  102, '0,100,102',  '市场部门',   1, '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', sysdate(), '', null);
insert into sys_dept values(109,  102, '0,100,102',  '财务部门',   2, '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', sysdate(), '', null);


-- ----------------------------
-- 2、用户信息表
-- ----------------------------
drop table if exists sys_user;
create table sys_user (
  user_id           bigint(20)      not null auto_increment    comment '用户ID',
  dept_id           bigint(20)      default null               comment '部门ID',
  user_name         varchar(30)     not null                   comment '用户账号',
  nick_name         varchar(30)     not null                   comment '用户昵称',
  user_type         varchar(2)      default '00'               comment '用户类型（00系统用户）',
  email             varchar(50)     default ''                 comment '用户邮箱',
  phonenumber       varchar(11)     default ''                 comment '手机号码',
  sex               char(1)         default '0'                comment '用户性别（0男 1女 2未知）',
  avatar            varchar(100)    default ''                 comment '头像地址',
  password          varchar(100)    default ''                 comment '密码',
  status            char(1)         default '0'                comment '帐号状态（0正常 1停用）',
  del_flag          char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  login_ip          varchar(128)    default ''                 comment '最后登录IP',
  login_date        datetime                                   comment '最后登录时间',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (user_id)
) engine=innodb auto_increment=100 comment = '用户信息表';

-- ----------------------------
-- 初始化-用户信息表数据
-- ----------------------------
insert into sys_user values(1,  103, 'admin', '若依', '00', 'ry@163.com', '15888888888', '1', '', '$2a$10$7JB720yubVSZvUI0rEqK/.VqGOZTH.ulu33dHOiBE8ByOhJIrdAu2', '0', '0', '127.0.0.1', sysdate(), 'admin', sysdate(), '', null, '管理员');
insert into sys_user values(2,  105, 'ry',    '若依', '00', 'ry@qq.com',  '15666666666', '1', '', '$2a$10$7JB720yubVSZvUI0rEqK/.VqGOZTH.ulu33dHOiBE8ByOhJIrdAu2', '0', '0', '127.0.0.1', sysdate(), 'admin', sysdate(), '', null, '测试员');


-- ----------------------------
-- 3、岗位信息表
-- ----------------------------
drop table if exists sys_post;
create table sys_post
(
  post_id       bigint(20)      not null auto_increment    comment '岗位ID',
  post_code     varchar(64)     not null                   comment '岗位编码',
  post_name     varchar(50)     not null                   comment '岗位名称',
  post_sort     int(4)          not null                   comment '显示顺序',
  status        char(1)         not null                   comment '状态（0正常 1停用）',
  create_by     varchar(64)     default ''                 comment '创建者',
  create_time   datetime                                   comment '创建时间',
  update_by     varchar(64)     default ''			       comment '更新者',
  update_time   datetime                                   comment '更新时间',
  remark        varchar(500)    default null               comment '备注',
  primary key (post_id)
) engine=innodb comment = '岗位信息表';

-- ----------------------------
-- 初始化-岗位信息表数据
-- ----------------------------
insert into sys_post values(1, 'ceo',  '董事长',    1, '0', 'admin', sysdate(), '', null, '');
insert into sys_post values(2, 'se',   '项目经理',  2, '0', 'admin', sysdate(), '', null, '');
insert into sys_post values(3, 'hr',   '人力资源',  3, '0', 'admin', sysdate(), '', null, '');
insert into sys_post values(4, 'user', '普通员工',  4, '0', 'admin', sysdate(), '', null, '');


-- ----------------------------
-- 4、角色信息表
-- ----------------------------
drop table if exists sys_role;
create table sys_role (
  role_id              bigint(20)      not null auto_increment    comment '角色ID',
  role_name            varchar(30)     not null                   comment '角色名称',
  role_key             varchar(100)    not null                   comment '角色权限字符串',
  role_sort            int(4)          not null                   comment '显示顺序',
  data_scope           char(1)         default '1'                comment '数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）',
  menu_check_strictly  tinyint(1)      default 1                  comment '菜单树选择项是否关联显示',
  dept_check_strictly  tinyint(1)      default 1                  comment '部门树选择项是否关联显示',
  status               char(1)         not null                   comment '角色状态（0正常 1停用）',
  del_flag             char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
  create_by            varchar(64)     default ''                 comment '创建者',
  create_time          datetime                                   comment '创建时间',
  update_by            varchar(64)     default ''                 comment '更新者',
  update_time          datetime                                   comment '更新时间',
  remark               varchar(500)    default null               comment '备注',
  primary key (role_id)
) engine=innodb auto_increment=100 comment = '角色信息表';

-- ----------------------------
-- 初始化-角色信息表数据
-- ----------------------------
insert into sys_role values('1', '超级管理员',  'admin',  1, 1, 1, 1, '0', '0', 'admin', sysdate(), '', null, '超级管理员');
insert into sys_role values('2', '普通角色',    'common', 2, 2, 1, 1, '0', '0', 'admin', sysdate(), '', null, '普通角色');


-- ----------------------------
-- 5、菜单权限表
-- ----------------------------
drop table if exists sys_menu;
create table sys_menu (
  menu_id           bigint(20)      not null auto_increment    comment '菜单ID',
  menu_name         varchar(50)     not null                   comment '菜单名称',
  parent_id         bigint(20)      default 0                  comment '父菜单ID',
  order_num         int(4)          default 0                  comment '显示顺序',
  path              varchar(200)    default ''                 comment '路由地址',
  component         varchar(255)    default null               comment '组件路径',
  query             varchar(255)    default null               comment '路由参数',
  is_frame          int(1)          default 1                  comment '是否为外链（0是 1否）',
  is_cache          int(1)          default 0                  comment '是否缓存（0缓存 1不缓存）',
  menu_type         char(1)         default ''                 comment '菜单类型（M目录 C菜单 F按钮）',
  visible           char(1)         default 0                  comment '菜单状态（0显示 1隐藏）',
  status            char(1)         default 0                  comment '菜单状态（0正常 1停用）',
  perms             varchar(100)    default null               comment '权限标识',
  icon              varchar(100)    default '#'                comment '菜单图标',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default ''                 comment '备注',
  primary key (menu_id)
) engine=innodb auto_increment=2000 comment = '菜单权限表';

-- ----------------------------
-- 初始化-菜单信息表数据
-- ----------------------------
-- 一级菜单
insert into sys_menu values('1', '系统管理', '0', '1', 'system',           null, '', 1, 0, 'M', '0', '0', '', 'system',   'admin', sysdate(), '', null, '系统管理目录');
insert into sys_menu values('2', '系统监控', '0', '2', 'monitor',          null, '', 1, 0, 'M', '0', '0', '', 'monitor',  'admin', sysdate(), '', null, '系统监控目录');
insert into sys_menu values('3', '系统工具', '0', '3', 'tool',             null, '', 1, 0, 'M', '0', '0', '', 'tool',     'admin', sysdate(), '', null, '系统工具目录');
insert into sys_menu values('4', '若依官网', '0', '4', 'http://ruoyi.vip', null, '', 0, 0, 'M', '0', '0', '', 'guide',    'admin', sysdate(), '', null, '若依官网地址');
-- 二级菜单
insert into sys_menu values('100',  '用户管理', '1',   '1', 'user',       'system/user/index',        '', 1, 0, 'C', '0', '0', 'system:user:list',        'user',          'admin', sysdate(), '', null, '用户管理菜单');
insert into sys_menu values('101',  '角色管理', '1',   '2', 'role',       'system/role/index',        '', 1, 0, 'C', '0', '0', 'system:role:list',        'peoples',       'admin', sysdate(), '', null, '角色管理菜单');
insert into sys_menu values('102',  '菜单管理', '1',   '3', 'menu',       'system/menu/index',        '', 1, 0, 'C', '0', '0', 'system:menu:list',        'tree-table',    'admin', sysdate(), '', null, '菜单管理菜单');
insert into sys_menu values('103',  '部门管理', '1',   '4', 'dept',       'system/dept/index',        '', 1, 0, 'C', '0', '0', 'system:dept:list',        'tree',          'admin', sysdate(), '', null, '部门管理菜单');
insert into sys_menu values('104',  '岗位管理', '1',   '5', 'post',       'system/post/index',        '', 1, 0, 'C', '0', '0', 'system:post:list',        'post',          'admin', sysdate(), '', null, '岗位管理菜单');
insert into sys_menu values('105',  '字典管理', '1',   '6', 'dict',       'system/dict/index',        '', 1, 0, 'C', '0', '0', 'system:dict:list',        'dict',          'admin', sysdate(), '', null, '字典管理菜单');
insert into sys_menu values('106',  '参数设置', '1',   '7', 'config',     'system/config/index',      '', 1, 0, 'C', '0', '0', 'system:config:list',      'edit',          'admin', sysdate(), '', null, '参数设置菜单');
insert into sys_menu values('107',  '通知公告', '1',   '8', 'notice',     'system/notice/index',      '', 1, 0, 'C', '0', '0', 'system:notice:list',      'message',       'admin', sysdate(), '', null, '通知公告菜单');
insert into sys_menu values('108',  '日志管理', '1',   '9', 'log',        '',                         '', 1, 0, 'M', '0', '0', '',                        'log',           'admin', sysdate(), '', null, '日志管理菜单');
insert into sys_menu values('109',  '在线用户', '2',   '1', 'online',     'monitor/online/index',     '', 1, 0, 'C', '0', '0', 'monitor:online:list',     'online',        'admin', sysdate(), '', null, '在线用户菜单');
insert into sys_menu values('110',  '定时任务', '2',   '2', 'job',        'monitor/job/index',        '', 1, 0, 'C', '0', '0', 'monitor:job:list',        'job',           'admin', sysdate(), '', null, '定时任务菜单');
insert into sys_menu values('111',  '数据监控', '2',   '3', 'druid',      'monitor/druid/index',      '', 1, 0, 'C', '0', '0', 'monitor:druid:list',      'druid',         'admin', sysdate(), '', null, '数据监控菜单');
insert into sys_menu values('112',  '服务监控', '2',   '4', 'server',     'monitor/server/index',     '', 1, 0, 'C', '0', '0', 'monitor:server:list',     'server',        'admin', sysdate(), '', null, '服务监控菜单');
insert into sys_menu values('113',  '缓存监控', '2',   '5', 'cache',      'monitor/cache/index',      '', 1, 0, 'C', '0', '0', 'monitor:cache:list',      'redis',         'admin', sysdate(), '', null, '缓存监控菜单');
insert into sys_menu values('114',  '缓存列表', '2',   '6', 'cacheList',  'monitor/cache/list',       '', 1, 0, 'C', '0', '0', 'monitor:cache:list',      'redis-list',    'admin', sysdate(), '', null, '缓存列表菜单');
insert into sys_menu values('115',  '表单构建', '3',   '1', 'build',      'tool/build/index',         '', 1, 0, 'C', '0', '0', 'tool:build:list',         'build',         'admin', sysdate(), '', null, '表单构建菜单');
insert into sys_menu values('116',  '代码生成', '3',   '2', 'gen',        'tool/gen/index',           '', 1, 0, 'C', '0', '0', 'tool:gen:list',           'code',          'admin', sysdate(), '', null, '代码生成菜单');
insert into sys_menu values('117',  '系统接口', '3',   '3', 'swagger',    'tool/swagger/index',       '', 1, 0, 'C', '0', '0', 'tool:swagger:list',       'swagger',       'admin', sysdate(), '', null, '系统接口菜单');
-- 三级菜单
insert into sys_menu values('500',  '操作日志', '108', '1', 'operlog',    'monitor/operlog/index',    '', 1, 0, 'C', '0', '0', 'monitor:operlog:list',    'form',          'admin', sysdate(), '', null, '操作日志菜单');
insert into sys_menu values('501',  '登录日志', '108', '2', 'logininfor', 'monitor/logininfor/index', '', 1, 0, 'C', '0', '0', 'monitor:logininfor:list', 'logininfor',    'admin', sysdate(), '', null, '登录日志菜单');
-- 用户管理按钮
insert into sys_menu values('1000', '用户查询', '100', '1',  '', '', '', 1, 0, 'F', '0', '0', 'system:user:query',          '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1001', '用户新增', '100', '2',  '', '', '', 1, 0, 'F', '0', '0', 'system:user:add',            '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1002', '用户修改', '100', '3',  '', '', '', 1, 0, 'F', '0', '0', 'system:user:edit',           '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1003', '用户删除', '100', '4',  '', '', '', 1, 0, 'F', '0', '0', 'system:user:remove',         '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1004', '用户导出', '100', '5',  '', '', '', 1, 0, 'F', '0', '0', 'system:user:export',         '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1005', '用户导入', '100', '6',  '', '', '', 1, 0, 'F', '0', '0', 'system:user:import',         '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1006', '重置密码', '100', '7',  '', '', '', 1, 0, 'F', '0', '0', 'system:user:resetPwd',       '#', 'admin', sysdate(), '', null, '');
-- 角色管理按钮
insert into sys_menu values('1007', '角色查询', '101', '1',  '', '', '', 1, 0, 'F', '0', '0', 'system:role:query',          '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1008', '角色新增', '101', '2',  '', '', '', 1, 0, 'F', '0', '0', 'system:role:add',            '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1009', '角色修改', '101', '3',  '', '', '', 1, 0, 'F', '0', '0', 'system:role:edit',           '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1010', '角色删除', '101', '4',  '', '', '', 1, 0, 'F', '0', '0', 'system:role:remove',         '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1011', '角色导出', '101', '5',  '', '', '', 1, 0, 'F', '0', '0', 'system:role:export',         '#', 'admin', sysdate(), '', null, '');
-- 菜单管理按钮
insert into sys_menu values('1012', '菜单查询', '102', '1',  '', '', '', 1, 0, 'F', '0', '0', 'system:menu:query',          '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1013', '菜单新增', '102', '2',  '', '', '', 1, 0, 'F', '0', '0', 'system:menu:add',            '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1014', '菜单修改', '102', '3',  '', '', '', 1, 0, 'F', '0', '0', 'system:menu:edit',           '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1015', '菜单删除', '102', '4',  '', '', '', 1, 0, 'F', '0', '0', 'system:menu:remove',         '#', 'admin', sysdate(), '', null, '');
-- 部门管理按钮
insert into sys_menu values('1016', '部门查询', '103', '1',  '', '', '', 1, 0, 'F', '0', '0', 'system:dept:query',          '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1017', '部门新增', '103', '2',  '', '', '', 1, 0, 'F', '0', '0', 'system:dept:add',            '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1018', '部门修改', '103', '3',  '', '', '', 1, 0, 'F', '0', '0', 'system:dept:edit',           '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1019', '部门删除', '103', '4',  '', '', '', 1, 0, 'F', '0', '0', 'system:dept:remove',         '#', 'admin', sysdate(), '', null, '');
-- 岗位管理按钮
insert into sys_menu values('1020', '岗位查询', '104', '1',  '', '', '', 1, 0, 'F', '0', '0', 'system:post:query',          '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1021', '岗位新增', '104', '2',  '', '', '', 1, 0, 'F', '0', '0', 'system:post:add',            '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1022', '岗位修改', '104', '3',  '', '', '', 1, 0, 'F', '0', '0', 'system:post:edit',           '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1023', '岗位删除', '104', '4',  '', '', '', 1, 0, 'F', '0', '0', 'system:post:remove',         '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1024', '岗位导出', '104', '5',  '', '', '', 1, 0, 'F', '0', '0', 'system:post:export',         '#', 'admin', sysdate(), '', null, '');
-- 字典管理按钮
insert into sys_menu values('1025', '字典查询', '105', '1', '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:query',          '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1026', '字典新增', '105', '2', '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:add',            '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1027', '字典修改', '105', '3', '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:edit',           '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1028', '字典删除', '105', '4', '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:remove',         '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1029', '字典导出', '105', '5', '#', '', '', 1, 0, 'F', '0', '0', 'system:dict:export',         '#', 'admin', sysdate(), '', null, '');
-- 参数设置按钮
insert into sys_menu values('1030', '参数查询', '106', '1', '#', '', '', 1, 0, 'F', '0', '0', 'system:config:query',        '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1031', '参数新增', '106', '2', '#', '', '', 1, 0, 'F', '0', '0', 'system:config:add',          '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1032', '参数修改', '106', '3', '#', '', '', 1, 0, 'F', '0', '0', 'system:config:edit',         '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1033', '参数删除', '106', '4', '#', '', '', 1, 0, 'F', '0', '0', 'system:config:remove',       '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1034', '参数导出', '106', '5', '#', '', '', 1, 0, 'F', '0', '0', 'system:config:export',       '#', 'admin', sysdate(), '', null, '');
-- 通知公告按钮
insert into sys_menu values('1035', '公告查询', '107', '1', '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:query',        '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1036', '公告新增', '107', '2', '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:add',          '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1037', '公告修改', '107', '3', '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:edit',         '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1038', '公告删除', '107', '4', '#', '', '', 1, 0, 'F', '0', '0', 'system:notice:remove',       '#', 'admin', sysdate(), '', null, '');
-- 操作日志按钮
insert into sys_menu values('1039', '操作查询', '500', '1', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:operlog:query',      '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1040', '操作删除', '500', '2', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:operlog:remove',     '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1041', '日志导出', '500', '3', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:operlog:export',     '#', 'admin', sysdate(), '', null, '');
-- 登录日志按钮
insert into sys_menu values('1042', '登录查询', '501', '1', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:logininfor:query',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1043', '登录删除', '501', '2', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:logininfor:remove',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1044', '日志导出', '501', '3', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:logininfor:export',  '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1045', '账户解锁', '501', '4', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:logininfor:unlock',  '#', 'admin', sysdate(), '', null, '');
-- 在线用户按钮
insert into sys_menu values('1046', '在线查询', '109', '1', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:online:query',       '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1047', '批量强退', '109', '2', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:online:batchLogout', '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1048', '单条强退', '109', '3', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:online:forceLogout', '#', 'admin', sysdate(), '', null, '');
-- 定时任务按钮
insert into sys_menu values('1049', '任务查询', '110', '1', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:query',          '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1050', '任务新增', '110', '2', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:add',            '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1051', '任务修改', '110', '3', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:edit',           '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1052', '任务删除', '110', '4', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:remove',         '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1053', '状态修改', '110', '5', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:changeStatus',   '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1054', '任务导出', '110', '6', '#', '', '', 1, 0, 'F', '0', '0', 'monitor:job:export',         '#', 'admin', sysdate(), '', null, '');
-- 代码生成按钮
insert into sys_menu values('1055', '生成查询', '116', '1', '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:query',             '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1056', '生成修改', '116', '2', '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:edit',              '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1057', '生成删除', '116', '3', '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:remove',            '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1058', '导入代码', '116', '4', '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:import',            '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1059', '预览代码', '116', '5', '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:preview',           '#', 'admin', sysdate(), '', null, '');
insert into sys_menu values('1060', '生成代码', '116', '6', '#', '', '', 1, 0, 'F', '0', '0', 'tool:gen:code',              '#', 'admin', sysdate(), '', null, '');


-- ----------------------------
-- 6、用户和角色关联表  用户N-1角色
-- ----------------------------
drop table if exists sys_user_role;
create table sys_user_role (
  user_id   bigint(20) not null comment '用户ID',
  role_id   bigint(20) not null comment '角色ID',
  primary key(user_id, role_id)
) engine=innodb comment = '用户和角色关联表';

-- ----------------------------
-- 初始化-用户和角色关联表数据
-- ----------------------------
insert into sys_user_role values ('1', '1');
insert into sys_user_role values ('2', '2');


-- ----------------------------
-- 7、角色和菜单关联表  角色1-N菜单
-- ----------------------------
drop table if exists sys_role_menu;
create table sys_role_menu (
  role_id   bigint(20) not null comment '角色ID',
  menu_id   bigint(20) not null comment '菜单ID',
  primary key(role_id, menu_id)
) engine=innodb comment = '角色和菜单关联表';

-- ----------------------------
-- 初始化-角色和菜单关联表数据
-- ----------------------------
insert into sys_role_menu values ('2', '1');
insert into sys_role_menu values ('2', '2');
insert into sys_role_menu values ('2', '3');
insert into sys_role_menu values ('2', '4');
insert into sys_role_menu values ('2', '100');
insert into sys_role_menu values ('2', '101');
insert into sys_role_menu values ('2', '102');
insert into sys_role_menu values ('2', '103');
insert into sys_role_menu values ('2', '104');
insert into sys_role_menu values ('2', '105');
insert into sys_role_menu values ('2', '106');
insert into sys_role_menu values ('2', '107');
insert into sys_role_menu values ('2', '108');
insert into sys_role_menu values ('2', '109');
insert into sys_role_menu values ('2', '110');
insert into sys_role_menu values ('2', '111');
insert into sys_role_menu values ('2', '112');
insert into sys_role_menu values ('2', '113');
insert into sys_role_menu values ('2', '114');
insert into sys_role_menu values ('2', '115');
insert into sys_role_menu values ('2', '116');
insert into sys_role_menu values ('2', '117');
insert into sys_role_menu values ('2', '500');
insert into sys_role_menu values ('2', '501');
insert into sys_role_menu values ('2', '1000');
insert into sys_role_menu values ('2', '1001');
insert into sys_role_menu values ('2', '1002');
insert into sys_role_menu values ('2', '1003');
insert into sys_role_menu values ('2', '1004');
insert into sys_role_menu values ('2', '1005');
insert into sys_role_menu values ('2', '1006');
insert into sys_role_menu values ('2', '1007');
insert into sys_role_menu values ('2', '1008');
insert into sys_role_menu values ('2', '1009');
insert into sys_role_menu values ('2', '1010');
insert into sys_role_menu values ('2', '1011');
insert into sys_role_menu values ('2', '1012');
insert into sys_role_menu values ('2', '1013');
insert into sys_role_menu values ('2', '1014');
insert into sys_role_menu values ('2', '1015');
insert into sys_role_menu values ('2', '1016');
insert into sys_role_menu values ('2', '1017');
insert into sys_role_menu values ('2', '1018');
insert into sys_role_menu values ('2', '1019');
insert into sys_role_menu values ('2', '1020');
insert into sys_role_menu values ('2', '1021');
insert into sys_role_menu values ('2', '1022');
insert into sys_role_menu values ('2', '1023');
insert into sys_role_menu values ('2', '1024');
insert into sys_role_menu values ('2', '1025');
insert into sys_role_menu values ('2', '1026');
insert into sys_role_menu values ('2', '1027');
insert into sys_role_menu values ('2', '1028');
insert into sys_role_menu values ('2', '1029');
insert into sys_role_menu values ('2', '1030');
insert into sys_role_menu values ('2', '1031');
insert into sys_role_menu values ('2', '1032');
insert into sys_role_menu values ('2', '1033');
insert into sys_role_menu values ('2', '1034');
insert into sys_role_menu values ('2', '1035');
insert into sys_role_menu values ('2', '1036');
insert into sys_role_menu values ('2', '1037');
insert into sys_role_menu values ('2', '1038');
insert into sys_role_menu values ('2', '1039');
insert into sys_role_menu values ('2', '1040');
insert into sys_role_menu values ('2', '1041');
insert into sys_role_menu values ('2', '1042');
insert into sys_role_menu values ('2', '1043');
insert into sys_role_menu values ('2', '1044');
insert into sys_role_menu values ('2', '1045');
insert into sys_role_menu values ('2', '1046');
insert into sys_role_menu values ('2', '1047');
insert into sys_role_menu values ('2', '1048');
insert into sys_role_menu values ('2', '1049');
insert into sys_role_menu values ('2', '1050');
insert into sys_role_menu values ('2', '1051');
insert into sys_role_menu values ('2', '1052');
insert into sys_role_menu values ('2', '1053');
insert into sys_role_menu values ('2', '1054');
insert into sys_role_menu values ('2', '1055');
insert into sys_role_menu values ('2', '1056');
insert into sys_role_menu values ('2', '1057');
insert into sys_role_menu values ('2', '1058');
insert into sys_role_menu values ('2', '1059');
insert into sys_role_menu values ('2', '1060');

-- ----------------------------
-- 8、角色和部门关联表  角色1-N部门
-- ----------------------------
drop table if exists sys_role_dept;
create table sys_role_dept (
  role_id   bigint(20) not null comment '角色ID',
  dept_id   bigint(20) not null comment '部门ID',
  primary key(role_id, dept_id)
) engine=innodb comment = '角色和部门关联表';

-- ----------------------------
-- 初始化-角色和部门关联表数据
-- ----------------------------
insert into sys_role_dept values ('2', '100');
insert into sys_role_dept values ('2', '101');
insert into sys_role_dept values ('2', '105');


-- ----------------------------
-- 9、用户与岗位关联表  用户1-N岗位
-- ----------------------------
drop table if exists sys_user_post;
create table sys_user_post
(
  user_id   bigint(20) not null comment '用户ID',
  post_id   bigint(20) not null comment '岗位ID',
  primary key (user_id, post_id)
) engine=innodb comment = '用户与岗位关联表';

-- ----------------------------
-- 初始化-用户与岗位关联表数据
-- ----------------------------
insert into sys_user_post values ('1', '1');
insert into sys_user_post values ('2', '2');


-- ----------------------------
-- 10、操作日志记录
-- ----------------------------
drop table if exists sys_oper_log;
create table sys_oper_log (
  oper_id           bigint(20)      not null auto_increment    comment '日志主键',
  title             varchar(50)     default ''                 comment '模块标题',
  business_type     int(2)          default 0                  comment '业务类型（0其它 1新增 2修改 3删除）',
  method            varchar(100)    default ''                 comment '方法名称',
  request_method    varchar(10)     default ''                 comment '请求方式',
  operator_type     int(1)          default 0                  comment '操作类别（0其它 1后台用户 2手机端用户）',
  oper_name         varchar(50)     default ''                 comment '操作人员',
  dept_name         varchar(50)     default ''                 comment '部门名称',
  oper_url          varchar(255)    default ''                 comment '请求URL',
  oper_ip           varchar(128)    default ''                 comment '主机地址',
  oper_location     varchar(255)    default ''                 comment '操作地点',
  oper_param        varchar(2000)   default ''                 comment '请求参数',
  json_result       varchar(2000)   default ''                 comment '返回参数',
  status            int(1)          default 0                  comment '操作状态（0正常 1异常）',
  error_msg         varchar(2000)   default ''                 comment '错误消息',
  oper_time         datetime                                   comment '操作时间',
  cost_time         bigint(20)      default 0                  comment '消耗时间',
  primary key (oper_id),
  key idx_sys_oper_log_bt (business_type),
  key idx_sys_oper_log_s  (status),
  key idx_sys_oper_log_ot (oper_time)
) engine=innodb auto_increment=100 comment = '操作日志记录';


-- ----------------------------
-- 11、字典类型表
-- ----------------------------
drop table if exists sys_dict_type;
create table sys_dict_type
(
  dict_id          bigint(20)      not null auto_increment    comment '字典主键',
  dict_name        varchar(100)    default ''                 comment '字典名称',
  dict_type        varchar(100)    default ''                 comment '字典类型',
  status           char(1)         default '0'                comment '状态（0正常 1停用）',
  create_by        varchar(64)     default ''                 comment '创建者',
  create_time      datetime                                   comment '创建时间',
  update_by        varchar(64)     default ''                 comment '更新者',
  update_time      datetime                                   comment '更新时间',
  remark           varchar(500)    default null               comment '备注',
  primary key (dict_id),
  unique (dict_type)
) engine=innodb auto_increment=100 comment = '字典类型表';

insert into sys_dict_type values(1,  '用户性别', 'sys_user_sex',        '0', 'admin', sysdate(), '', null, '用户性别列表');
insert into sys_dict_type values(2,  '菜单状态', 'sys_show_hide',       '0', 'admin', sysdate(), '', null, '菜单状态列表');
insert into sys_dict_type values(3,  '系统开关', 'sys_normal_disable',  '0', 'admin', sysdate(), '', null, '系统开关列表');
insert into sys_dict_type values(4,  '任务状态', 'sys_job_status',      '0', 'admin', sysdate(), '', null, '任务状态列表');
insert into sys_dict_type values(5,  '任务分组', 'sys_job_group',       '0', 'admin', sysdate(), '', null, '任务分组列表');
insert into sys_dict_type values(6,  '系统是否', 'sys_yes_no',          '0', 'admin', sysdate(), '', null, '系统是否列表');
insert into sys_dict_type values(7,  '通知类型', 'sys_notice_type',     '0', 'admin', sysdate(), '', null, '通知类型列表');
insert into sys_dict_type values(8,  '通知状态', 'sys_notice_status',   '0', 'admin', sysdate(), '', null, '通知状态列表');
insert into sys_dict_type values(9,  '操作类型', 'sys_oper_type',       '0', 'admin', sysdate(), '', null, '操作类型列表');
insert into sys_dict_type values(10, '系统状态', 'sys_common_status',   '0', 'admin', sysdate(), '', null, '登录状态列表');
insert into sys_dict_type values (11, '设备类目', 'netm_device_category', '0', 'admin', sysdate(), '', null, '网络管理-设备类目列表');
insert into sys_dict_type values (12, '资源类目', 'netm_resource_category', '0', 'admin', sysdate(), '', null, '网络管理-资源类目列表');
insert into sys_dict_type values (13, '指标类目', 'netm_index_category', '0', 'admin', sysdate(), '', null, '网络管理-指标类目列表');
insert into sys_dict_type values (14, '设备模型', 'netm_device_model', '0', 'admin', sysdate(), '', null, '设备类型下资源、链路的固定识别和显示方式，下挂的发现和连通性监控方式，以及针对该型号进行在线升级等针对该型号的特殊处理方式。该参数是可自定义插件扩展接口，可通过编写插件并注入平台实现设备型号定制化处理，通常情况下选择：通用模型或不填写。');
insert into sys_dict_type values (15, '资源发现方法', 'netm_device_resource_search_way', '0', 'admin', sysdate(), '', null, '设备资源发现、匹配以及回显方式');
insert into sys_dict_type values (16, '监控协议', 'netm_protocol', '0', 'admin', sysdate(), '', null, '网络管理-监控协议');
insert into sys_dict_type values (17, '技术类型', 'netm_search_tool', '0', 'admin', sysdate(), '', null, '该资源类型的发现和监控所需要的技术。若该资源是通过SNMP协议的OID关联匹配的，且监控也基于SNMP协议OID的轮询进行，则配置SNMP即可');
insert into sys_dict_type values (18, '发现方法', 'netm_search_method', '0', 'admin', sysdate(), '', null, '资源发现的算法程序，通过该算法实现将设备所上支持的某种协议根据资源识别码所获取到的某个值或某些内容，并将其解析转换为软件设备上对应的资源对象。若获取到的结果为多个资源，需要将其对应的资源索引或对应的编号填充到资源编号属性作为该资源的唯一标识。该参数为插件扩展接口，可通过编写插件实现自定义资源解析');
insert into sys_dict_type values (19, '指标告警过滤规则', 'netm_index_alarm_filter', '0', 'admin', sysdate(), 'admin', null, '当前指标的告警、trap等故障监控的过滤方式选择，默认无需过滤可不填写该内容');
insert into sys_dict_type values (20, '指标数值类型', 'netm_index_value_type', '0', 'admin', sysdate(), '', null, '数值类 如 温度、丢包数;2,文本类 如：固件版本号、序列号;3,占比类 如：CPU、内存;4,时间类 如：最近访问时间;5,状态类 如：接口UP、接口Down');
insert into sys_dict_type values (21, '监视器类型', 'netm_monitor_type', '0', 'admin', sysdate(), '', null, '指标监视器。可选故障监视器、状态监视器、性能监视器。故障监视器用于判断值的大小超过预设值产生故障，状态监视器用于监控值的变化情况值状态值发生变化就会产生故障，性能监视器用于监视设备资源性能');
insert into sys_dict_type values (22, '指标监视器监视算法', 'netm_monitor_method', '0', 'admin', sysdate(), '', null, '监视器根据配置的监视目标，与设备交互获取到设备对应的结果值，并将获取的结果按照配置的顺序返回，系统自动根据运算式的运算表达式依次带入值进行运算。该参数为插件扩展接口，可通过编写插件实现自定义资源解析，另外系统默认提供了大部分设备通用或占用的监视算法');
insert into sys_dict_type values (23, '故障触发操作符', 'netm_monitor_condition_operator', '0', 'admin', sysdate(), '', null, '最后计算结果的故障触发条件设置');
insert into sys_dict_type values (24, 'Trap消息展现方式', 'netm_trap_display_mode', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_type values (25, 'Trap事件类型', 'netm_trap_event_type', '0', 'admin', sysdate(), '', null, '该Trap解析事件类型');
insert into sys_dict_type values (26, 'Trap版本', 'netm_trap_version', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_type values (27, '事件优先级', 'netm_trap_event_priority', '0', 'admin', sysdate(), '', null, 'Trap解析事件优先级');
insert into sys_dict_type values (28, 'Trap特殊解析器', 'netm_trap_special_parser', '0', 'admin', sysdate(), '', null, '特殊解析规则，针对不同设备、不同Trap消息需要做定制化开发');



-- ----------------------------
-- 12、字典数据表
-- ----------------------------
drop table if exists sys_dict_data;
create table sys_dict_data
(
  dict_code        bigint(20)      not null auto_increment    comment '字典编码',
  dict_sort        int(4)          default 0                  comment '字典排序',
  dict_label       varchar(100)    default ''                 comment '字典标签',
  dict_value       varchar(100)    default ''                 comment '字典键值',
  dict_type        varchar(100)    default ''                 comment '字典类型',
  css_class        varchar(100)    default null               comment '样式属性（其他样式扩展）',
  list_class       varchar(100)    default null               comment '表格回显样式',
  is_default       char(1)         default 'N'                comment '是否默认（Y是 N否）',
  status           char(1)         default '0'                comment '状态（0正常 1停用）',
  create_by        varchar(64)     default ''                 comment '创建者',
  create_time      datetime                                   comment '创建时间',
  update_by        varchar(64)     default ''                 comment '更新者',
  update_time      datetime                                   comment '更新时间',
  remark           varchar(500)    default null               comment '备注',
  primary key (dict_code)
) engine=innodb auto_increment=100 comment = '字典数据表';

insert into sys_dict_data values(1,  1,  '男',       '0',       'sys_user_sex',        '',   '',        'Y', '0', 'admin', sysdate(), '', null, '性别男');
insert into sys_dict_data values(2,  2,  '女',       '1',       'sys_user_sex',        '',   '',        'N', '0', 'admin', sysdate(), '', null, '性别女');
insert into sys_dict_data values(3,  3,  '未知',     '2',       'sys_user_sex',        '',   '',        'N', '0', 'admin', sysdate(), '', null, '性别未知');
insert into sys_dict_data values(4,  1,  '显示',     '0',       'sys_show_hide',       '',   'primary', 'Y', '0', 'admin', sysdate(), '', null, '显示菜单');
insert into sys_dict_data values(5,  2,  '隐藏',     '1',       'sys_show_hide',       '',   'danger',  'N', '0', 'admin', sysdate(), '', null, '隐藏菜单');
insert into sys_dict_data values(6,  1,  '正常',     '0',       'sys_normal_disable',  '',   'primary', 'Y', '0', 'admin', sysdate(), '', null, '正常状态');
insert into sys_dict_data values(7,  2,  '停用',     '1',       'sys_normal_disable',  '',   'danger',  'N', '0', 'admin', sysdate(), '', null, '停用状态');
insert into sys_dict_data values(8,  1,  '正常',     '0',       'sys_job_status',      '',   'primary', 'Y', '0', 'admin', sysdate(), '', null, '正常状态');
insert into sys_dict_data values(9,  2,  '暂停',     '1',       'sys_job_status',      '',   'danger',  'N', '0', 'admin', sysdate(), '', null, '停用状态');
insert into sys_dict_data values(10, 1,  '默认',     'DEFAULT', 'sys_job_group',       '',   '',        'Y', '0', 'admin', sysdate(), '', null, '默认分组');
insert into sys_dict_data values(11, 2,  '系统',     'SYSTEM',  'sys_job_group',       '',   '',        'N', '0', 'admin', sysdate(), '', null, '系统分组');
insert into sys_dict_data values(12, 1,  '是',       'Y',       'sys_yes_no',          '',   'primary', 'Y', '0', 'admin', sysdate(), '', null, '系统默认是');
insert into sys_dict_data values(13, 2,  '否',       'N',       'sys_yes_no',          '',   'danger',  'N', '0', 'admin', sysdate(), '', null, '系统默认否');
insert into sys_dict_data values(14, 1,  '通知',     '1',       'sys_notice_type',     '',   'warning', 'Y', '0', 'admin', sysdate(), '', null, '通知');
insert into sys_dict_data values(15, 2,  '公告',     '2',       'sys_notice_type',     '',   'success', 'N', '0', 'admin', sysdate(), '', null, '公告');
insert into sys_dict_data values(16, 1,  '正常',     '0',       'sys_notice_status',   '',   'primary', 'Y', '0', 'admin', sysdate(), '', null, '正常状态');
insert into sys_dict_data values(17, 2,  '关闭',     '1',       'sys_notice_status',   '',   'danger',  'N', '0', 'admin', sysdate(), '', null, '关闭状态');
insert into sys_dict_data values(18, 99, '其他',     '0',       'sys_oper_type',       '',   'info',    'N', '0', 'admin', sysdate(), '', null, '其他操作');
insert into sys_dict_data values(19, 1,  '新增',     '1',       'sys_oper_type',       '',   'info',    'N', '0', 'admin', sysdate(), '', null, '新增操作');
insert into sys_dict_data values(20, 2,  '修改',     '2',       'sys_oper_type',       '',   'info',    'N', '0', 'admin', sysdate(), '', null, '修改操作');
insert into sys_dict_data values(21, 3,  '删除',     '3',       'sys_oper_type',       '',   'danger',  'N', '0', 'admin', sysdate(), '', null, '删除操作');
insert into sys_dict_data values(22, 4,  '授权',     '4',       'sys_oper_type',       '',   'primary', 'N', '0', 'admin', sysdate(), '', null, '授权操作');
insert into sys_dict_data values(23, 5,  '导出',     '5',       'sys_oper_type',       '',   'warning', 'N', '0', 'admin', sysdate(), '', null, '导出操作');
insert into sys_dict_data values(24, 6,  '导入',     '6',       'sys_oper_type',       '',   'warning', 'N', '0', 'admin', sysdate(), '', null, '导入操作');
insert into sys_dict_data values(25, 7,  '强退',     '7',       'sys_oper_type',       '',   'danger',  'N', '0', 'admin', sysdate(), '', null, '强退操作');
insert into sys_dict_data values(26, 8,  '生成代码', '8',       'sys_oper_type',       '',   'warning', 'N', '0', 'admin', sysdate(), '', null, '生成操作');
insert into sys_dict_data values(27, 9,  '清空数据', '9',       'sys_oper_type',       '',   'danger',  'N', '0', 'admin', sysdate(), '', null, '清空操作');
insert into sys_dict_data values(28, 1,  '成功',     '0',       'sys_common_status',   '',   'primary', 'N', '0', 'admin', sysdate(), '', null, '正常状态');
insert into sys_dict_data values(29, 2,  '失败',     '1',       'sys_common_status',   '',   'danger',  'N', '0', 'admin', sysdate(), '', null, '停用状态');
insert into sys_dict_data values (30, 1, '服务器', '0', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (31, 2, '交换机', '1', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (32, 3, '路由器', '2', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (33, 6, 'PC', '5', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (34, 5, '防火墙', '4', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (35, 7, '虚拟机', '6', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (36, 8, '数据库', '7', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (37, 9, '中间件', '8', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (38, 4, '网络设备', '3', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (39, 10, '流量设备', '9', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (40, 11, '负载均衡', '10', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (41, 12, '途径设备', '11', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (42, 13, '其他', '12', 'netm_device_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (43, 1, '处理器', '0', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (44, 2, '内存', '1', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (45, 3, '网络接口', '2', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (46, 4, '磁盘', '3', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (47, 5, '服务', '4', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (48, 6, '进程', '5', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (49, 7, '数据库', '6', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (50, 8, '中间件', '7', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (51, 9, 'JVM', '8', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (52, 10, '板槽', '9', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (53, 11, '其他', '10', 'netm_resource_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (54, 1, '运行状态', '0', 'netm_index_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (55, 2, 'CPU使用率', '1', 'netm_index_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (56, 3, '内存使用率', '2', 'netm_index_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (57, 4, '输入流量', '3', 'netm_index_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (58, 5, '输出流量', '4', 'netm_index_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (59, 6, '上行带宽', '5', 'netm_index_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (60, 7, '下行带宽', '6', 'netm_index_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (61, 8, '磁盘使用率', '7', 'netm_index_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (62, 9, '数据库连接数', '8', 'netm_index_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (63, 10, 'JVM内存利用率', '9', 'netm_index_category', '', 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (64, 1, '通用模型', '0', 'netm_device_model', null, 'default', 'N', '0', 'admin', sysdate(), 'admin', null, null);
insert into sys_dict_data values (65, 1, '搜索方法', '0', 'netm_device_resource_search_way', null, 'default', 'N', '0', 'admin', sysdate(), '', null, '根据设备类型所配置的设备模板进行完全拷贝资源到当作当前设备的资源，不会到设备中去发现。通常用于配置设备面板图且资源类型、资源属性、资源数量和编号固定的设备型号。');
insert into sys_dict_data values (66, 2, '静态模板', '1', 'netm_device_resource_search_way', null, 'default', 'N', '0', 'admin', sysdate(), '', null, '根据设备类型所绑定的资源类型去设备进行发现。并将发现的结果以列表的方式展示。通常用于无需面板图且资源类型、资源属性、资源数量和编号都不固定的设备型号，系统默认选择该策略');
insert into sys_dict_data values (67, 1, 'SNMP', '0', 'netm_protocol', null, 'default', 'N', '0', 'admin', sysdate(), '', null, 'SNMP协议');
insert into sys_dict_data values (68, 1, 'SNMP表', '0', 'netm_search_tool', null, 'default', 'N', '0', 'admin', sysdate(), '', null, '若该资源是通过SNMP协议的OID关联匹配的，且监控也基于SNMP协议OID的轮询进行，则配置SNMP表即可');
insert into sys_dict_data values (69, 1, '通用SNMP表发现方法', '0', 'netm_search_method', null, 'default', 'N', '0', 'admin', sysdate(), '', null, '通用表发现方法，设备名称和设备参数必须填写，监视目标填写表OID，无需填写括号');
insert into sys_dict_data values (70, 1, '告警白名单过滤', '0', 'netm_index_alarm_filter', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (71, 2, '告警次数过滤', '1', 'netm_index_alarm_filter', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (72, 3, '告警时长过滤', '2', 'netm_index_alarm_filter', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (73, 1, '数值类', '0', 'netm_index_value_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (74, 2, '文本类', '1', 'netm_index_value_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (75, 3, '占比类', '2', 'netm_index_value_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (76, 4, '时间类', '3', 'netm_index_value_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (77, 5, '状态类', '4', 'netm_index_value_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (78, 1, '故障监视器', '0', 'netm_monitor_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (79, 2, '状态监视器', '1', 'netm_monitor_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (80, 3, '性能监视器', '2', 'netm_monitor_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (81, 1, 'CPU 使用率监视器', '0', 'netm_monitor_method', null, 'default', 'N', '0', 'admin', sysdate(), '', null, 'cpu使用率监视，只支持通用HOST-RESOURCES-MIB，多核cpu取平均值(hrProcessorLoad1.3.6.1.2.1.25.3.3.1.2)');
insert into sys_dict_data values (82, 2, '连通性监视器', '1', 'netm_monitor_method', null, 'default', 'N', '0', 'admin', sysdate(), '', null, '默认所有设备的系统连通性监视器算法，该连通性任务的执行通过获取设备类型所绑定的设备模型进行连通性判断');
insert into sys_dict_data values (83, 3, 'SNMP代理活动监视器', '2', 'netm_monitor_method', null, 'default', 'N', '0', 'admin', sysdate(), '', null, 'SNMP Ageng活动状态监视,监视目标较容易获取的叶子OID');
insert into sys_dict_data values (84, 4, 'SNMP响应时间监视器', '3', 'netm_monitor_method', null, 'default', 'N', '0', 'admin', sysdate(), '', null, 'TCP服务端口监视,SNMP延迟时间，监视参数，较容易获得的叶子节点OID');
insert into sys_dict_data values (85, 5, 'SNMP简单数据监视器', '4', 'netm_monitor_method', null, 'default', 'N', '0', 'admin', sysdate(), '', null, '简单数据监视 获取指定OID数据 不支持运算 &lt;1.3.6.1.2.1.25.3.3.1.2.&gt; 代替索引，如果监视参数不为空，则去除采集数据中的单位，比如 ，监视参数为 % 去除值为 10% 采集结果就为10');
insert into sys_dict_data values (86, 1, '=', '0', 'netm_monitor_condition_operator', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (87, 2, '>=', '1', 'netm_monitor_condition_operator', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (88, 3, '<=', '2', 'netm_monitor_condition_operator', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (89, 4, '!=', '3', 'netm_monitor_condition_operator', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (90, 5, '<>', '4', 'netm_monitor_condition_operator', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (91, 6, '!<>', '5', 'netm_monitor_condition_operator', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (93, 1, '告警', '0', 'netm_trap_display_mode', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (94, 2, '事件', '1', 'netm_trap_display_mode', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (95, 1, '认证相关', '0', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (96, 2, '授权相关', '1', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (97, 3, '任务计划相关', '2', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (98, 4, '守护进程相关', '3', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (99, 5, '内核相关', '4', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (100, 6, '安全相关', '5', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (101, 7, '打印相关', '6', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (102, 8, '用户相关', '7', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (103, 9, 'IP-MAC绑定', '8', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (104, 10, 'IP使用', '9', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (105, 16, '其他', '15', 'netm_trap_event_type', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (106, 1, 'V1', '0', 'netm_trap_version', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (107, 2, 'V2', '1', 'netm_trap_version', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (108, 1, '低级', '0', 'netm_trap_event_priority', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (109, 2, '中级', '1', 'netm_trap_event_priority', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (110, 3, '高级', '2', 'netm_trap_event_priority', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (111, 4, '紧急', '3', 'netm_trap_event_priority', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (112, 1, 'Common trap proccessor', '0', 'netm_trap_special_parser', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (113, 2, 'one-to-more trap proccessor', '1', 'netm_trap_special_parser', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (114, 3, 'HM IP Conflict Trap Proccessor', '2', 'netm_trap_special_parser', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (115, 4, 'MOXA MACIP Conflict Proccessor', '3', 'netm_trap_special_parser', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (116, 5, 'HM Ring Red Proccessor', '4', 'netm_trap_special_parser', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (117, 6, 'MOXA Ring Red Proccessor', '5', 'netm_trap_special_parser', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);
insert into sys_dict_data values (118, 7, ' Westermo Ring Red Proccessor', '6', 'netm_trap_special_parser', null, 'default', 'N', '0', 'admin', sysdate(), '', null, null);

-- ----------------------------
-- 13、参数配置表
-- ----------------------------
drop table if exists sys_config;
create table sys_config (
  config_id         int(5)          not null auto_increment    comment '参数主键',
  config_name       varchar(100)    default ''                 comment '参数名称',
  config_key        varchar(100)    default ''                 comment '参数键名',
  config_value      varchar(500)    default ''                 comment '参数键值',
  config_type       char(1)         default 'N'                comment '系统内置（Y是 N否）',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (config_id)
) engine=innodb auto_increment=100 comment = '参数配置表';

insert into sys_config values(1, '主框架页-默认皮肤样式名称',     'sys.index.skinName',            'skin-blue',     'Y', 'admin', sysdate(), '', null, '蓝色 skin-blue、绿色 skin-green、紫色 skin-purple、红色 skin-red、黄色 skin-yellow' );
insert into sys_config values(2, '用户管理-账号初始密码',         'sys.user.initPassword',         '123456',        'Y', 'admin', sysdate(), '', null, '初始化密码 123456' );
insert into sys_config values(3, '主框架页-侧边栏主题',           'sys.index.sideTheme',           'theme-dark',    'Y', 'admin', sysdate(), '', null, '深色主题theme-dark，浅色主题theme-light' );
insert into sys_config values(4, '账号自助-验证码开关',           'sys.account.captchaEnabled',    'true',          'Y', 'admin', sysdate(), '', null, '是否开启验证码功能（true开启，false关闭）');
insert into sys_config values(5, '账号自助-是否开启用户注册功能', 'sys.account.registerUser',      'false',         'Y', 'admin', sysdate(), '', null, '是否开启注册用户功能（true开启，false关闭）');
insert into sys_config values(6, '用户登录-黑名单列表',           'sys.login.blackIPList',         '',              'Y', 'admin', sysdate(), '', null, '设置登录IP黑名单限制，多个匹配项以;分隔，支持匹配（*通配、网段）');


-- ----------------------------
-- 14、系统访问记录
-- ----------------------------
drop table if exists sys_logininfor;
create table sys_logininfor (
  info_id        bigint(20)     not null auto_increment   comment '访问ID',
  user_name      varchar(50)    default ''                comment '用户账号',
  ipaddr         varchar(128)   default ''                comment '登录IP地址',
  login_location varchar(255)   default ''                comment '登录地点',
  browser        varchar(50)    default ''                comment '浏览器类型',
  os             varchar(50)    default ''                comment '操作系统',
  status         char(1)        default '0'               comment '登录状态（0成功 1失败）',
  msg            varchar(255)   default ''                comment '提示消息',
  login_time     datetime                                 comment '访问时间',
  primary key (info_id),
  key idx_sys_logininfor_s  (status),
  key idx_sys_logininfor_lt (login_time)
) engine=innodb auto_increment=100 comment = '系统访问记录';


-- ----------------------------
-- 15、定时任务调度表
-- ----------------------------
drop table if exists sys_job;
create table sys_job (
  job_id              bigint(20)    not null auto_increment    comment '任务ID',
  job_name            varchar(64)   default ''                 comment '任务名称',
  job_group           varchar(64)   default 'DEFAULT'          comment '任务组名',
  invoke_target       varchar(500)  not null                   comment '调用目标字符串',
  cron_expression     varchar(255)  default ''                 comment 'cron执行表达式',
  misfire_policy      varchar(20)   default '3'                comment '计划执行错误策略（1立即执行 2执行一次 3放弃执行）',
  concurrent          char(1)       default '1'                comment '是否并发执行（0允许 1禁止）',
  status              char(1)       default '0'                comment '状态（0正常 1暂停）',
  create_by           varchar(64)   default ''                 comment '创建者',
  create_time         datetime                                 comment '创建时间',
  update_by           varchar(64)   default ''                 comment '更新者',
  update_time         datetime                                 comment '更新时间',
  remark              varchar(500)  default ''                 comment '备注信息',
  primary key (job_id, job_name, job_group)
) engine=innodb auto_increment=100 comment = '定时任务调度表';

insert into sys_job values(1, '系统默认（无参）', 'DEFAULT', 'ryTask.ryNoParams',        '0/10 * * * * ?', '3', '1', '1', 'admin', sysdate(), '', null, '');
insert into sys_job values(2, '系统默认（有参）', 'DEFAULT', 'ryTask.ryParams(\'ry\')',  '0/15 * * * * ?', '3', '1', '1', 'admin', sysdate(), '', null, '');
insert into sys_job values(3, '系统默认（多参）', 'DEFAULT', 'ryTask.ryMultipleParams(\'ry\', true, 2000L, 316.50D, 100)',  '0/20 * * * * ?', '3', '1', '1', 'admin', sysdate(), '', null, '');


-- ----------------------------
-- 16、定时任务调度日志表
-- ----------------------------
drop table if exists sys_job_log;
create table sys_job_log (
  job_log_id          bigint(20)     not null auto_increment    comment '任务日志ID',
  job_name            varchar(64)    not null                   comment '任务名称',
  job_group           varchar(64)    not null                   comment '任务组名',
  invoke_target       varchar(500)   not null                   comment '调用目标字符串',
  job_message         varchar(500)                              comment '日志信息',
  status              char(1)        default '0'                comment '执行状态（0正常 1失败）',
  exception_info      varchar(2000)  default ''                 comment '异常信息',
  create_time         datetime                                  comment '创建时间',
  primary key (job_log_id)
) engine=innodb comment = '定时任务调度日志表';


-- ----------------------------
-- 17、通知公告表
-- ----------------------------
drop table if exists sys_notice;
create table sys_notice (
  notice_id         int(4)          not null auto_increment    comment '公告ID',
  notice_title      varchar(50)     not null                   comment '公告标题',
  notice_type       char(1)         not null                   comment '公告类型（1通知 2公告）',
  notice_content    longblob        default null               comment '公告内容',
  status            char(1)         default '0'                comment '公告状态（0正常 1关闭）',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(255)    default null               comment '备注',
  primary key (notice_id)
) engine=innodb auto_increment=10 comment = '通知公告表';

-- ----------------------------
-- 初始化-公告信息表数据
-- ----------------------------
insert into sys_notice values('1', '温馨提醒：2018-07-01 若依新版本发布啦', '2', '新版本内容', '0', 'admin', sysdate(), '', null, '管理员');
insert into sys_notice values('2', '维护通知：2018-07-01 若依系统凌晨维护', '1', '维护内容',   '0', 'admin', sysdate(), '', null, '管理员');


-- ----------------------------
-- 18、代码生成业务表
-- ----------------------------
drop table if exists gen_table;
create table gen_table (
  table_id          bigint(20)      not null auto_increment    comment '编号',
  table_name        varchar(200)    default ''                 comment '表名称',
  table_comment     varchar(500)    default ''                 comment '表描述',
  sub_table_name    varchar(64)     default null               comment '关联子表的表名',
  sub_table_fk_name varchar(64)     default null               comment '子表关联的外键名',
  class_name        varchar(100)    default ''                 comment '实体类名称',
  tpl_category      varchar(200)    default 'crud'             comment '使用的模板（crud单表操作 tree树表操作）',
  package_name      varchar(100)                               comment '生成包路径',
  module_name       varchar(30)                                comment '生成模块名',
  business_name     varchar(30)                                comment '生成业务名',
  function_name     varchar(50)                                comment '生成功能名',
  function_author   varchar(50)                                comment '生成功能作者',
  gen_type          char(1)         default '0'                comment '生成代码方式（0zip压缩包 1自定义路径）',
  gen_path          varchar(200)    default '/'                comment '生成路径（不填默认项目路径）',
  options           varchar(1000)                              comment '其它生成选项',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time 	    datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  remark            varchar(500)    default null               comment '备注',
  primary key (table_id)
) engine=innodb auto_increment=1 comment = '代码生成业务表';


-- ----------------------------
-- 19、代码生成业务表字段
-- ----------------------------
drop table if exists gen_table_column;
create table gen_table_column (
  column_id         bigint(20)      not null auto_increment    comment '编号',
  table_id          bigint(20)                                 comment '归属表编号',
  column_name       varchar(200)                               comment '列名称',
  column_comment    varchar(500)                               comment '列描述',
  column_type       varchar(100)                               comment '列类型',
  java_type         varchar(500)                               comment 'JAVA类型',
  java_field        varchar(200)                               comment 'JAVA字段名',
  is_pk             char(1)                                    comment '是否主键（1是）',
  is_increment      char(1)                                    comment '是否自增（1是）',
  is_required       char(1)                                    comment '是否必填（1是）',
  is_insert         char(1)                                    comment '是否为插入字段（1是）',
  is_edit           char(1)                                    comment '是否编辑字段（1是）',
  is_list           char(1)                                    comment '是否列表字段（1是）',
  is_query          char(1)                                    comment '是否查询字段（1是）',
  query_type        varchar(200)    default 'EQ'               comment '查询方式（等于、不等于、大于、小于、范围）',
  html_type         varchar(200)                               comment '显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）',
  dict_type         varchar(200)    default ''                 comment '字典类型',
  sort              int                                        comment '排序',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time 	    datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (column_id)
) engine=innodb auto_increment=1 comment = '代码生成业务表字段';

drop table if exists netm_device;
create table netm_device
(
    device_id            bigint auto_increment primary key,
    name                 varchar(256)                not null comment '设备名称',
    `desc`               varchar(640)                null comment '描述信息',
    model                varchar(384)                null,
    category             varchar(256) default '其他'   not null comment '设备类别',
    firmware_suffix      varchar(64)  default '.bin' null,
    icon                 varchar(256)                null,
    discovery_way        varchar(128) default '搜索方法' null comment '资源发现方法',
    background_image     varchar(256)                null,
    protocol             varchar(128) default 'SNMP' not null comment '监控协议',
    web_url              varchar(256)                null comment 'web访问地址',
    sys_oid              varchar(1024)               null,
    enabled              tinyint(1)   default 1      null,
    topo_locked          tinyint(1)   default 0      null comment '是否锁定在拓扑图中的位置',
    topo_show_name       tinyint(1)   default 1      null comment '是否在拓扑图中显示资源名称',
    topo_full_screen     tinyint(1)   default 0      null comment '是否在全屏模式下显示该设备类型',
    desc_contain_matcher varchar(1024)               null comment '系统描述包含匹配',
    create_time          datetime                    null,
    create_by            varchar(64)  default ''     null,
    update_by            varchar(64)  default ''     null,
    update_time          datetime                    null,
    remark               varchar(500) default ''     null
) comment '设备';

drop table if exists netm_resource;
create table netm_resource
(
    resource_id      bigint auto_increment primary key,
    name             varchar(256)                not null,
    icon             varchar(256)                not null,
    category         varchar(256)                null,
    code             varchar(128)                null comment '资源识别码,暂时仅支持oid',
    protocol         varchar(128) default 'SNMP' null,
    discovery_way    varchar(256)                null,
    param_name       varchar(128)                null comment '资源名称',
    param_value      varchar(64)                 null,
    param_desc       varchar(512)                null,
    parent           varchar(128)                null comment '父资源',
    un_managed_style tinyint(1)   default 0      null comment '不可管理资源是否需要特殊显示',
    linkable         tinyint(1)   default 0      null comment '是否支持连接',
    device_improved  tinyint(1)   default 0      null comment '是否提升为设备',
    enabled          tinyint(1)   default 1      null,
    upper_layer      tinyint(1)   default 0      null comment '是否显示图层靠前',
    create_time      datetime                    null,
    create_by        varchar(64)  default ''     null,
    update_time      datetime                    null,
    update_by        varchar(64)  default ''     null,
    remark           varchar(500)                null,
    constraint netm_resource_name_uindex unique (name)
) comment '资源';

drop table if exists netm_index;
create table netm_index
(
    index_id     bigint auto_increment primary key,
    category     varchar(256)           not null,
    unit         varchar(64)            not null comment '指标单位',
    alarm_filter varchar(128)           null comment '过滤规则',
    param        varchar(64)            null,
    name         varchar(256)           not null,
    priority     int                    null comment '指标关键程度',
    value_type   varchar(64)            null comment '指标数值类型',
    create_time  datetime               null,
    create_by    varchar(64) default '' null,
    update_by    varchar(64) default '' null,
    update_time  datetime               null,
    `desc`       varchar(500)           null comment '指标描述',
    remark       varchar(500)           null,
    constraint netm_index_name_uindex unique (name)
) comment '指标';

drop table if exists netm_index_monitor;
create table netm_index_monitor
(
    monitor_id          bigint auto_increment primary key,
    name                varchar(256)           not null,
    `desc`              varchar(500)           null comment '监视器描述',
    resource            varchar(256)           not null comment '资源类型',
    `index`             varchar(256)           not null comment '监控的指标',
    monitor_way         varchar(256)           not null comment '监控算法',
    target_param        varchar(512)           null comment '监控目标',
    expression          varchar(512)           null comment '运算表达式',
    `interval`          int         default 30 not null comment '监控周期',
    operator            varchar(32)            null comment '判断条件操作符',
    serious_threshold   int                    not null,
    primary_threshold   int                    not null,
    secondary_threshold int                    not null,
    cause               varchar(256)           null comment '故障原因设定',
    advice              varchar(256)           null comment '处理建议',
    parser              varchar(256)           null comment '解析表达式',
    auto_run            tinyint(1)  default 1  null,
    counter             tinyint(1)  default 0  null comment '是否需要计数',
    enabled             tinyint(1)  default 1  null,
    create_time         datetime               null,
    create_by           varchar(64) default '' null,
    update_time         datetime               null,
    update_by           varchar(64) default '' null,
    remark              varchar(500)           null,
    constraint netm_index_monitor_name_uindex unique (name)
) comment '指标监视器';

drop table if exists netm_trap_monitor;
create table netm_trap_monitor
(
    monitor_id          bigint auto_increment primary key,
    name                varchar(256)              not null,
    trap_oid            varchar(128)              not null,
    `desc`              varchar(500)              null comment '监视器描述',
    formatter           varchar(512)              null comment 'trap消息模板',
    display_mode        varchar(64)               null comment '展现方式',
    event_type          varchar(256)              null comment '时间类型',
    priority            varchar(64)               null comment '事件优先级',
    trap_version        varchar(64)               null comment 'trap版本',
    v1_standard_type    varchar(128)              null,
    v1_private_type     varchar(128) default '-1' null,
    resource            varchar(256)              not null comment '资源类型',
    resource_oid        varchar(128)              null comment 'trap消息中对应的资源oid',
    value_oid           varchar(128)              null comment 'trap消息中监视的值oid',
    desc_oid            varchar(128)              null comment 'trap消息中对应的描述iod',
    `index`             varchar(256)              not null comment '监控的指标',
    operator            varchar(32)               null comment '判断条件操作符',
    serious_threshold   int                       not null,
    primary_threshold   int                       not null,
    secondary_threshold int                       not null,
    cause               varchar(256)              null comment '故障原因设定',
    special_parser      tinyint(1)                null comment '是否需要特殊解析器',
    parser_processor    varchar(256)              null comment '特殊解析器算法',
    enabled             tinyint(1)   default 1    null,
    create_time         datetime                  null,
    create_by           varchar(64)  default ''   null,
    update_by           varchar(64)  default ''   null,
    update_time         datetime                  null,
    remark              varchar(500)              null,
    constraint netm_index_monitor_name_uindex unique (name)
) comment 'Trap监视器';