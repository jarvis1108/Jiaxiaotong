/*
 Navicat MySQL Data Transfer

 Source Server         : StrongestScholar
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : 139.199.15.124:3306
 Source Schema         : QuestionBankManual

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 18/07/2018 15:26:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_ITN_KnowledgeManual
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_KnowledgeManual`;
CREATE TABLE `t_ITN_KnowledgeManual`  (
  `KnowledgeID` varchar(38) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID',
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该项在此次导入中的序号',
  `SubjectNameCode` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属科目NameCode',
  `OrderIndex` int(11) NULL DEFAULT NULL COMMENT '序号',
  `TreeCode` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '树结点编码',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `Content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '知识点内容',
  `Des` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述说明',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '录入时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '录入人',
  `LastUpdTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近跟新用户',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  PRIMARY KEY (`KnowledgeID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '知识点表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_ITN_MainManual
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_MainManual`;
CREATE TABLE `t_ITN_MainManual`  (
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '录入编号',
  `InitNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化编码',
  `InitUserCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化用户编号',
  `InitUserName` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化用户姓名',
  `InitName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化化名称',
  `InitDes` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化描述',
  `InitTime` datetime(0) NULL DEFAULT NULL COMMENT '录入时间',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '录入备注说明',
  `PrsStatus` tinyint(1) NULL DEFAULT NULL COMMENT '状态，0表示未审核，1表示已选中，2表示未选中，3表示已转入数据库，-1表示已删除',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `LastUpdTime` datetime(0) NULL DEFAULT NULL COMMENT '上次更新时间',
  PRIMARY KEY (`InitID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_ITN_QuestionManual
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_QuestionManual`;
CREATE TABLE `t_ITN_QuestionManual`  (
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题id',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题编码',
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入编码',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `ErrorReason` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '错误原因',
  `ExaminationCode` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试卷编号',
  `ExaminationDes` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试卷名称',
  `ExaminationTitle` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试卷标题',
  `ExaminationSummary` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试卷描述说明',
  `ExaminationVersion` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试卷版本号',
  `QuestionCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题编号',
  `QuestionType` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题类型，选择题，语音题',
  `KnowledgeDes` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '知识点说明，科目_知识点,如：一年级数学下册_第二单元/认识前后',
  `Question` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题干',
  `Provider` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '提供者，存储用户名',
  `PersonInCharge` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `GradeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级名称，如一年级,二年级',
  `SubjectName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目名称，如语文，数学',
  `Reference` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '引用出处',
  `QuestionLevel` int(11) NULL DEFAULT NULL COMMENT '级别',
  `Difficulty` double NULL DEFAULT NULL COMMENT '难度系数',
  `CoinWeight` double NULL DEFAULT NULL COMMENT '金币权值',
  `GPWeight` double NULL DEFAULT NULL COMMENT '绩点权值',
  `QuestionAnalyze` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '题目解析',
  `RecommendTime` int(11) NULL DEFAULT NULL COMMENT '推荐答题时间，以秒为单位',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `CreateUsername` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户姓名',
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
  PRIMARY KEY (`QuestionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '题目表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_ITN_QuestionMultipleChoiceManual
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_QuestionMultipleChoiceManual`;
CREATE TABLE `t_ITN_QuestionMultipleChoiceManual`  (
  `QuestionID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '题目编号',
  `QuestionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题编码',
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该项在此次导入中的序号',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `ChoiceA` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项A',
  `ChoiceB` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项B',
  `ChoiceC` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项C',
  `ChoiceD` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项D',
  `Answer` tinyint(4) NULL DEFAULT NULL COMMENT '答案：0:A; 1B; 2:C; 3:D',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '录入时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '录入人ID',
  `CreateUsername` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户姓名',
  `LastUpdTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  PRIMARY KEY (`QuestionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '多项选择题' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_ITN_QuestionRecitationManual
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_QuestionRecitationManual`;
CREATE TABLE `t_ITN_QuestionRecitationManual`  (
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
-- Table structure for t_ITN_SubjectManual
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_SubjectManual`;
CREATE TABLE `t_ITN_SubjectManual`  (
  `SubjectID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '科目编号',
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '导入ID',
  `InitNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '该项在此次导入中的序号',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `OrderIndex` int(11) NULL DEFAULT NULL COMMENT '序号',
  `TreeCode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '大纲级号',
  `SubjectName` varchar(72) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目名称',
  `SubjectShortName` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目简称',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建用户ID',
  `LastUpdTime` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最近更新时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最近更新用户ID',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`SubjectID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '科目表' ROW_FORMAT = Compact;

-- ----------------------------
-- View structure for Dvlp_v_Init_Knowledge
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_v_Init_Knowledge`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_v_Init_Knowledge` AS select `t1`.`KnowledgeID` AS `KnowledgeID`,`t1`.`InitID` AS `InitID`,`t1`.`InitNo` AS `InitNo`,`t1`.`SubjectNameCode` AS `SubjectNameCode`,`t1`.`OrderIndex` AS `OrderIndex`,`t1`.`TreeCode` AS `TreeCode`,`t1`.`IsCorrect` AS `IsCorrect`,`t1`.`Content` AS `Content`,`t1`.`Des` AS `Des`,`t1`.`CreateTime` AS `CreateTime`,`t1`.`CreateUser` AS `CreateUser`,`t1`.`LastUpdTime` AS `LastUpdTime`,`t1`.`LastUpdUser` AS `LastUpdUser`,`t1`.`Remark` AS `Remark`,`t1`.`IsValid` AS `IsValid`,`t2`.`SubjectID` AS `SubjectID` from (`QuestionBankManual`.`t_ITN_Knowledge` `t1` left join `QuestionBankTemp`.`t_ITN_Subject` `t2` on((locate(`t2`.`SubjectName`,`t1`.`SubjectNameCode`) > 0)));

-- ----------------------------
-- View structure for Dvlp_v_Init_Subject1
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_v_Init_Subject1`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_v_Init_Subject1` AS select `V`.`SubjectID` AS `SubjectID`,`V`.`InitID` AS `InitID`,`V`.`InitNo` AS `InitNo`,`V`.`IsCorrect` AS `IsCorrect`,`V`.`OrderIndex` AS `OrderIndex`,`V`.`TreeCode` AS `TreeCode`,`V`.`SubjectName` AS `SubjectName`,`V`.`SubjectShortName` AS `SubjectShortName`,`V`.`CreateTime` AS `CreateTime`,ifnull(`V`.`CreateUser`,`StrongestScholar`.`Dvlp_Fn_GetDefaultUserID`('A')) AS `CreateUser`,`V`.`LastUpdTime` AS `LastUpdTime`,ifnull(`V`.`LastUpdUser`,`StrongestScholar`.`Dvlp_Fn_GetDefaultUserID`('A')) AS `LastUpdUser`,`V`.`IsValid` AS `IsValid`,`V`.`Remark` AS `Remark`,substring_index(`V`.`TreeCode`,'.',1) AS `TreeCodeFirst`,(`StrongestScholar`.`Dvlp_Fn_GetSubstrCount`(`V`.`TreeCode`,'.') + 1) AS `TreeLevel` from `t_ITN_SubjectManual` `V`;

-- ----------------------------
-- View structure for Dvlp_v_Init_Subject2
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_v_Init_Subject2`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_v_Init_Subject2` AS select `V`.`SubjectID` AS `SubjectID`,`V`.`InitID` AS `InitID`,`V`.`InitNo` AS `InitNo`,`V`.`IsCorrect` AS `IsCorrect`,`V`.`OrderIndex` AS `OrderIndex`,`V`.`TreeCode` AS `TreeCode`,`V`.`SubjectName` AS `SubjectName`,`V`.`SubjectShortName` AS `SubjectShortName`,`V`.`CreateTime` AS `CreateTime`,`V`.`CreateUser` AS `CreateUser`,`V`.`LastUpdTime` AS `LastUpdTime`,`V`.`LastUpdUser` AS `LastUpdUser`,`V`.`IsValid` AS `IsValid`,`V`.`Remark` AS `Remark`,`V`.`TreeCodeFirst` AS `TreeCodeFirst`,`V`.`TreeLevel` AS `TreeLevel`,(case `V`.`TreeCodeFirst` when '1' then '小学' when '2' then '小学' when '3' then '小学' when '4' then '小学' when '5' then '小学' when '6' then '小学' when '7' then '初中' when '8' then '初中' when '9' then '初中' when '10' then '高中' end) AS `GradePhaseName`,(case `V`.`TreeCodeFirst` when '1' then '一年级' when '2' then '二年级' when '3' then '三年级' when '4' then '四年级' when '5' then '五年级' when '6' then '六年级' when '7' then '七年级' when '8' then '八年级' when '9' then '九年级' end) AS `GradeName`,(case `V`.`TreeCodeFirst` when '1' then substr(`V`.`SubjectName`,4,2) when '2' then substr(`V`.`SubjectName`,4,2) when '3' then substr(`V`.`SubjectName`,4,2) when '4' then substr(`V`.`SubjectName`,4,2) when '5' then substr(`V`.`SubjectName`,4,2) when '6' then substr(`V`.`SubjectName`,4,2) when '7' then substr(`V`.`SubjectName`,4,2) when '8' then substr(`V`.`SubjectName`,4,2) when '9' then substr(`V`.`SubjectName`,4,2) else substr(`V`.`SubjectName`,3,2) end) AS `CourseName`,(case `V`.`TreeCodeFirst` when '1' then substr(`V`.`SubjectName`,6) when '2' then substr(`V`.`SubjectName`,6) when '3' then substr(`V`.`SubjectName`,6) when '4' then substr(`V`.`SubjectName`,6) when '5' then substr(`V`.`SubjectName`,6) when '6' then substr(`V`.`SubjectName`,6) when '7' then substr(`V`.`SubjectName`,6) when '8' then substr(`V`.`SubjectName`,6) when '9' then substr(`V`.`SubjectName`,6) else substr(`V`.`SubjectName`,5,2) end) AS `Booklet` from `Dvlp_v_Init_Subject1` `V`;

-- ----------------------------
-- View structure for Dvlp_v_Init_Subject3
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_v_Init_Subject3`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_v_Init_Subject3` AS select `V1`.`SubjectID` AS `SubjectID`,`V1`.`InitID` AS `InitID`,`V1`.`InitNo` AS `InitNo`,`V1`.`IsCorrect` AS `IsCorrect`,`V1`.`OrderIndex` AS `OrderIndex`,`V1`.`TreeCode` AS `TreeCode`,`V1`.`SubjectName` AS `SubjectName`,`V1`.`SubjectShortName` AS `SubjectShortName`,`V1`.`CreateTime` AS `CreateTime`,`V1`.`CreateUser` AS `CreateUser`,`V1`.`LastUpdTime` AS `LastUpdTime`,`V1`.`LastUpdUser` AS `LastUpdUser`,`V1`.`IsValid` AS `IsValid`,`V1`.`Remark` AS `Remark`,`V1`.`TreeCodeFirst` AS `TreeCodeFirst`,`V1`.`TreeLevel` AS `TreeLevel`,`V1`.`GradePhaseName` AS `GradePhaseName`,`V1`.`GradeName` AS `GradeName`,`V1`.`CourseName` AS `CourseName`,`V1`.`Booklet` AS `Booklet`,(select `TX1`.`GradePhaseID` from `StrongestScholar`.`t_BSD_GradePhaseInfo` `TX1` where (convert(`V1`.`GradePhaseName` using utf8) = `TX1`.`GradePhaseName`)) AS `GradePhaseID`,(select `TX2`.`GradeID` from `StrongestScholar`.`t_BSD_GradeInfo` `TX2` where (convert(`V1`.`GradeName` using utf8) = `TX2`.`GradeName`)) AS `GradeID`,(select `TX3`.`CourseID` from `StrongestScholar`.`t_BSD_CourseInfo` `TX3` where (`V1`.`CourseName` = `TX3`.`CourseName`)) AS `CourseID` from `QuestionBankManual`.`Dvlp_v_Init_Subject2` `V1`;

SET FOREIGN_KEY_CHECKS = 1;
