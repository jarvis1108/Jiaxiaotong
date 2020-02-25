/*
 Navicat MySQL Data Transfer

 Source Server         : StrongestScholar
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : 139.199.15.124:3306
 Source Schema         : WechatOA

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 20/07/2018 20:00:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_MFD_MessageDelivery
-- ----------------------------
DROP TABLE IF EXISTS `t_MFD_MessageDelivery`;
CREATE TABLE `t_MFD_MessageDelivery`  (
  `MessageDeliveryID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '消息发送ID',
  `MessageDeliveryNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '消息发送No',
  `MessageTemplateId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '消息模板Id',
  `DeliveryDesc` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '发送描述',
  `BusinessType` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '业务类型',
  `BusinessNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '业务单号',
  `EmailWaySleepSecond` int(10) NULL DEFAULT NULL COMMENT '邮件发送后停留时间间隔',
  `EmailWayOrderIndex` int(4) NULL DEFAULT NULL COMMENT '邮件发送序号',
  `EmailWayIsEnable` tinyint(4) NULL DEFAULT 0 COMMENT '邮件是否发送',
  `QQWayIsEnable` tinyint(4) NULL DEFAULT 0 COMMENT 'QQ是否发送',
  `QQWayOrderIndex` int(4) NULL DEFAULT NULL COMMENT 'QQ发送序号',
  `QQWaySleepSecond` int(10) NULL DEFAULT NULL COMMENT 'QQ发送停留时间间隔',
  `ShortMessageWayIsEnable` tinyint(4) NULL DEFAULT 0 COMMENT '短是否发送',
  `ShortMessageWayOrderIndex` int(4) NULL DEFAULT NULL COMMENT '短信发送顺序号',
  `ShortMessagelWaySleepSecond` int(10) NULL DEFAULT NULL COMMENT '知信发送后停留时间间隔',
  `PhoneWayIsEnable` tinyint(4) NULL DEFAULT 0 COMMENT '电话是否允许',
  `PhoneWayOrderIndex` int(4) NULL DEFAULT NULL COMMENT '电话发送序号',
  `PhoneWaySleepSecond` int(10) NULL DEFAULT NULL COMMENT '电话发送后停留时间间隔',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `MessageContent` varchar(512) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `MessageSubject` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `MessageTitle` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MessageDeliveryID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '消息发送表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MFD_MessageDeliveryDetail
-- ----------------------------
DROP TABLE IF EXISTS `t_MFD_MessageDeliveryDetail`;
CREATE TABLE `t_MFD_MessageDeliveryDetail`  (
  `MessageDeliveryDetailId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '消息发送明细Id',
  `MessageDeliveryId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '消息发送ID',
  `MessageDeliveryNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '消息发送No',
  `SenderId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '发送者ID',
  `ReceiverID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '接收者Id',
  `DeliveryDatailSubject` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '发送消息主题',
  `DeliveryDatailTitle` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '发送消息标题',
  `DeliveryDatailContent` varchar(512) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '发送内容',
  `DeliveryDetailTxt` varchar(512) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '消息明细文本',
  `ExpectDeliveryDetailTime` datetime(0) NULL DEFAULT NULL COMMENT '期望发送时间',
  `FactDeliveryDetailTime` datetime(0) NULL DEFAULT NULL COMMENT '实际发送时间',
  `MessageSendWay` tinyint(4) NULL DEFAULT 1 COMMENT '消息发送方式；1：微信；2：邮箱；3：QQ；4：短信',
  `DeliveryDetailStatus` int(1) NULL DEFAULT 0 COMMENT '发送状态；0：成功；1：失败；2：已读',
  `IsRcvFeedback` tinyint(4) NULL DEFAULT 0 COMMENT '是否收到反馈，1：收到，0：未收到',
  `ExpectFeedbackTime` datetime(0) NULL DEFAULT NULL COMMENT '预期反馈时间 ',
  `FactFeedbackTime` datetime(0) NULL DEFAULT NULL COMMENT '实际反馈时间',
  `ActualRepetitionTimes` int(4) NULL DEFAULT NULL COMMENT '实际重复次数',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`MessageDeliveryDetailId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '消息发送明细表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MFD_MessageTemplate
-- ----------------------------
DROP TABLE IF EXISTS `t_MFD_MessageTemplate`;
CREATE TABLE `t_MFD_MessageTemplate`  (
  `MessageTemplateID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '消息模板ID',
  `MessageTemplateNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '消息模板编号',
  `MessageSubject` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '消息主题',
  `MessageTitle` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '消息标题',
  `MessageContent` varchar(512) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '消息内容',
  `SendTimes` int(10) NULL DEFAULT 1 COMMENT '发送次数',
  `RepetitionTimes` int(10) NULL DEFAULT NULL COMMENT '重试次数',
  `BusinessType` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '业务类型',
  `EmailWayIsEnable` tinyint(4) NULL DEFAULT 0 COMMENT '邮件是否发送',
  `EmailWayOrderIndex` tinyint(4) NULL DEFAULT NULL COMMENT '邮件发送序号',
  `EmailWaySleepSecond` int(10) NULL DEFAULT NULL COMMENT '邮件发送后停留时间间隔',
  `QQWayIsEnable` tinyint(4) NULL DEFAULT 0 COMMENT 'QQ是否发送',
  `QQWayOrderIndex` int(4) NULL DEFAULT NULL COMMENT 'QQ发送序号',
  `QQWaySleepSecond` int(10) NULL DEFAULT NULL COMMENT 'QQ发送停留时间间隔',
  `ShortMessageWayIsEnable` tinyint(4) NULL DEFAULT 0 COMMENT '短是否发送',
  `ShortMessageWayOrderIndex` int(4) NULL DEFAULT NULL COMMENT '短信发送顺序号',
  `ShortMessagelWaySleepSecond` int(10) NULL DEFAULT NULL COMMENT '知信发送后停留时间间隔',
  `PhoneWayIsEnable` tinyint(4) NULL DEFAULT 0 COMMENT '电话是否允许',
  `PhoneWayOrderIndex` int(4) NULL DEFAULT NULL COMMENT '电话发送序号',
  `PhoneWaySleepSecond` int(10) NULL DEFAULT NULL COMMENT '电话发送后停留时间间隔',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`MessageTemplateID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '消息模板表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MRT_ConferReq
-- ----------------------------
DROP TABLE IF EXISTS `t_MRT_ConferReq`;
CREATE TABLE `t_MRT_ConferReq`  (
  `ConferReqID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '协商申请ID',
  `ReservationID2` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '原预订ID',
  `ConferReqReserveId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '协商申请者的预订Id',
  `ConferRequesterID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '协商申请人ID',
  `ReservationID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '原预订ID',
  `AuditorID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '审核人ID',
  `AuditTime` datetime(0) NULL DEFAULT NULL COMMENT '审核时间',
  `AuditOpinion` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '审核意见',
  `ConferReqContent` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '协商申请内容',
  `ProcessStatus` tinyint(4) NULL DEFAULT 1 COMMENT '协商申请状态 1 ：已录入； 2：待审批； 3：审核未通过； 4：已审核\n            5：同意；6：不同意；',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `reserverId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ConferReqID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '协商申请表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MRT_MeetingRoom
-- ----------------------------
DROP TABLE IF EXISTS `t_MRT_MeetingRoom`;
CREATE TABLE `t_MRT_MeetingRoom`  (
  `RoomID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '房间ID',
  `RoomNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '房间编号',
  `RoomName` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '房间名字',
  `RoomStatus` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT '0' COMMENT '房间状态 0：空闲； 1：占用； 2：预订中 ',
  `Location` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '会议室地址',
  `AdministratorId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '办公室管理员',
  `Capacity` int(4) NULL DEFAULT NULL COMMENT '容量',
  `HasProjector` tinyint(4) NULL DEFAULT 1 COMMENT '有没有投影仪；1有，0无',
  `ImgUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '会议室图片地址',
  `BeginTime` time(0) NULL DEFAULT NULL COMMENT '每天开始时间',
  `EndTime` time(0) NULL DEFAULT NULL COMMENT '每天结束时间',
  `AllowedOvertime` int(10) NULL DEFAULT NULL COMMENT '允许超时时长，单位为秒',
  `IsAvailable` tinyint(4) NULL DEFAULT 1 COMMENT '是否可用 0 ：不可用； 1：可用',
  `DeviceId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '设备Id',
  `PermanentPwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '是否具有永久性质的密码',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`RoomID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '会议室' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_MRT_Reservation
-- ----------------------------
DROP TABLE IF EXISTS `t_MRT_Reservation`;
CREATE TABLE `t_MRT_Reservation`  (
  `ReservationID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '预订ID',
  `ReservationNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '预订编号',
  `RoomID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '房间编号',
  `RoomNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '房间编号',
  `ReserverID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '预定人ID',
  `ReservationDate` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '预订时间',
  `StartTime` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `EndTime` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `Reason` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '预订原因',
  `IsUsedProjector` tinyint(4) NULL DEFAULT 0 COMMENT '是否用投影仪，1是，0否',
  `MeetingContent` varchar(512) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '会议内容',
  `AuditorID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '审核人ID',
  `AuditTime` datetime(0) NULL DEFAULT NULL COMMENT '审核时间',
  `AuditOpinion` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '审核意见',
  `RevokerID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '撤销人ID',
  `RevokeTime` datetime(0) NULL DEFAULT NULL COMMENT '撤销时间',
  `RevokeOpinion` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '撤销意见',
  `ProcessStatus` tinyint(4) NULL DEFAULT 1 COMMENT '预订状态 1 ：已录入； 2：待审批； 3：审核未通过； 4：已审核 ；\n            5：协商中；6：用户取消；7：协商取消；8：管理员撤销',
  `DigitalPassword` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '数字密码',
  `PwdStartTime` datetime(0) NULL DEFAULT NULL COMMENT '锁生效时间',
  `PwdExpireTime` datetime(0) NULL DEFAULT NULL COMMENT '锁失效时间',
  `IsUrgent` tinyint(4) NULL DEFAULT 0 COMMENT '是否紧急预订，1：紧急，0：一般',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`ReservationID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '预订信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_PER_MyApplication
-- ----------------------------
DROP TABLE IF EXISTS `t_PER_MyApplication`;
CREATE TABLE `t_PER_MyApplication`  (
  `MyApplicationID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '我的应用Id',
  `MyApplicationNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '我的应用No',
  `UserId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '用户Id',
  `SubSystemID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '子系统Id',
  `IsSelected` tinyint(4) NULL DEFAULT 0 COMMENT '是否选中 1：选中 0：未选中',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`MyApplicationID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '我的应用' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_AdminAuthority
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_AdminAuthority`;
CREATE TABLE `t_SYS_AdminAuthority`  (
  `AdminAuthorityId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '管理员权限Id',
  `SubSystemId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '子系统Id',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '管理员用户Id',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`AdminAuthorityId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '管理员权限\n' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_Authority
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_Authority`;
CREATE TABLE `t_SYS_Authority`  (
  `AuthorityId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '权限Id',
  `FunctionId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户Id',
  `RoleId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '角色Id',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`AuthorityId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '权限表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_Function
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_Function`;
CREATE TABLE `t_SYS_Function`  (
  `FunctionId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '功能Id',
  `FunctionNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '功能No',
  `FunctionName` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '功能名称',
  `FunctionDesc` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '功能描述',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`FunctionId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '功能表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_Group
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_Group`;
CREATE TABLE `t_SYS_Group`  (
  `GroupId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '功能Id',
  `GroupNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '功能No',
  `GroupName` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '功能名称',
  `GroupShortName` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '功能描述',
  `IsPrivateGroup` tinyint(4) NULL DEFAULT 0 COMMENT '是否私有群',
  `OwnerID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '所属用户ID',
  `IsPublic` tinyint(4) NULL DEFAULT 0 COMMENT '是否公开，1：公开，0：不公开',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`GroupId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '群组表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_GroupMember
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_GroupMember`;
CREATE TABLE `t_SYS_GroupMember`  (
  `GroupMemberID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '群组成员Id',
  `GroupMemberNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '群组成员编码',
  `GroupId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '群组Id',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户ID',
  `CallName` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '群中称呼，默认为用户表中的称呼',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`GroupMemberID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '群组成员表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_Role
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_Role`;
CREATE TABLE `t_SYS_Role`  (
  `RoleId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '角色Id',
  `RoleNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '角色No',
  `RoleName` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '角色名称',
  `RoleDesc` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '角色描述',
  `IsUserIdentity` tinyint(4) NULL DEFAULT 1 COMMENT '是否是用户身份，1表示是，0表示否',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`RoleId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_SubSystem
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_SubSystem`;
CREATE TABLE `t_SYS_SubSystem`  (
  `SubSystemID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '子系统Id',
  `SubSystemNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '子系统No',
  `SubSystemName` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '子系统名称',
  `SubSystemShortName` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '子系统简称',
  `SubSystemType` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '子系统类型，A 表示Web 桌面; B表示微信App',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`SubSystemID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '子系统表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_User
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_User`;
CREATE TABLE `t_SYS_User`  (
  `UserId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '用户Id',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户No',
  `UserName` varchar(55) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `Password` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户密码',
  `CallName` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '默认称呼',
  `Title` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '职称',
  `DepartmentName` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '院系名',
  `Sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '性别',
  `CurOpenId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '当前微信号',
  `PhoneNo` varchar(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '手机号',
  `SparePhoneNo` varchar(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '备用手机号',
  `QQNo` varchar(12) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT 'QQ号',
  `Email` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '邮箱账号',
  `AuthorityId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '权限Id',
  `NoticeTimes` int(11) NULL DEFAULT NULL COMMENT '通知总次数',
  `NoticeFeedbackTimes` int(11) NULL DEFAULT NULL COMMENT '反馈总次数',
  `LastLoginTime` datetime(0) NULL DEFAULT NULL COMMENT '最近登陆时间',
  `LastOffLineTime` datetime(0) NULL DEFAULT NULL COMMENT '最近下线时间',
  `OrganizationUserCode` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '机构内部编号',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`UserId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_UserIdentity
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_UserIdentity`;
CREATE TABLE `t_SYS_UserIdentity`  (
  `UserIdentityID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '用户身份Id',
  `UserIdentityNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户身份No',
  `UserIdentityName` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户ID',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`UserIdentityID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '用户身份' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_UserRole
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_UserRole`;
CREATE TABLE `t_SYS_UserRole`  (
  `UserRoleId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '权限Id',
  `UserId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户Id',
  `RoleId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '角色Id',
  `IsVerified` tinyint(4) NULL DEFAULT 0 COMMENT '是否认证，1认证，0没有认证',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`UserRoleId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '用户角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_SYS_UserWeChat
-- ----------------------------
DROP TABLE IF EXISTS `t_SYS_UserWeChat`;
CREATE TABLE `t_SYS_UserWeChat`  (
  `BindID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '绑定Id',
  `UserID` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户ID',
  `UserNo` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户No',
  `OpenId` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '当前微信号',
  `FistBindTime` datetime(0) NULL DEFAULT NULL COMMENT '初次绑定见附件我',
  `LastBindTime` datetime(0) NULL DEFAULT NULL COMMENT '最近绑定时间',
  `IsBindSuccess` tinyint(4) NULL DEFAULT 1 COMMENT '是否绑定成功，1：表成，0：失败',
  `CreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `CreateUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '创建用户id',
  `LastUpdTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最近修改时间',
  `LastUpdUser` varchar(36) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '最近修改用户id',
  `IsValid` tinyint(4) NULL DEFAULT NULL COMMENT '是否有效，1表示有效，0表示无效',
  `Remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`BindID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '用户微信号' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
