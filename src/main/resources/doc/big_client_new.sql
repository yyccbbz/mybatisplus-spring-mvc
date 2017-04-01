/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50632
Source Host           : localhost:3306
Source Database       : big_client_new

Target Server Type    : MYSQL
Target Server Version : 50632
File Encoding         : 65001

Date: 2017-04-01 17:24:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cl_allot_user
-- ----------------------------
DROP TABLE IF EXISTS `cl_allot_user`;
CREATE TABLE `cl_allot_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `register_date` varchar(20) DEFAULT NULL COMMENT '注册日期',
  `id_card` varchar(20) DEFAULT NULL COMMENT '证件号码',
  `if_employee` varchar(20) DEFAULT NULL COMMENT '是否员工',
  `assets_amount` varchar(100) DEFAULT NULL COMMENT '资产总额',
  `sex` varchar(20) DEFAULT NULL COMMENT '性别',
  `age` varchar(20) DEFAULT NULL COMMENT '年龄',
  `birthday` varchar(20) DEFAULT NULL COMMENT '出生日期',
  `referrer` varchar(20) DEFAULT NULL COMMENT '扫码推荐人',
  `referrer_phone_number` varchar(20) DEFAULT NULL COMMENT '推荐人手机号',
  `if_referrer_employee` varchar(20) DEFAULT NULL COMMENT '推荐人是否员工',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `if_delete` int(4) DEFAULT '0' COMMENT '是否删除;0:未删除，1:删除',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=236305 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='平台待分配客户';

-- ----------------------------
-- Table structure for cl_excel
-- ----------------------------
DROP TABLE IF EXISTS `cl_excel`;
CREATE TABLE `cl_excel` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_id` bigint(20) DEFAULT NULL COMMENT '当前用户ID',
  `excel_name` varchar(100) DEFAULT NULL COMMENT 'Excel源文件名',
  `excel_real_name` varchar(100) DEFAULT NULL COMMENT 'Excel服务器文件名',
  `excel_real_path` varchar(200) DEFAULT NULL COMMENT 'Excel服务器路径',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for cl_ext_user
-- ----------------------------
DROP TABLE IF EXISTS `cl_ext_user`;
CREATE TABLE `cl_ext_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `if_register` varchar(20) DEFAULT NULL COMMENT '是否注册',
  `register_date` varchar(20) DEFAULT NULL COMMENT '注册日期',
  `if_real_name` varchar(20) DEFAULT NULL COMMENT '是否实名',
  `if_bind_card` varchar(20) DEFAULT NULL COMMENT '是否绑卡',
  `if_transaction` varchar(20) DEFAULT NULL COMMENT '是否有过交易',
  `referrer` varchar(20) DEFAULT NULL COMMENT '扫码推荐人',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `if_delete` int(4) DEFAULT '0' COMMENT '是否删除;0:未删除，1:删除',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=84711 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='外部拓展客户';

-- ----------------------------
-- Table structure for cl_ext_user_bak
-- ----------------------------
DROP TABLE IF EXISTS `cl_ext_user_bak`;
CREATE TABLE `cl_ext_user_bak` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `excel_id` bigint(20) NOT NULL COMMENT 'excel关联id',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `customer_name` varchar(20) DEFAULT NULL COMMENT '投顾上传的客户姓名（待匹配系统客户姓名）',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `if_effective` int(4) DEFAULT NULL COMMENT '是否有效（1：有效，0：无效）',
  `if_delete` int(4) DEFAULT '0' COMMENT '是否删除，0代表未删除，1代表删除',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注信息(用来记录上报无效的原因）',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `IDX_EXCEL_ID` (`excel_id`) USING BTREE,
  KEY `IDX_PHONE_NUMBER` (`phone_number`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3079 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='外部拓展客户（导入名单）';

-- ----------------------------
-- Table structure for cl_formal_user
-- ----------------------------
DROP TABLE IF EXISTS `cl_formal_user`;
CREATE TABLE `cl_formal_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `report_or_allot` varchar(20) DEFAULT NULL COMMENT '上报/分配',
  `report_or_allot_date` varchar(20) DEFAULT NULL COMMENT '上报/分配时间',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `if_delete` int(4) DEFAULT '0' COMMENT '是否删除;0:未删除，1:删除',
  `if_performance_pool` int(4) DEFAULT NULL COMMENT '是否业绩池（0：否，1：是）',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `ind_cl_formal_user_phone_number` (`phone_number`)
) ENGINE=InnoDB AUTO_INCREMENT=108519 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='正式客户名单';

-- ----------------------------
-- Table structure for cl_formal_user_version
-- ----------------------------
DROP TABLE IF EXISTS `cl_formal_user_version`;
CREATE TABLE `cl_formal_user_version` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_id` bigint(20) DEFAULT NULL COMMENT '客户ID',
  `advisor_id` bigint(20) DEFAULT NULL COMMENT '投顾ID',
  `version_no` varchar(20) DEFAULT NULL COMMENT '版本号:默认是1，依次递增',
  `start_date` datetime DEFAULT NULL COMMENT '分配起始日期',
  `end_date` datetime DEFAULT NULL COMMENT '分配结束日期，为NULL值表示没有结束日期',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=108519 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='正式名单的版本表，该表关联user和adviser,记录客户和投顾的对应关系。';

-- ----------------------------
-- Table structure for cl_performance_pool_list
-- ----------------------------
DROP TABLE IF EXISTS `cl_performance_pool_list`;
CREATE TABLE `cl_performance_pool_list` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `if_performance_pool` int(4) DEFAULT NULL COMMENT '是否业绩池（0：不计入，1：计入）',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`,`phone_number`),
  KEY `pool_list_phone_ind` (`phone_number`)
) ENGINE=InnoDB AUTO_INCREMENT=24297 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='业绩池名单';

-- ----------------------------
-- Table structure for history_users_center
-- ----------------------------
DROP TABLE IF EXISTS `history_users_center`;
CREATE TABLE `history_users_center` (
  `month` varchar(8) NOT NULL COMMENT '对比月份',
  `mobile_no` bigint(20) NOT NULL COMMENT '用户手机',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户姓名',
  `investment_adviser` varchar(50) DEFAULT NULL COMMENT '投资顾问',
  `aum_total` double(12,2) DEFAULT NULL COMMENT '资产余额',
  `huoke_coefficient` int(11) DEFAULT NULL COMMENT '投顾获客折算系数',
  PRIMARY KEY (`month`,`mobile_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for history_users_tougu
-- ----------------------------
DROP TABLE IF EXISTS `history_users_tougu`;
CREATE TABLE `history_users_tougu` (
  `month` varchar(8) NOT NULL COMMENT '对比月份',
  `mobile_no` bigint(20) NOT NULL COMMENT '用户手机',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户姓名',
  `investment_adviser` varchar(50) DEFAULT NULL COMMENT '投资顾问',
  `aum_total` double(12,2) DEFAULT NULL COMMENT '资产余额',
  `huoke_coefficient` int(11) DEFAULT NULL COMMENT '大客户中心获客折算系数',
  PRIMARY KEY (`month`,`mobile_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for kam_advisor
-- ----------------------------
DROP TABLE IF EXISTS `kam_advisor`;
CREATE TABLE `kam_advisor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `tid` bigint(20) DEFAULT NULL COMMENT '所属团队ID（advisor_team.id）',
  `serial_number` varchar(20) DEFAULT NULL COMMENT '投顾编号',
  `level` varchar(20) DEFAULT NULL COMMENT '投顾级别',
  `system_name` varchar(20) DEFAULT NULL COMMENT '系统登录用户名',
  `actual_name` varchar(20) DEFAULT NULL COMMENT '投顾姓名',
  `phone_number` varchar(20) DEFAULT NULL COMMENT '投顾手机号码',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注信息',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for kam_advisor_team
-- ----------------------------
DROP TABLE IF EXISTS `kam_advisor_team`;
CREATE TABLE `kam_advisor_team` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `team_name` varchar(20) DEFAULT NULL COMMENT '团队名称',
  `team_leader_id` bigint(20) DEFAULT NULL COMMENT '团队长ID（= advisor.id）',
  `area` varchar(20) DEFAULT NULL COMMENT '区域',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='投资顾问团队';

-- ----------------------------
-- Table structure for pa_current_package_regular_sales_scale_accounting
-- ----------------------------
DROP TABLE IF EXISTS `pa_current_package_regular_sales_scale_accounting`;
CREATE TABLE `pa_current_package_regular_sales_scale_accounting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `report_or_allot` int(4) DEFAULT NULL COMMENT '上报/分配',
  `report_or_allot_date` varchar(20) DEFAULT NULL COMMENT '上报/分配日期',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `base_product_name` varchar(50) DEFAULT NULL COMMENT '基础产品名称（活包定）',
  `purchase_amount` varchar(20) DEFAULT NULL COMMENT '申购金额',
  `current_assets_total` varchar(20) DEFAULT NULL COMMENT '现有资产---当前活期AUM（资产总额）',
  `purchase_date` varchar(20) DEFAULT NULL COMMENT '申购时间 0000-00-00 00:00:00',
  `monthly_purchase_amount_5` double(20,2) DEFAULT '0.00' COMMENT '申购金额/5',
  `performance_pool_coefficient` int(4) DEFAULT NULL COMMENT '业绩池系数',
  `effective_current_sales_scale` double(20,2) DEFAULT '0.00' COMMENT '有效金额（万元）',
  `deferred_next_month` double(20,2) DEFAULT '0.00' COMMENT '递延下月',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17745 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[业绩核算]-----[活包定销售规模核算]';

-- ----------------------------
-- Table structure for pa_current_sales_scale_accounting
-- ----------------------------
DROP TABLE IF EXISTS `pa_current_sales_scale_accounting`;
CREATE TABLE `pa_current_sales_scale_accounting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `report_or_allot` int(4) DEFAULT NULL COMMENT '上报/分配',
  `report_or_allot_date` varchar(20) DEFAULT NULL COMMENT '上报/分配日期',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `basic_product_name` varchar(50) DEFAULT NULL COMMENT '基础产品名称（活期）',
  `monthly_purchase_amount` double(20,2) DEFAULT '0.00' COMMENT '申购金额（万元）',
  `current_assets_total` varchar(20) DEFAULT NULL COMMENT '现有资产',
  `purchase_date` varchar(20) DEFAULT NULL COMMENT '申购日期',
  `monthly_purchase_amount_10` double(20,2) DEFAULT '0.00' COMMENT '申购金额/10（千元）',
  `performance_pool_coefficient` int(4) DEFAULT NULL COMMENT '业绩池系数',
  `effective_current_sales_scale` double(20,2) DEFAULT '0.00' COMMENT '有效金额（万元）',
  `deferred_next_month` double(20,2) DEFAULT '0.00' COMMENT '递延下月金额（万元）',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=194509 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[业绩核算]--[活期销售规模核算]--current sales scale accounting';

-- ----------------------------
-- Table structure for pa_customers_accounting
-- ----------------------------
DROP TABLE IF EXISTS `pa_customers_accounting`;
CREATE TABLE `pa_customers_accounting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `register_date` varchar(20) DEFAULT NULL COMMENT '注册日期',
  `ending_balance` varchar(20) DEFAULT NULL COMMENT '期末AUM',
  `ending_balance_time_point` varchar(20) DEFAULT NULL COMMENT '期末AUM时间点',
  `ending_not_less_than_fifty` int(4) DEFAULT '0' COMMENT '期末不小于50万系数（0：不符合条件，1：符合条件）',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `buy_amount` varchar(100) DEFAULT NULL COMMENT '投资金额',
  `current_amount_paid` varchar(100) DEFAULT NULL COMMENT '本期兑付金额',
  `beginning_balance` varchar(20) DEFAULT NULL COMMENT '期初AUM',
  `beginning_balance_time_point` varchar(20) DEFAULT NULL COMMENT '期初AUM时间点',
  `beginning_no_greater_than_fifty` int(4) DEFAULT '0' COMMENT '期初不大于50万系数（0：不符合条件，1：符合条件）',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `if_performance_pool` int(4) DEFAULT NULL COMMENT '业绩池系数（0：不计入，1：计入）',
  `advisor_get_customers` int(10) DEFAULT NULL COMMENT '投顾获客',
  `comparison_historical_advisor` int(10) DEFAULT NULL COMMENT '比对历史获客（投顾）',
  `advisor_get_customers_remove_duplicates` int(10) DEFAULT NULL COMMENT '投顾获客去重',
  `center_for_customers` int(10) DEFAULT NULL COMMENT '中心获客',
  `comparison_historical_center` int(10) DEFAULT NULL COMMENT '比对历史获客（中心）',
  `center_for_customers_remove_duplicates` int(10) DEFAULT NULL COMMENT '中心获客去重',
  `error_query` varchar(20) DEFAULT NULL COMMENT '差错查询（预留字段）',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=108519 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[业绩核算]--[获客数核算]--customers accounting';

-- ----------------------------
-- Table structure for pa_regular_sales_scale_accounting
-- ----------------------------
DROP TABLE IF EXISTS `pa_regular_sales_scale_accounting`;
CREATE TABLE `pa_regular_sales_scale_accounting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `referrer` varchar(20) DEFAULT NULL COMMENT '扫码推荐人',
  `rebate_expiration_date` varchar(20) DEFAULT NULL COMMENT '返利失效日期',
  `report_or_allot` varchar(20) DEFAULT NULL COMMENT '上报/分配',
  `report_or_allot_date` varchar(20) DEFAULT NULL COMMENT '上报/分配时间',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `basic_product_name` varchar(50) DEFAULT NULL COMMENT '基础产品名称（定期）',
  `investment_amount` varchar(20) DEFAULT NULL COMMENT '投资金额',
  `regular_assets_total` varchar(20) DEFAULT NULL COMMENT '现有资产---当前定期AUM（资产总额）',
  `investment_date` varchar(20) DEFAULT NULL COMMENT '购买时间 0000-00-00 00:00:00',
  `partition_coefficient` int(4) DEFAULT '0' COMMENT '分配系数',
  `performance_pool_coefficient` int(4) DEFAULT '0' COMMENT '业绩池系数',
  `product_coefficient` int(4) DEFAULT '0' COMMENT '产品系数',
  `effective_sales_amount` double(20,2) DEFAULT '0.00' COMMENT '有效销售金额（单位：元）',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=918261 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[业绩核算]--[定期销售规模核算]--regular sales scale accounting';

-- ----------------------------
-- Table structure for pr_constitute_customer
-- ----------------------------
DROP TABLE IF EXISTS `pr_constitute_customer`;
CREATE TABLE `pr_constitute_customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `investment_advisor` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `performance_customers_number` varchar(20) DEFAULT NULL COMMENT '计入业绩客户数',
  `pure_new_vip_customers` varchar(20) DEFAULT NULL COMMENT '纯新增vip客户数',
  `reported_customers_number` varchar(20) DEFAULT NULL COMMENT '上报客户数',
  `allot_customers_number` varchar(20) DEFAULT NULL COMMENT '分配客户数',
  `weekly_get_customers_number` varchar(20) DEFAULT NULL COMMENT '本周获客数',
  `current_vip_customers_number` varchar(20) DEFAULT NULL COMMENT '当前vip客户数',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[业绩报表]--[获客构成]--constitute customer';

-- ----------------------------
-- Table structure for pr_customer_conversion_rate
-- ----------------------------
DROP TABLE IF EXISTS `pr_customer_conversion_rate`;
CREATE TABLE `pr_customer_conversion_rate` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `investment_advisor` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `last_period_customers_number` varchar(20) DEFAULT NULL COMMENT '上期客户数',
  `current_period_customers_number` varchar(20) DEFAULT NULL COMMENT '本期客户数',
  `last_period_registered_customers_number` varchar(20) DEFAULT NULL COMMENT '上期注册客户数',
  `current_period_registered_customers_number` varchar(20) DEFAULT NULL COMMENT '本期注册客户数',
  `last_period_transaction_customers_number` varchar(20) DEFAULT NULL COMMENT '上期客户交易数',
  `current_period_transaction_customers_number` varchar(20) DEFAULT NULL COMMENT '本期客户交易数',
  `current_period_registered_customers_proportion` varchar(20) DEFAULT NULL COMMENT '本期注册客户占比',
  `customer_registration_growth_rate` varchar(20) DEFAULT NULL COMMENT '客户注册增长率',
  `current_period_transactions_customers_proportion` varchar(20) DEFAULT NULL COMMENT '本期交易客户占比',
  `customer_transaction_conversion_rate` varchar(20) DEFAULT NULL COMMENT '客户交易转换率',
  `current_period_customers_aum_growth_rate` varchar(20) DEFAULT NULL COMMENT '本期客户AUM增长率(期末基准)',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[业绩报表]--[客户转换率]--customer conversion rate';

-- ----------------------------
-- Table structure for pr_performance_report
-- ----------------------------
DROP TABLE IF EXISTS `pr_performance_report`;
CREATE TABLE `pr_performance_report` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `area` varchar(10) DEFAULT '' COMMENT '区域',
  `team_name` varchar(10) DEFAULT '' COMMENT '投顾组',
  `advisor_level` varchar(20) DEFAULT '' COMMENT '投顾级别',
  `investment_advisor` varchar(10) DEFAULT '' COMMENT '投资顾问',
  `current_vip_customers_number` int(10) DEFAULT '0' COMMENT '当前vip客户数(人数)',
  `performance_customers_aum` double(20,2) DEFAULT '0.00' COMMENT '计入业绩客户AUM值（亿元）',
  `performance_customers_number` int(10) DEFAULT '0' COMMENT '计入业绩客户数（人数）',
  `reported_customers_registered_growth_rate` varchar(20) DEFAULT '' COMMENT '上报客户数注册增长率',
  `reported_customers_transactions_growth_rate` varchar(20) DEFAULT '' COMMENT '上报客户交易数增长率',
  `monthly_regular_sales_scale` double(20,2) DEFAULT '0.00' COMMENT '本月定期销售规模（万元）',
  `monthly_current_sales_scale_conversion` double(20,2) DEFAULT '0.00' COMMENT '本月活期申购额折算后(万元) ',
  `monthly_cpr_sales_scale_conversion` double(20,2) DEFAULT '0.00' COMMENT '本月活包定申购额折算后（万元）',
  `monthly_sales_scale` double(20,2) DEFAULT '0.00' COMMENT '当前销售规模(万元)',
  `monthly_sales_scale_performance_targets` int(10) DEFAULT '0' COMMENT '月销售规模业绩目标(万元)',
  `sales_completion_rate` varchar(20) DEFAULT '' COMMENT '销售规模完成率',
  `team_sales_scale` double(20,2) DEFAULT '0.00' COMMENT '小组销售规模(万元)',
  `monthly_get_customers_number` int(10) DEFAULT '0' COMMENT '本月获客数(折算)',
  `monthly_get_customers_target` int(10) DEFAULT '0' COMMENT '月度获客业绩目标(折算)',
  `get_customers_completion_rate` varchar(20) DEFAULT '' COMMENT '获客完成率',
  `team_get_customers_number` int(10) DEFAULT '0' COMMENT '小组获客数量(折算)',
  `comprehensive_completion_rate` varchar(20) DEFAULT '' COMMENT '综合完成率',
  `comprehensive_completion_rate_ranking` int(10) DEFAULT '0' COMMENT '综合完成率排名',
  `team_comprehensive_completion_rate` varchar(20) DEFAULT '' COMMENT '小组综合完成率',
  `version` int(10) DEFAULT '0' COMMENT '版本（格式为年月 201612、201701）',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[业绩报表]--[业绩报表]--performance report';

-- ----------------------------
-- Table structure for pr_regular_payment
-- ----------------------------
DROP TABLE IF EXISTS `pr_regular_payment`;
CREATE TABLE `pr_regular_payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `product_name` varchar(20) DEFAULT NULL COMMENT '产品名称',
  `product_period` varchar(20) DEFAULT NULL COMMENT '产品期限',
  `year_days` varchar(20) DEFAULT NULL COMMENT '年天数',
  `principal` varchar(20) DEFAULT NULL COMMENT '本金',
  `product_revenue` varchar(20) DEFAULT NULL COMMENT '产品收益',
  `investment_advisor` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[业绩报表]--[定期兑付报表]--regular payment';

-- ----------------------------
-- Table structure for pr_return_payment_report
-- ----------------------------
DROP TABLE IF EXISTS `pr_return_payment_report`;
CREATE TABLE `pr_return_payment_report` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `phone_number` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `investment_advisor` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `product_name` varchar(20) DEFAULT NULL COMMENT '产品名称',
  `amount` varchar(20) DEFAULT NULL COMMENT '金额',
  `product_period` varchar(20) DEFAULT NULL COMMENT '产品期限',
  `product_interest_rate` varchar(20) DEFAULT NULL COMMENT '产品利率',
  `interest_date` varchar(20) DEFAULT NULL COMMENT '起息日',
  `expiry_date` varchar(20) DEFAULT NULL COMMENT '到期日',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[业绩报表]--[回款报表]';

-- ----------------------------
-- Table structure for sr_assets_balance
-- ----------------------------
DROP TABLE IF EXISTS `sr_assets_balance`;
CREATE TABLE `sr_assets_balance` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `register_date` varchar(20) DEFAULT NULL COMMENT '注册日期',
  `regular_assets_total` varchar(20) DEFAULT NULL COMMENT '当前定期AUM',
  `current_assets_total` varchar(20) DEFAULT NULL COMMENT '当前活期AUM',
  `crp_assets_total` varchar(20) DEFAULT NULL COMMENT '当活包定AUM',
  `aum_total` varchar(20) DEFAULT NULL COMMENT '当前总AUM',
  `aum_time_point` varchar(20) DEFAULT NULL COMMENT 'AUM时间点',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=108519 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[统计报表]--[资产余额]--assets balance';

-- ----------------------------
-- Table structure for sr_crp_payment_due
-- ----------------------------
DROP TABLE IF EXISTS `sr_crp_payment_due`;
CREATE TABLE `sr_crp_payment_due` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `product_name` varchar(20) DEFAULT NULL COMMENT '产品名称',
  `redemption_date` varchar(20) DEFAULT NULL COMMENT '兑付时间',
  `principal` varchar(20) DEFAULT NULL COMMENT '本金',
  `product_revenue` varchar(20) DEFAULT NULL COMMENT '产品收益',
  `transfer_amount` varchar(20) DEFAULT NULL COMMENT '划款金额',
  `investment_advisor` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[统计报表]--[活包定到期兑付报表]';

-- ----------------------------
-- Table structure for sr_current_package_regular_sales_details
-- ----------------------------
DROP TABLE IF EXISTS `sr_current_package_regular_sales_details`;
CREATE TABLE `sr_current_package_regular_sales_details` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `report_or_allot` int(4) DEFAULT NULL COMMENT '上报/分配',
  `report_or_allot_date` varchar(20) DEFAULT NULL COMMENT '上报/分配日期',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `base_product_name` varchar(50) DEFAULT NULL COMMENT '基础产品名称（活包定）',
  `purchase_amount` varchar(20) DEFAULT NULL COMMENT '申购金额',
  `current_assets_total` varchar(20) DEFAULT NULL COMMENT '现有资产---当前活期AUM（资产总额）',
  `purchase_date` varchar(20) DEFAULT NULL COMMENT '申购时间 0000-00-00 00:00:00',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17745 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[统计报表]-----[活包定销售明细]';

-- ----------------------------
-- Table structure for sr_current_redemption
-- ----------------------------
DROP TABLE IF EXISTS `sr_current_redemption`;
CREATE TABLE `sr_current_redemption` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `product_name` varchar(20) DEFAULT NULL COMMENT '产品名称',
  `redemption_date` varchar(20) DEFAULT NULL COMMENT '赎回时间',
  `redemption_amount` varchar(20) DEFAULT NULL COMMENT '赎回金额',
  `investment_advisor` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[统计报表]--[活期赎回报表]';

-- ----------------------------
-- Table structure for sr_current_sales_details
-- ----------------------------
DROP TABLE IF EXISTS `sr_current_sales_details`;
CREATE TABLE `sr_current_sales_details` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `report_or_allot` varchar(20) DEFAULT NULL COMMENT '上报/分配',
  `report_or_allot_date` varchar(20) DEFAULT NULL COMMENT '上报/分配时间',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `base_product_name` varchar(50) DEFAULT NULL COMMENT '基础产品名称（活期）',
  `purchase_amount` varchar(20) DEFAULT NULL COMMENT '申购金额',
  `current_assets_total` varchar(20) DEFAULT NULL COMMENT '现有资产---当前活期AUM（资产总额）',
  `purchase_date` varchar(20) DEFAULT NULL COMMENT '申购时间 0000-00-00 00:00:00',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=194509 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[统计报表]--[活期销售明细]--current sales details';

-- ----------------------------
-- Table structure for sr_regular_payment_due
-- ----------------------------
DROP TABLE IF EXISTS `sr_regular_payment_due`;
CREATE TABLE `sr_regular_payment_due` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `product_name` varchar(20) DEFAULT NULL COMMENT '产品名称',
  `redemption_date` varchar(20) DEFAULT NULL COMMENT '兑付时间',
  `principal` varchar(20) DEFAULT NULL COMMENT '本金',
  `product_revenue` varchar(20) DEFAULT NULL COMMENT '产品收益',
  `transfer_amount` varchar(20) DEFAULT NULL COMMENT '划款金额',
  `investment_advisor` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[统计报表]--[定期到期兑付报表]';

-- ----------------------------
-- Table structure for sr_regular_sales_details
-- ----------------------------
DROP TABLE IF EXISTS `sr_regular_sales_details`;
CREATE TABLE `sr_regular_sales_details` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自动编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `phone_number` bigint(20) NOT NULL COMMENT '手机号码',
  `referrer` varchar(20) DEFAULT NULL COMMENT '扫码推荐人',
  `rebate_expiration_date` varchar(20) DEFAULT NULL COMMENT '返利失效日期',
  `report_or_allot` varchar(20) DEFAULT NULL COMMENT '上报/分配',
  `report_or_allot_date` varchar(20) DEFAULT NULL COMMENT '上报/分配时间',
  `investment_adviser` varchar(20) DEFAULT NULL COMMENT '投资顾问',
  `user_identify` varchar(20) DEFAULT NULL COMMENT '客户标识',
  `basic_product_name` varchar(50) DEFAULT NULL COMMENT '基础产品名称（定期）',
  `investment_amount` varchar(20) DEFAULT NULL COMMENT '投资金额',
  `regular_assets_total` varchar(20) DEFAULT NULL COMMENT '现有资产---当前定期AUM（资产总额）',
  `investment_date` varchar(20) DEFAULT NULL COMMENT '购买时间 0000-00-00 00:00:00',
  `mtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=918261 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='[统计报表]--[定期销售明细]--regular sales details';
