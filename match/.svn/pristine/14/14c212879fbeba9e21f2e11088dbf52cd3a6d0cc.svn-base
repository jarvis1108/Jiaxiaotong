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

 Date: 14/08/2018 21:06:48
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
-- Table structure for t_BSD_GradePhaseInfoRel
-- ----------------------------
DROP TABLE IF EXISTS `t_BSD_GradePhaseInfoRel`;
CREATE TABLE `t_BSD_GradePhaseInfoRel`  (
  `GradePhaseRelID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '科目阶段相关ID',
  `GradePhaseID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '阶段ID',
  `GradeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '阶段编码',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`GradePhaseRelID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '年级阶段相关信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_BSD_Knowledge
-- ----------------------------
DROP TABLE IF EXISTS `t_BSD_Knowledge`;
CREATE TABLE `t_BSD_Knowledge`  (
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
-- Table structure for t_BSD_Subject
-- ----------------------------
DROP TABLE IF EXISTS `t_BSD_Subject`;
CREATE TABLE `t_BSD_Subject`  (
  `SubjectID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学科ID',
  `SubjectNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科编码',
  `SubjectName` varchar(72) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科名称',
  `SubjectShortName` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学科简称',
  `GradePhaseID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级阶段ID',
  `BookVerID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教材版本',
  `GradeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '年级ID',
  `CourseID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程ID',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `SubjectGrade` int(11) NULL DEFAULT NULL COMMENT '科目所属年级',
  `SubjectGradeType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目年级类型',
  `SubjectType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目类型',
  PRIMARY KEY (`SubjectID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '科目表' ROW_FORMAT = Compact;

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
  `UnitOfNumerator` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '计量单位的分子部分（即总价单位）',
  `UnitOfDenominator` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '计量单位的分母部分（即数量单位）',
  `ProductPrice` double(14, 2) NULL DEFAULT NULL COMMENT '商品单价',
  `ProductSort` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品类型，A1:现金买金币,A2:现金买学点-普通学点,A3:现金买学点-日卡,A4:现金买学点-月卡,A5:现金买学点-年卡,B1:金币兑学点,B2:金币兑实物（礼品）,B3:金币兑虚拟物品（指道具，如双倍金币卡）',
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
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题',
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
  `FightType` tinyint(4) NULL DEFAULT NULL COMMENT '战局类型，0：匹配对战；1：好友对战；2：群PK；3：知识练兵场。',
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
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题',
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
-- Table structure for t_QST_Question
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_Question`;
CREATE TABLE `t_QST_Question`  (
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题ID',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题你',
  `QuestionCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题目编号',
  `QuestionTypeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题类型ID',
  `KnowledgeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '知识点ID',
  `Question` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '问题',
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
-- Table structure for t_QST_QuestionForLib
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_QuestionForLib`;
CREATE TABLE `t_QST_QuestionForLib`  (
  `QuestionForLibID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题ID',
  `QuestionForLibNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题',
  `QuestionForLibCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题目编号',
  `QuestionLibID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '私有题库ID',
  `QuestionLibNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题库编码',
  `IsPublic` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '是否公开：1：公开，0：不公开，默认0',
  `QuestionTypeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题类型ID',
  `KnowledgeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '知识点ID',
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
  `FromQuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来自试题ID',
  `FromQuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来自试题编码',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsFromQuestion` tinyint(4) NULL DEFAULT 0 COMMENT '是否来自试题：1：来自试题，0：不是来自试题，默认0',
  PRIMARY KEY (`QuestionForLibID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题库题目表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_QST_QuestionLib
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_QuestionLib`;
CREATE TABLE `t_QST_QuestionLib`  (
  `QuestionLibID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '私有题库ID',
  `QuestionLibNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题库编码',
  `QuestionLibCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题库编号',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属用户ID',
  `IsDefaultQustionLib` tinyint(4) NULL DEFAULT NULL COMMENT '是否默认题库:每个用户最多只能有一个默认题库，1：是默认题库，否则：不是默认题库，默认0',
  `IsPublic` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '是否公开：1：公开，0：不公开，默认0',
  `QuestionLibDes` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题库名称',
  `QuestionLibTitle` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题库标题',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`QuestionLibID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题库表' ROW_FORMAT = Compact;

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
-- Table structure for t_QST_QuestionMultipleChoiceForLib
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_QuestionMultipleChoiceForLib`;
CREATE TABLE `t_QST_QuestionMultipleChoiceForLib`  (
  `QuestionForLibID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题ID',
  `QuestionForLibNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题',
  `QuestionLibID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '私有题库ID',
  `QuestionLibNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题库编码',
  `FromQuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '来自试题ID',
  `FromQuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来自试题编码',
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
  PRIMARY KEY (`QuestionForLibID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题目库选择题题目表' ROW_FORMAT = Compact;

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
-- Table structure for t_QST_QuestionRecitationForLib
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_QuestionRecitationForLib`;
CREATE TABLE `t_QST_QuestionRecitationForLib`  (
  `QuestionForLibID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题ID',
  `QuestionForLibNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题',
  `QuestionLibID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '私有题库ID',
  `QuestionLibNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题库编码',
  `FromQuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '来自试题ID',
  `FromQuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来自试题编码',
  `Answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '基本计量单位',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  PRIMARY KEY (`QuestionForLibID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题库题目背诵表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_QST_QuestionType
-- ----------------------------
DROP TABLE IF EXISTS `t_QST_QuestionType`;
CREATE TABLE `t_QST_QuestionType`  (
  `QuestionTypeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题类型ID',
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
  `LastUpdateTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
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
  `Openid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'OpenID',
  `WechatName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '微信呢称',
  `Telephone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `HeadImage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `OtherInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其它信息',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近更新时间',
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
-- Table structure for t_SYS_UserRelInfo
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_UserRelInfo`;
CREATE TABLE `t_SYS_UserRelInfo`  (
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `Coin` int(11) NULL DEFAULT NULL COMMENT '用户金币',
  `GradePoint` int(11) NULL DEFAULT NULL COMMENT '用户绩点',
  `LearningPoint` int(11) NULL DEFAULT NULL COMMENT '用户学点',
  `InternalLevel` int(11) NULL DEFAULT NULL COMMENT '用户内部等级，系统内部评级',
  `MatchSumCount` int(11) NULL DEFAULT NULL COMMENT '比赛总次数',
  `MatchWinCount` int(11) NULL DEFAULT NULL COMMENT '比赛赢的次数',
  `MatchLoseCount` int(11) NULL DEFAULT NULL COMMENT '比赛输的次数',
  `MatchDogFallCount` int(11) NULL DEFAULT NULL COMMENT '比赛输平局的次数',
  `Experience` int(11) NULL DEFAULT NULL COMMENT '用户经验值',
  `ExternalLevel` int(11) NULL DEFAULT NULL COMMENT '用户外部等级，展示给客户端',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，0表示无效，1表示有效',
  PRIMARY KEY (`UserID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户信息_相关信息部分（主要记录比赛及财富信息）' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_UserSelectedCourse
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_UserSelectedCourse`;
CREATE TABLE `t_SYS_UserSelectedCourse`  (
  `UserSelectedID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户已选学科ID',
  `UserSelectedNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户已选学科编码',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户编码',
  `CourseID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程ID',
  `SubjectID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目ID',
  `SelectedType` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选择类型,具体A:具体到课程,B:具体到学科',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注说明',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，0表示无效，1表示有效',
  PRIMARY KEY (`UserSelectedID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户选择课程' ROW_FORMAT = Compact;

-- ----------------------------
-- View structure for Dvlp_V_BatGeneralData
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_V_BatGeneralData`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_V_BatGeneralData` AS select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3` union all select uuid() AS `MyUUID_LEN36`,replace(convert(uuid() using utf8mb4),'-','') AS `MyUUID_LEN32`,uuid_short() AS `MyShortUUID`,date_format(now(),'%Y-%m-%d') AS `CurDate1`,date_format(now(),'%Y-%m-%d %H:%m:%s') AS `CurDateTime1`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d') AS `CurDate2`,date_format(from_unixtime(unix_timestamp(now())),'%Y-%m-%d %H:%m:%s') AS `CurDateTime3`;

-- ----------------------------
-- View structure for V_MultipleChoice
-- ----------------------------
DROP VIEW IF EXISTS `V_MultipleChoice`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `V_MultipleChoice` AS select `t_QST_Question`.`QuestionID` AS `QuestionID`,`t_QST_Question`.`QuestionNo` AS `QuestionNo`,`t_QST_Question`.`QuestionCode` AS `QuestionCode`,`t_QST_Question`.`KnowledgeID` AS `KnowledgeID`,`t_QST_Question`.`Question` AS `Question`,`t_QST_QuestionMultipleChoice`.`ChoiceA` AS `ChoiceA`,`t_QST_QuestionMultipleChoice`.`ChoiceB` AS `ChoiceB`,`t_QST_QuestionMultipleChoice`.`ChoiceC` AS `ChoiceC`,`t_QST_QuestionMultipleChoice`.`ChoiceD` AS `ChoiceD`,`t_QST_QuestionMultipleChoice`.`Answer` AS `Answer`,`t_QST_Question`.`Reference` AS `Reference`,`t_QST_Question`.`QuestionLevel` AS `QuestionLevel`,`t_QST_Question`.`Difficulty` AS `Difficulty`,`t_QST_Question`.`CoinWeight` AS `CoinWeight`,`t_QST_Question`.`GPWeight` AS `GPWeight`,`t_QST_Question`.`QuestionAnalyze` AS `QuestionAnalyze`,`t_BSD_Knowledge`.`Content` AS `Content`,`t_BSD_Subject`.`SubjectID` AS `SubjectID`,`t_BSD_Subject`.`SubjectName` AS `SubjectName`,`t_BSD_Subject`.`SubjectShortName` AS `SubjectShortName`,`t_BSD_CourseInfo`.`CourseID` AS `CourseID`,`t_BSD_CourseInfo`.`CourseName` AS `CourseName`,`t_BSD_CourseInfo`.`CourseShortName` AS `CourseShortName` from ((((`t_BSD_CourseInfo` join `t_BSD_Subject` on((`t_BSD_Subject`.`CourseID` = `t_BSD_CourseInfo`.`CourseID`))) join `t_BSD_Knowledge` on((`t_BSD_Knowledge`.`SubjectID` = `t_BSD_Subject`.`SubjectID`))) join `t_QST_Question` on((`t_QST_Question`.`KnowledgeID` = `t_BSD_Knowledge`.`KnowledgeID`))) join `t_QST_QuestionMultipleChoice` on((`t_QST_Question`.`QuestionID` = `t_QST_QuestionMultipleChoice`.`QuestionID`)));

-- ----------------------------
-- Function structure for Dvlp_Fn_GetDefaultUserID
-- ----------------------------
DROP FUNCTION IF EXISTS `Dvlp_Fn_GetDefaultUserID`;
delimiter ;;
CREATE FUNCTION `Dvlp_Fn_GetDefaultUserID`(In_Str_UserType VARCHAR(20))
 RETURNS varchar(36) CHARSET utf8
BEGIN
	DECLARE  Str_RetVal  VARCHAR(36);
	
	Set Str_RetVal = 
	CASE  In_Str_UserType 
				 WHEN "A" THEN "b98a95a0-88a9-11e8-a7b0-5254009bf409"
				 When "B" Then "b98a95a0-88a9-11e8-a7b0-5254009bf409"
				 When "C" Then "b98a95a0-88a9-11e8-a7b0-5254009bf409"
				 ELSE "b98a95a0-88a9-11e8-a7b0-5254009bf409"
				 END;

	RETURN Str_RetVal;
END
;;
delimiter ;

-- ----------------------------
-- Function structure for Dvlp_Fn_GetKnowledgeDes
-- ----------------------------
DROP FUNCTION IF EXISTS `Dvlp_Fn_GetKnowledgeDes`;
delimiter ;;
CREATE FUNCTION `Dvlp_Fn_GetKnowledgeDes`(In_KnowledgeID VARCHAR(36))
 RETURNS varchar(255) CHARSET utf8
BEGIN
	
	DECLARE D_SubjectID VARCHAR(36);
	DECLARE D_TreeNodeNo  VARCHAR(64);
	DECLARE D_KnowledgeDes VARCHAR(255) DEFAULT '';
	DECLARE D_Content      VARCHAR(255);	
	
	DECLARE done INT DEFAULT FALSE;
	
	DECLARE cur CURSOR FOR
	SELECT t.Content FROM StrongestScholar.t_BSD_Knowledge t
	WHERE (SELECT TreeNodeNo FROM StrongestScholar.t_BSD_Knowledge
	WHERE KnowledgeID = In_KnowledgeID) LIKE CONCAT(t.TreeNodeNo,'%')
        AND t.SubjectID = (SELECT SubjectID FROM StrongestScholar.t_BSD_Knowledge
	WHERE KnowledgeID = In_KnowledgeID);
	
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
				
-- 	SELECT SubjectID FROM StrongestScholar.t_BSD_Knowledge
-- 	WHERE KnowledgeID = In_KnowledgeID;
--  	
-- 	SELECT TreeNodeNo FROM StrongestScholar.t_BSD_Knowledge
-- 	WHERE KnowledgeID = In_KnowledgeID;
			
-- 	SELECT SubjectID,TreeNodeNo INTO D_SubjectID,D_TreeNodeNo
-- 	FROM StrongestScholar.t_BSD_Knowledge
-- 	WHERE KnowledgeID = In_KnowledgeID;

	OPEN cur;
	
	readLoop:
	LOOP
		IF done THEN
		   LEAVE readLoop;
		END IF;	 
		
	  FETCH cur INTO D_Content;
		SET D_KnowledgeDes = CONCAT(D_KnowledgeDes,D_Content);		
  END LOOP;		
	
	CLOSE cur;
	SET D_KnowledgeDes = 'test';
	
	RETURN D_KnowledgeDes;
END
;;
delimiter ;

-- ----------------------------
-- Function structure for Dvlp_Fn_GetSubstrCount
-- ----------------------------
DROP FUNCTION IF EXISTS `Dvlp_Fn_GetSubstrCount`;
delimiter ;;
CREATE FUNCTION `Dvlp_Fn_GetSubstrCount`(In_Str_Context    VARCHAR(4000),
		In_Str_SubStr     VARCHAR(1000))
 RETURNS int(11)
BEGIN
	DECLARE str_Tmp VARCHAR(1000);
	DECLARE nRetVal INTEGER(11);
	
	if IFNULL(In_Str_Context,"") = "" Or
		 IFNULL(In_Str_SubStr,"") = "" Then
		Set nRetVal = 0;		
		return nRetVal;
	End IF;	
	
	Set str_Tmp = REPLACE(UPPER(In_Str_Context),
	                      UPPER(In_Str_SubStr),"");										
 
	

	SELECT (LENGTH(In_Str_Context) - LENGTH(str_Tmp)) / LENGTH(In_Str_SubStr) into nRetVal;
	
	return nRetVal;
END
;;
delimiter ;

-- ----------------------------
-- Function structure for Dvlp_Fn_RemoveHtmlTag
-- ----------------------------
DROP FUNCTION IF EXISTS `Dvlp_Fn_RemoveHtmlTag`;
delimiter ;;
CREATE FUNCTION `Dvlp_Fn_RemoveHtmlTag`(In_Str_StrHtml				VARCHAR(4000))
 RETURNS varchar(3000) CHARSET utf8
BEGIN
  DECLARE iStart  INT;
	DECLARE iEnd INT; 
	DECLARE iLength int;
	DECLARE strRetVal VARCHAR(4000) DEFAULT In_Str_StrHtml;
	 
	if IFNULL(strRetVal,'') = '' Then
		RETURN strRetVal;		
	End if;	 
	 
   WHILE Locate( '<', strRetVal ) > 0 And Locate( '>', strRetVal, Locate( '<', In_Str_StrHtml )) > 0 	DO
      BEGIN
        SET iStart = Locate( '<', strRetVal ), iEnd = Locate( '>', strRetVal, Locate('<', In_Str_StrHtml ));
        SET iLength = ( iEnd - iStart) + 1;
        IF iLength > 0 THEN
          BEGIN
            SET strRetVal = Insert( strRetVal, iStart, iLength, '');
          END;
        END IF;
      END;
    END WHILE;
    
		RETURN strRetVal;

	RETURN 0;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_DemoIfDynamicSQL
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_DemoIfDynamicSQL`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_DemoIfDynamicSQL`()
BEGIN
  -- 定义SQL语句变量
	DECLARE SqlText VARCHAR(1024);
	DECLARE nRecordCount INT(11);
	
	-- 编译动态SQL语句(这里是查询的语句，当然也可以执行更新语句)
	Set @strSQLText = 'Select Count(1) From Dual Where 1 = ? And ? In \(1,\'2\',3\)';	
	PREPARE SqlText FROM @strSQLText;
	
	set @a=1;
	set @b=2;
									
	EXECUTE SqlText  USING @a,@b;
 
  SELECT  nRecordCount As PFFFF;	
	
	DEALLOCATE PREPARE SqlText;		
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_DemoOfCursor
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_DemoOfCursor`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_DemoOfCursor`()
Label_Begin:
BEGIN 
	-- 1.定义变量
	
	-- 1.1 定义游标变量及其它变量
	
	-- 1.1.1定义游标变量
	
	-- 1.1.1.1 定义源数据变量
	DECLARE S_ID  				  VARCHAR(128);
	DECLARE S_SubjectID    	VARCHAR(128);
	DECLARE S_SubjectName  	VARCHAR(255);		
		
	-- 1.3 遍历游标遍历结束标志
  DECLARE done INT DEFAULT FALSE;
  
	-- 1.2 定义游标
  DECLARE cur CURSOR FOR 	
	SELECT V.ID As ID,
	       CONCAT('SubjectID_',V.ID) AS SubjectID,
				 CONCAT('SubjectName_',V.ID) AS SubjectName
	FROM
	(
		SELECT UUID() As ID From DUAL
		Union All
		SELECT UUID() As ID From DUAL
		Union All
		SELECT UUID() As ID From DUAL
		Union All
		SELECT UUID() As ID From DUAL
		Union All
		SELECT UUID() As ID From DUAL
		Union All
		SELECT UUID() As ID From DUAL
	) V;
			
	-- 1.4 遍历游戏结束标志绑定到游戏
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
	
	-- 3.用游标对数据逐条进行处理
	
  -- 3.1 打开游标
  OPEN cur;
  
  -- 3.2 开始循环
  read_loop: LOOP
	
    -- 声明结束的时候
    IF done THEN
        LEAVE read_loop;
    END IF;
		
		-- 提取游标里的当前行的数据 
    
		FETCH cur INTO  S_ID,S_SubjectID,S_SubjectName;
		
		if S_ID is Null Or 
		   S_SubjectID is NULL then		
			SELECT 'ID均不允许为空' As Message;	
		  LEAVE read_loop;	
		End if;
		
		SELECT S_SubjectName As SubjectName;
		
	End LOOP;	
	
  -- 关闭游标
  CLOSE cur;		

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_DemoOfErrInfo
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_DemoOfErrInfo`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_DemoOfErrInfo`()
Label_Begin:
BEGIN
  DECLARE MyErrCode  VARCHAR(36);
	DECLARE MyErrMsg   VARCHAR(1000);
	DECLARE nCount 		 INT(11) DEFAULT 0;
		  
	DECLARE t_err int DEFAULT 0;
	
	-- 这里声明为Continue事件是指出现SQL异常时继续执行，而实际中用
	-- Exit Handler的情况下会多些
  DECLARE CONTINUE HANDLER FOR SQLEXCEPTION 
	Begin
		ROLLBACK;	 
		   GET DIAGNOSTICS CONDITION 1 MyErrCode=RETURNED_SQLSTATE,MyErrMsg=MESSAGE_TEXT;		
		SELECT MyErrCode,MyErrMsg;
		Set t_err = 1;
		
		-- 这里可以将异常的日志写数数据库日导表中去
		
	End;
	
	set t_err = 0;
	
	START TRANSACTION;
	
	
	-- 这里摸拟正确
	INSERT into QuestionBankTemp.t_ITN_InitLogInfo(LogID,InitID)	
	VALUES(UUID(),UUID());
	
	-- 每一句SQL语句后都要加该语句
	if t_err = 1 then
	   LEAVE Label_Begin;
	end if;
				
  -- 这里摸拟出错：InitID长度为36，这里让其出错
	INSERT into QuestionBankTemp.t_ITN_InitLogInfo(LogID,InitID)	
	VALUES(UUID(),'ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff');
	
	if t_err = 1 then
	   LEAVE Label_Begin;
	end if;
	
	Set nCount = nCount + 1;
	
	-- 最后语句判断是否正确并提交
	 if t_err = 0 then
			COMMIT;
	    
			-- 这里可将成功的信息写入日导表中去       
	
	 end if;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_DemoOfTmplateTable
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_DemoOfTmplateTable`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_DemoOfTmplateTable`()
Label_Begin:
   -- 示例说明:本示例的临时表是基本连接的
BEGIN
	DECLARE nRecordCount 		INT(11);
	DECLARE nIsAlawysCreate 	INT(11) DEFAULT 0;
    If IFNULL(nIsAlawysCreate,0) = 1 THEN
	  -- 创建表的选项：InnoDB：表示数据库驱动
		--               utf8:表示字符集，不加无法支持中文
		--                Compact:表示紧湊型，为MySQL默认的
		--               
	  Create TEMPORARY TABLE  MyTmpTable_123
		(
				F_A    VARCHAR(36),
				F_B    VARCHAR(20),
				F_C    VARCHAR(20),
				PRIMARY KEY (F_A) 			
		)  ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '示例临时表' ROW_FORMAT = Compact;
	ELSE
		Create TEMPORARY TABLE  if not exists  MyTmpTable_123
		(
				F_A    VARCHAR(36),
				F_B    VARCHAR(20),
				F_C    VARCHAR(20),
				PRIMARY KEY (F_A) 			
		)   ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '示例临时表' ROW_FORMAT = Compact;
	End if;
	
	INSERT INTO MyTmpTable_123(F_A,F_B,F_C)
	VALUES(UUID(),2222,'我想我是海!');
	
	SELECT COUNT(1) 
	INTO nRecordCount
	From MyTmpTable_123;
	
	SELECT * From MyTmpTable_123;
	
	
	SELECT nRecordCount As FFFDDD;

END
;;
delimiter ;

-- ----------------------------
-- Function structure for Dvlp_P_GetDefaultBoolVerID
-- ----------------------------
DROP FUNCTION IF EXISTS `Dvlp_P_GetDefaultBoolVerID`;
delimiter ;;
CREATE FUNCTION `Dvlp_P_GetDefaultBoolVerID`()
 RETURNS varchar(36) CHARSET utf8
BEGIN
	-- 定义版本号
	DECLARE strRetVal 		VARCHAR(36);
	
  -- 直接取人教版本的ID（目前系统题库只有人教版）	
	Set strRetVal = "50109363-88c2-11e8-a7b0-5254009bf409";
		
	RETURN strRetVal;
	
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_ImpQuestionToFormal
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_ImpQuestionToFormal`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_ImpQuestionToFormal`(In_Str_Condition			 	VARCHAR(1024),-- 要查询哪些数据的SQL过滤条件		
		 In_Str_InitID         	VARCHAR(36),
		 In_Str_InitDes				 	VARCHAR(50),-- 初始化信息
     In_N_From             	INT(11),-- 开始的序号（从1开始计）
     In_N_To         			 	INT(11))
Label_Begin:
BEGIN
	
-- 	1 定义变量
-- 	1.1 定义目标数据库变量字段
	
	DECLARE D_QuestionID        VARCHAR(36);
	DECLARE D_QuestionNo        VARCHAR(36);
	DECLARE D_QuestionCode      VARCHAR(36);
	DECLARE D_QuestionTypeID    VARCHAR(36);
	DECLARE D_KnowledgeID       VARCHAR(36);
	DECLARE D_Question          VARCHAR(255);
	DECLARE D_Provider          VARCHAR(36);
	DECLARE D_PersonInCharge    VARCHAR(36);
	DECLARE D_Reference         VARCHAR(255);
	DECLARE D_QuestionLevel     INT(11);
	DECLARE D_Difficulty        DOUBLE;
	DECLARE D_CoinWeight        DOUBLE;
	DECLARE D_GPWeight          DOUBLE;
	DECLARE D_QuestionAnalyze   VARCHAR(512);
	DECLARE D_RecommendTime     INT(11);
	DECLARE CreateTime          TIMESTAMP;
	DECLARE CreateUser          VARCHAR(36);
	DECLARE LastUpdTime         TIMESTAMP;
	DECLARE LastUpdUser         VARCHAR(36);
	DECLARE IsValid             TINYINT;
	DECLARE Remark              VARCHAR(255);
	
	-- 1.2 定义程序中变量
-- 	 DECLARE nRecordCount INT(11);
	 DECLARE nCurBatIndex INT(11) DEFAULT 0;	 
	 DECLARE nBeginIndex  INT(11) DEFAULT 0 ;
	 
	 DECLARE MyErrCode VARCHAR(36);
	 DECLARE MyErrMsg  VARCHAR(1000);
	 
	 
	 
	  -- 1.3 定义事件相关变量	 
	 DECLARE t_error INTEGER DEFAULT 0;    
   DECLARE CONTINUE HANDLER FOR SQLEXCEPTION 
	 BEGIN
				ROLLBACK;	 
				 
				GET DIAGNOSTICS CONDITION 1 MyErrCode=RETURNED_SQLSTATE,MyErrMsg=MESSAGE_TEXT;
				
				IF IN_N_IsAlwaysFormBatN = 0 THEN
					SET nCurBatIndex = nCurBatIndex + 1;				
				END IF;				
						
				-- 回滚后记录当前日志信息
        CALL QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
				(
					null,
					In_Str_InitID,
					'E',
					CONCAT('ErrCode:',
					        IFNULL(MyErrCode,''),					        
									",ErrMsg:",
									IFNULL(MyErrMsg,''),
								 ',The current operation information is: the conditions for inserting records:In_Str_Condition:',								
								 IFNULL(In_Str_Condition,''),
								 ',In_Str_InitID:',
								  IFNULL(In_Str_InitID,''),
								 ',In_N_From:',
								 IFNULL(In_N_From,''),
								 ',In_N_To:',
								 IFNULL(In_N_To,''),
								 ',In_Str_InitDes:',
								 IFNULL(In_Str_InitDes,''),
								 ',The current starting sequence number is:',
								 IFNULL(nBeginIndex,''))
				 );									
				
				SET t_error = 1;
	END;
	
	-- 2.预处理及参数检验
	 
	 -- 2.1 预处理变量
	 SET In_Str_InitID = IFNULL(In_Str_InitID,'36d52856-8a93-11e8-8ba0-5254009bf409');	 
	 SET IN_Str_Condition = IFNULL(IN_Str_Condition,'');
	 SET In_N_From = IFNULL(In_N_From,0);
	 SET In_N_To = IFNULL(IN_N_To,In_N_From + 10000 - 1);
	 SET In_Str_InitDes = IFNULL(IN_Str_InitDes,
	                             CONCAT("Data Initialization At:",
															 date_format( now( ), '%Y-%m-%d %H:%m:%s' )));
															 
		SET @strSQLText = CONCA('INSERT IGNORE INTO StrongestScholar.t_QST_Question(QuestionID,QuestionNo,QuestionCode,QuestionTypeID,KnowledgeID,Question,Provider,PersonInCharge,Reference,QuestionLevel,Difficulty,CoinWeight,GPWeight,QuestionAnalyze,RecommendTime,CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,Remark)
SELECT QuestionID,QuestionNo,QuestionCode,QuestionTypeID,KnowledgeID,Question,Provider,PersonInCharge,Reference,QuestionLevel,Difficulty,CoinWeight,GPWeight,QuestionAnalyze,RecommendTime,CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,Remark
FROM QuestionBankTemp.t_ITN_Question LIMIT ?,20');

		PREPARE SqlText FROM @strSQLText;
PrsLoop:													 
		LOOP
		  START TRANSACTION;
			
			SET nBeginIndex = In_N_From + nCurBatIndex * In_N_BatCount - 1;
			IF nBeiginIndex + 1 > In_N_To THEN
				LEAVE PrsLoop;
			END IF;	
			
			SET @a = nBeginIndex;
			
			EXECUTE SqlText USING @a;
			
			IF t_error = 1 THEN 
				  LEAVE Label_Begin;
			END IF;
			
			IF t_error = 0 THEN
				COMMIT;
			  Set nCurBatIndex = nCurBatIndex + 1;
				CALL QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
				(
					null,
					In_Str_InitID,
					'E',
					CONCAT(',The current operation information is: the conditions for inserting records:In_Str_Condition:',								
								 IFNULL(In_Str_Condition,''),
								 ',In_Str_InitID:',
								  IFNULL(In_Str_InitID,''),
								 ',In_N_From:',
								 IFNULL(In_N_From,''),
								 ',In_N_To:',
								 IFNULL(In_N_To,''),
								 ',In_Str_InitDes:',
								 IFNULL(In_Str_InitDes,''),
								 ',The current starting sequence number is:',
								 IFNULL(nBeginIndex,''))
				 );					
		  END IF;	
		END LOOP;
	
    DEALLOCATE PREPARE SqlText;	
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_Init_ImpKnowledgeFromCrawler
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_Init_ImpKnowledgeFromCrawler`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_Init_ImpKnowledgeFromCrawler`(In_Str_InitID	VARCHAR(36))
Label_Begin:
BEGIN 
	-- 1.定义变量
	
	-- 1.1 定义游标变量及其它变量
	
	-- 1.1.1定义游标变量
	
	-- 1.1.1.1 定义源数据变量
	DECLARE S_ID  				  VARCHAR(36);
	DECLARE S_SubjectID    	VARCHAR(36);
	DECLARE S_SubjectName  	VARCHAR(255);					
	DECLARE S_GradeID      	VARCHAR(36);
	DECLARE S_GradeName    	VARCHAR(255);
	DECLARE S_GradeNameA   	VARCHAR(255);
	DECLARE S_UnitID       	VARCHAR(36);
	DECLARE S_UnitName     	VARCHAR(255);
	DECLARE S_ChapterID    	VARCHAR(36);
	DECLARE S_ChapterName  	VARCHAR(255);
	DECLARE S_KnowledgeID  	VARCHAR(36);
	DECLARE S_KnowledgeName VARCHAR(255);
					
	-- 1.1.1.2 定义目标数据的变量
  DECLARE D_KnowledgeID VARCHAR(36);
	DECLARE D_TreeNodeNo VARCHAR(36);
	DECLARE D_InitID VARCHAR(36);
	DECLARE D_InitNo VARCHAR(36);
	DECLARE D_IsCorrect tinyint(4);
	DECLARE D_KnowledgeParentID VARCHAR(72);
	DECLARE D_SubjectShortName VARCHAR(72);	
	DECLARE D_SubjectID VARCHAR(36);
	DECLARE D_Content VARCHAR(3000);
	DECLARE D_NodeLevel VARCHAR(36);
	DECLARE D_IsLeaf VARCHAR(36);
	DECLARE D_CreateTime datetime;
	DECLARE D_CreateUser VARCHAR(36);
	DECLARE D_LastUpdTime datetime;
	DECLARE D_LastUpdUser VARCHAR(36);
	DECLARE D_IsValid tinyint(4);
	DECLARE D_Remark VARCHAR(36);
			
	-- 1.1.2 定义其它变量
	DECLARE nRecordIndex INT DEFAULT 0;
	DECLARE nRecordCount INT DEFAULT 0;

  Declare strSubjectID VARCHAR(255) DEFAULT NULL;
  Declare strUnitName VARCHAR(255) DEFAULT NULL;
	Declare strChaperName VARCHAR(255)  DEFAULT NULL;
	Declare strKnowledgeName VARCHAR(255) DEFAULT NULL;
	
	DECLARE nUnitIndex   		INT DEFAULT 0;
	DECLARE nChaperIndex 		INT DEFAULT 0;
	DECLARE nKnowledgeIndex INT DEFAULT 0;
		
	-- 1.3 遍历游标遍历结束标志
  DECLARE done INT DEFAULT FALSE;
  
	-- 1.2 定义游标
  DECLARE cur CURSOR FOR 
	SELECT  `T1`.`id` AS `ID`,
					`T1`.`subject_id` AS `SubjectID`,
					`T1`.`subject_name` AS `SubjectName`,					
					`T1`.`grade_id` AS `GradeID`,
					`T1`.`grade_name` AS `GradeName`,
					`T1`.`grade_name_A` AS `GradeNameA`,
					`T1`.`unit_id` AS `UnitID`,
					`T1`.`unit_name` AS `UnitName`,
					`T1`.`chapter_id` AS `ChapterID`,
					`T1`.`chapter_name` AS `ChapterName`,
					`T1`.`knowledge_id` AS `KnowledgeID`,
					`T1`.`knowledge_name` AS `KnowledgeName`,
           T1.D_SubjectID					
	FROM QuestionBankCrawler.Dvlp_‌Init_V_Knowledge T1
	Where T1.D_SubjectID is Not Null Or 1  = 0
	Order By T1.grade_id,T1.subject_id,T1.unit_id,T1.chapter_id,knowledge_id;
	
  		
	-- 1.4 遍历游戏结束标志绑定到游戏
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
	
	-- 2.检验及预处理	
	Set In_Str_InitID = CASE IFNULL(In_Str_InitID,"") 
													WHEN "" then "01cd58b1-88a2-11e8-a7b0-5254009bf409"       							 
													Else In_Str_InitID END;		
	
	if IFNUll(In_Str_InitID,"") = "" THEN	
	  SELECT '请传入要初始化的ID' As Message;
		
		LEAVE Label_Begin;
	End if;
	
	SELECT Count(1) INTO nRecordCount		
	FROM QuestionBankCrawler.Dvlp_‌Init_V_Knowledge T1
	Where T1.D_SubjectID is Not Null Or 1  = 0;
				
	if nRecordCount <= 0 then
		  SELECT '没有找到要操作的源数据!' As Message;
			LEAVE Label_Begin;
	End if;
	
	-- 初始化爬虫中的数据
	
	-- 删除表中的科目
-- 	DELETE 
-- 	From QuestionBankTemp.t_ITN_Knowledge
-- 	Where  1 = 1;
	
	-- 3.用游标对数据逐条进行处理
	
  -- 3.1 打开游标
  OPEN cur;
  
  -- 3.2 开始循环
  read_loop: LOOP
	
    -- 声明结束的时候
    IF done THEN
        LEAVE read_loop;
    END IF;
		
		-- 提取游标里的当前行的数据 
    
		FETCH cur INTO  S_ID,S_SubjectID,S_SubjectName,S_GradeID,S_GradeName,
		                S_GradeNameA,S_UnitID,S_UnitName,S_ChapterID,S_ChapterName,
										S_KnowledgeID,S_KnowledgeName,D_SubjectID;
		
		if D_SubjectID is Null Or 
		   S_UnitName is NULL Or 
		   S_ChapterName Is Null or
			 S_KnowledgeName Is Null then		
			SELECT 'S_ID:' + S_ID + '的记录中存在空的名称！' As Message;	
		  LEAVE read_loop;	
		End if;
		
		if strSubjectID is null OR 
		   strUnitName is null Or  
			 strChaperName is null Or 
			 strKnowledgeName is null Or
		   strSubjectID != D_SubjectID then
			 Set strSubjectID = D_SubjectID;
			 Set strUnitName = S_UnitName;
			 Set strChaperName = S_ChapterName;
			 Set strKnowledgeName = S_KnowledgeName;	
			 Set nUnitIndex = 1;
			 Set nChaperIndex = 1;	
       Set nKnowledgeIndex = 1;			 
	  else
				if strUnitName != S_UnitName then
				   Set strUnitName = S_UnitName;
					 Set nUnitIndex = nUnitIndex + 1;
					 
					 Set strChaperName = S_ChapterName;
					 Set nChaperIndex = 1;	
					 
			     Set strKnowledgeName = S_KnowledgeName;	
           Set nKnowledgeIndex = 1;			 				
				else
				   if strChaperName != S_ChapterName then							 
							 Set strChaperName = S_ChapterName;
							 Set nChaperIndex = nChaperIndex + 1;	
							 
							 Set strKnowledgeName = S_KnowledgeName;	
							 Set nKnowledgeIndex = 1;				 
					 else
							 Set strKnowledgeName = S_KnowledgeName;	
							 Set nKnowledgeIndex = nKnowledgeIndex + 1;
					 End 	if;			
				End if;
		End if;
		
		Set nRecordIndex = nRecordIndex + 1;
		
		-- 当前知识点ID
		Set D_KnowledgeID = UUID();
		
		Set D_TreeNodeNo = CONCAT("R",LPAD(nUnitIndex,3,'0'),
		                              LPAD(nChaperIndex,3,'0'),
																	LPAD(nKnowledgeIndex,3,'0'));

		Set D_InitID = In_Str_InitID;
		Set D_InitNo = In_Str_InitID;
		Set D_IsCorrect = 1;
	  
		Set D_KnowledgeParentID = ''; -- ????		
		Set D_IsLeaf = 1; -- ???	
		
		Set D_SubjectShortName = S_GradeNameA;	  
		Set D_Content = S_KnowledgeName;
	  -- Set D_NodeLevel = (Length(D_TreeNodeNo) - 1) / 3;	-- ?	
		Set D_CreateTime = now();	
		Set D_CreateUser = StrongestScholar.Dvlp_Fn_GetDefaultUserID("A");		
		Set D_LastUpdTime = D_CreateTime;	
		Set D_LastUpdUser = StrongestScholar.Dvlp_Fn_GetDefaultUserID("A");	
		Set D_IsValid = 1;	
		Set D_Remark = NULL;
		
		-- 插入章的内容
		Set D_TreeNodeNo = CONCAT("R",LPAD(nUnitIndex,3,'0'));
		INSERT INTO QuestionBankTemp.t_ITN_Knowledge(KnowledgeID,TreeNodeNo,InitID,InitNo,IsCorrect,KnowledgeParentID,SubjectID,Content,NodeLevel,IsLeaf,
															  CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,
																Remark)
		SELECT D_KnowledgeID,D_TreeNodeNo,D_InitID,D_InitNo,D_IsCorrect,														  
					 D_KnowledgeParentID,D_SubjectID,strUnitName,D_NodeLevel,D_IsLeaf,
					 D_CreateTime,D_CreateUser,D_LastUpdTime,
					 D_LastUpdUser,D_IsValid,D_Remark
		 From DUAL
		 Where NOT EXISTS
		 (
				 SELECT 1
				 From QuestionBankTemp.t_ITN_Knowledge TT1
				 Where TT1.SubjectID = D_SubjectID And 
				       TT1.TreeNodeNo =  D_TreeNodeNo		 
		 );
		
		-- 插入节的内容
		Set D_KnowledgeID = UUID();
		Set D_TreeNodeNo = CONCAT("R",LPAD(nUnitIndex,3,'0'),
		                              LPAD(nChaperIndex,3,'0'));
		INSERT INTO QuestionBankTemp.t_ITN_Knowledge(KnowledgeID,TreeNodeNo,InitID,InitNo,IsCorrect,KnowledgeParentID,SubjectID,Content,NodeLevel,IsLeaf,
															  CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,Remark)
		SELECT D_KnowledgeID,D_TreeNodeNo,D_InitID,D_InitNo,D_IsCorrect,														  
					 D_KnowledgeParentID,D_SubjectID,strChaperName,D_NodeLevel,D_IsLeaf,
					 D_CreateTime,D_CreateUser,D_LastUpdTime,
					 D_LastUpdUser,D_IsValid,D_Remark
		 From Dual 
		 Where Not EXISTS
		 (
				 SELECT 1
				 From QuestionBankTemp.t_ITN_Knowledge TT1
				 Where TT1.SubjectID = D_SubjectID And 
				       TT1.TreeNodeNo =  D_TreeNodeNo		 
		 );
				
		-- 插入数据到目标表中去
		Set D_KnowledgeID = UUID();
		Set D_TreeNodeNo =  CONCAT("R",LPAD(nUnitIndex,3,'0'),
		                               LPAD(nChaperIndex,3,'0'),
																	 LPAD(nKnowledgeIndex,3,'0'));
	  INSERT INTO QuestionBankTemp.t_ITN_Knowledge( KnowledgeID,TreeNodeNo,InitID,InitNo,IsCorrect,KnowledgeParentID,SubjectID,Content,NodeLevel,IsLeaf,
															                     CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,
																                   Remark,FromCrawlerKnowledgeID,FromCrawlerID)
		SELECT D_KnowledgeID,D_TreeNodeNo,D_InitID,D_InitNo,D_IsCorrect,														  
					 D_KnowledgeParentID, D_SubjectID,D_Content,D_NodeLevel,D_IsLeaf,
					 D_CreateTime,D_CreateUser,D_LastUpdTime,
					 D_LastUpdUser,D_IsValid,D_Remark,S_KnowledgeID,S_ID
		ON DUPLICATE KEY
		UPDATE TreeNodeNo=D_TreeNodeNo,
					 InitID=D_InitID,
					 InitNo=D_InitNo,
					 IsCorrect=D_IsCorrect,
					 KnowledgeParentID=D_KnowledgeParentID,
					 SubjectID=D_SubjectID,
					 Content=D_Content,
					 NodeLevel=D_NodeLevel,
					 IsLeaf=D_IsLeaf, 
					 CreateTime=D_CreateTime,
					 CreateUser=D_CreateUser,
					 LastUpdTime=D_LastUpdTime,
					 LastUpdUser=D_LastUpdUser,
					 IsValid=D_IsValid,
					 Remark=D_Remark,
					 FromCrawlerKnowledgeID=S_KnowledgeID,
					 FromCrawlerID=S_KnowledgeID;
		
  END LOOP;
	
	-- 更新级数
	Update QuestionBankTemp.t_ITN_Knowledge 
	Set NodeLevel = FLOOR((LENGTH(TreeNodeNo) - 1) / 3);

	-- 更新是否是叶子结点
	Update QuestionBankTemp.t_ITN_Knowledge  
	Set IsLeaf = QuestionBankTemp.Dvlp_Fn_GetKnowledgeIsLeaf(SubjectID,TreeNodeNo);
	
  -- 关闭游标
  CLOSE cur;		
	
	-- 4.作一些处理
	if nRecordIndex >= NRecordCount   then
		 SELECT '记录已成功的迁移到准数据库中了！' As Message;		 
  Else
			SELECT '记录已迁移但不完整地到准数据库中去了！' As Message;
	End if;	

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_Init_ImpKnowledgeFromManual
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_Init_ImpKnowledgeFromManual`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_Init_ImpKnowledgeFromManual`(`In_Str_InitID` varchar(36))
Label_Begin:
BEGIN
	-- 1.定义变量

	-- 1.1 定义游标变量及其它变量

	-- 1.1.1定义游标变量

	-- 1.1.1.1 定义源数据变量
	DECLARE S_KnowledgeID  				  VARCHAR(38);
	DECLARE S_InitID    	          VARCHAR(255);
	DECLARE S_InitNo  	            VARCHAR(255);
	DECLARE S_SubjectNameCode      	VARCHAR(64);
	DECLARE S_OrderIndex    	      INT(11);
	DECLARE S_TreeCode   	          VARCHAR(64);
	DECLARE S_IsCorrect       	    TINYINT;
	DECLARE S_Content     	        VARCHAR(255);
	DECLARE S_Des    	              VARCHAR(512);
	DECLARE S_CreateTime 	          TIMESTAMP;
	DECLARE S_CreateUser 	          VARCHAR(36);
	DECLARE S_LastUpdTime 	        TIMESTAMP;
	DECLARE S_LastUpdUser 	        VARCHAR(36);
	DECLARE S_Remark 	              VARCHAR(255);
	DECLARE S_IsValid  	            TINYINT;
	DECLARE S_SubjectID             VARCHAR(36);

	-- 1.1.1.2 定义目标数据的变量
  DECLARE D_KnowledgeID VARCHAR(36);
	DECLARE D_TreeNodeNo VARCHAR(36);
	DECLARE D_InitID VARCHAR(36);
	DECLARE D_InitNo VARCHAR(36);
	DECLARE D_IsCorrect TINYINT(4);
	DECLARE D_KnowledgeParentID VARCHAR(72) DEFAULT NULL;
	DECLARE D_SubjectShortName VARCHAR(72);
	DECLARE D_SubjectID VARCHAR(36);
	DECLARE D_Content VARCHAR(3000);
	DECLARE D_NodeLevel VARCHAR(36);
	DECLARE D_IsLeaf TINYINT(4) DEFAULT 0;
	DECLARE D_CreateTime datetime;
	DECLARE D_CreateUser VARCHAR(36);
	DECLARE D_LastUpdTime datetime;
	DECLARE D_LastUpdUser VARCHAR(36);
	DECLARE D_IsValid tinyint(4);
	DECLARE D_Remark VARCHAR(36);

	-- 1.1.2 定义其它变量
	DECLARE nRecordIndex INT DEFAULT 0;
	DECLARE nRecordCount INT DEFAULT 0;
-- 
--   Declare strSubjectID VARCHAR(255) DEFAULT NULL;
--   Declare strUnitName VARCHAR(255) DEFAULT NULL;
-- 	Declare strChaperName VARCHAR(255)  DEFAULT NULL;
-- 	Declare strKnowledgeName VARCHAR(255) DEFAULT NULL;

-- 	DECLARE nUnitIndex   		INT DEFAULT 0;
-- 	DECLARE nChaperIndex 		INT DEFAULT 0;
-- 	DECLARE nKnowledgeIndex INT DEFAULT 0;

	-- 1.3 遍历游标遍历结束标志
  DECLARE done INT DEFAULT FALSE;

	-- 1.2 定义游标
--   DECLARE cur CURSOR FOR
-- 	SELECT  `T1`.`id` AS `ID`,
-- 					`T1`.`subject_id` AS `SubjectID`,
-- 					`T1`.`subject_name` AS `SubjectName`,
-- 					`T1`.`grade_id` AS `GradeID`,
-- 					`T1`.`grade_name` AS `GradeName`,
-- 					`T1`.`grade_name_A` AS `GradeNameA`,
-- 					`T1`.`unit_id` AS `UnitID`,
-- 					`T1`.`unit_name` AS `UnitName`,
-- 					`T1`.`chapter_id` AS `ChapterID`,
-- 					`T1`.`chapter_name` AS `ChapterName`,
-- 					`T1`.`knowledge_id` AS `KnowledgeID`,
-- 					`T1`.`knowledge_name` AS `KnowledgeName`,
--            T1.D_SubjectID
-- 	FROM QuestionBankCrawler.Dvlp_‌Init_V_Knowledge T1
-- 	Where T1.D_SubjectID is Not Null Or 1  = 0
-- 	Order By T1.grade_id,T1.subject_id,T1.unit_id,T1.chapter_id,knowledge_id;
--   获取人工录入表中的数据
  DECLARE cur CURSOR FOR
	SELECT T1.KnowledgeID,
				 T1.InitID,
				 T1.InitNo,
				 T1.SubjectNameCode,
				 T1.OrderIndex,
				 T1.TreeCode,
				 T1.IsCorrect,
				 T1.Content,
				 T1.Des,
				 T1.CreateTime,
				 T1.CreateUser,
				 T1.LastUpdTime,
				 T1.LastUpdUser,
				 T1.Remark,
				 T1.IsValid,
				 T1.SubjectID
	FROM QuestionBankManual.Dvlp_v_Init_KnowledgeManual T1;



	-- 1.4 遍历游标结束标志绑定到游戏
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

	-- 2.检验及预处理
	Set In_Str_InitID = CASE IFNULL(In_Str_InitID,"")
													WHEN "" then "01cd58b1-88a2-11e8-a7b0-5254009bf409"
													Else In_Str_InitID END;

	if IFNUll(In_Str_InitID,"") = "" THEN
	  SELECT '请传入要初始化的ID' As Message;

		LEAVE Label_Begin;
	End if;
	SET S_InitID = In_Str_InitID;
	SET S_InitNo = In_Str_InitID;

-- 	SELECT Count(1) INTO nRecordCount
-- 	FROM QuestionBankCrawler.Dvlp_‌Init_V_Knowledge T1
-- 	Where T1.D_SubjectID is Not Null Or 1  = 0;
  SELECT Count(1) INTO nRecordCount
	FROM QuestionBankManual.t_ITN_KnowledgeManual T1
	Where T1.SubjectNameCode IS NOT NULL;

	if nRecordCount <= 0 then
		  SELECT '没有找到要操作的源数据!' As Message;
			LEAVE Label_Begin;
	End if;

	-- 初始化爬虫中的数据

	-- 删除表中的科目
-- 	DELETE
-- 	From QuestionBankTemp.t_ITN_Knowledge
-- 	Where  1 = 1;

	-- 3.用游标对数据逐条进行处理

  -- 3.1 打开游标
  OPEN cur;

  -- 3.2 开始循环
  read_loop: LOOP

    -- 声明结束的时候
    IF done THEN
        LEAVE read_loop;
    END IF;

		-- 提取游标里的当前行的数据
		FETCH cur INTO  S_KnowledgeID,S_InitID,S_InitNo,S_SubjectNameCode,S_OrderIndex,S_TreeCode,S_IsCorrect,S_Content,S_Des,S_CreateTime,S_CreateUser,  S_LastUpdTime,S_LastUpdUser,S_Remark,S_IsValid,S_SubjectID;

		IF S_SubjectNameCode=NULL OR
		   S_TreeCode=NULL OR
			 S_Content=NULL THEN
			 SELECT 'S_KnowledgeID' + S_KnowledgeID + '的记录中存在字段为空' AS Message;
			 LEAVE read_loop;
		END IF;


		SET D_KnowledgeID = S_KnowledgeID;
		SET D_TreeNodeNo = CONCAT('R',
															SUBSTRING_INDEX(S_TreeCode,'.',1),
															IFNULL(SUBSTRING_INDEX(S_TreeCode,'.',2),''),
															IFNULL(SUBSTRING_INDEX(S_TreeCode,'.',3),''));
		SET D_InitID = 	S_InitID;
		SET D_InitNo =  S_InitNo;
		SET D_IsCorrect = S_IsCorrect;
		SET D_KnowledgeParentID = NULL;
		SET D_SubjectID = S_SubjectID;
		SET D_Content = S_Content;
		SET D_NodeLevel = (CHAR_LENGTH(D_TreeNodeNo)-1)/3;
		IF D_NodeLevel = 3 THEN
			SET D_IsLeaf = TRUE;
		END IF;	
		SET D_CreateTime = now();
		SET D_CreateUser = StrongestScholar.Dvlp_Fn_GetDefaultUserID("A");
		SET D_LastUpdTime = D_CreateTime;
		SET D_LastUpdUser = StrongestScholar.Dvlp_Fn_GetDefaultUserID("A");
		SET D_IsValid = 1;
		SET D_Remark = NULL; 


		INSERT INTO QuestionBankTemp.t_ITN_Knowledge( KnowledgeID,TreeNodeNo,InitID,InitNo,IsCorrect,KnowledgeParentID,SubjectID,Content,NodeLevel,IsLeaf,
															                     CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,
																                   Remark,FromCrawlerKnowledgeID,FromCrawlerID)
		SELECT D_KnowledgeID,D_TreeNodeNo,D_InitID,D_InitNo,D_IsCorrect,
					 D_KnowledgeParentID, D_SubjectID,D_Content,D_NodeLevel,D_IsLeaf,
					 D_CreateTime,D_CreateUser,D_LastUpdTime,
					 D_LastUpdUser,D_IsValid,D_Remark,NULL,NULL
		ON DUPLICATE KEY
		UPDATE TreeNodeNo=D_TreeNodeNo,
					 InitID=D_InitID,
					 InitNo=D_InitNo,
					 IsCorrect=D_IsCorrect,
					 KnowledgeParentID=D_KnowledgeParentID,
					 SubjectID=D_SubjectID,
					 Content=D_Content,
					 NodeLevel=D_NodeLevel,
					 IsLeaf=D_IsLeaf,
					 CreateTime=D_CreateTime,
					 CreateUser=D_CreateUser,
					 LastUpdTime=D_LastUpdTime,
					 LastUpdUser=D_LastUpdUser,
					 IsValid=D_IsValid,
					 Remark=D_Remark,
					 FromCrawlerKnowledgeID=NULL,
					 FromCrawlerID=NULL;





-- 		if D_SubjectID is Null Or
-- 		   S_UnitName is NULL Or
-- 		   S_ChapterName Is Null or
-- 			 S_KnowledgeName Is Null then
-- 			SELECT 'S_ID:' + S_ID + '的记录中存在空的名称！' As Message;
-- 		  LEAVE read_loop;
-- 		End if;
--
-- 		if strSubjectID is null OR
-- 		   strUnitName is null Or
-- 			 strChaperName is null Or
-- 			 strKnowledgeName is null Or
-- 		   strSubjectID != D_SubjectID then
-- 			 Set strSubjectID = D_SubjectID;
-- 			 Set strUnitName = S_UnitName;
-- 			 Set strChaperName = S_ChapterName;
-- 			 Set strKnowledgeName = S_KnowledgeName;
-- 			 Set nUnitIndex = 1;
-- 			 Set nChaperIndex = 1;
--        Set nKnowledgeIndex = 1;
-- 	  else
-- 				if strUnitName != S_UnitName then
-- 				   Set strUnitName = S_UnitName;
-- 					 Set nUnitIndex = nUnitIndex + 1;
--
-- 					 Set strChaperName = S_ChapterName;
-- 					 Set nChaperIndex = 1;
--
-- 			     Set strKnowledgeName = S_KnowledgeName;
--            Set nKnowledgeIndex = 1;
-- 				else
-- 				   if strChaperName != S_ChapterName then
-- 							 Set strChaperName = S_ChapterName;
-- 							 Set nChaperIndex = nChaperIndex + 1;
--
-- 							 Set strKnowledgeName = S_KnowledgeName;
-- 							 Set nKnowledgeIndex = 1;
-- 					 else
-- 							 Set strKnowledgeName = S_KnowledgeName;
-- 							 Set nKnowledgeIndex = nKnowledgeIndex + 1;
-- 					 End 	if;
-- 				End if;
-- 		End if;
--
		Set nRecordIndex = nRecordIndex + 1;
--
-- 		-- 当前知识点ID
-- 		Set D_KnowledgeID = UUID();
--
-- 		Set D_TreeNodeNo = CONCAT("R",LPAD(nUnitIndex,3,'0'),
-- 		                              LPAD(nChaperIndex,3,'0'),
-- 																	LPAD(nKnowledgeIndex,3,'0'));
--
-- 		Set D_InitID = In_Str_InitID;
-- 		Set D_InitNo = In_Str_InitID;
-- 		Set D_IsCorrect = 1;
--
-- 		Set D_KnowledgeParentID = ''; -- ????
-- 		Set D_IsLeaf = 1; -- ???
--
-- 		Set D_SubjectShortName = S_GradeNameA;
-- 		Set D_Content = S_KnowledgeName;
-- 	  -- Set D_NodeLevel = (Length(D_TreeNodeNo) - 1) / 3;	-- ?
-- 		Set D_CreateTime = now();
-- 		Set D_CreateUser = StrongestScholar.Dvlp_Fn_GetDefaultUserID("A");
-- 		Set D_LastUpdTime = D_CreateTime;
-- 		Set D_LastUpdUser = StrongestScholar.Dvlp_Fn_GetDefaultUserID("A");
-- 		Set D_IsValid = 1;
-- 		Set D_Remark = NULL;
--
-- 		-- 插入章的内容
-- 		Set D_TreeNodeNo = CONCAT("R",LPAD(nUnitIndex,3,'0'));
-- 		INSERT INTO QuestionBankTemp.t_ITN_Knowledge(KnowledgeID,TreeNodeNo,InitID,InitNo,IsCorrect,KnowledgeParentID,SubjectID,Content,NodeLevel,IsLeaf,
-- 															  CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,
-- 																Remark)
-- 		SELECT D_KnowledgeID,D_TreeNodeNo,D_InitID,D_InitNo,D_IsCorrect,
-- 					 D_KnowledgeParentID,D_SubjectID,strUnitName,D_NodeLevel,D_IsLeaf,
-- 					 D_CreateTime,D_CreateUser,D_LastUpdTime,
-- 					 D_LastUpdUser,D_IsValid,D_Remark
-- 		 From DUAL
-- 		 Where NOT EXISTS
-- 		 (
-- 				 SELECT 1
-- 				 From QuestionBankTemp.t_ITN_Knowledge TT1
-- 				 Where TT1.SubjectID = D_SubjectID And
-- 				       TT1.TreeNodeNo =  D_TreeNodeNo
-- 		 );
--
-- 		-- 插入节的内容
-- 		Set D_KnowledgeID = UUID();
-- 		Set D_TreeNodeNo = CONCAT("R",LPAD(nUnitIndex,3,'0'),
-- 		                              LPAD(nChaperIndex,3,'0'));
-- 		INSERT INTO QuestionBankTemp.t_ITN_Knowledge(KnowledgeID,TreeNodeNo,InitID,InitNo,IsCorrect,KnowledgeParentID,SubjectID,Content,NodeLevel,IsLeaf,
-- 															  CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,Remark)
-- 		SELECT D_KnowledgeID,D_TreeNodeNo,D_InitID,D_InitNo,D_IsCorrect,
-- 					 D_KnowledgeParentID,D_SubjectID,strChaperName,D_NodeLevel,D_IsLeaf,
-- 					 D_CreateTime,D_CreateUser,D_LastUpdTime,
-- 					 D_LastUpdUser,D_IsValid,D_Remark
-- 		 From Dual
-- 		 Where Not EXISTS
-- 		 (
-- 				 SELECT 1
-- 				 From QuestionBankTemp.t_ITN_Knowledge TT1
-- 				 Where TT1.SubjectID = D_SubjectID And
-- 				       TT1.TreeNodeNo =  D_TreeNodeNo
-- 		 );

		-- 插入数据到目标表中去
-- 		Set D_KnowledgeID = UUID();
-- 		Set D_TreeNodeNo =  CONCAT("R",LPAD(nUnitIndex,3,'0'),
-- 		                               LPAD(nChaperIndex,3,'0'),
-- 																	 LPAD(nKnowledgeIndex,3,'0'));
-- 	  INSERT INTO QuestionBankTemp.t_ITN_Knowledge( KnowledgeID,TreeNodeNo,InitID,InitNo,IsCorrect,KnowledgeParentID,SubjectID,Content,NodeLevel,IsLeaf,
-- 															                     CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,
-- 																                   Remark,FromCrawlerKnowledgeID,FromCrawlerID)
-- 		SELECT D_KnowledgeID,D_TreeNodeNo,D_InitID,D_InitNo,D_IsCorrect,
-- 					 D_KnowledgeParentID, D_SubjectID,D_Content,D_NodeLevel,D_IsLeaf,
-- 					 D_CreateTime,D_CreateUser,D_LastUpdTime,
-- 					 D_LastUpdUser,D_IsValid,D_Remark,S_KnowledgeID,S_ID
-- 		ON DUPLICATE KEY
-- 		UPDATE TreeNodeNo=D_TreeNodeNo,
-- 					 InitID=D_InitID,
-- 					 InitNo=D_InitNo,
-- 					 IsCorrect=D_IsCorrect,
-- 					 KnowledgeParentID=D_KnowledgeParentID,
-- 					 SubjectID=D_SubjectID,
-- 					 Content=D_Content,
-- 					 NodeLevel=D_NodeLevel,
-- 					 IsLeaf=D_IsLeaf,
-- 					 CreateTime=D_CreateTime,
-- 					 CreateUser=D_CreateUser,
-- 					 LastUpdTime=D_LastUpdTime,
-- 					 LastUpdUser=D_LastUpdUser,
-- 					 IsValid=D_IsValid,
-- 					 Remark=D_Remark,
-- 					 FromCrawlerKnowledgeID=S_KnowledgeID,
-- 					 FromCrawlerID=S_KnowledgeID;

  END LOOP;

	-- 更新级数
-- 	Update QuestionBankTemp.t_ITN_Knowledge
-- 	Set NodeLevel = FLOOR((LENGTH(TreeNodeNo) - 1) / 3);z

-- 	-- 更新是否是叶子结点
-- 	Update QuestionBankTemp.t_ITN_Knowledge
-- 	Set IsLeaf = QuestionBankTemp.Dvlp_Fn_GetKnowledgeIsLeaf(SubjectID,TreeNodeNo);

  -- 关闭游标
  CLOSE cur;

	-- 4.作一些处理
	if nRecordIndex >= nRecordCount   then
		 SELECT '记录已成功的迁移到准数据库中了！' As Message;
  Else
			SELECT '记录已迁移但不完整地到准数据库中去了！' As Message;
	End if;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_Init_ImpKnowledgeToFormal
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_Init_ImpKnowledgeToFormal`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_Init_ImpKnowledgeToFormal`()
Label_Begin:
BEGIN
	-- 1.1.1.2 定义目标数据的变量
  DECLARE D_KnowledgeID VARCHAR(36);
	DECLARE D_TreeNodeNo VARCHAR(36);
	DECLARE D_InitID VARCHAR(36);
	DECLARE D_InitNo VARCHAR(36);
	DECLARE D_IsCorrect TINYINT(4);
	DECLARE D_KnowledgeParentID VARCHAR(72) DEFAULT NULL;
	DECLARE D_SubjectID VARCHAR(36);
	DECLARE D_Content VARCHAR(3000);
	DECLARE D_NodeLevel VARCHAR(36);
	DECLARE D_IsLeaf TINYINT(4) DEFAULT 0;
	DECLARE D_CreateTime datetime;
	DECLARE D_CreateUser VARCHAR(36);
	DECLARE D_LastUpdTime datetime;
	DECLARE D_LastUpdUser VARCHAR(36);
	DECLARE D_IsValid tinyint(4);
	DECLARE D_Remark VARCHAR(36);

	-- 1.1.2 定义其它变量
	DECLARE nRecordIndex INT DEFAULT 0;
	DECLARE nRecordCount INT DEFAULT 0;

	-- 1.3 遍历游标遍历结束标志
  DECLARE done INT DEFAULT FALSE;
	
	DECLARE cur CURSOR FOR
	SELECT T1.KnowledgeID,
	       T1.TreeNodeNo,
				 T1.InitID,
				 T1.InitNo,
				 T1.IsCorrect,
				 T1.KnowledgeParentID,
				 T1.SubjectID,
				 T1.Content,
				 T1.NodeLevel,
				 T1.IsLeaf,
			   T1.CreateTime,
				 T1.CreateUser,
				 T1.LastUpdTime,
				 T1.LastUpdUser,
				 T1.IsValid,
				 T1.Remark 
	FROM QuestionBankTemp.t_ITN_Knowledge T1;
	
	-- 1.4 遍历游标结束标志绑定到游戏
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
	
	SELECT Count(1) INTO nRecordCount
	FROM QuestionBankTemp.t_ITN_Knowledge T1;

	if nRecordCount <= 0 then
		  SELECT '没有找到要操作的源数据!' As Message;
			LEAVE Label_Begin;
	End if;
	
	 -- 3.1 打开游标
  OPEN cur;

  -- 3.2 开始循环
  read_loop: LOOP

    -- 声明结束的时候
    IF done THEN
        LEAVE read_loop;
    END IF;

		-- 提取游标里的当前行的数据
		FETCH cur INTO  
					D_KnowledgeID,
					D_TreeNodeNo,
	        D_InitID,
	        D_InitNo,
	        D_IsCorrect,
	        D_KnowledgeParentID,
	        D_SubjectID,
	        D_Content,
	        D_NodeLevel,
	        D_IsLeaf,
	        D_CreateTime,
	        D_CreateUser,
	        D_LastUpdTime,
	        D_LastUpdUser,
	        D_IsValid,
	        D_Remark;
					
		SET D_CreateTime = now();
		SET D_CreateUser = StrongestScholar.Dvlp_Fn_GetDefaultUserID("A");
		SET D_LastUpdTime = D_CreateTime;
		SET D_LastUpdUser = StrongestScholar.Dvlp_Fn_GetDefaultUserID("A");			
					

		INSERT INTO StrongestScholar.t_BSD_Knowledge(KnowledgeID,KnowledgeParentID,SubjectID,Content,TreeNodeNo,NodeLevel,IsLeaf,CreateTime,CreateUser,LastUpdTime,LastUpdUser,Remark,IsValid)
		SELECT D_KnowledgeID,D_KnowledgeParentID,D_SubjectID,
					 D_Content,D_TreeNodeNo,D_NodeLevel,D_IsLeaf,
					 D_CreateTime,D_CreateUser,D_LastUpdTime,
					 D_LastUpdUser,D_Remark,D_IsValid
		ON DUPLICATE KEY
		UPDATE KnowledgeParentID=D_KnowledgeParentID,
					 SubjectID=D_SubjectID,
					 Content=D_Content,
					 TreeNodeNo=D_TreeNodeNo,
					 NodeLevel=D_NodeLevel,
					 IsLeaf=D_IsLeaf,
					 CreateTime=D_CreateTime,
					 CreateUser=D_CreateUser,
					 LastUpdTime=D_LastUpdTime,
					 LastUpdUser=D_LastUpdUser,
					 Remark=D_Remark,
					 IsValid=D_IsValid;
				 
   Set nRecordIndex = nRecordIndex + 1;
END LOOP;

	 -- 关闭游标
  CLOSE cur;

	-- 4.作一些处理
	if nRecordIndex >= nRecordCount   then
		 SELECT '记录已成功的迁移到准数据库中了！' As Message;
  Else
			SELECT '记录已迁移但不完整地到准数据库中去了！' As Message;
	End if;


END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_Init_ImpQuestionFromCrawler
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_Init_ImpQuestionFromCrawler`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_Init_ImpQuestionFromCrawler`(IN_Str_Condition			 	VARCHAR(1024),-- 要查询哪些数据的SQL过滤条件		
		 In_Str_InitID         	VARCHAR(36),
     In_N_From             	INT(11),-- 开始的序号（从1开始计）
     IN_N_To         			 	INT(11),-- 结束的序号（含该序号，从1开始计）	
	   IN_N_IsAlwaysFormBatN  TINYINT(4),-- 1:是否总是执行前N条记录,否则：按批量进行	 
		 IN_Str_InitDes				 	VARCHAR(50),
		 IN_N_IsDel						 	TINYINT(4),		 
		 In_Str_InitID_From    	VARCHAR(36),
     In_N_BatCount				 	INT(10))
Label_Begin:
BEGIN
	 
	 -- 1.定义变量	 
	 
	 -- 1.1 定义字段变量(这里变量准备做后期游标接收使用，暂时未用到)
	 DECLARE F_QuestionID	varchar(36);
	 DECLARE F_QuestionNo	varchar(36);
	 DECLARE F_InitID	varchar(255);
	 DECLARE F_InitNo	varchar(255);
	 DECLARE F_IsCorrect	tinyint(4);
	 DECLARE F_ErrorReason	varchar(512);
	 DECLARE F_QuestionCode	varchar(36);
	 DECLARE F_QuestionTypeID	varchar(36);
	 DECLARE F_KnowledgeID	varchar(36);
	 DECLARE F_Question	text(0);
	 DECLARE F_Provider	varchar(36);
	 DECLARE F_PersonInCharge	varchar(36);
	 DECLARE F_Reference	varchar(255);
	 DECLARE F_QuestionLevel	int(11);
	 DECLARE F_Difficulty	double;
	 DECLARE F_CoinWeight	double;
 	 DECLARE F_GPWeight	double;
 	 DECLARE F_QuestionAnalyze text(0);
	 DECLARE F_RecommendTime	int(11);
	 DECLARE F_CreateTime	datetime(0);
	 DECLARE F_CreateUser	varchar(36);
	 DECLARE F_LastUpdTime	timestamp;
	 DECLARE F_LastUpdUser	varchar(36);
	 DECLARE F_PrsStatus	tinyint;
	 DECLARE F_PrsUserId	varchar(64);
	 DECLARE F_PrsUsername	varchar(255);
	 DECLARE F_PrsTime	datetime(0);
	 DECLARE F_IsCheckPass	varchar(16);
	 DECLARE F_CheckUserId	varchar(64);
	 DECLARE F_CheckUsername	varchar(64);
	 DECLARE F_CheckTime	datetime;
	 DECLARE F_IsValid	tinyint(4);
	 DECLARE F_Remark	varchar(255);
	 DECLARE F_FromQuestionID	varchar(255);
	 DECLARE F_FromQuestionNo	varchar(255);
	 
	 -- 1.2 定义程序中变量
	 DECLARE nRecordCount INT(11);
	 Declare nCurBatIndex INT(11) DEFAULT 0;	 
	 DECLARE nBeginIndex  INT(11) DEFAULT 0;
	 
	 DECLARE MyErrCode VARCHAR(36);
	 DECLARE MyErrMsg  VARCHAR(1000);
	 
	 -- 1.3 定义事件相关变量	 
	 DECLARE t_error INTEGER DEFAULT 0;    
   DECLARE CONTINUE HANDLER FOR SQLEXCEPTION 
	 Begin
				ROLLBACK;	 
				 
				GET DIAGNOSTICS CONDITION 1 MyErrCode=RETURNED_SQLSTATE,MyErrMsg=MESSAGE_TEXT;
				
				If IN_N_IsAlwaysFormBatN = 0 then
					Set nCurBatIndex = nCurBatIndex + 1;				
				End if;				
						
				-- 回滚后记录当前日志信息
        Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
				(
					null,
					In_Str_InitID,
					'E',
					CONCAT('ErrCode:',
					        IFNULL(MyErrCode,''),					        
									",ErrMsg:",
									IFNULL(MyErrMsg,''),
								 ',The current operation information is: the conditions for inserting records:IN_Str_Condition:',								
								 IFNULL(IN_Str_Condition,''),
								 ',In_Str_InitID:',
								  IFNULL(In_Str_InitID,''),
								 ',In_N_From:',
								 IFNULL(In_N_From,''),
								 ',IN_N_To:',
								 IFNULL(IN_N_To,''),
								 ',IN_Str_InitDes:',
								 IFNULL(IN_Str_InitDes,''),
								 ',IN_N_IsDel:',
								 IFNULL(IN_N_IsDel,''),
								 ',In_Str_InitID_From:',
								 IFNULL(In_Str_InitID_From,''),
								 ',In_N_BatCount:',
								 IFNULL(In_N_BatCount,''),
								 ',IN_N_IsAlwaysFormBatN:',
								 IFNULL(IN_N_IsAlwaysFormBatN,''),
								 ',The current starting sequence number is:',
								 IFNULL(nBeginIndex,''))
				 );									
				
				SET t_error = 1;
	End;
	 	 
	 -- 2.预处理及参数检验
	 
	 -- 2.1 预处理变量
	 Set In_Str_InitID = IFNULL(In_Str_InitID,'36d52856-8a93-11e8-8ba0-5254009bf409');	 
	 Set In_Str_InitID_From = IFNULL(In_Str_InitID_From,In_Str_InitID);
	 Set In_N_BatCount = IFNULL(In_N_BatCount,500);
	 Set IN_N_IsDel = IFNULL(IN_N_IsDel,0);
	 Set In_N_From = IFNULL(In_N_From,0);
	 Set IN_N_To = IFNULL(IN_N_To,In_N_From + 10000 - 1);
	 Set IN_Str_InitDes = IFNULL(IN_Str_InitDes,
	                             CONCAT("Data Initialization At:",
															 date_format( now( ), '%Y-%m-%d %H:%m:%s' )));
	 Set IN_N_IsAlwaysFormBatN = IFNULL(IN_N_IsAlwaysFormBatN,0);
	 Set IN_Str_Condition = IFNULL(IN_Str_Condition,'');
	  
	 -- 2.2 删除题库表中所有的数据
	 if IN_N_IsDel = 1 THEN
		 DELETE From QuestionBankTemp.t_ITN_Question
		 Where InitNo = In_Str_InitID;
		 
		 if t_error = 1 then 
			LEAVE Label_Begin;
		end if;
		 
		 DELETE From QuestionBankTemp.t_ITN_Main
		 Where InitID = In_Str_InitID;
		 
		  if t_error = 1 then 
			LEAVE Label_Begin;
		end if;
	End if;
		
	 -- 插入明细的数据
	 INSERT Into QuestionBankTemp.t_ITN_Main
		(
			InitID,InitNo,InitUserCode,InitUserName,InitName,
			InitDes,FromType,FromDBName,FromInitID,FromInitNo,
			InitTime,Remark,PrsStatus,CreateTime,LastUpdTime
		)
		SELECT In_Str_InitID As InitID, In_Str_InitID As InitNo,null As InitUserCode,null AS InitUserName,
					 IN_Str_InitDes As InitName,
					 IN_Str_InitDes As InitDes,						
					 null As FromType,'QuestionBankCrawler' As FromDBName,'' As FromInitID,
					 In_Str_InitID_From As FromInitNo,now() As InitTime,null As Remark,0 As PrsStatus,
					 NOW() As CreateTime,NOW() As  LastUpdTime
		From Dual 
		Where Not EXISTS
		(
				SELECT 1
				From QuestionBankTemp.t_ITN_Main TT1
				Where TT1.InitID = In_Str_InitID
		);
		
		if t_error = 1 then 
			LEAVE Label_Begin;
		end if;
	 
	 -- 2.3 先获取记录的总数
	 SELECT COUNT(1)  INTO NRecordCount
	 From QuestionBankCrawler.tb_question T1
	 Where T1.InitNo = In_Str_InitID_From;	
	
   if t_error = 1 then 
			LEAVE Label_Begin;
		end if;	
				 	 
	 SELECT NRecordCount As MsgNRecordCount;
	 
	 CREATE TEMPORARY TABLE IF NOT EXISTS `Tmp_Tb_Question`  
	 (
				`QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
				`InitID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
				`InitNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
				`KnowledgeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
				`Question` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
				`QuestionTxt` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
				`ChoiceA` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
				`ChoiceB` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
				`ChoiceC` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
				`ChoiceD` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
				`Answer` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
				`QuestionAnalyze` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
				`Difficulty` float(3, 2) NULL DEFAULT NULL,
				`FromQuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
				`FromInitID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
				PRIMARY KEY (`InitID`, `QuestionID`) USING BTREE
		) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;
	 
--    CREATE TEMPORARY TABLE IF NOT EXISTS `Tmp_Tb_Question`  
-- 	 (
-- 				`QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
-- 				`InitID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '初始化ID',
-- 				`InitNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化编码',
-- 				`KnowledgeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
-- 				`Question` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '题干',
-- 				`QuestionTxt` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '标题的纯文本',
-- 				`ChoiceA` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项A',
-- 				`ChoiceB` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项B',
-- 				`ChoiceC` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项C',
-- 				`ChoiceD` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项D',
-- 				`Answer` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '答案',
-- 				`QuestionAnalyze` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '解析',
-- 				`Difficulty` float(3, 2) NULL DEFAULT NULL COMMENT '难度系数',
-- 				`FromQuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题id',
-- 				`FromInitID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源的试题InitID',
-- 				PRIMARY KEY (`InitID`, `QuestionID`) USING BTREE
-- 		) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '试题的临时表' ROW_FORMAT = Compact;
-- 
		-- 将数据插入临时表
		Set @strSQLText = CONCAT('Insert Tmp_Tb_Question(QuestionID,InitID,InitNo,KnowledgeID,Question,',
																									'QuestionTxt,ChoiceA,ChoiceB,ChoiceC,ChoiceD,',
																									'Answer,QuestionAnalyze,Difficulty,FromQuestionID,FromInitID)
														SELECT UUID(),\'',In_Str_InitID,'\',\'',In_Str_InitID,'\',KnowledgeID,Question,
																									QuestionTxt,ChoiceA,ChoiceB,ChoiceC,ChoiceD,
																									Answer,QuestionAnalyze,Difficulty,FromQuestionID,InitID As FromInitID
														From  QuestionBankCrawler.Dvlp_Init_V_Question T1
														Where T1.InitNo = ? ',
														IF(IN_N_IsAlwaysFormBatN = 1,' And IFNULL(T1.Status,0) != 3 ',' '),
														IF(IN_Str_Condition != '',CONCAT(' And ',IN_Str_Condition),''),
														'  Limit ?,?');
														
-- 		select @strSQLText As DynamicSQLText;
														
		PREPARE SqlText FROM @strSQLText;
		
		-- 记录当前日志信息				
		Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
		(
			null,
			In_Str_InitID,
			'I',
			CONCAT(',The current operation information is: the conditions for inserting records:IN_Str_Condition:',
			        IFNULL(IN_Str_Condition,''),
						 ',In_Str_InitID:',IFNULL(In_Str_InitID,''),
						 ',In_N_From:',IFNULL(In_N_From,''),',IN_N_To:',IFNULL(IN_N_To,''),
						 ',IN_Str_InitDes:',IFNULL(IN_Str_InitDes,''),
						 ',IN_N_IsDel:',IFNULL(IN_N_IsDel,''),
						 ',In_Str_InitID_From:',IFNULL(In_Str_InitID_From,''),
						 ',IN_N_IsAlwaysFormBatN:',IFNULL(IN_N_IsAlwaysFormBatN,''),
						 ',In_N_BatCount:',IFNULL(In_N_BatCount,''),'Ready to start processing data')
		 );
		 
		if t_error = 1 then 
			LEAVE Label_Begin;
		end if;
 
   PrsLooP:LOOP			 
	  IF IN_N_IsAlwaysFormBatN = 0 THEN
			Set nBeginIndex = In_N_From +  nCurBatIndex * In_N_BatCount - 1;
			IF nBeginIndex + 1 > IN_N_To   THEN
				LEAVE PrsLooP; 
			END IF;
		End if;
		
		Set t_error = 0;
		
		START TRANSACTION;
		
		-- 先清除数据
		DELETE From Tmp_Tb_Question;

    
	  if t_error = 1 then 
			ITERATE PrsLooP;
		end if;
		
		set @a=nBeginIndex;
		set @b=In_N_BatCount;
		set @c=In_Str_InitID_From;
							
		EXECUTE SqlText USING @c,@a,@b;		
		
		if t_error = 1 then 
			IF IN_N_IsAlwaysFormBatN = 0 THEN
				ITERATE PrsLooP;
			ELSE
				LEAVE Label_Begin;
			End if;
		end if;
		
		-- 当没有记录需要处理时就会退出程序
		SELECT COUNT(1) 
	  INTO	nRecordCount
		From Tmp_Tb_Question;
		
		IF IN_N_IsAlwaysFormBatN = 1 THEN		
        IF nRecordCount=0 THEN
				   LEAVE Label_Begin;
				END IF;
		End if;		
		
		-- 删除已经存在的明细
		DELETE T1
		FROM Tmp_Tb_Question T1, QuestionBankTemp.t_ITN_Question TT1
		WHERE T1.FromInitID=TT1.FromInitID AND T1.FromQuestionID=TT1.FromQuestionID;
-- 		DELETE From Tmp_Tb_Question										
-- 		Where (FromInitID,FromQuestionID) In 
-- 		(
-- 			 SELECT TT1.FromInitID,TT1.FromQuestionID
-- 			 From QuestionBankTemp.t_ITN_Question  TT1						 
-- 		);
		
		if t_error = 1 then 
			IF IN_N_IsAlwaysFormBatN = 0 THEN
				ITERATE PrsLooP;
			ELSE
				LEAVE Label_Begin;
			End if;
		end if;
		
		-- 从临时表转入目标表
		INSERT INTO QuestionBankTemp.t_ITN_Question 
		(
			QuestionID,QuestionNo,InitID,InitNo,IsCorrect,
			ErrorReason,QuestionCode,QuestionTypeID,KnowledgeID,Question,
			Provider,PersonInCharge,Reference,QuestionLevel,Difficulty,
			CoinWeight,GPWeight,QuestionAnalyze,RecommendTime,CreateTime,
			CreateUser,LastUpdTime,LastUpdUser,PrsStatus,PrsUserId,
			PrsUsername,PrsTime,IsCheckPass,CheckUserId,CheckUsername,
			CheckTime,IsValid,Remark,FromQuestionID,FromQuestionNo)

		SELECT V.QuestionID As QuestionID,QuestionID As QuestionNo,InitID As InitID,InitID As InitNo,   IsCorrect,
					 ErrorReason,QuestionID As QuestionCode,QuestionTypeID,KnowledgeID,Question,
					 null,null,null,null,Difficulty,
					 null,null,V.QuestionAnalyze,null,NOW(),
					 null,NOW(),null,null,null,
					 null,NOW(),0,NULL,NULL,
					 null,1,null,V.FromQuestionID As FromQuestionID,V.FromQuestionID As FromQuestionNo
		From 
		(
			SELECT T1.QuestionID As QuestionID,In_Str_InitID As InitID, In_Str_InitID As  InitNo,0 As IsCorrect,
				null As ErrorReason,
				1 As QuestionTypeID,T1.KnowledgeID As KnowledgeID,T1.Question As Question,
				T1.Difficulty,T1.QuestionAnalyze,T1.FromQuestionID
			FROM Tmp_Tb_Question T1
		) V;
		
		if t_error = 1 then 
			IF IN_N_IsAlwaysFormBatN = 0 THEN
				ITERATE PrsLooP;
			ELSE
				LEAVE Label_Begin;
			End if;
		end if;		

		INSERT into QuestionBankTemp.t_ITN_QuestionMultipleChoice
		(QuestionID,QuestionNo,InitID,InitNo,IsCorrect,
		 ChoiceA,ChoiceB,ChoiceC,ChoiceD,Answer,
		 CreateTime,CreateUser,LastUpdTime,LastUpdUser,Remark,IsValid)
		SELECT T1.QuestionID,T1.QuestionID,In_Str_InitID,In_Str_InitID,null,
					 T1.ChoiceA,T1.ChoiceB,T1.ChoiceC,T1.ChoiceD,T1.Answer,
					 NOW() As CreateTime,null As  CreateUser,NOW(),NULL,null,NULL
		FROM Tmp_Tb_Question T1;
		
		if t_error = 1 then 
			IF IN_N_IsAlwaysFormBatN = 0 THEN
				ITERATE PrsLooP;
			ELSE
				LEAVE Label_Begin;
			End if;
		end if;
		
		-- 更新状态为已转至准数据库
		UPDATE QuestionBankCrawler.tb_question T1,Tmp_Tb_Question TT1
    Set T1.status = 3
    WHERE T1.initId = TT1.FromInitID AND T1.id=TT1.FromQuestionID;
-- 		UPDATE QuestionBankCrawler.tb_question T1
-- 		Set T1.status = 3
-- 		Where (T1.initId,T1.id) IN
-- 		(
-- 				SELECT TT1.FromInitID,TT1.FromQuestionID
-- 				From Tmp_Tb_Question TT1
-- 		);
			
    IF t_error = 0 THEN 										   
	 	  COMMIT;    
			
			IF IN_N_IsAlwaysFormBatN = 0 THEN
				Set nCurBatIndex = nCurBatIndex + 1;
			End if;
		 
			Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
			(
				null,
				In_Str_InitID,
				'I',
				CONCAT('The current operation information is: the conditions for inserting records:IN_Str_Condition:',								
							 IFNULL(IN_Str_Condition,''),
							 ',In_Str_InitID:',
								IFNULL(In_Str_InitID,''),
							 ',In_N_From:',
							 IFNULL(In_N_From,''),
							 ',IN_N_To:',
							 IFNULL(IN_N_To,''),
							 ',IN_Str_InitDes:',
							 IFNULL(IN_Str_InitDes,''),
							 ',IN_N_IsDel:',
							 IFNULL(IN_N_IsDel,''),
							 ',In_Str_InitID_From:',
							 IFNULL(In_Str_InitID_From,''),
							 ',In_N_BatCount:',
							 IFNULL(In_N_BatCount,''),
							 ',IN_N_IsAlwaysFormBatN:',
								 IFNULL(IN_N_IsAlwaysFormBatN,''),
							 ',The current starting sequence number is:',
							 IFNULL(nBeginIndex,''),'Inserted successfully!')
			 );		
	  END IF;
	
	END LOOP;
	
	DEALLOCATE PREPARE SqlText;					
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_Init_ImpQuestionFromManual
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_Init_ImpQuestionFromManual`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_Init_ImpQuestionFromManual`(In_Str_InitID VARCHAR(36))
Label_Begin:
BEGIN

  -- 1.定义变量	 
	 
	-- 1.1 定义目标表中字段变量

	DECLARE D_QuestionID          VARCHAR(36);
	DECLARE D_QuestionNo          VARCHAR(36);
	DECLARE D_InitID              VARCHAR(255);
	DECLARE D_InitNo              VARCHAR(255);
	DECLARE D_IsCorrect           TINYINt(4);
	DECLARE D_ErrorReason         VARCHAR(512);
	DECLARE D_QuestionCode        VARCHAR(36);
	DECLARE D_QuestionTypeID      VARCHAR(36);
	DECLARE D_KnowledgeID         VARCHAR(36);
	DECLARE D_Question            VARCHAR(1024);
	DECLARE D_Provider            VARCHAR(36);
	DECLARE D_PersonInCharge      VARCHAR(36);
	DECLARE D_Reference           VARCHAR(255);
	DECLARE D_QuestionLevel       INT(11);
	DECLARE D_Difficult           DOUBLE;
	DECLARE D_CoinWeight          DOUBLE;
	DECLARE D_GPWeight            DOUBLE;
	DECLARE D_QuestionAnalyze     VARCHAR(1024);
	DECLARE D_RecommendTime       INT(11);
	DECLARE D_CreateTime          TIMESTAMP;
	DECLARE D_CreateUser          VARCHAR(36);
	DECLARE D_LastUpdTime         TIMESTAMP;
	DECLARE D_LastUpdUser         VARCHAR(36);
	DECLARE D_PrsStatus           TINYINT(1);
	DECLARE D_PrsUserId           VARCHAR(64);
	DECLARE D_PrsUsername         VARCHAR(255);
	DECLARE D_PrsTime             TIMESTAMP;
	DECLARE D_IsCheckPass         VARCHAR(16);
	DECLARE D_CheckUserId         VARCHAR(64);
	DECLARE D_CheckUsername       VARCHAR(64);
	DECLARE D_IsValid             TINYINT(4);
	DECLARE D_Remark              VARCHAR(255);
	DECLARE D_FromQuestionID      VARCHAR(255);
	DECLARE D_FromQuestionNo      VARCHAR(255);
	DECLARE D_FromInitID          VARCHAR(36);
	
	
  -- 1.2 定义源表中的字段变量
	DECLARE S_QuestionID          VARCHAR(36);
	DECLARE S_QuestionNo          VARCHAR(36);
	DECLARE S_InitID              VARCHAR(255);
	DECLARE S_InitNo              VARCHAR(255);
	DECLARE S_IsCorrect           TINYINT;
	DECLARE S_ErrorReason         VARCHAR(512);
	DECLARE S_ExaminationCode     VARCHAR(128);
	DECLARE S_ExaminationSummary  VARCHAR(128);
	DECLARE S_ExaminationVersion  VARCHAR(128);
	DECLARE S_QuestionCode        VARCHAR(36);
	DECLARE S_QuestionType        VARCHAR(36);
	DECLARE S_KnowledgeDes        VARCHAR(128);
	DECLARE S_Question            VARCHAR(512);
	DECLARE S_Provider            VARCHAR(36);
	DECLARE S_PersonInCharge      VARCHAR(36);
	DECLARE S_GradeName           VARCHAR(255);
	DECLARE S_SubjectName         VARCHAR(255);
	DECLARE S_Reference           VARCHAR(255);
	DECLARE S_QuestionLevel       INT(11);
	DECLARE S_Difficulty          DOUBLE;
	DECLARE S_CoinWeight          DOUBLE;
	DECLARE S_GPWeight            DOUBLE;
	DECLARE S_QuestionAnalyze     VARCHAR(1024);
	DECLARE S_RecommendTime       INT(11);
	DECLARE S_CreateTime          TIMESTAMP;
	DECLARE S_CreateUser          VARCHAR(36);
	DECLARE S_LastUpdTime         TIMESTAMP;
	DECLARE S_LastUpdUser         VARCHAR(36);
	DECLARE S_PrsStatus           TINYINT(1);
	DECLARE S_PrsUserId           VARCHAR(64);
	DECLARE S_PrsUsername         VARCHAR(255);
	DECLARE S_PrsTime             TIMESTAMP;
	DECLARE S_IsCheckPass         VARCHAR(16);
	DECLARE S_CheckUserId         VARCHAR(64);
	DECLARE S_CheckUsername       VARCHAR(64);
	DECLARE S_IsValid             TINYINT(4);
	DECLARE S_Remark              VARCHAR(255);
	
	-- 1.3 定义其它变量
	DECLARE nRecordIndex INT DEFAULT 0;
	DECLARE nRecordCount INT DEFAULT 0;
	
	DECLARE MyErrCode VARCHAR(36);
	DECLARE MyErrMsg  VARCHAR(1000);
	  
		
	-- 	3 游标操作
  -- 	3.1 定义游标
	DECLARE cur CURSOR FOR
	SELECT * FROM QuestionBankManual.t_ITN_QuestionManual;
	
  --  定义异常处理	
  DECLARE CONTINUE HANDLER FOR SQLEXCEPTION 
	Begin
				ROLLBACK;	 
				 
				GET DIAGNOSTICS CONDITION 1 MyErrCode=RETURNED_SQLSTATE,MyErrMsg=MESSAGE_TEXT;
				
				-- 回滚后记录当前日志信息
        Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
				(
					NULL,
					In_Str_InitID,
					'E',
					CONCAT('ErrCode:',
					        IFNULL(MyErrCode,''),					        
									",ErrMsg:",
									IFNULL(MyErrMsg,''),
								 ',In_Str_InitID:',
								  IFNULL(In_Str_InitID,''),
								 ',QuestionID:',
								 IFNULL(S_QuestionID,'')
								 )
				 );									
	End;
	
  
	
 	-- 3.2检验及预处理
	SET In_Str_InitID = CASE IFNULL(In_Str_InitID,"")
													WHEN "" then "01cd58b1-88a2-11e8-a7b0-5254009bf409"
													ELSE In_Str_InitID END;

	IF IFNUll(In_Str_InitID,"") = "" THEN
	  SELECT '请传入要初始化的ID' As Message;
		LEAVE Label_Begin;
	End IF;
	
  -- 	3.3 打开游标
  OPEN cur;
	
  -- 	3.4 开始循环
	PrsLoop:
	LOOP
		FETCH cur INTO S_QuestionID,
								   S_QuestionNo,
								   S_InitID,
								   S_InitNo,
								   S_IsCorrect,
								   S_ErrorReason,
								   S_ExaminationCode,
								   S_ExaminationSummary,
								   S_ExaminationVersion,
								   S_QuestionCode,
								   S_QuestionType,
								   S_KnowledgeDes,
								   S_Question,
								   S_Provider,
								   S_PersonInCharge,
								   S_GradeName,
								   S_SubjectName,
								   S_Reference,
								   S_QuestionLevel,
								   S_Difficulty,
								   S_CoinWeight,
									 S_GPWeight,
								   S_QuestionAnalyze,
								   S_RecommendTime,
								   S_CreateTime,
								   S_CreateUser,
								   S_LastUpdTime,
								   S_LastUpdUser,
								   S_PrsStatus,
								   S_PrsUserId,
								   S_PrsUsername,
								   S_PrsTime,
								   S_IsCheckPass,
								   S_CheckUserId,
								   S_CheckUsername,
								   S_IsValid,
								   S_Remark;
									 
			SET D_QuestionID = S_QuestionID;
			SET D_QuestionNo = S_QuestionNo;
			SET D_InitID = S_InitID;
			SET D_InitNo = S_InitNo;
									 
		END LOOP;							 
	
	
	
	
	
	 

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_Init_ImpQuestionToCrawler
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_Init_ImpQuestionToCrawler`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_Init_ImpQuestionToCrawler`(IN_Str_Condition			 VARCHAR(1024),-- 过滤条件
    In_Str_InitID         VARCHAR(36),
    IN In_N_From             INT(11),-- 开始的序号（从1开始计）
    IN In_N_To         			 INT(11),-- 结束的序号（含该序号，从1开始计）
		IN In_N_BatCount				 INT(10),
		IN_Str_InitDes				 VARCHAR(50))
Label_Begin:
BEGIN
	-- 定义程序中变量

	 DECLARE nCurBatIndex INT(11) DEFAULT 0;	 
	 DECLARE nBeginIndex  INT(11) DEFAULT 0;
	 
	 DECLARE MyErrCode VARCHAR(36);
	 DECLARE MyErrMsg  VARCHAR(1000);
	 
	 
	 -- 异常处理函数 
	 DECLARE t_error INTEGER DEFAULT 0;    
   DECLARE CONTINUE HANDLER FOR SQLEXCEPTION 
	 Begin
				ROLLBACK;	 
				
-- 				GET DIAGNOSTICS CONDITION 1 MyErrCode=RETURNED_SQLSTATE,MyErrMsg=MESSAGE_TEXT;
				
				Set nCurBatIndex = nCurBatIndex + 1;
						
				-- 回滚后记录当前日志信息
        Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
				(
					null,
					In_Str_InitID,
					'E',
					CONCAT('ErrCode:',
					        IFNULL(MyErrCode,''),					        
									",ErrMsg:",
									IFNULL(MyErrMsg,''),
								 ',In_Str_InitID:',
								  IFNULL(In_Str_InitID,''),
								 ',In_N_From:',
								 IFNULL(In_N_From,''),
								 ',In_N_To:',
								 IFNULL(In_N_To,''),
								 ',IN_Str_InitDes:',
								 IFNULL(IN_Str_InitDes,''),
								 ',In_N_BatCount:',
								 IFNULL(In_N_BatCount,''),
								 ',The current starting sequence number is:',
								 IFNULL(nBeginIndex,''))
				 );									
				
				SET t_error=1;
	End;
	
	--  预处理变量
	 SET IN_Str_Condition = IFNULL(IN_Str_Condition,'');
	 Set In_Str_InitID = IFNULL(In_Str_InitID,'36d52856-8a93-11e8-8ba0-5254009bf409');	 
	 Set In_N_BatCount = IFNULL(In_N_BatCount,500);
	 Set In_N_From = IFNULL(In_N_From,0);
	 Set IN_N_To = IFNULL(IN_N_To,In_N_From + 10000 - 1);
	 Set IN_Str_InitDes = IFNULL(IN_Str_InitDes,
	                             CONCAT("Data Initialization At:",
															 date_format( now( ), '%Y-%m-%d %H:%m:%s' )));
	
	
-- 	插入语句，核心部分

	SET @sqlstmt = CONCAT('INSERT IGNORE INTO QuestionBankCrawler.tb_question (initId,
													id,
													InitNo,
													title,
													titleTxt,
													choiceA,
													choiceB,
													choiceC,
													choiceD,
													answer,
													analysis,
													phase,
													subject,
													grade,
													booklet,
													unit,
													chapter,
													knowledge,
													knowledgeID,
													difficulty,
													bookVersion,
													status,
													currentTime
													)
													(SELECT (initId
													id,
													InitNo,
													title,
													titleTxt,
													choiceA,
													choiceB,
													choiceC,
													choiceD,
													answer,
													analysis,
													phase,
													subject,
													grade,
													booklet,
													unit,
													chapter,
													knowledge,
													knowledgeID,
													difficulty,
													bookVersion,
													status,
													currentTime
													) FROM QuestionBankCrawlerDvlp.tb_question ',
																						IN_Str_Condition,
																						'LIMIT ?,?)');
									
		
	
	PREPARE exestmt FROM @sqlstmt;


-- 记录当前日志信息				
		Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
		(
			null,
			In_Str_InitID,
			'I',
			CONCAT(',In_Str_InitID:',In_Str_InitID,
						 ',In_N_From:',In_N_From,
						 ',IN_N_To:',IN_N_To,
						 ',IN_Str_InitDes:',IN_Str_InitDes,
						 ',In_N_BatCount:',In_N_BatCount,'Ready to start processing data')
		 );
		 
		if t_error = 1 then 
			LEAVE Label_Begin;
		end if;
		
		PrsLoop:LOOP
	  Set nBeginIndex = In_N_From +  nCurBatIndex * In_N_BatCount;
		IF nBeginIndex + 1 > IN_N_To   THEN
			LEAVE PrsLooP; 
		END IF;
		
		START TRANSACTION;
		
		SET	@s1 = nBeginIndex;
	  SET @s2 = In_N_BatCount;
	  EXECUTE exestmt USING @s1,@s2;
		
		if t_error = 1 then 
			ITERATE PrsLooP;
		end if;							   
	 	IF t_error = 0 THEN 										   
	 	  COMMIT;    
			
			Set nCurBatIndex = nCurBatIndex + 1;
		 
			Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
			(
				null,
				In_Str_InitID,
				'I',
				CONCAT(',In_Str_InitID:',
								IFNULL(In_Str_InitID,''),
							 ',In_N_From:',
							 IFNULL(In_N_From,''),
							 ',IN_N_To:',
							 IFNULL(IN_N_To,''),
							 ',IN_Str_InitDes:',
							 IFNULL(IN_Str_InitDes,''),
							 ',In_N_BatCount:',
							 IFNULL(In_N_BatCount,''),
							 ',The current starting sequence number is:',
							 IFNULL(nBeginIndex,''),'Inserted successfully!')
			 );		
	 
	  END IF;   
			
END LOOP;

	DEALLOCATE PREPARE exestmt;

	

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_Init_ImpQuestionToFormal
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_Init_ImpQuestionToFormal`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_Init_ImpQuestionToFormal`(In_Str_Condition			 	VARCHAR(1024),-- 要查询哪些数据的SQL过滤条件		
		 In_Str_InitID         	VARCHAR(36),
		 In_Str_InitDes				 	VARCHAR(50),-- 初始化信息
     In_N_From             	INT(11),-- 开始的序号（从1开始计）
     In_N_To         			 	INT(11),-- 结束的序号（含该序号，从1开始计）
		 In_N_BatCount          INT(11))
Label_Begin:
BEGIN
	
-- 	1 定义变量
-- 	1.1 定义目标数据库变量字段
	
	DECLARE D_QuestionID        VARCHAR(36);
	DECLARE D_QuestionNo        VARCHAR(36);
	DECLARE D_QuestionCode      VARCHAR(36);
	DECLARE D_QuestionTypeID    VARCHAR(36);
	DECLARE D_KnowledgeID       VARCHAR(36);
	DECLARE D_Question          VARCHAR(255);
	DECLARE D_Provider          VARCHAR(36);
	DECLARE D_PersonInCharge    VARCHAR(36);
	DECLARE D_Reference         VARCHAR(255);
	DECLARE D_QuestionLevel     INT(11);
	DECLARE D_Difficulty        DOUBLE;
	DECLARE D_CoinWeight        DOUBLE;
	DECLARE D_GPWeight          DOUBLE;
	DECLARE D_QuestionAnalyze   VARCHAR(512);
	DECLARE D_RecommendTime     INT(11);
	DECLARE CreateTime          TIMESTAMP;
	DECLARE CreateUser          VARCHAR(36);
	DECLARE LastUpdTime         TIMESTAMP;
	DECLARE LastUpdUser         VARCHAR(36);
	DECLARE IsValid             TINYINT;
	DECLARE Remark              VARCHAR(255);
	
	-- 1.2 定义程序中变量
-- 	 DECLARE nRecordCount INT(11);
	 DECLARE nCurBatIndex INT(11) DEFAULT 0;	 
	 DECLARE nBeginIndex  INT(11) DEFAULT 0 ;
	 
	 
	 DECLARE MyErrCode VARCHAR(36);
	 DECLARE MyErrMsg  VARCHAR(1000);
	 
	 
	 
	  -- 1.3 定义事件相关变量	 
	 DECLARE t_error INTEGER DEFAULT 0;    
   DECLARE CONTINUE HANDLER FOR SQLEXCEPTION 
	 BEGIN
				ROLLBACK;	 
				 
 			GET DIAGNOSTICS CONDITION 1 MyErrCode=RETURNED_SQLSTATE,MyErrMsg=MESSAGE_TEXT;
				
				
				SET nCurBatIndex = nCurBatIndex + 1;				
								
						
				-- 回滚后记录当前日志信息
        CALL QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
				(
					null,
					In_Str_InitID,
					'E',
					CONCAT('ErrCode:',
					        IFNULL(MyErrCode,''),					        
									",ErrMsg:",
									IFNULL(MyErrMsg,''),
								 ',The current operation information is: the conditions for inserting records:In_Str_Condition:',								
								 IFNULL(In_Str_Condition,''),
								 ',In_Str_InitID:',
								  IFNULL(In_Str_InitID,''),
								 ',In_N_From:',
								 IFNULL(In_N_From,''),
								 ',In_N_To:',
								 IFNULL(In_N_To,''),
								 ',In_Str_InitDes:',
								 IFNULL(In_Str_InitDes,''),
								 ',The current starting sequence number is:',
								 IFNULL(nBeginIndex,''))
				 );									
				
				SET t_error = 1;
	END;
	
	-- 2.预处理及参数检验
	 
	 -- 2.1 预处理变量
	 SET In_Str_InitID = IFNULL(In_Str_InitID,'36d52856-8a93-11e8-8ba0-5254009bf409');	 
	 SET IN_Str_Condition = IFNULL(IN_Str_Condition,'');
	 SET In_N_From = IFNULL(In_N_From,0);
	 SET In_N_To = IFNULL(IN_N_To,In_N_From + 10000 - 1);
	 SET In_N_BatCount = IFNULL(In_N_BatCount,50);
	 SET In_Str_InitDes = IFNULL(IN_Str_InitDes,
	                             CONCAT("Data Initialization At:",
															 date_format( now( ), '%Y-%m-%d %H:%m:%s' )));
															 
		SET @strSQLText = 'INSERT IGNORE INTO StrongestScholar.t_QST_Question(QuestionID,QuestionNo,QuestionCode,QuestionTypeID,KnowledgeID,Question,Provider,PersonInCharge,Reference,QuestionLevel,Difficulty,CoinWeight,GPWeight,QuestionAnalyze,RecommendTime,CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,Remark)
SELECT QuestionID,QuestionNo,QuestionCode,QuestionTypeID,KnowledgeID,Question,Provider,PersonInCharge,Reference,QuestionLevel,Difficulty,CoinWeight,GPWeight,QuestionAnalyze,RecommendTime,CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,Remark
FROM QuestionBankTemp.t_ITN_Question LIMIT ?,?';

		PREPARE SqlText FROM @strSQLText;
PrsLoop:													 
		LOOP
		  START TRANSACTION;
			
			SET nBeginIndex = In_N_From + nCurBatIndex * In_N_BatCount - 1;
			IF nBeginIndex + 1 > In_N_To THEN
				LEAVE PrsLoop;
			END IF;	
			
			SET @a = nBeginIndex;
			SET @b = In_N_BatCount;
			
			EXECUTE SqlText USING @a,@b;
			
			IF t_error = 1 THEN 
				  LEAVE Label_Begin;
			END IF;
			
			IF t_error = 0 THEN
				COMMIT;
			  Set nCurBatIndex = nCurBatIndex + 1;
				CALL QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
				(
					null,
					In_Str_InitID,
					'E',
					CONCAT(',The current operation information is: the conditions for inserting records:In_Str_Condition:',								
								 IFNULL(In_Str_Condition,''),
								 ',In_Str_InitID:',
								  IFNULL(In_Str_InitID,''),
								 ',In_N_From:',
								 IFNULL(In_N_From,''),
								 ',In_N_To:',
								 IFNULL(In_N_To,''),
								 ',In_Str_InitDes:',
								 IFNULL(In_Str_InitDes,''),
								 ',The current starting sequence number is:',
								 IFNULL(nBeginIndex,''))
				 );					
		  END IF;	
		END LOOP;
	
    DEALLOCATE PREPARE SqlText;	
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_Init_ImpSubjectFromManual
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_Init_ImpSubjectFromManual`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_Init_ImpSubjectFromManual`(In_Str_InitID	VARCHAR(36))
Label_Begin:
BEGIN 
	-- 1.定义变量
	
	-- 1.1 定义游标变量及其它变量
	
	-- 1.1.1定义游标变量
  DECLARE SubjectID VARCHAR(36);
	DECLARE SubjectNo VARCHAR(36);
	DECLARE InitID VARCHAR(36);
	DECLARE InitNo VARCHAR(36);
	DECLARE IsCorrect tinyint(4);
	DECLARE SubjectName VARCHAR(72);
	DECLARE SubjectShortName VARCHAR(72);	
	DECLARE GradePhaseID VARCHAR(36);
	DECLARE GradeID VARCHAR(36);
	DECLARE CourseID VARCHAR(36);
	DECLARE BookVerID VARCHAR(36);
	DECLARE Booklet VARCHAR(36);
	DECLARE CreateTime datetime;
	DECLARE CreateUser VARCHAR(36);
	DECLARE LastUpdTime datetime;
	DECLARE LastUpdUser VARCHAR(36);
	DECLARE IsValid tinyint(4);
	DECLARE Remark VARCHAR(36);
			
	-- 1.1.2 定义其它变量
	DECLARE nRecordIndex INT DEFAULT 0;
	DECLARE nRecordCount INT DEFAULT 0; 
		
	-- 1.3 遍历游标遍历结束标志
  DECLARE done INT DEFAULT FALSE;
  
	-- 1.2 定义游标
  DECLARE cur CURSOR FOR 
	SELECT  `T1`.`SubjectID` AS `SubjectID`,					
					`T1`.`InitID` AS `InitID`,
					`T1`.`InitNo` AS `InitNo`,
					`T1`.`IsCorrect` AS `IsCorrect`,
					`T1`.`SubjectName` AS `SubjectName`,
					`T1`.`SubjectShortName` AS `SubjectShortName`,
					`T1`.`GradePhaseID` AS `GradePhaseID`,
					`T1`.`GradeID` AS `GradeID`,
					`T1`.`CourseID` AS `CourseID`,				
					`T1`.`Booklet` AS `Booklet`,
					`T1`.`CreateTime` AS `CreateTime`,
					`T1`.`CreateUser` AS `CreateUser`,
					`T1`.`LastUpdTime` AS `LastUpdTime`,
					`T1`.`LastUpdUser` AS `LastUpdUser`,
					`T1`.`IsValid` AS `IsValid`,
					`T1`.`Remark` AS `Remark` 
	FROM QuestionBankManual.Dvlp_v_Init_Subject3Manual T1
	Where T1.initID = In_Str_InitID And
	      T1.IsLeaf = TRUE;
  		
	-- 1.4 遍历游戏结束标志绑定到游戏
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
	
	-- 2.检验及预处理	
	Set In_Str_InitID = CASE IFNULL(In_Str_InitID,"") 
													WHEN "" then "01cd58b1-88a2-11e8-a7b0-5254009bf409"       							 
													Else In_Str_InitID END;		
	
	if IFNUll(In_Str_InitID,"") = "" THEN	
	  SELECT '请传入要初始化的ID' As Message;
		
		LEAVE Label_Begin;
	End if;
	
	SELECT COUNT(1) Into nRecordCount
	FROM QuestionBankManual.Dvlp_v_Init_Subject3Manual T1
	Where T1.initID = In_Str_InitID And
	      T1.TreeLevel = 3; 
				
	if nRecordCount <= 0 then
		  SELECT '没有找到要操作的源数据!' As Message;
	
			LEAVE Label_Begin;
	End if;
	
	-- 删除表中的科目
-- 	DELETE From QuestionBankTemp.t_ITN_Subject Where 1 = 1; 
		
	
	-- 3.用游标对数据逐条进行处理
	
  -- 3.1 打开游标
  OPEN cur;
  
  -- 3.2 开始循环
  read_loop: LOOP
	
    -- 声明结束的时候
    IF done THEN
        LEAVE read_loop;
    END IF;
		
		-- 提取游标里的当前行的数据 
    FETCH cur INTO  SubjectID,										
										InitID,
										InitNo,
										IsCorrect,
										SubjectName,
										SubjectShortName,
										GradePhaseID,
										GradeID,
										CourseID,										
										Booklet,
										CreateTime,
										CreateUser,
										LastUpdTime,
										LastUpdUser,
										IsValid,
										Remark;

		
		Set nRecordIndex = nRecordIndex + 1;
		Set SubjectNo = LPAD(nRecordIndex,3,'0');
				
		SET BookVerID = StrongestScholar.Dvlp_P_GetDefaultBoolVerID();
    
		-- 这里做你想做的循环的事件
	  INSERT INTO QuestionBankTemp.t_ITN_Subject( SubjectID,SubjectNo,InitID,InitNo,IsCorrect,SubjectName,SubjectShortName,GradePhaseID,GradeID,CourseID, BookVerID,
		                                            Booklet,CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,Remark)
		SELECT SubjectID,SubjectNo,InitID,InitNo,IsCorrect,															  
					 SubjectName,SubjectShortName,GradePhaseID,GradeID,CourseID,
					 BookVerID,Booklet,CreateTime,CreateUser,LastUpdTime,
					 LastUpdUser,IsValid,Remark
		ON DUPLICATE KEY
		UPDATE SubjectNo = SubjectNo,
					 InitID = InitID,
					 InitNo = InitNo,
					 IsCorrect = IsCorrect,															  
					 SubjectName = SubjectName,
					 SubjectShortName = SubjectShortName,
					 GradePhaseID = GradePhaseID,
					 GradeID = GradeID,
					 CourseID = CourseID,
					 BookVerID = BookVerID,
					 Booklet = Booklet,
					 CreateTime = CreateTime,
					 CreateUser = CreateUser,
					 LastUpdTime = LastUpdTime,
					 LastUpdUser = LastUpdUser,
					 IsValid = IsValid,
					 Remark = Remark;
  END LOOP;
	
  -- 关闭游标
  CLOSE cur;		
	
	-- 4.作一些处理
	if nRecordIndex >= NRecordCount   then
		 SELECT '记录已成功的迁移到准数据库中了！' As Message;		 
  Else
			SELECT '记录已迁移但不完整地到准数据库中去了！' As Message;
	End if;	

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_Init_ImpSubjectToFormal
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_Init_ImpSubjectToFormal`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_Init_ImpSubjectToFormal`()
Label_Begin:
BEGIN
	-- 1.定义变量

	-- 1.1 定义游标变量及其它变量

	-- 1.1.1定义游标变量
  DECLARE D_SubjectID VARCHAR(36);
	DECLARE D_SubjectNo VARCHAR(36);
	DECLARE D_InitID VARCHAR(36);
	DECLARE D_InitNo VARCHAR(36);
	DECLARE D_IsCorrect tinyint(4);
	DECLARE D_SubjectName VARCHAR(72);
	DECLARE D_SubjectShortName VARCHAR(72);
	DECLARE D_GradePhaseID VARCHAR(36);
	DECLARE D_GradeID VARCHAR(36);
	DECLARE D_CourseID VARCHAR(36);
	DECLARE D_BookVerID VARCHAR(36);
	DECLARE D_Booklet VARCHAR(36);
	DECLARE D_CreateTime datetime;
	DECLARE D_CreateUser VARCHAR(36);
	DECLARE D_LastUpdTime datetime;
	DECLARE D_LastUpdUser VARCHAR(36);
	DECLARE D_IsValid tinyint(4);
	DECLARE D_Remark VARCHAR(36);

	-- 1.1.2 定义其它变量
	DECLARE nRecordIndex INT DEFAULT 0;
	DECLARE nRecordCount INT DEFAULT 0;

	-- 1.3 遍历游标遍历结束标志
  DECLARE done INT DEFAULT FALSE;

	-- 1.2 定义游标
  DECLARE cur CURSOR FOR
	SELECT  `T1`.`SubjectID` AS `SubjectID`,
	        `T1`.`SubjectNo` AS `SubjectNo`,
					`T1`.`InitID` AS `InitID`,
					`T1`.`InitNo` AS `InitNo`,
					`T1`.`IsCorrect` AS `IsCorrect`,
					`T1`.`SubjectName` AS `SubjectName`,
					`T1`.`SubjectShortName` AS `SubjectShortName`,
					`T1`.`GradePhaseID` AS `GradePhaseID`,
					`T1`.`GradeID` AS `GradeID`,
					`T1`.`CourseID` AS `CourseID`,
					`T1`.`BookVerID` AS `BookVerID`,
					`T1`.`Booklet` AS `Booklet`,
					`T1`.`CreateTime` AS `CreateTime`,
					`T1`.`CreateUser` AS `CreateUser`,
					`T1`.`LastUpdTime` AS `LastUpdTime`,
					`T1`.`LastUpdUser` AS `LastUpdUser`,
					`T1`.`IsValid` AS `IsValid`,
					`T1`.`Remark` AS `Remark`
	FROM QuestionBankTemp.t_ITN_Subject T1
	WHERE SubjectNo IS NOT NULL;
-- 	Where T1.initID = In_Str_InitID ;

	-- 1.4 遍历游戏结束标志绑定到游戏
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

	SELECT COUNT(1) Into nRecordCount
	FROM QuestionBankTemp.t_ITN_Subject T1;
-- 	Where T1.initID = In_Str_InitID And
-- 	      T1.TreeLevel = 3;

	if nRecordCount <= 0 then
		  SELECT '没有找到要操作的源数据!' As Message;
			LEAVE Label_Begin;
	End if;


	-- 3.用游标对数据逐条进行处理

  -- 3.1 打开游标
  OPEN cur;

  -- 3.2 开始循环
  read_loop:
	LOOP

    -- 声明结束的时候
    IF done THEN
        LEAVE read_loop;
    END IF;

		-- 提取游标里的当前行的数据
    FETCH cur INTO  D_SubjectID,
										D_SubjectNo,
										D_InitID,
										D_InitNo,
										D_IsCorrect,
										D_SubjectName,
										D_SubjectShortName,
										D_GradePhaseID,
										D_GradeID,
										D_CourseID,
                    D_BookVerID,
										D_Booklet,
										D_CreateTime,
										D_CreateUser,
										D_LastUpdTime,
										D_LastUpdUser,
										D_IsValid,
										D_Remark;

		Set nRecordIndex = nRecordIndex + 1;

		SET D_CreateTime = now();
		SET D_CreateUser = StrongestScholar.Dvlp_Fn_GetDefaultUserID("A");
		SET D_LastUpdTime = D_CreateTime;
		SET D_LastUpdUser = StrongestScholar.Dvlp_Fn_GetDefaultUserID("A");

		-- 这里做你想做的循环的事件
	  INSERT IGNORE INTO StrongestScholar.t_BSD_Subject(SubjectID,SubjectNo,SubjectName,SubjectShortName,GradePhaseID,BookVerID,GradeID,CourseID,CreateTime,CreateUser,LastUpdTime,LastUpdUser,IsValid,Remark)
		SELECT D_SubjectID,D_SubjectNo,D_SubjectName,D_SubjectShortName,
					 D_GradePhaseID,D_BookVerID,D_GradeID,D_CourseID,D_CreateTime,
					 D_CreateUser,D_LastUpdTime,D_LastUpdUser,D_IsValid,D_Remark
		ON DUPLICATE KEY
		UPDATE SubjectNo = D_SubjectNo,
					 SubjectName = D_SubjectName,
					 SubjectShortName = D_SubjectShortName,
					 GradePhaseID = D_GradePhaseID,
					 BookVerID = D_BookVerID,
					 GradeID = D_GradeID,
					 CourseID = D_CourseID,
					 CreateTime = D_CreateTime,
					 CreateUser = D_CreateUser,
					 LastUpdTime = D_LastUpdTime,
					 LastUpdUser = D_LastUpdUser,
					 IsValid = D_IsValid,
					 Remark = D_Remark;
  END LOOP;

  -- 关闭游标
  CLOSE cur;

	-- 4.作一些处理
	if nRecordIndex >= NRecordCount   then
		 SELECT '记录已成功的迁移到准数据库中了！' As Message;
  Else
			SELECT '记录已迁移但不完整地到准数据库中去了！' As Message;
	End if;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_Init_UpdateQuestionTableKnowledgeID
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_Init_UpdateQuestionTableKnowledgeID`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_Init_UpdateQuestionTableKnowledgeID`(In IN_Str_Condition			 	VARCHAR(1024),-- 要查询哪些数据的SQL过滤条件
		 IN In_Str_InitID         	VARCHAR(36),
     IN In_N_From          			INT(11),-- 开始的序号（从1开始计）
     IN IN_N_To         	 			INT(11),-- 结束的序号（含该序号，从1开始计）		 
		 In IN_Str_InitDes				 	VARCHAR(50),
     IN In_N_BatCount			 			INT(10))
Label_Begin:
BEGIN

	-- 1.1 定义程序中变量

	 DECLARE nRecordCount INT(11);
	 Declare nCurBatIndex INT(11) DEFAULT 0;	 
	 DECLARE nBeginIndex  INT(11) DEFAULT 0;
	 
	 DECLARE exestmt VARCHAR(1024);
	 
	 DECLARE MyErrCode VARCHAR(36);
	 DECLARE MyErrMsg  VARCHAR(1000);
	 
	 -- 异常处理函数 
	 DECLARE t_error INTEGER DEFAULT 0;    
	 
	 -- 定义异常处理函数
   DECLARE CONTINUE HANDLER FOR SQLEXCEPTION 
	 Begin
				ROLLBACK;	 
				
				GET DIAGNOSTICS CONDITION 1 MyErrCode=RETURNED_SQLSTATE,MyErrMsg=MESSAGE_TEXT;
				
				Set nCurBatIndex = nCurBatIndex + 1;
						
				-- 回滚后记录当前日志信息
        Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
				(
					null,
					In_Str_InitID,
					'E',
					CONCAT('ErrCode:',
					        IFNULL(MyErrCode,''),					        
									",ErrMsg:",
									IFNULL(MyErrMsg,''),
								 ',The current operation information is: the conditions for inserting records:IN_Str_Condition:',								
								 IFNULL(IN_Str_Condition,''),
								 ',In_Str_InitID:',
								  IFNULL(In_Str_InitID,''),
								 ',In_N_From:',
								 IFNULL(In_N_From,''),
								 ',IN_N_To:',
								 IFNULL(IN_N_To,''),
								 ',IN_Str_InitDes:',
								 IFNULL(IN_Str_InitDes,''),
								 ',In_N_BatCount:',
								 IFNULL(In_N_BatCount,''),
								 ',The current starting sequence number is:',
								 IFNULL(nBeginIndex,''))
				 );
				
				SET t_error=1;
	End;
	  
-- 2.预处理及参数检验
	 
	 -- 2.1 预处理变量
	 SET IN_Str_Condition = IFNULL(IN_Str_Condition,'');
	 Set In_Str_InitID = IFNULL(In_Str_InitID,'36d52856-8a93-11e8-8ba0-5254009bf409');	 
	 Set In_N_BatCount = IFNULL(In_N_BatCount,500);
	 Set In_N_From = IFNULL(In_N_From,0);
	 Set IN_N_To = IFNULL(IN_N_To,In_N_From + 10000);
	 Set IN_Str_InitDes = IFNULL(IN_Str_InitDes,
	                             CONCAT("Data Initialization At:",
															 date_format( now( ), '%Y-%m-%d %H:%m:%s' )));
	  


-- 更新knowledgeID语句
	SET @stmt = CONCAT(' UPDATE QuestionBankCrawler.tb_question t1
								SET t1.knowledgeID = 	 QuestionBankCrawler.Dvlp_Fn_GetQuestionKnowledgeID(t1.phase,t1.subject,t1.grade,t1.booklet,t1.bookVersion,t1.unit,t1.chapter,t1.knowledge)
								WHERE ((t1.id IN (
																	SELECT TT1.id 
																	FROM 
																	(
																		 SELECT TX1.id 
																		 From QuestionBankCrawler.tb_question  TX1 
																		 ',
																		 IN_Str_Condition,
																		 'LIMIT ?,?
																	) TT1
																))
													AND t1.knowledgeID IS NULL			
											 )');
	PREPARE exestmt FROM @stmt;	
	
	-- 记录当前日志信息				
		Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
		(
			null,
			In_Str_InitID,
			'I',
			CONCAT(',In_Str_InitID:',In_Str_InitID,
						 ',In_N_From:',In_N_From,',IN_N_To:',IN_N_To,
						 ',IN_Str_InitDes:',IN_Str_InitDes,
						 ',In_N_BatCount:',In_N_BatCount,'Ready to start processing data')
		 );
		 
		if t_error = 1 then 
			LEAVE Label_Begin;
		end if;

PrsLoop:LOOP
	  Set nBeginIndex = In_N_From +  nCurBatIndex * In_N_BatCount - 1;
		IF nBeginIndex + 1 > IN_N_To   THEN
			LEAVE PrsLooP; 
		END IF;
		
		START TRANSACTION;
		

		SET	@s1 = nBeginIndex;
	  SET @s2 = In_N_BatCount;
	  EXECUTE exestmt USING @s1,@s2;
		
		if t_error = 1 then 
			ITERATE PrsLooP;
		end if;							   
	 	IF t_error = 0 THEN 										   
	 	  COMMIT;    
			
			Set nCurBatIndex = nCurBatIndex + 1;
		 
			Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
			(
				null,
				In_Str_InitID,
				'I',
				CONCAT(',In_Str_InitID:',
								IFNULL(In_Str_InitID,''),
							 ',In_N_From:',
							 IFNULL(In_N_From,''),
							 ',IN_N_To:',
							 IFNULL(IN_N_To,''),
							 ',IN_Str_InitDes:',
							 IFNULL(IN_Str_InitDes,''),
							 ',In_N_BatCount:',
							 IFNULL(In_N_BatCount,''),
							 ',The current starting sequence number is:',
							 IFNULL(nBeginIndex,''),'Inserted successfully!')
			 );		
	 
	  END IF;   
			
END LOOP;

	DEALLOCATE PREPARE exestmt;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for Dvlp_P_UpdateQuestionTableKnowledgeID
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_UpdateQuestionTableKnowledgeID`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_UpdateQuestionTableKnowledgeID`(IN_Str_Condition			 VARCHAR(1024),-- 过滤条件
		 IN_BL_IsAlwaysHeadN   INT(1), -- 是否总是前n条记录，1表示是前n条，否则表示不是前n条
		 In_Str_InitID         VARCHAR(36),
     IN In_N_From          INT(11),-- 开始的序号（从1开始计）
     IN IN_N_To         	 INT(11),-- 结束的序号（含该序号，从1开始计）		 
		 IN_Str_InitDes				 VARCHAR(50),
     IN In_N_BatCount			 INT(10))
Label_Begin:
BEGIN

	-- 1.1 定义程序中变量

	 DECLARE nRecordCount INT(11);
	 Declare nCurBatIndex INT(11) DEFAULT 0;	 
	 DECLARE nBeginIndex  INT(11) DEFAULT 0;
	 
	 DECLARE exestmt VARCHAR(1024);
	 
	 DECLARE MyErrCode VARCHAR(36);
	 DECLARE MyErrMsg  VARCHAR(1000);
	 
	 -- 异常处理函数 
	 DECLARE t_error INTEGER DEFAULT 0;    
   DECLARE CONTINUE HANDLER FOR SQLEXCEPTION 
	 Begin
				ROLLBACK;	 
				
				-- GET DIAGNOSTICS CONDITION 1 MyErrCode=RETURNED_SQLSTATE,MyErrMsg=MESSAGE_TEXT;
				
				Set nCurBatIndex = nCurBatIndex + 1;
						
				-- 回滚后记录当前日志信息
        Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
				(
					null,
					In_Str_InitID,
					'E',
					CONCAT('ErrCode:',
					        IFNULL(MyErrCode,''),					        
									",ErrMsg:",
									IFNULL(MyErrMsg,''),
								 ',The current operation information is: the conditions for inserting records:IN_Str_Phase:',								
								 IFNULL(IN_Str_Phase,''),
								 ',In_Str_InitID:',
								  IFNULL(In_Str_InitID,''),
								 ',In_N_From:',
								 IFNULL(In_N_From,''),
								 ',IN_N_To:',
								 IFNULL(IN_N_To,''),
								 ',IN_Str_InitDes:',
								 IFNULL(IN_Str_InitDes,''),
								 ',In_N_BatCount:',
								 IFNULL(In_N_BatCount,''),
								 ',The current starting sequence number is:',
								 IFNULL(nBeginIndex,''))
				 );									
				
				SET t_error=1;
	End;
	  
-- 2.预处理及参数检验
	 
	 -- 2.1 预处理变量
	 SET IN_Str_Condition = IFNULL(IN_Str_Condition,'');
	 Set In_Str_InitID = IFNULL(In_Str_InitID,'36d52856-8a93-11e8-8ba0-5254009bf409');	 
	 Set In_N_BatCount = IFNULL(In_N_BatCount,500);
	 Set In_N_From = IFNULL(In_N_From,0);
	 Set IN_N_To = IFNULL(IN_N_To,In_N_From + 10000 - 1);
	 Set IN_Str_InitDes = IFNULL(IN_Str_InitDes,
	                             CONCAT("Data Initialization At:",
															 date_format( now( ), '%Y-%m-%d %H:%m:%s' )));




-- 更新knowledgeID语句
	SET @stmt = CONCAT(' UPDATE QuestionBankCrawler.tb_question t1
								SET t1.knowledgeID = IFNULL(t1.knowledgeID,QuestionBankCrawler.Dvlp_Fn_GetQuestionKnowledgeID(t1.phase,t1.subject,t1.grade,t1.booklet,t1.bookVersion,t1.unit,t1.chapter,t1.knowledge))
								WHERE (t1.id IN (
																	SELECT TT1.id 
																	FROM 
																	(
																		 SELECT TX1.id 
																		 From QuestionBankCrawler.tb_question  TX1 
																		 WHERE  1 = 1 ',
																		 IF(IN_Str_Condition = '','  ','And '),
																		 IN_Str_Condition,
																		 'LIMIT ?,?
																	) TT1
																)
																
											 )');
	PREPARE exestmt FROM @stmt;
  

	
	-- 记录当前日志信息				
		Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
		(
			null,
			In_Str_InitID,
			'I',
			CONCAT(',In_Str_InitID:',In_Str_InitID,
						 ',In_N_From:',In_N_From,',IN_N_To:',IN_N_To,
						 ',IN_Str_InitDes:',IN_Str_InitDes,
						 ',In_N_BatCount:',In_N_BatCount,'Ready to start processing data')
		 );
		 
		if t_error = 1 then 
			LEAVE Label_Begin;
		end if;

PrsLoop:LOOP
	  Set nBeginIndex = In_N_From +  nCurBatIndex * In_N_BatCount;
		IF nBeginIndex + 1 > IN_N_To   THEN
			LEAVE PrsLooP; 
		END IF;
		
		START TRANSACTION;
		

		SET	@s1 = nBeginIndex;
	  SET @s2 = In_N_BatCount;
	  EXECUTE exestmt USING @s1,@s2;
		
		if t_error = 1 then 
			ITERATE PrsLooP;
		end if;							   
	 	IF t_error = 0 THEN 										   
	 	  COMMIT;    
			
			Set nCurBatIndex = nCurBatIndex + 1;
		 
			Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
			(
				null,
				In_Str_InitID,
				'I',
				CONCAT(',In_Str_InitID:',
								IFNULL(In_Str_InitID,''),
							 ',In_N_From:',
							 IFNULL(In_N_From,''),
							 ',IN_N_To:',
							 IFNULL(IN_N_To,''),
							 ',IN_Str_InitDes:',
							 IFNULL(IN_Str_InitDes,''),
							 ',In_N_BatCount:',
							 IFNULL(In_N_BatCount,''),
							 ',The current starting sequence number is:',
							 IFNULL(nBeginIndex,''),'Inserted successfully!')
			 );		
	 
	  END IF;   
			
END LOOP;

	DEALLOCATE PREPARE exestmt;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for NewProc
-- ----------------------------
DROP PROCEDURE IF EXISTS `NewProc`;
delimiter ;;
CREATE PROCEDURE `NewProc`(IN_Str_Condition			   VARCHAR(1024),-- 过滤条件
    In_Str_InitID            VARCHAR(36),
    IN In_N_From             INT(11),-- 开始的序号（从1开始计）
    IN In_N_To         			 INT(11),-- 结束的序号（含该序号，从1开始计）
		IN In_N_BatCount				 INT(10),
		IN_Str_InitDes				   VARCHAR(50))
Label_Begin:
BEGIN
	-- 定义程序中变量

	 DECLARE nCurBatIndex INT(11) DEFAULT 0;	 
	 DECLARE nBeginIndex  INT(11) DEFAULT 0;
	 
	 DECLARE MyErrCode VARCHAR(36);
	 DECLARE MyErrMsg  VARCHAR(1000);
	 
	 
	 -- 异常处理函数 
	 DECLARE t_error INTEGER DEFAULT 0;    
   DECLARE CONTINUE HANDLER FOR SQLEXCEPTION 
	 Begin
				ROLLBACK;	 
				
				GET DIAGNOSTICS CONDITION 1 MyErrCode=RETURNED_SQLSTATE,MyErrMsg=MESSAGE_TEXT;
				
				Set nCurBatIndex = nCurBatIndex + 1;
						
				-- 回滚后记录当前日志信息
        Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
				(
					null,
					In_Str_InitID,
					'E',
					CONCAT('ErrCode:',
					        IFNULL(MyErrCode,''),					        
									",ErrMsg:",
									IFNULL(MyErrMsg,''),
								 ',The current operation information is: the conditions for inserting records:IN_Str_Phase:',								
								 IFNULL(In_Str_Phase,''),
								 ',In_Str_InitID:',
								  IFNULL(In_Str_InitID,''),
								 ',In_N_From:',
								 IFNULL(In_N_From,''),
								 ',In_N_To:',
								 IFNULL(In_N_To,''),
								 ',IN_Str_InitDes:',
								 IFNULL(IN_Str_InitDes,''),
								 ',In_N_BatCount:',
								 IFNULL(In_N_BatCount,''),
								 ',The current starting sequence number is:',
								 IFNULL(nBeginIndex,''))
				 );									
				
				SET t_error=1;
	End;
	
	--  预处理变量
	 Set In_Str_InitID = IFNULL(In_Str_InitID,'36d52856-8a93-11e8-8ba0-5254009bf409');	 
	 Set In_N_BatCount = IFNULL(In_N_BatCount,500);
	 Set In_N_From = IFNULL(In_N_From,0);
	 Set IN_N_To = IFNULL(IN_N_To,In_N_From + 10000 - 1);
	 Set IN_Str_InitDes = IFNULL(IN_Str_InitDes,
	                             CONCAT("Data Initialization At:",
															 date_format( now( ), '%Y-%m-%d %H:%m:%s' )));
	
	
-- 	插入语句，核心部分

	SET @sqlstmt = CONCAT('INSERT IGNORE INTO QuestionBankCrawler.tb_question_test 
	                (SELECT * FROM QuestionBankCrawler.tb_question WHERE ',
									IF(IN_Str_Condition = '','  ','And '),
									IN_Str_Condition,
									'LIMIT ?,?)');
		
	
	PREPARE exestmt FROM @sqlstmt;


-- 记录当前日志信息				
		Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
		(
			null,
			In_Str_InitID,
			'I',
			CONCAT(',In_Str_InitID:',In_Str_InitID,
						 ',In_N_From:',In_N_From,
						 ',IN_N_To:',IN_N_To,
						 ',IN_Str_InitDes:',IN_Str_InitDes,
						 ',In_N_BatCount:',In_N_BatCount,'Ready to start processing data')
		 );
		 
		if t_error = 1 then 
			LEAVE Label_Begin;
		end if;
		
		PrsLoop:LOOP
	  Set nBeginIndex = In_N_From +  nCurBatIndex * In_N_BatCount - 1;
		IF nBeginIndex + 1 > IN_N_To   THEN
			LEAVE PrsLooP; 
		END IF;
		
		START TRANSACTION;
		
		SET @s1 = In_Str_Phase;
		SET	@s2 = nBeginIndex;
	  SET @s3 = In_N_BatCount;
	  EXECUTE exestmt USING @s1,@s2,@s3;
		
		if t_error = 1 then 
			ITERATE PrsLooP;
		end if;							   
	 	IF t_error = 0 THEN 										   
	 	  COMMIT;    
			
			Set nCurBatIndex = nCurBatIndex + 1;
		 
			Call QuestionBankTemp.Dvlp_P_WriteLogInfoToDB
			(
				null,
				In_Str_InitID,
				'I',
				CONCAT(',In_Str_InitID:',
								IFNULL(In_Str_InitID,''),
							 ',In_N_From:',
							 IFNULL(In_N_From,''),
							 ',IN_N_To:',
							 IFNULL(IN_N_To,''),
							 ',IN_Str_InitDes:',
							 IFNULL(IN_Str_InitDes,''),
							 ',In_N_BatCount:',
							 IFNULL(In_N_BatCount,''),
							 ',The current starting sequence number is:',
							 IFNULL(nBeginIndex,''),'Inserted successfully!')
			 );		
	 
	  END IF;   
			
END LOOP;

	DEALLOCATE PREPARE exestmt;

	

END
;;
delimiter ;

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
