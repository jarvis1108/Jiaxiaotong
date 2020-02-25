/*
 Navicat MySQL Data Transfer

 Source Server         : StrongestScholar
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : 139.199.15.124:3306
 Source Schema         : StrongestScholar

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 13/07/2018 14:14:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) NULL DEFAULT NULL COMMENT '下一值'
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '序列号表' ROW_FORMAT = Fixed;

-- ----------------------------
-- Table structure for t_BSD_BookVerInfo
-- ----------------------------
DROP TABLE IF EXISTS `t_BSD_BookVerInfo`;
CREATE TABLE `t_BSD_BookVerInfo`  (
  `BookVerID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '书本版本ID',
  `BookVerNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书本版本编码',
  `BookVerCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书本版本编号',
  `BookVerName` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书本版本名称',
  `BookVerShortName` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书本版本简称',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`BookVerID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '书版本基本信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_BSD_CourseInfo
-- ----------------------------
DROP TABLE IF EXISTS `t_BSD_CourseInfo`;
CREATE TABLE `t_BSD_CourseInfo`  (
  `CourseID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程ID',
  `CourseNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级编码',
  `CourseCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级编号',
  `CourseName` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级名称',
  `CourseShortName` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级简称',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`CourseID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程基本信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_BSD_GradeInfo
-- ----------------------------
DROP TABLE IF EXISTS `t_BSD_GradeInfo`;
CREATE TABLE `t_BSD_GradeInfo`  (
  `GradeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '年级ID',
  `GradeNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级编码',
  `GradeCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级编号',
  `GradeName` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级名称',
  `GradeShortName` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级简称',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`GradeID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '年级基本信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_BSD_GradePhaseInfo
-- ----------------------------
DROP TABLE IF EXISTS `t_BSD_GradePhaseInfo`;
CREATE TABLE `t_BSD_GradePhaseInfo`  (
  `GradePhaseID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '年级ID',
  `GradePhaseNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级编码',
  `GradePhaseCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级编号',
  `GradePhaseName` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级名称',
  `GradePhaseShortName` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级简称',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`GradePhaseID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '年级阶段基本信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_COM_CommunityRole
-- ----------------------------
DROP TABLE IF EXISTS `t_COM_CommunityRole`;
CREATE TABLE `t_COM_CommunityRole`  (
  `CommunityRoleID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '社区角色ID',
  `CommunityRoleName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '社区角色名',
  `Level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '社区角色级别',
  `Description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '社区角色名称',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`CommunityRoleID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '社区角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_COM_SpecialTraining
-- ----------------------------
DROP TABLE IF EXISTS `t_COM_SpecialTraining`;
CREATE TABLE `t_COM_SpecialTraining`  (
  `SpecialTrainingID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '集训营ID',
  `SpecialTrainingName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '集训营名称',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `LastUserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户',
  `CommunityRoleID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '社区角色ID',
  `TreeNodeCode` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '树形编号',
  `IsLeafNode` tinyint(4) NULL DEFAULT NULL COMMENT '是否是叶子结点，1表示是；0表示不是',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`SpecialTrainingID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '集训营表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MAL_Coupon
-- ----------------------------
DROP TABLE IF EXISTS `t_MAL_Coupon`;
CREATE TABLE `t_MAL_Coupon`  (
  `CouponID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '优惠卷ID',
  `CouponNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '优惠券编码',
  `CouponType` tinyint(4) NOT NULL COMMENT '优惠券类型，0：代现金；1：代金币',
  `Amount` int(11) NULL DEFAULT NULL COMMENT '优惠券金额',
  `BeginTime` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `EndTime` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `PeriodAmount` int(11) NULL DEFAULT NULL COMMENT '有效期，以秒为单位',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`CouponID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '优惠券表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MAL_CouponDetail
-- ----------------------------
DROP TABLE IF EXISTS `t_MAL_CouponDetail`;
CREATE TABLE `t_MAL_CouponDetail`  (
  `CouponExchangeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '优惠券兑换ID',
  `CouponExchangeNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '优惠券兑换编码',
  `CouponID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '优惠卷ID',
  `CouponNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '优惠券编码',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `BeginTime` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `EndTime` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `CouponStatus` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '优惠券状态',
  `OrderRecordId` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单ID',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`CouponExchangeID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '优惠券明细表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MAL_OrderRecord
-- ----------------------------
DROP TABLE IF EXISTS `t_MAL_OrderRecord`;
CREATE TABLE `t_MAL_OrderRecord`  (
  `OrderRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单ID',
  `OrderRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单编码',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `ProductID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品ID',
  `ProductNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品 编码',
  `ProductAmount` int(11) NULL DEFAULT NULL COMMENT '商品数量',
  `Unit` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单位',
  `SumPrice` decimal(14, 2) NULL DEFAULT NULL COMMENT '总价',
  `ActualSumPrice` decimal(14, 2) NULL DEFAULT NULL COMMENT '实际金额',
  `PurchaseWay` tinyint(4) NULL DEFAULT NULL COMMENT '购买方式，0：人民币；1：金币',
  `Status` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单表',
  `Instruction` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单介绍',
  `SubscribeTime` datetime(0) NULL DEFAULT NULL COMMENT '订阅时间',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`OrderRecordID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MAL_ProductInfo
-- ----------------------------
DROP TABLE IF EXISTS `t_MAL_ProductInfo`;
CREATE TABLE `t_MAL_ProductInfo`  (
  `ProductID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品ID',
  `ProductNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品 编码',
  `ProductName` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品名称',
  `Specification` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产品信息表',
  `Price` decimal(14, 2) NULL DEFAULT NULL COMMENT '商品单价',
  `BasicAccountingUnit` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '基本计量单位',
  `PaymentType` tinyint(4) NULL DEFAULT NULL COMMENT '支付方式，0：人民币；1：金币；2：都支持',
  `BeginTime` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `EndTime` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`ProductID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '产品信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MTH_LPConsumeRecord
-- ----------------------------
DROP TABLE IF EXISTS `t_MTH_LPConsumeRecord`;
CREATE TABLE `t_MTH_LPConsumeRecord`  (
  `LPConsumeRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学点消费记录ID',
  `MatchRecordQuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局题目ID',
  `MatchRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局ID',
  `MatchRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局编码',
  `MatchRecordUserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局用户ID',
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题ID',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题你',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `BeginTime` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `EndTime` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `Amount` int(11) NULL DEFAULT NULL COMMENT '消费金额，也就是学点消费数量',
  `IsTrue` tinyint(4) NULL DEFAULT NULL COMMENT '是否正确，1表示正确，0表示错误',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  PRIMARY KEY (`LPConsumeRecordID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学点消费记录' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MTH_MatchRecord
-- ----------------------------
DROP TABLE IF EXISTS `t_MTH_MatchRecord`;
CREATE TABLE `t_MTH_MatchRecord`  (
  `MatchRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '战局ID',
  `MatchRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局编码',
  `FightType` tinyint(4) NULL DEFAULT NULL COMMENT '战局类型，0：两人比赛；1：邀请好友对战；2：群战；3：练习。',
  `BeginTime` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `EndTime` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `MatchPeriod` int(11) NULL DEFAULT NULL COMMENT '对战时长，以秒为单位',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `FightStatus` tinyint(4) NULL DEFAULT 1 COMMENT '战局状态，0：创建，1：坐下，2：准备，3：开始，4：游戏中，5：游戏结束。',
  `UserMaxCount` int(11) NULL DEFAULT NULL COMMENT '用户最大数量',
  `UserFactCount` int(11) NULL DEFAULT NULL COMMENT '用户实际数量',
  `MatchRule` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '匹配规则',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`MatchRecordID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '战局表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MTH_MatchRecordQuestion
-- ----------------------------
DROP TABLE IF EXISTS `t_MTH_MatchRecordQuestion`;
CREATE TABLE `t_MTH_MatchRecordQuestion`  (
  `MatchRecordQuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '战局题目ID',
  `MatchRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局ID',
  `MatchRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局编码',
  `QuestionIndex` int(11) NULL DEFAULT NULL COMMENT '试题序号，从1开始',
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题ID',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题你',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`MatchRecordQuestionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '战局试题表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MTH_MatchRecordUser
-- ----------------------------
DROP TABLE IF EXISTS `t_MTH_MatchRecordUser`;
CREATE TABLE `t_MTH_MatchRecordUser`  (
  `MatchRecordUserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '战局用户ID',
  `MatchRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局ID',
  `MatchRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局编码',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `OriginalGradePoint` int(11) NULL DEFAULT NULL COMMENT '初始绩点',
  `AcquiredGradePoint` int(11) NOT NULL COMMENT '用户本场比赛获取的绩点，自然数',
  `OriginalGradeCoin` int(11) NULL DEFAULT NULL COMMENT '初始金币',
  `AcquiredGradeCoin` int(11) NOT NULL COMMENT '用户本场比赛获取的金币，可正可负可零',
  `OriginalLearningPoint` int(11) NULL DEFAULT NULL COMMENT '初始学点',
  `AcquiredLearningPoint` int(11) NOT NULL COMMENT '用户本场比赛获取的学点，可正可负可零',
  `IsCreator` tinyint(4) NULL DEFAULT 1 COMMENT '是否为创建者。1：创建者；0：非创建者',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`MatchRecordUserID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '战局用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_QST_Knowledge
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_Knowledge`;
CREATE TABLE `t_QST_Knowledge`  (
  `KnowledgeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '知识点ID',
  `KnowledgeParentID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '知识点父类ID',
  `SubjectID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科ID',
  `Content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '知识点内容',
  `TreeNodeNo` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '树形编码',
  `NodeLevel` int(11) NULL DEFAULT NULL COMMENT '级别，根节点是0',
  `IsLeaf` tinyint(4) NULL DEFAULT 0 COMMENT '是否是叶子结点，1表示是，0表示不是，缺省是0',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  PRIMARY KEY (`KnowledgeID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '知识点表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_QST_Question
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_Question`;
CREATE TABLE `t_QST_Question`  (
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题ID',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题你',
  `QuestionCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题目编号',
  `QuestionTypeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题类型ID',
  `KnowledgeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '知识点ID',
  `SubjectID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科ID',
  `Question` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '问题',
  `Provider` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '提供者',
  `PersonInCharge` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `Reference` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '引用出处',
  `QuestionLevel` int(11) NULL DEFAULT NULL COMMENT '级别',
  `Difficulty` double NULL DEFAULT NULL COMMENT '难度系数',
  `CoinWeight` double NULL DEFAULT NULL COMMENT '金币权值',
  `GPWeight` double NULL DEFAULT NULL COMMENT '绩点权值',
  `QuestionAnalyze` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '解析',
  `RecommendTime` int(11) NULL DEFAULT NULL COMMENT '推荐答题时间，以秒为单位',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`QuestionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题目基本信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_QST_QuestionMultipleChoice
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_QuestionMultipleChoice`;
CREATE TABLE `t_QST_QuestionMultipleChoice`  (
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题ID',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题你',
  `ChoiceA` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项A',
  `ChoiceB` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项B',
  `ChoiceC` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项C',
  `ChoiceD` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项D',
  `Answer` tinyint(4) NULL DEFAULT NULL COMMENT '答案：0:A; 1B; 2:C; 3:D',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  PRIMARY KEY (`QuestionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题目选择题表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_QST_QuestionRecitation
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_QuestionRecitation`;
CREATE TABLE `t_QST_QuestionRecitation`  (
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题ID',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题你',
  `Answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '基本计量单位',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  PRIMARY KEY (`QuestionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题目背诵表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_QST_QuestionType
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_QuestionType`;
CREATE TABLE `t_QST_QuestionType`  (
  `QuestionTypeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '试题类型ID',
  `QusetionTypeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题类型ID',
  `QuestionTypeNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题目类型编码',
  `QuestionTypeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题目类型名称',
  `QusetionTypeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`QuestionTypeID`, `QusetionTypeID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题目类型表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_QST_Subject
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_Subject`;
CREATE TABLE `t_QST_Subject`  (
  `SubjectID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学科ID',
  `SubjectNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科编码',
  `SubjectName` varchar(72) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科名称',
  `SubjectType` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科类型',
  `SubjectShortName` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科简称',
  `SubjectGradeType` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目年级类型',
  `SubjectGrade` int(11) NULL DEFAULT NULL COMMENT '科目年级（1-9）',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`SubjectID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '科目表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_Admin
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_Admin`;
CREATE TABLE `t_SYS_Admin`  (
  `AdminID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员ID',
  `AdminNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员编码',
  `AdminName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员名',
  `Account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '帐户',
  `AdminPsw` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `UserLevel` tinyint(4) NULL DEFAULT 1 COMMENT '用户级别：0：超级管理员，1：一般管理员，2：业务员，3：题库贡献者',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，0表示无效，1表示有效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`AdminID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '管理员表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_AdminPurview
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_AdminPurview`;
CREATE TABLE `t_SYS_AdminPurview`  (
  `AdminPurviewID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员角色名',
  `AdminID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员ID',
  `AdminNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员编码',
  `AdminRoleID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员角色ID',
  `AdminRoleNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员角色编码',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`AdminPurviewID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '管理员权限表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_AdminRole
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_AdminRole`;
CREATE TABLE `t_SYS_AdminRole`  (
  `AdminRoleID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员角色ID',
  `AdminRoleNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员角色编码',
  `AdminRoleName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '答案 ',
  `PurviewCode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限编码',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`AdminRoleID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '管理员角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_MatchSetting
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_MatchSetting`;
CREATE TABLE `t_SYS_MatchSetting`  (
  `MatchSettingID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '匹配设置ID',
  `MaxMatchCount` int(11) NULL DEFAULT NULL COMMENT '最长匹配次数',
  `MatchTime` int(11) NULL DEFAULT NULL COMMENT '单次匹配时长，以秒为单位',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`MatchSettingID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '匹配设置表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_QuestionSetting
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_QuestionSetting`;
CREATE TABLE `t_SYS_QuestionSetting`  (
  `QuestionSettingID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '题目设置ID',
  `MatchType` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '匹配类型',
  `QuestiontTypeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题类型ID',
  `QuestionNumber` int(11) NULL DEFAULT NULL COMMENT '试题数量',
  `QuestionTime` int(11) NULL DEFAULT NULL COMMENT '答题时间，以秒为单位',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，0表示无效，1表示有效',
  `QuestionTypeID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题类型ID',
  PRIMARY KEY (`QuestionSettingID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '试题题目表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_SerialNo
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_SerialNo`;
CREATE TABLE `t_SYS_SerialNo`  (
  `Id` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '流水码编码',
  `ProgramRefNo` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '程序引用编码',
  `Prefix` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '前缀',
  `YearFlag` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年标志',
  `MonthFlag` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小时标志',
  `DayFlag` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日期的标志',
  `HourFlag` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小时标志你',
  `MinuteFlag` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分钟标志',
  `SecondFlag` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '秒标志',
  `CurrentPosition` int(4) NOT NULL DEFAULT 0 COMMENT '当前位置',
  `LengthOfSerialNumber` int(4) NOT NULL COMMENT '流水号的长度',
  `StepLength` int(4) NOT NULL COMMENT '步长',
  `Direction` tinyint(4) NULL DEFAULT 1 COMMENT '方向 （1 为正向，0为反方向）',
  `IsEnableLoop` tinyint(4) NULL DEFAULT 0 COMMENT '是否支持循环 （1支持循环  0不支持循环）',
  `LastTimePart` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新时间',
  `Suffix` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '后缀',
  `LastUpdateTime` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) COMMENT '最近更新时间',
  PRIMARY KEY (`Id`) USING BTREE,
  UNIQUE INDEX `ProgramRefNo_UNIQUE`(`ProgramRefNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '流水码表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_User
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_User`;
CREATE TABLE `t_SYS_User`  (
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `UserName` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `Sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `Coin` int(11) NULL DEFAULT NULL COMMENT '用户金币',
  `GradePoint` int(11) NULL DEFAULT NULL COMMENT '用户绩点',
  `LearningPoint` int(11) NULL DEFAULT NULL COMMENT '用户学点',
  `Openid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'OpenID',
  `WechatName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '微信呢称',
  `Telephone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `HeadImage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `InternalLevel` int(11) NULL DEFAULT NULL COMMENT '用户内部等级，系统内部评级',
  `Experience` int(11) NULL DEFAULT NULL COMMENT '用户经验值',
  `ExternalLevel` int(11) NULL DEFAULT NULL COMMENT '用户外部等级，展示给客户端',
  `OtherInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其它信息',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，0表示无效，1表示有效',
  PRIMARY KEY (`UserID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_UserCoinDetail
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_UserCoinDetail`;
CREATE TABLE `t_SYS_UserCoinDetail`  (
  `UserCoinDetailID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户金币明细ID',
  `UserCoinDetailNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户金币明细编码',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `OccurTime` datetime(0) NULL DEFAULT NULL COMMENT '业务发生时间',
  `OriginalAmount` int(11) NULL DEFAULT NULL COMMENT '初始金币数量',
  `AcquiredAmount` int(11) NULL DEFAULT NULL COMMENT '获取金币数量',
  `LossAmount` int(11) NULL DEFAULT NULL COMMENT '损失金币数量',
  `CurrentAmount` int(11) NULL DEFAULT NULL COMMENT '当前金币数量',
  `ReasonType` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原因类型',
  `MatchRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局ID',
  `MatchRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局编码',
  `OrderRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单ID',
  `OrderRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单编码',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，0表示无效，1表示有效',
  PRIMARY KEY (`UserCoinDetailID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户金币明细表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_UserGPDetail
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_UserGPDetail`;
CREATE TABLE `t_SYS_UserGPDetail`  (
  `UserGPDetailID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户绩点明细ID',
  `UserGPDetailNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户绩点明细编码',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `OccurTime` datetime(0) NULL DEFAULT NULL COMMENT '业务发生时间',
  `OriginalAmount` int(11) NULL DEFAULT NULL COMMENT '初始绩点数量',
  `AcquiredAmount` int(11) NULL DEFAULT NULL COMMENT '获取绩点数量',
  `LossAmount` int(11) NULL DEFAULT NULL COMMENT '损失绩点数量',
  `CurrentAmount` int(11) NULL DEFAULT NULL COMMENT '当前绩点数量',
  `ReasonType` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原因类型',
  `MatchRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局ID',
  `MatchRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局编码',
  `OrderRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单ID',
  `OrderRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单编码',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，0表示无效，1表示有效',
  PRIMARY KEY (`UserGPDetailID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户绩点明细表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_UserLPDetail
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_UserLPDetail`;
CREATE TABLE `t_SYS_UserLPDetail`  (
  `UserLPDetailID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户学点明细ID',
  `UserLPDetailNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户学点明细编码',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `OccurTime` datetime(0) NULL DEFAULT NULL COMMENT '业务发生时间',
  `OriginalAmount` int(11) NULL DEFAULT NULL COMMENT '初始学点数量',
  `AcquiredAmount` int(11) NULL DEFAULT NULL COMMENT '获取学点数量',
  `LossAmount` int(11) NULL DEFAULT NULL COMMENT '损失学点数量',
  `CurrentAmount` int(11) NULL DEFAULT NULL COMMENT '当前学点数量',
  `ReasonType` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原因类型',
  `MatchRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局ID',
  `MatchRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '战局编码',
  `OrderRecordID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单ID',
  `OrderRecordNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单编码',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，0表示无效，1表示有效',
  PRIMARY KEY (`UserLPDetailID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户学点明细表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_UserLoginRecord
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_UserLoginRecord`;
CREATE TABLE `t_SYS_UserLoginRecord`  (
  `UserLoginID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户登陆ID',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `LoginTime` datetime(0) NULL DEFAULT NULL COMMENT '登陆时间',
  `LogoutTime` datetime(0) NULL DEFAULT NULL COMMENT '注销时间',
  `Period` int(11) NULL DEFAULT NULL COMMENT '登陆时长，以秒为单位',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，0表示无效，1表示有效',
  PRIMARY KEY (`UserLoginID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户登陆记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Procedure structure for P_SYS_GetSerialNo
-- ----------------------------
DROP PROCEDURE IF EXISTS `P_SYS_GetSerialNo`;
delimiter ;;
CREATE PROCEDURE `P_SYS_GetSerialNo`(In TheProgramRefNo Varchar(8), 
	In NumberOfSerialNo Int(4),
    Inout SerialNos Varchar(1500),
    Inout ActualNumberOfSerialNo Int(4),
    Inout Errmsg Varchar(1000))
GetSerialNoStatement:
Begin
	-- 存储前缀和时间部分
    Declare PrefixTimePart Varchar(50);
	
	-- 存储前缀，后缀
	Declare Prefix Varchar(50);
    Declare Suffix Varchar(50);
    
    -- 存储时间相关的变量
	Declare YearFlag Varchar(4);
    Declare MonthFlag Varchar(2);
    Declare DayFlag Varchar(2);
    Declare HourFlag Varchar(2);
    Declare MinuteFlag Varchar(2);
    Declare SecondFlag Varchar(2);
    Declare LastTimePart Varchar(45);
    Declare CurrentTimePart Varchar(45);
    Declare DateMask Varchar(50) Default "";
    
    -- 存储流水号相关的变量
    Declare CurrentPosition Int(4);
    Declare LengthOfSerialNumber Int(4);
    Declare MaxSize Int(4);
    Declare StepLength Int(4);
    Declare Direction Tinyint(4);
    Declare IsEnableLoop Tinyint(4);
    Declare InitialPosition Int(4) Default 0;
    
    -- 存储程序引用字段对应的行数
    Declare CountOfOperatedRows Int(4);
    
    If Ifnull(TheProgramRefNo,'') = '' Then
		Leave getSerialNoStatement;
    End If;
    
    If NumberOfSerialNo is null Then
		set NumberOfSerialNo = 1;
    End If;
    
    -- 为将要操作的数据加锁
	Update serialno 
    Set LastUpdateTime = current_timestamp
    Where ProgramRefNo = TheProgramRefNo;
    
	-- 进行数据校验
	Select count(*) Into CountOfOperatedRows
	From serialno
	Where ProgramRefNo = TheProgramRefNo;

	If CountOfOperatedRows = 0 Then
		Set errmsg = concat('单据序列号：', TheProgramRefNo, '对应的数据并不存在！');
        Leave getSerialNoStatement;
	End If;
	If CountOfOperatedRows > 1 Then
		Set errmsg = concat('单据序列号：', TheProgramRefNo, '对应的数据重复！');
		Leave getSerialNoStatement;
	End If;
    
    -- 取得程序引用字段对应的数据行
	Select s.Prefix, s.Suffix,
		s.YearFlag, s.MonthFlag, s.DayFlag, s.HourFlag, s.MinuteFlag, s.SecondFlag, s.LastTimePart,
        s.CurrentPosition, s.LengthOfSerialNumber, s.StepLength, s.Direction, s.IsEnableLoop
    Into Prefix, Suffix,
		YearFlag, MonthFlag, DayFlag, HourFlag, MinuteFlag, SecondFlag, LastTimePart,
        CurrentPosition, LengthOfSerialNumber, StepLength, Direction, IsEnableLoop
    From serialno s
    Where s.ProgramRefNo = TheProgramRefNo;
    
    -- 取得CurrentTimePart\
    If ifnull(YearFlag, '') != '' Then
		Set CurrentTimePart = subString(date_format(now(), '%Y'), 4 - length(YearFlag) + 1, 4);
	End If;
    If MonthFlag = 'MM' Then 
		Set DateMask = concat(DateMask, "%m");
	Elseif MonthFlag = 'M' Then
		Set DateMask = concat(DateMask, "%c");
	End If;
	If DayFlag = 'DD' Then 
		Set DateMask = concat(DateMask, "%d");
	Elseif DayFlag = 'D' Then
		Set DateMask = concat(DateMask, "%e");
	End If;
	If HourFlag = 'HH' Then 
		Set DateMask = concat(DateMask, "%H");
	Elseif HourFlag = 'H' Then
		Set DateMask = concat(DateMask, "%k");
	End If;
    set CurrentTimePart = concat(
		CurrentTimePart, 
		date_format(now(), DateMask)
	);
    If MinuteFlag = 'MM' Then 
		set CurrentTimePart = concat(CurrentTimePart, date_format(now(), '%i'));
	Elseif MinuteFlag = 'M' Then
		set CurrentTimePart = concat(CurrentTimePart, TRIM(LEADING '0' FROM date_format(now(), '%i')));
	End If;
	If SecondFlag = 'SS' Then 
		set CurrentTimePart = concat(CurrentTimePart, date_format(now(), '%S'));
	Elseif SecondFlag = 'S' Then
		set CurrentTimePart = concat(CurrentTimePart, TRIM(LEADING '0' FROM date_format(now(), '%S')));
	End If;
    
    -- 取得PrefixTimePart
    Set PrefixTimePart = concat(Prefix, CurrentTimePart);
    
    -- 根据方向设置步长和初始位置
    If Direction = 0 Then 
		Set StepLength = -StepLength;
        Set InitialPosition = MaxSize;
	End If;
    
	-- 判断是否需要清0
    If (CurrentTimePart <=> LastTimePart) = 0 Then
    	Update serialno s 
		Set s.LastTimePart = CurrentTimePart, s.CurrentPosition = InitialPosition
		Where s.ProgramRefNo = TheProgramRefNo;
	End If;
	
    -- 设置条件的初始值
    Set ActualNumberOfSerialNo = NumberOfSerialNo;
	Set MaxSize = power(10, LengthOfSerialNumber);
    
    -- 如果不支持循环
    If IsEnableLoop = 0 Then
		Set Errmsg = MaxSize;
		-- CurrentPosition合理并且所需的流水号还没有取完
		While  (CurrentPosition < MaxSize) And (CurrentPosition > 0) And (ActualNumberOfSerialNo > 0) Do
			-- 设置结果
			Set SerialNos = concat(SerialNos, PrefixTimePart, lpad(CurrentPosition, LengthOfSerialNumber, '0'), Suffix, ',');
            Set CurrentPosition = CurrentPosition + StepLength;
            Set ActualNumberOfSerialNo = ActualNumberOfSerialNo - 1;
        End While;
        -- 将CurrentPosition设置为当前值
        Update serialno s 
        Set s.CurrentPosition = CurrentPosition 
        Where s.ProgramRefNo = TheProgramRefNo;
    End If;
    
    Set ActualNumberOfSerialNo = NumberOfSerialNo - ActualNumberOfSerialNo;
end
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
