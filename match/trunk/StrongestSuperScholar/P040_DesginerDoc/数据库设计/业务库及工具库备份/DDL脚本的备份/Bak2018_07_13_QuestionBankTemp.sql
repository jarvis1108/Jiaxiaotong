/*
 Navicat MySQL Data Transfer

 Source Server         : StrongestScholar
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : 139.199.15.124:3306
 Source Schema         : QuestionBankTemp

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 13/07/2018 08:38:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_ITN_Knowledge
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_Knowledge`;
CREATE TABLE `t_ITN_Knowledge`  (
  `KnowledgeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID',
  `TreeNodeNo` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '树结点编码',
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该项在此次导入中的序号',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `KnowledgeParentID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父类ID，可以为空',
  `SubjectID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属科目编号',
  `Content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '知识点内容',
  `NodeLevel` int(11) NULL DEFAULT NULL COMMENT '级别，根节点是0',
  `IsLeaf` tinyint(4) NULL DEFAULT 0 COMMENT '是否是叶子结点，1表示是，0表示不是，缺省是0',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '录入时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '录入人',
  `LastUpdTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近跟新用户',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  PRIMARY KEY (`KnowledgeID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '知识点表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_ITN_Main
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_Main`;
CREATE TABLE `t_ITN_Main`  (
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '录入编号',
  `InitNo` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化编码',
  `InitUserCode` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化用户编号',
  `InitUserName` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化用户姓名',
  `InitName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化化名称',
  `InitDes` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化描述',
  `FromType` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源类型，A:直接录入，B：来源于其它导入库',
  `FromDBName` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '来源的数据库名',
  `FromInitID` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源的初始化ID',
  `FromInitNo` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源的初始化编码',
  `InitTime` datetime(0) NULL DEFAULT NULL COMMENT '录入时间',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '录入备注说明',
  `PrsStatus` tinyint(1) NULL DEFAULT NULL COMMENT '状态，0表示未审核，1表示已选中，2表示未选中，3表示已转入数据库，-1表示已删除',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `LastUpdTime` datetime(0) NULL DEFAULT NULL COMMENT '上次更新时间',
  PRIMARY KEY (`InitID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_ITN_Question
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_Question`;
CREATE TABLE `t_ITN_Question`  (
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题id',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题编码',
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入编码',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `ErrorReason` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '错误原因',
  `QuestionCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题编号',
  `QuestionTypeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题类型ID',
  `KnowledgeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '知识点编号',
  `SubjectID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目编号',
  `Question` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '题干',
  `Provider` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '提供者，存储用户名',
  `PersonInCharge` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `Reference` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '引用出处',
  `QuestionLevel` int(11) NULL DEFAULT NULL COMMENT '级别',
  `Difficulty` double NULL DEFAULT NULL COMMENT '难度系数',
  `CoinWeight` double NULL DEFAULT NULL COMMENT '金币权值',
  `GPWeight` double NULL DEFAULT NULL COMMENT '绩点权值',
  `QuestionAnalyze` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '题目解析',
  `RecommendTime` int(11) NULL DEFAULT NULL COMMENT '推荐答题时间，以秒为单位',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `PrsStatus` tinyint(1) NULL DEFAULT NULL COMMENT '状态，0表示未审核，1表示已选中，2表示未选中，3表示已转入数据库，-1表示已删除',
  `PrsUserId` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理用户ID',
  `PrsUsername` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理用户姓名',
  `PrsTime` datetime(0) NULL DEFAULT NULL COMMENT '处理时间',
  `IsCheckPass` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否审题通过，0表示未审核，1表示审核通过，2表示审核未通过',
  `CheckUserId` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '审核人ID',
  `CheckUsername` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '审核人姓名',
  `CheckTime` datetime(0) NULL DEFAULT NULL COMMENT '审核时间',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `FromQuestionID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源试题ID',
  `FromQuestionNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源试题编码',
  PRIMARY KEY (`QuestionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题目表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_ITN_QuestionMultipleChoice
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_QuestionMultipleChoice`;
CREATE TABLE `t_ITN_QuestionMultipleChoice`  (
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '题目编号',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题编码',
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该项在此次导入中的序号',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `ChoiceA` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项A',
  `ChoiceB` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项B',
  `ChoiceC` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项C',
  `ChoiceD` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项D',
  `Answer` tinyint(4) NULL DEFAULT NULL COMMENT '答案：0:A; 1B; 2:C; 3:D',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '录入时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '录入人',
  `LastUpdTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  PRIMARY KEY (`QuestionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '多项选择题' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_ITN_QuestionRecitation
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_QuestionRecitation`;
CREATE TABLE `t_ITN_QuestionRecitation`  (
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '题目编号',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题编码',
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该项在此次导入中的序号',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `Answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '答案',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '录入时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '录入人',
  `LastUpdTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近跟新用户',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  PRIMARY KEY (`QuestionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '背诵题' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_ITN_Subject
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_Subject`;
CREATE TABLE `t_ITN_Subject`  (
  `SubjectID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '科目编号',
  `SubjectNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目编码',
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该项在此次导入中的序号',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `SubjectName` varchar(72) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目名称',
  `SubjectShortName` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目简称',
  `SubjectGradeType` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级类型（A：小学：B:初中，C：高中；D：大学本科；E：大学专科；H：研究生）',
  `SubjectGrade` int(11) NULL DEFAULT NULL COMMENT '科目年级（1-9）',
  `SubjectType` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目类型：A：语文；B：数学；C：英语；D：科学；E：物理；F：化学；G：生物；H：政治；I：历史；J：地理；',
  `Booklet` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分册如：上册，下册，必修一，必修二等',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户',
  `LastUpdTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`SubjectID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '科目表' ROW_FORMAT = Compact;

-- ----------------------------
-- View structure for v_MultipleChoice
-- ----------------------------
DROP VIEW IF EXISTS `v_MultipleChoice`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_MultipleChoice` AS select `t_ITN_Question`.`QuestionID` AS `QuestionID`,`t_ITN_Question`.`Question` AS `Question`,`t_ITN_QuestionMultipleChoice`.`ChoiceA` AS `ChoiceA`,`t_ITN_QuestionMultipleChoice`.`ChoiceB` AS `ChoiceB`,`t_ITN_QuestionMultipleChoice`.`ChoiceC` AS `ChoiceC`,`t_ITN_QuestionMultipleChoice`.`ChoiceD` AS `ChoiceD`,`t_ITN_QuestionMultipleChoice`.`Answer` AS `Answer`,`t_ITN_Question`.`QuestionAnalyze` AS `QuestionAnalyze`,`t_ITN_Question`.`Difficulty` AS `Difficulty`,`t_ITN_Subject`.`SubjectName` AS `SubjectName`,`t_ITN_Subject`.`SubjectShortName` AS `SubjectShortName`,`t_ITN_Subject`.`SubjectGradeType` AS `SubjectGradeType`,`t_ITN_Subject`.`SubjectGrade` AS `SubjectGrade`,`t_ITN_Subject`.`SubjectType` AS `SubjectType`,`t_ITN_Subject`.`Booklet` AS `Booklet`,`t_ITN_Knowledge`.`Content` AS `Content`,`t_ITN_Question`.`IsCheckPass` AS `IsCheckPass` from (((`t_ITN_Knowledge` join `t_ITN_Question` on((`t_ITN_Question`.`KnowledgeID` = `t_ITN_Knowledge`.`KnowledgeID`))) join `t_ITN_QuestionMultipleChoice` on((`t_ITN_Question`.`QuestionID` = `t_ITN_QuestionMultipleChoice`.`QuestionID`))) join `t_ITN_Subject` on((`t_ITN_Question`.`SubjectID` = `t_ITN_Subject`.`SubjectID`)));

-- ----------------------------
-- Procedure structure for Dvlp_P_TransSubjectDataFromManual
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_TransSubjectDataFromManual`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_TransSubjectDataFromManual`(IN InitID VARCHAR(36),
	IN InitNo VARCHAR(36),
	In InitUserID	VARCHAR(36),
	In InitUserName VARCHAR(16))
BEGIN
	DECLARE NA int;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
