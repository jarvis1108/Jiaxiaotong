/*
 Navicat MySQL Data Transfer

 Source Server         : MyDataTrans
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : 139.199.15.124:3306
 Source Schema         : reader_development

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 14/08/2018 14:43:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bd_conf
-- ----------------------------
DROP TABLE IF EXISTS `bd_conf`;
CREATE TABLE `bd_conf`  (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `prop_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '配置名称',
  `prop_key` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '配置键',
  `prop_value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '配置值',
  `prop_note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '配置备注',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配置记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bd_coupon
-- ----------------------------
DROP TABLE IF EXISTS `bd_coupon`;
CREATE TABLE `bd_coupon`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `coupon_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '优惠券名称',
  `coupon_total_count` int(11) NULL DEFAULT 0 COMMENT '优惠券发放总数 0为无限制',
  `coupon_current_count` int(11) NOT NULL DEFAULT 0 COMMENT '目前已发放数量',
  `coupon_discount_amount` decimal(10, 2) NULL DEFAULT NULL COMMENT '优惠券抵扣金额',
  `coupon_discount_rate` int(10) NULL DEFAULT NULL COMMENT '折扣',
  `coupon_least_cost` decimal(10, 2) NULL DEFAULT NULL COMMENT '满减门槛 默认空为无门槛',
  `coupon_accept_level_id` int(11) NULL DEFAULT NULL COMMENT '适用等级',
  `coupon_reject_level` int(11) NULL DEFAULT NULL COMMENT '不适用level id',
  `coupon_image_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '优惠券图片地址',
  `coupon_discount_limit` decimal(10, 2) NULL DEFAULT NULL COMMENT '折扣金额上限',
  `coupon_type` tinyint(3) NOT NULL DEFAULT 1 COMMENT '优惠券类型 0：满减劵  1：无门槛抵用 2：折扣卷',
  `coupon_expire` int(11) NOT NULL DEFAULT 0 COMMENT '优惠券过期时间 以天为单位 0为无限期',
  `coupon_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '优惠券创建时间',
  `coupon_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '优惠券修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '优惠券种类信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bd_course
-- ----------------------------
DROP TABLE IF EXISTS `bd_course`;
CREATE TABLE `bd_course`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `course_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程编号',
  `course_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '课程名称',
  `course_price` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '课程价格',
  `course_level` int(11) NOT NULL DEFAULT 0 COMMENT '课程等级 字典表',
  `course_level_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '课程等级描述（冗余字段）',
  `course_teacher_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程教师id 预留项 暂时不做',
  `course_teacher_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '教师名称（冗余字段）',
  `course_day_count` int(11) NOT NULL DEFAULT 0 COMMENT '课程本期天数',
  `course_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '课程创建时间',
  `course_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '课程修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '课程逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bd_course_periods
-- ----------------------------
DROP TABLE IF EXISTS `bd_course_periods`;
CREATE TABLE `bd_course_periods`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `course_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '课程id',
  `periods_index` int(11) NULL DEFAULT NULL COMMENT '班级号',
  `periods_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '图片地址',
  `periods_start_time` datetime(0) NULL DEFAULT NULL COMMENT '班级开始时间',
  `periods_end_time` datetime(0) NULL DEFAULT NULL COMMENT '班级结束时间',
  `periods_status` tinyint(3) NULL DEFAULT NULL COMMENT '本班状态 0：未开始 1：已开始 2：已结束',
  `student_count` int(11) NOT NULL DEFAULT 0 COMMENT '报名人数',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  `periods_deadline` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '班级报名截止时间',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程班级表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bd_course_progress
-- ----------------------------
DROP TABLE IF EXISTS `bd_course_progress`;
CREATE TABLE `bd_course_progress`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `progress_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '进度图片地址',
  `progress_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '进度标题',
  `course_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '课程id',
  `course_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名称(冗余字段）',
  `progress_count` int(11) NOT NULL DEFAULT 0 COMMENT '第几天任务 0：试用 从1开始正式进行',
  `progress_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '进度创建日期',
  `progress_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '进度修改日期',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程进度' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bd_course_tags
-- ----------------------------
DROP TABLE IF EXISTS `bd_course_tags`;
CREATE TABLE `bd_course_tags`  (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '标签名称',
  `tag_index` int(11) NOT NULL DEFAULT 0 COMMENT '标签顺序',
  `course_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '课程id',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程标签' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bd_item
-- ----------------------------
DROP TABLE IF EXISTS `bd_item`;
CREATE TABLE `bd_item`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `item_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '物品名称',
  `item_image_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '物品图片url',
  `item_source` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '物品来源',
  `item_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '物品描述',
  `item_cost` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '物品市场价格',
  `item_coin_cost` int(11) NULL DEFAULT 0 COMMENT '物品金币价格',
  `item_total_count` smallint(6) NOT NULL DEFAULT 0 COMMENT '物品总数量',
  `item_used_count` smallint(6) NOT NULL DEFAULT 0 COMMENT '已兑换物品数量',
  `item_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '物品创建时间',
  `item_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '物品修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '物品表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bd_level_dic
-- ----------------------------
DROP TABLE IF EXISTS `bd_level_dic`;
CREATE TABLE `bd_level_dic`  (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `level_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '等级名称',
  `level_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '等级描述，适应人群',
  `pid` int(11) NOT NULL DEFAULT 0 COMMENT '等级id',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程级别字典表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bd_progress_task
-- ----------------------------
DROP TABLE IF EXISTS `bd_progress_task`;
CREATE TABLE `bd_progress_task`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `progress_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '进度id',
  `task_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '任务名称',
  `task_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务内容',
  `need_record` tinyint(3) NOT NULL DEFAULT 0 COMMENT '是否需要录音 0：不需要 1：需要',
  `can_skip` tinyint(3) NOT NULL DEFAULT 0 COMMENT '是否可跳过 0：不可跳过 1：可以跳过',
  `have_score` tinyint(3) NOT NULL DEFAULT 0 COMMENT '是否得分 0: 不得分 1：得分',
  `task_standard` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评分依据',
  `task_tips` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '任务提示',
  `task_index` int(11) NOT NULL DEFAULT 0 COMMENT '任务顺序',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  `task_type` int(11) NOT NULL DEFAULT 0 COMMENT '任务类型 0：经典背诵 1：视频导读 2：品读(纯文本) 3：品读(有音频文件，用户可以点读，默读) 4：品读(用户需要朗读,语音识别)5：总结与拓展',
  `task_coins` int(11) NOT NULL DEFAULT 0 COMMENT '任务金币数，默认为0',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '进度任务' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bd_question
-- ----------------------------
DROP TABLE IF EXISTS `bd_question`;
CREATE TABLE `bd_question`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `question_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '题干',
  `question_type` tinyint(3) NOT NULL DEFAULT 0 COMMENT '题目类型 0：选择题 1：判断题 2：多选题 3：简答题 4：填空题 5 图片上传题',
  `question_options` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '题目选项 json格式 请参考文档',
  `question_answer` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '单选多选判断此项为空 简答题与填空题见文档json格式',
  `question_explain_video` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '视频讲解地址(可以没有）',
  `question_explain` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '解析',
  `progress_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '进度id',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  `question_index` int(11) NOT NULL DEFAULT 1 COMMENT '题目序号：1,2,3,4...',
  `question_coins` int(11) NOT NULL DEFAULT 0 COMMENT '题目金币数，默认为0',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题库' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for bd_redeem
-- ----------------------------
DROP TABLE IF EXISTS `bd_redeem`;
CREATE TABLE `bd_redeem`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `redeem_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '兑换码编号',
  `course_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '课程id',
  `redeem_state` tinyint(3) NOT NULL DEFAULT 0 COMMENT '兑换码状态: 0：未使用 1：已经使用 2:作废无效',
  `redeem_reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '兑换码发放原因',
  `manager_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发放管理员id',
  `redeem_expire` int(11) NOT NULL DEFAULT 0 COMMENT '兑换码过期时间 以天为单位 0为无限期',
  `redeem_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '兑换码创建时间',
  `redeem_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '兑换码修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  `saler_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '推销员id',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '兑换码信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_advice
-- ----------------------------
DROP TABLE IF EXISTS `ub_advice`;
CREATE TABLE `ub_advice`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `user_nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `advice_describe` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '意见反馈',
  `advice_reply` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '意见反馈回复',
  `advice_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '反馈状态 0：未回复 1：已回复',
  `advice_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `advice_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '意见反馈表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_apply_auth
-- ----------------------------
DROP TABLE IF EXISTS `ub_apply_auth`;
CREATE TABLE `ub_apply_auth`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `user_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '实名姓名',
  `user_phone` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '手机号码',
  `user_credit_card` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '银行卡号',
  `apply_role` int(11) NOT NULL DEFAULT 0 COMMENT '申请身份  1：教师 2：专家 3：推销员 4：管理员',
  `apply_state` int(11) NOT NULL DEFAULT 0 COMMENT '审核状态 0：(未审核)unchecked 1：(审核通过)passed 2：(审核拒绝)refused',
  `auth_apply_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '授权申请时间',
  `apply_check_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '审核时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户申请授权表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_choice
-- ----------------------------
DROP TABLE IF EXISTS `ub_choice`;
CREATE TABLE `ub_choice`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `user_nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户昵称（冗余字段）',
  `course_periods_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程班级id',
  `course_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名称（冗余字段）',
  `choice_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '选课时间',
  `choice_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '选课修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  `teacher_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '助教老师id',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '选课表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_course_order
-- ----------------------------
DROP TABLE IF EXISTS `ub_course_order`;
CREATE TABLE `ub_course_order`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `order_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '订单id',
  `periods_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程班级id',
  `periods_price` decimal(10, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '课程金额',
  `course_order_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '课程订单编号',
  `discount_rate` int(11) UNSIGNED NOT NULL DEFAULT 100 COMMENT '折扣比率：85即为85%折扣 100为无折扣',
  `discount_amount` decimal(10, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '折扣金额',
  `order_subtotal` decimal(10, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '总计金额',
  `is_use_coupon` tinyint(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否使用优惠券 0：未使用 1：使用',
  `coupon_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '优惠券id',
  `coupon_discount_amount` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '优惠券抵扣金额',
  `is_use_voucher` tinyint(3) NOT NULL DEFAULT 0 COMMENT '是否使用兑换码 0：未使用 1：使用',
  `voucher_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '兑换码id',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程订单详情表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_order
-- ----------------------------
DROP TABLE IF EXISTS `ub_order`;
CREATE TABLE `ub_order`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `order_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '订单编号',
  `order_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单类型：1 阅读订单',
  `order_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '订单状态 0：下单 1：已支付 2：支付成功 3：支付失败 4：订单超时 5：订单已取消',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '客户id',
  `order_fee` decimal(10, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '订单金额',
  `order_amount` decimal(10, 2) UNSIGNED NULL DEFAULT 0.00 COMMENT '订单实付金额',
  `order_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '订单创建时间',
  `order_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '订单修改时间',
  `order_pay_time` datetime(0) NULL DEFAULT NULL COMMENT '订单付款时间',
  `order_pay_channel` tinyint(3) UNSIGNED NULL DEFAULT 0 COMMENT '订单支付渠道 0：微信支付 1：支付宝 2：内部支付',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_period_teacher
-- ----------------------------
DROP TABLE IF EXISTS `ub_period_teacher`;
CREATE TABLE `ub_period_teacher`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `periods_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '班级id',
  `teacher_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '教师id',
  `task_count` int(11) NOT NULL DEFAULT 0 COMMENT '批改任务量',
  `exchange_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '表建立时间',
  `modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '状态修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '班级助教表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_progress_study
-- ----------------------------
DROP TABLE IF EXISTS `ub_progress_study`;
CREATE TABLE `ub_progress_study`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `progress_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '进度id',
  `periods_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程班级id',
  `question_score` int(11) NOT NULL DEFAULT 0 COMMENT '成绩',
  `sign_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '打卡状态 0: 未打卡 1：已打卡 2：补打成功',
  `study_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '学习创建时间',
  `study_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '学习修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  `question_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '做题状态 0：未开始 1：已完成',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户进度跟踪' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_saler_order
-- ----------------------------
DROP TABLE IF EXISTS `ub_saler_order`;
CREATE TABLE `ub_saler_order`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `order_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '订单id',
  `saler_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '销售员id',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `promotion_type` smallint(6) NOT NULL DEFAULT 0 COMMENT '推广方式 0:分享链接 1:兑换码 2:扫码',
  `saler_bonus` decimal(10, 2) NOT NULL DEFAULT 0.10 COMMENT '销售员在订单产生时的提成比例',
  `promotion_amount` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '提成金额',
  `saler_order_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '推广日期',
  `saler_order_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '推广修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '推销员订单提成记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_saler_promotion_record
-- ----------------------------
DROP TABLE IF EXISTS `ub_saler_promotion_record`;
CREATE TABLE `ub_saler_promotion_record`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `saler_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '销售员id',
  `manager_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '审核管理员id',
  `balance_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '结算状态：0：未审核 2：审核通过 3：审核拒绝 4：已到账',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员备注信息，用于拒绝提现',
  `promotion_balance_amount` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '申请提现金额',
  `balance_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '提现发起日期',
  `balance_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `balance_check_time` datetime(0) NULL DEFAULT NULL COMMENT '审核日期',
  `is_deleted` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '销售员结算记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_study_question
-- ----------------------------
DROP TABLE IF EXISTS `ub_study_question`;
CREATE TABLE `ub_study_question`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `study_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '学习id',
  `question_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '问题id',
  `answer_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回答内容',
  `answer_key` int(11) NULL DEFAULT 0 COMMENT '选项key',
  `answer_score` int(11) NULL DEFAULT 0 COMMENT '问题得分',
  `answer_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '回答创建时间',
  `answer_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '回答修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  `question_grade_state` tinyint(3) NOT NULL DEFAULT 0 COMMENT '题目判分状态 0：未打分 1：已打分',
  `question_tea_comment` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '教师评语',
  `teacher_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '作业批改老师id',
  `answer_correct_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '对应上传图片题目，存储的是批改后的图片链接List）',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '做题记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_study_task
-- ----------------------------
DROP TABLE IF EXISTS `ub_study_task`;
CREATE TABLE `ub_study_task`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `study_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '学习id',
  `task_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '任务id',
  `answer_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回答内容',
  `task_score` int(11) NULL DEFAULT 0 COMMENT '任务得分',
  `recite_link` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户背诵链接(冗余字段)',
  `answer_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '回答创建时间',
  `answer_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '回答修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务学习记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_user_coupon
-- ----------------------------
DROP TABLE IF EXISTS `ub_user_coupon`;
CREATE TABLE `ub_user_coupon`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `coupon_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '优惠券种类id',
  `coupon_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '优惠券状态 0：可用 1：锁定 2：已使用 3：已过期',
  `coupon_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '优惠券获得日期',
  `coupon_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '优惠券修改时间',
  `coupon_use_time` datetime(0) NULL DEFAULT NULL COMMENT '优惠券使用时间',
  `coupon_expire_time` datetime(0) NULL DEFAULT NULL COMMENT '优惠券过期时间 空则无限期',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户优惠券信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_user_exchange_course
-- ----------------------------
DROP TABLE IF EXISTS `ub_user_exchange_course`;
CREATE TABLE `ub_user_exchange_course`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `periods_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '班级id',
  `course_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '课程名(冗余项)',
  `course_exchange_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '兑换课程时间',
  `course_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '状态修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户兑换课程表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_user_express_address
-- ----------------------------
DROP TABLE IF EXISTS `ub_user_express_address`;
CREATE TABLE `ub_user_express_address`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `express_user_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '收件人姓名',
  `express_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '收件人地址',
  `express_user_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '收件人手机号',
  `address_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `address_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收件表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_user_item
-- ----------------------------
DROP TABLE IF EXISTS `ub_user_item`;
CREATE TABLE `ub_user_item`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `item_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '物品id',
  `item_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '物品名称',
  `item_image_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '物品图片url',
  `item_count` smallint(6) NOT NULL DEFAULT 0 COMMENT '物品数量',
  `item_coin_cost` int(11) NOT NULL DEFAULT 0 COMMENT '兑换物品花费金币总数量',
  `item_cost` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '物品市场价（单价）¥',
  `item_total_cost` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '物品总价格（单价）¥',
  `express_user_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '收件人姓名',
  `express_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '收件人地址',
  `express_user_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '收件人手机号',
  `item_exchange_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '兑换物品时间',
  `item_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '物品状态：0表示未邮寄，1表示已邮寄',
  `express_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '快递编号',
  `item_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '物品状态修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '兑换物品信息记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_user_promotion
-- ----------------------------
DROP TABLE IF EXISTS `ub_user_promotion`;
CREATE TABLE `ub_user_promotion`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '被邀请用户id',
  `superior_user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上级推广人id(实际邀请人)，空为无',
  `supsuperior_user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上上级用户id，空为无',
  `order_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '订单编号（用于追踪）',
  `order_amount` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '订单实付金额',
  `promotion_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '推广日期',
  `promotion_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '推广修改日期',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户分享提成表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_user_promotion_follow
-- ----------------------------
DROP TABLE IF EXISTS `ub_user_promotion_follow`;
CREATE TABLE `ub_user_promotion_follow`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_in_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '邀请发起者用户id',
  `user_be_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '被邀请用户openid(注意)',
  `follow_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '用户关注时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  `user_be_phone` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被邀请用户手机号',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户邀请关注表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_user_promotion_record
-- ----------------------------
DROP TABLE IF EXISTS `ub_user_promotion_record`;
CREATE TABLE `ub_user_promotion_record`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '提现发起人id',
  `manager_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '审查员id',
  `promotion_balance_amount` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '本次结算金额',
  `balance_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '结算状态 0：已发起 2：审核通过 3：审核拒绝 4：已到账',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员拒绝审核原因',
  `balance_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '结算发起时间',
  `balance_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '结算修改时间',
  `balance_check_time` datetime(0) NULL DEFAULT NULL COMMENT '管理员审核时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户提成记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for ub_user_punch
-- ----------------------------
DROP TABLE IF EXISTS `ub_user_punch`;
CREATE TABLE `ub_user_punch`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `periods_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '班级id',
  `now_coin_count` int(11) NOT NULL DEFAULT 0 COMMENT '当前金币总数-该期课程',
  `punch_continue_day` int(11) NOT NULL DEFAULT 0 COMMENT '连续打卡天数',
  `last_punch_day` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '上一次打卡日期',
  `punch_count` int(11) NOT NULL DEFAULT 0 COMMENT '总打卡天数',
  `punch_day` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '打卡日期,list存储打卡日期',
  `punch_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '表建立时间',
  `punch_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '表修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户当期打卡金币情况查询表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uc_expert
-- ----------------------------
DROP TABLE IF EXISTS `uc_expert`;
CREATE TABLE `uc_expert`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `expert_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '专家姓名',
  `expert_authority` int(11) NOT NULL DEFAULT 0 COMMENT '专家权限',
  `expert_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '专家状态 0：正常 1：冻结',
  `expert_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '专家创建日期',
  `expert_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '专家修改日期',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '专家表 用于课程审核' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uc_manager
-- ----------------------------
DROP TABLE IF EXISTS `uc_manager`;
CREATE TABLE `uc_manager`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `manager_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '管理员名称',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `authority` int(11) NOT NULL DEFAULT 0 COMMENT '管理员等级 0：没有权限 1：删除权限 2：修改权限 4：读取权限',
  `manager_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '管理员创建日期',
  `manager_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '管理员修改日期',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '管理员' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uc_saler
-- ----------------------------
DROP TABLE IF EXISTS `uc_saler`;
CREATE TABLE `uc_saler`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `saler_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '推销员姓名',
  `saler_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '推销员联系方式',
  `saler_bonus` decimal(10, 2) NOT NULL DEFAULT 0.10 COMMENT '推销员提成比例 默认10%',
  `saler_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '推销员账号状态 0：正常 1：冻结',
  `saler_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '推销员创建时间',
  `saler_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '推销员修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  `saler_bank_card` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '推销员银行卡号',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '推销员' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uc_teacher
-- ----------------------------
DROP TABLE IF EXISTS `uc_teacher`;
CREATE TABLE `uc_teacher`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `teacher_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '教师姓名',
  `teacher_authority` int(11) NOT NULL DEFAULT 0 COMMENT '教师权限表',
  `teacher_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '教师状态 0：正常 1：过期 2：冻结',
  `teacher_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '教师创建日期',
  `teacher_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '教师修改日期',
  `teacher_expire_time` datetime(0) NULL DEFAULT NULL COMMENT '教师过期日期 空则无限期',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uc_theme
-- ----------------------------
DROP TABLE IF EXISTS `uc_theme`;
CREATE TABLE `uc_theme`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `theme_color` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '主题颜色,red/blue...分别对应表不同的主题描述',
  `theme_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '主题描述',
  `theme_color_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '主题颜色对应的颜色代码',
  `theme_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '主题创建时间',
  `theme_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '主题修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '主题表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uc_user
-- ----------------------------
DROP TABLE IF EXISTS `uc_user`;
CREATE TABLE `uc_user`  (
  `Id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '用户名 当用户来源不为用户名密码注册时，此项可为空',
  `user_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '用户编号',
  `user_nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户登录密码 当用户手机号注册、微信来源，此项可为空',
  `user_balance` int(11) NOT NULL DEFAULT 0 COMMENT '用户金币额',
  `user_avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `user_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户手机号 当用户来源为用户名密码注册、公众号时，此项为空',
  `user_origin` tinyint(3) NOT NULL DEFAULT 0 COMMENT '用户来源 0 用户名密码注册 1 手机号注册 2 公众号来源 3 小程序来源',
  `wechat_user_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '当用户来源为公众号和小程序时，此项关联微信第三方信息',
  `user_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '用户创建时间',
  `user_modify_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '用户信息修改时间',
  `user_last_login_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '用户最后登录时间',
  `user_status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '用户状态 0 正常 1 冻结',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  `user_wechat_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户微信号',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uc_user_role
-- ----------------------------
DROP TABLE IF EXISTS `uc_user_role`;
CREATE TABLE `uc_user_role`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `role_type` int(11) NOT NULL DEFAULT 0 COMMENT '用户角色 0：普通用户 1：教师用户 2：专家用户 3：推销员用户 4：管理员用户',
  `role_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `role_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uc_user_theme
-- ----------------------------
DROP TABLE IF EXISTS `uc_user_theme`;
CREATE TABLE `uc_user_theme`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `default_theme` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户主题',
  `theme_create_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '主题创建时间',
  `theme_modify_time` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '主题修改时间',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0：未删除 1：已删除',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户主题表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for uc_wechat_user
-- ----------------------------
DROP TABLE IF EXISTS `uc_wechat_user`;
CREATE TABLE `uc_wechat_user`  (
  `Id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT 'wechat_user_id',
  `wechat_open_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户识别凭证 openid',
  `wechat_type` tinyint(3) NOT NULL DEFAULT 0 COMMENT '微信类型：0 公众号 1 小程序',
  `wechat_union_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'union_id',
  `is_deleted` tinyint(3) NOT NULL DEFAULT 0 COMMENT '逻辑删除 0： 未删除 1：已删除',
  PRIMARY KEY (`wechat_open_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '微信用户信息' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
