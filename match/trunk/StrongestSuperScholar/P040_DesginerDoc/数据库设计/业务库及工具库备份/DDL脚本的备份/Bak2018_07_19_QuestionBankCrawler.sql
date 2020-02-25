/*
 Navicat MySQL Data Transfer

 Source Server         : StrongestScholar
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : 139.199.15.124:3306
 Source Schema         : QuestionBankCrawler

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 19/07/2018 18:11:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_knowledge
-- ----------------------------
DROP TABLE IF EXISTS `tb_knowledge`;
CREATE TABLE `tb_knowledge`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `subject_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `subject_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `version_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `version_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `unit_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `unit_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `chapter_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `chapter_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `knowledge_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `knowledge_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `page_num` int(5) NULL DEFAULT 0 COMMENT '爬到页数，默认0',
  `is_finish` int(1) NULL DEFAULT 0 COMMENT '0：未完成 1：已完成',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 53884 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_main
-- ----------------------------
DROP TABLE IF EXISTS `tb_main`;
CREATE TABLE `tb_main`  (
  `initId` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '录入编号',
  `InitNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化编码',
  `initName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '录入名称',
  `initDesc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '录入描述',
  `initUsername` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '录入人',
  `initTime` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '录入时间',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '-1表示已删除，1表示已录入，2表示录入审核，3表示已转入准数据库',
  PRIMARY KEY (`initId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_question
-- ----------------------------
DROP TABLE IF EXISTS `tb_question`;
CREATE TABLE `tb_question`  (
  `initId` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '初始化ID',
  `id` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题id',
  `InitNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '初始化编码',
  `title` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '题干',
  `titleTxt` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '标题的纯文本',
  `choiceA` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项A',
  `choiceB` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项B',
  `choiceC` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项C',
  `choiceD` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项D',
  `answer` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '答案',
  `analysis` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '解析',
  `phase` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '阶段，小学、初中、高中',
  `subject` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目',
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级',
  `booklet` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '册，例如上册、下册、必修一等',
  `unit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单元',
  `chapter` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '章节',
  `knowledge` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '知识点',
  `difficulty` float(3, 2) NULL DEFAULT NULL COMMENT '难度系数',
  `bookVersion` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教材版本',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '状态，0表示未审核，1表示已选中，2表示未选中，3表示已转入准数据库，-1表示已删除',
  `currentTime` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '题目导入时间',
  PRIMARY KEY (`initId`, `id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- View structure for Dvlp_Init_V_Question
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_Init_V_Question`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_Init_V_Question` AS select `t1`.`initId` AS `InitID`,`t1`.`InitNo` AS `InitNo`,`t3`.`KnowledgeID` AS `KnowledgeID`,`t2`.`knowledge_id` AS `ddd`,`t1`.`title` AS `Question`,`t1`.`titleTxt` AS `QuestionTxt`,`t1`.`choiceA` AS `ChoiceA`,`t1`.`choiceB` AS `ChoiceB`,`t1`.`choiceC` AS `ChoiceC`,`t1`.`choiceD` AS `ChoiceD`,`t1`.`answer` AS `Answer`,`t1`.`analysis` AS `QuestionAnalyze`,`t1`.`difficulty` AS `Difficulty`,`t1`.`id` AS `FromQuestionID` from ((`QuestionBankCrawler`.`tb_question` `t1` left join `QuestionBankCrawler`.`tb_knowledge` `t2` on(((concat(`t1`.`phase`,`t1`.`subject`) = `t2`.`subject_name`) and (concat(`t1`.`grade`,`t1`.`booklet`) = `t2`.`grade_name`) and (`t1`.`unit` = `t2`.`unit_name`) and (`t1`.`chapter` = `t2`.`chapter_name`) and (`t1`.`knowledge` = `t2`.`knowledge_name`)))) left join `QuestionBankTemp`.`t_ITN_Knowledge` `t3` on((`t2`.`knowledge_id` = `t3`.`FromCrawlerKnowledgeID`))) where ((`t1`.`bookVersion` = '人教版') and (`t1`.`phase` in ('初中','高中')));

-- ----------------------------
-- View structure for Dvlp_Init_V_SubjectData
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_Init_V_SubjectData`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_Init_V_SubjectData` AS select distinct `T1`.`id` AS `id`,`T1`.`subject_id` AS `subject_id`,`T1`.`subject_name` AS `subject_name`,`T1`.`version_id` AS `version_id`,`T1`.`version_name` AS `version_name`,`T1`.`grade_id` AS `grade_id`,`T1`.`grade_name` AS `grade_name` from `QuestionBankCrawlerDvlp`.`tb_knowledge` `T1` where (((`T1`.`subject_name` like '初中%') or (`T1`.`subject_name` like '高中%')) and (`T1`.`version_name` = '人教版')) order by `T1`.`id`;

-- ----------------------------
-- View structure for Dvlp_‌Init_V_Knowledge
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_‌Init_V_Knowledge`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_‌Init_V_Knowledge` AS select `T1`.`id` AS `id`,`T1`.`subject_id` AS `subject_id`,`T1`.`subject_name` AS `subject_name`,`T1`.`version_id` AS `version_id`,`T1`.`version_name` AS `version_name`,`T1`.`grade_id` AS `grade_id`,`T1`.`grade_name` AS `grade_name`,replace((case substr(`T1`.`subject_name`,1,2) when '高中' then concat(`T1`.`subject_name`,`T1`.`grade_name`) else concat(substr(`T1`.`grade_name`,1,3),substr(`T1`.`subject_name`,3,2),substr(`T1`.`grade_name`,4)) end),'思品','政治') AS `grade_name_AOgr`,`T2`.`SubjectName` AS `grade_name_A`,`T1`.`unit_id` AS `unit_id`,`T1`.`unit_name` AS `unit_name`,`T1`.`chapter_id` AS `chapter_id`,`T1`.`chapter_name` AS `chapter_name`,`T1`.`knowledge_id` AS `knowledge_id`,`T1`.`knowledge_name` AS `knowledge_name`,`T1`.`page_num` AS `page_num`,`T1`.`is_finish` AS `is_finish`,`T2`.`SubjectID` AS `D_SubjectID`,`T2`.`SubjectNo` AS `D_SubjectNo`,`T2`.`SubjectName` AS `D_SubjectName`,`T2`.`GradePhaseID` AS `D_GradePhaseID`,`T2`.`GradeID` AS `D_GradeID`,`T2`.`CourseID` AS `D_CourseID`,substr(`T1`.`subject_name`,1,2) AS `phaseInQ`,substr(`T1`.`grade_name`,1,3) AS `gradeInQ`,`T1`.`version_name` AS `bookVersionInQ`,substr(`T1`.`subject_name`,3) AS `subjectInQ`,substr(`T1`.`grade_name`,4) AS `bookletInQ` from (`QuestionBankCrawler`.`tb_knowledge` `T1` left join `QuestionBankTemp`.`t_ITN_Subject` `T2` on((replace((case substr(`T1`.`subject_name`,1,2) when '高中' then concat(`T1`.`subject_name`,`T1`.`grade_name`) else concat(substr(`T1`.`grade_name`,1,3),substr(`T1`.`subject_name`,3,2),substr(`T1`.`grade_name`,4)) end),'思品','政治') = `T2`.`SubjectName`))) where ((`T1`.`version_name` = '人教版') and ((`T1`.`subject_name` like '初中%') or (`T1`.`subject_name` like '高中%')) and (`T1`.`grade_name` <> '基础知识'));

SET FOREIGN_KEY_CHECKS = 1;
