/*
 Navicat MySQL Data Transfer

 Source Server         : MyDataTrans
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : 139.199.15.124:3306
 Source Schema         : QuestionBankTemp

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 14/08/2018 14:43:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_ITN_InitLogInfo
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_InitLogInfo`;
CREATE TABLE `t_ITN_InitLogInfo`  (
  `LogID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '日志的ID',
  `InitID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化ID',
  `LogNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日志编码',
  `LogType` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日导类型：W:警告，E：错误，F：严重错误，I：一般信息',
  `LogContent` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日志内容',
  `LogCurTime` datetime(0) NULL DEFAULT NULL COMMENT '日导发生时间',
  PRIMARY KEY (`LogID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
  `FromCrawlerID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来自爬虫中表的ID',
  `FromCrawlerKnowledgeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来自爬虫中的知识点ID',
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
  `InitNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化编码',
  `InitUserCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化用户编号',
  `InitUserName` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化用户姓名',
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
  `Question` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '题干',
  `Provider` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '提供者，存储用户名',
  `PersonInCharge` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `Reference` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '引用出处',
  `QuestionLevel` int(11) NULL DEFAULT NULL COMMENT '级别',
  `Difficulty` double(5, 4) NULL DEFAULT NULL COMMENT '难度系数',
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
  `FromInitID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源的试题InitID',
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
  `Answer` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT 'A,B,C,D',
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
  `InitID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该项在此次导入中的序号',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `SubjectName` varchar(72) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目名称',
  `SubjectShortName` varchar(72) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目简称',
  `GradePhaseID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '阶段ID，来自t_BSD_GradePhaseInfo中同名字段',
  `GradeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级ID，来自t_BSD_GradeInfo中同名字段',
  `CourseID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程ID，来自t_BSD_CourseInfo中同名字段',
  `BookVerID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课本ID，来自t_BSD_BookVerInfo中同名字段',
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
-- Table structure for t_ITN_Subject_test
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_Subject_test`;
CREATE TABLE `t_ITN_Subject_test`  (
  `SubjectID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '科目编号',
  `SubjectNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目编码',
  `InitID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该项在此次导入中的序号',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `SubjectName` varchar(72) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目名称',
  `SubjectShortName` varchar(72) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目简称',
  `GradePhaseID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '阶段ID，来自t_BSD_GradePhaseInfo中同名字段',
  `GradeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级ID，来自t_BSD_GradeInfo中同名字段',
  `CourseID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程ID，来自t_BSD_CourseInfo中同名字段',
  `BookVerID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课本ID，来自t_BSD_BookVerInfo中同名字段',
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
-- View structure for Dvlp_v_Init_Subject
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_v_Init_Subject`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_v_Init_Subject` AS select `QuestionBankTemp`.`t_ITN_Subject`.`SubjectID` AS `SubjectID`,`QuestionBankTemp`.`t_ITN_Subject`.`SubjectNo` AS `SubjectNo`,`QuestionBankTemp`.`t_ITN_Subject`.`InitID` AS `InitID`,`QuestionBankTemp`.`t_ITN_Subject`.`InitNo` AS `InitNo`,`QuestionBankTemp`.`t_ITN_Subject`.`IsCorrect` AS `IsCorrect`,`QuestionBankTemp`.`t_ITN_Subject`.`SubjectName` AS `SubjectName`,`QuestionBankTemp`.`t_ITN_Subject`.`SubjectShortName` AS `SubjectShortName`,`QuestionBankTemp`.`t_ITN_Subject`.`GradePhaseID` AS `GradePhaseID`,(select `TX1`.`GradePhaseName` from `StrongestScholar`.`t_BSD_GradePhaseInfo` `TX1` where (`QuestionBankTemp`.`t_ITN_Subject`.`GradePhaseID` = `TX1`.`GradePhaseID`)) AS `GradePhaseName`,`QuestionBankTemp`.`t_ITN_Subject`.`GradeID` AS `GradeID`,(select `TX2`.`GradeName` from `StrongestScholar`.`t_BSD_GradeInfo` `TX2` where (`QuestionBankTemp`.`t_ITN_Subject`.`GradeID` = `TX2`.`GradeID`)) AS `GradeName`,`QuestionBankTemp`.`t_ITN_Subject`.`CourseID` AS `CourseID`,(select `TX3`.`CourseName` from `StrongestScholar`.`t_BSD_CourseInfo` `TX3` where (`QuestionBankTemp`.`t_ITN_Subject`.`CourseID` = `TX3`.`CourseID`)) AS `CourseName`,`QuestionBankTemp`.`t_ITN_Subject`.`BookVerID` AS `BookVerID`,`QuestionBankTemp`.`t_ITN_Subject`.`Booklet` AS `Booklet`,`QuestionBankTemp`.`t_ITN_Subject`.`CreateTime` AS `CreateTime`,`QuestionBankTemp`.`t_ITN_Subject`.`CreateUser` AS `CreateUser`,`QuestionBankTemp`.`t_ITN_Subject`.`LastUpdTime` AS `LastUpdTime`,`QuestionBankTemp`.`t_ITN_Subject`.`LastUpdUser` AS `LastUpdUser`,`QuestionBankTemp`.`t_ITN_Subject`.`IsValid` AS `IsValid`,`QuestionBankTemp`.`t_ITN_Subject`.`Remark` AS `Remark` from `QuestionBankTemp`.`t_ITN_Subject`;

-- ----------------------------
-- View structure for Dvlp_V_INT_Knowledge
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_V_INT_Knowledge`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_V_INT_Knowledge` AS select `T1`.`KnowledgeID` AS `KnowledgeID`,`T1`.`TreeNodeNo` AS `TreeNodeNo`,`T1`.`InitID` AS `InitID`,`T1`.`InitNo` AS `InitNo`,`T1`.`IsCorrect` AS `IsCorrect`,`T1`.`KnowledgeParentID` AS `KnowledgeParentID`,`T1`.`SubjectID` AS `SubjectID`,`T1`.`Content` AS `Content`,`T1`.`NodeLevel` AS `NodeLevel`,`T1`.`FromCrawlerID` AS `FromCrawlerID`,`T1`.`FromCrawlerKnowledgeID` AS `FromCrawlerKnowledgeID`,`T1`.`IsLeaf` AS `IsLeaf`,`T1`.`CreateTime` AS `CreateTime`,`T1`.`CreateUser` AS `CreateUser`,`T1`.`LastUpdTime` AS `LastUpdTime`,`T1`.`LastUpdUser` AS `LastUpdUser`,`T1`.`Remark` AS `Remark`,`T1`.`IsValid` AS `IsValid` from `t_ITN_Knowledge` `T1`;

-- ----------------------------
-- View structure for Dvlp_v_MultipleChoice
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_v_MultipleChoice`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_v_MultipleChoice` AS select `QuestionBankTemp`.`t_ITN_Question`.`QuestionID` AS `QuestionID`,`QuestionBankTemp`.`t_ITN_Question`.`QuestionNo` AS `QuestionNo`,`QuestionBankTemp`.`t_ITN_Question`.`Question` AS `Question`,`QuestionBankTemp`.`t_ITN_QuestionMultipleChoice`.`ChoiceA` AS `ChoiceA`,`QuestionBankTemp`.`t_ITN_QuestionMultipleChoice`.`ChoiceB` AS `ChoiceB`,`QuestionBankTemp`.`t_ITN_QuestionMultipleChoice`.`ChoiceC` AS `ChoiceC`,`QuestionBankTemp`.`t_ITN_QuestionMultipleChoice`.`ChoiceD` AS `ChoiceD`,`QuestionBankTemp`.`t_ITN_QuestionMultipleChoice`.`Answer` AS `Answer`,`QuestionBankTemp`.`t_ITN_Question`.`QuestionAnalyze` AS `QuestionAnalyze`,`QuestionBankTemp`.`t_ITN_Question`.`Difficulty` AS `Difficulty`,`QuestionBankTemp`.`t_ITN_Question`.`CreateTime` AS `CreateTime`,`QuestionBankTemp`.`t_ITN_Question`.`CreateUser` AS `CreateUser`,`QuestionBankTemp`.`t_ITN_Question`.`LastUpdTime` AS `LastUpdTime`,`QuestionBankTemp`.`t_ITN_Question`.`LastUpdUser` AS `LastUpdUser`,`Dvlp_v_Init_Subject`.`SubjectID` AS `SubjectID`,`Dvlp_v_Init_Subject`.`SubjectNo` AS `SubjectNo`,`Dvlp_v_Init_Subject`.`SubjectName` AS `SubjectName`,`Dvlp_v_Init_Subject`.`SubjectShortName` AS `SubjectShortName`,`Dvlp_v_Init_Subject`.`GradePhaseID` AS `GradePhaseID`,`Dvlp_v_Init_Subject`.`GradePhaseName` AS `GradePhaseName`,`Dvlp_v_Init_Subject`.`GradeID` AS `GradeID`,`Dvlp_v_Init_Subject`.`GradeName` AS `GradeName`,`Dvlp_v_Init_Subject`.`CourseID` AS `CourseID`,`Dvlp_v_Init_Subject`.`CourseName` AS `CourseName`,`Dvlp_v_Init_Subject`.`BookVerID` AS `BookVerID`,`Dvlp_v_Init_Subject`.`Booklet` AS `Booklet`,`QuestionBankTemp`.`t_ITN_Knowledge`.`KnowledgeID` AS `KnowledgeID`,`QuestionBankTemp`.`t_ITN_Knowledge`.`Content` AS `Content`,`QuestionBankTemp`.`t_ITN_Question`.`IsCheckPass` AS `IsCheckPass`,`QuestionBankTemp`.`t_ITN_Main`.`InitID` AS `InitID`,`QuestionBankTemp`.`t_ITN_Main`.`InitNo` AS `InitNo`,`QuestionBankTemp`.`t_ITN_Main`.`InitName` AS `InitName`,`QuestionBankTemp`.`t_ITN_Main`.`InitDes` AS `InitDes` from ((((`QuestionBankTemp`.`t_ITN_Question` join `QuestionBankTemp`.`t_ITN_QuestionMultipleChoice` on((`QuestionBankTemp`.`t_ITN_Question`.`QuestionID` = `QuestionBankTemp`.`t_ITN_QuestionMultipleChoice`.`QuestionID`))) join `QuestionBankTemp`.`t_ITN_Knowledge` on((`QuestionBankTemp`.`t_ITN_Question`.`KnowledgeID` = `QuestionBankTemp`.`t_ITN_Knowledge`.`KnowledgeID`))) join `QuestionBankTemp`.`Dvlp_v_Init_Subject` on((`QuestionBankTemp`.`t_ITN_Knowledge`.`SubjectID` = `Dvlp_v_Init_Subject`.`SubjectID`))) join `QuestionBankTemp`.`t_ITN_Main` on((`QuestionBankTemp`.`t_ITN_Question`.`InitID` = `QuestionBankTemp`.`t_ITN_Main`.`InitID`)));

-- ----------------------------
-- Function structure for Dvlp_Fn_GetKnowledgeIsLeaf
-- ----------------------------
DROP FUNCTION IF EXISTS `Dvlp_Fn_GetKnowledgeIsLeaf`;
delimiter ;;
CREATE FUNCTION `Dvlp_Fn_GetKnowledgeIsLeaf`(IN_Str_SubjectID 			VARCHAR(36),
		IN_Str_TreeNo					VARCHAR(1000))
 RETURNS int(11)
BEGIN	
  DECLARE nRetVal INT(11) DEFAULT 0;
		
	Set nRetVal = Case IN_Str_SubjectID 
	                 WHEN NULL then 0 
									 WHEN ''  then 0
									 else 1
								 END;
  if nRetVal = 0 then
		RETURN nRetVal;
	end if;
	
	Set nRetVal = Case IN_Str_TreeNo 
	                 WHEN NULL then 0 
									 WHEN ''  then 0
									 else 1
								 END;
  if nRetVal = 0 then
		RETURN nRetVal;
	end if;
	
	SELECT Case COUNT(1) When 0 then 1 Else 0 End	
	into nRetVal
  From QuestionBankTemp.t_ITN_Knowledge T1
  Where T1.SubjectID = IN_Str_SubjectID And
			  T1.TreeNodeNo != IN_Str_TreeNo And
			  T1.TreeNodeNo Like CONCAT(IN_Str_TreeNo,'%');
	
	return nRetVal;
END
;;
delimiter ;

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

-- ----------------------------
-- Procedure structure for Dvlp_P_WriteLogInfoToDB
-- ----------------------------
DROP PROCEDURE IF EXISTS `Dvlp_P_WriteLogInfoToDB`;
delimiter ;;
CREATE PROCEDURE `Dvlp_P_WriteLogInfoToDB`(In_Str_LogID			  VARCHAR(36),
     IN_Str_InitID			VARCHAR(36),
		 In_Str_LogType			VARCHAR(20),
		 In_Str_LogInfo			VARCHAR(1024))
BEGIN
		INSERT INTO QuestionBankTemp.t_ITN_InitLogInfo(LogID,InitID,LogNo,LogType,LogContent,LogCurTime)
		SELECT  Case  
							When In_Str_LogID Is Null  then UUID()
							When In_Str_LogID = ''  then UUID()
							Else In_Str_LogID End As LogID,
						Case  
							When IN_Str_InitID Is Null then NULL
							When IN_Str_InitID = ''  then NULL
							Else IN_Str_InitID End As InitID,
							CONCAT("LOG_",DATE_FORMAT(Now(),"%Y%m%d%H%m%s"),LPAD(FLOOR(1 + RAND() * 1000),3,'0')),
							Case In_Str_LogType 
							   When null Then 'E'
							   When '' then 'E' 
								 Else In_Str_LogType
						  End As LogType,
							CONCAT('Current time:',
											 DATE_FORMAT(now(),"%Y-%m-%d %H-%m-%s"),
											 ',Current operation info is :',IFNULL(In_Str_LogInfo,'')),
								NOW()
				From DUAL;	
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
