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

 Date: 13/07/2018 08:38:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_ITN_Knowledge
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_Knowledge`;
CREATE TABLE `t_ITN_Knowledge`  (
  `KnowledgeID` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID',
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
-- Table structure for t_ITN_QuestionMultipleChoice
-- ----------------------------
DROP TABLE IF EXISTS `t_ITN_QuestionMultipleChoice`;
CREATE TABLE `t_ITN_QuestionMultipleChoice`  (
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
  `InitID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '导入ID',
  `InitNo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该项在此次导入中的序号',
  `IsCorrect` tinyint(4) NULL DEFAULT NULL COMMENT '导入数据是否正确',
  `OrderIndex` int(11) NULL DEFAULT NULL COMMENT '序号',
  `TreeCode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '大纲级号',
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

SET FOREIGN_KEY_CHECKS = 1;
