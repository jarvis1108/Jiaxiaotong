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

 Date: 16/07/2018 21:45:00
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
  `initId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '录入编号',
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
  `initId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '录入编号',
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题id',
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
-- View structure for Dvlp_Init_V_SubjectData
-- ----------------------------
DROP VIEW IF EXISTS `Dvlp_Init_V_SubjectData`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `Dvlp_Init_V_SubjectData` AS select distinct `T1`.`id` AS `id`,`T1`.`subject_id` AS `subject_id`,`T1`.`subject_name` AS `subject_name`,`T1`.`version_id` AS `version_id`,`T1`.`version_name` AS `version_name`,`T1`.`grade_id` AS `grade_id`,`T1`.`grade_name` AS `grade_name` from `QuestionBankCrawlerDvlp`.`tb_knowledge` `T1` where (((`T1`.`subject_name` like '初中%') or (`T1`.`subject_name` like '高中%')) and (`T1`.`version_name` = '人教版')) order by `T1`.`id`;

SET FOREIGN_KEY_CHECKS = 1;
