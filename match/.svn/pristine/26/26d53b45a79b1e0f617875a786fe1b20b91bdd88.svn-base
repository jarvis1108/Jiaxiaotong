package com.dxtwangxiao.strongestsuperscholar.module.system.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 用户学点流水明细
 * <p>
 * Created by Devin
 * 2018-06-25 上午 10:40
 */
@Entity
@Table(name = "t_SYS_UserLPDetail")
public class UserLPDetail {
    private String userLpDetailId;//用户学点明细ID
    private String userLpDetailNo;//用户学点明细编码
    private String userId;//用户ID
    private String userNo;//用户编码
    private Timestamp occurTime;//业务发生时间
    private Integer originalAmount;//初始学点数量
    private Integer acquiredAmount;//获取学点数量
    private Integer lossAmount;//损失学点数量
    private Integer currentAmount;//当前学点数量
    private String reasonType;//原因类型
    private String matchRecordId;//战局ID
    private String matchRecordNo;//战局编码
    private String orderRecordId;//订单ID
    private String orderRecordNo;//订单编码
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private String remark;
    private Byte isValid;

    @Id
    @Column(name = "UserLPDetailID")
    public String getUserLpDetailId() {
        return userLpDetailId;
    }

    public void setUserLpDetailId(String userLpDetailId) {
        this.userLpDetailId = userLpDetailId;
    }

    @Basic
    @Column(name = "UserLPDetailNo")
    public String getUserLpDetailNo() {
        return userLpDetailNo;
    }

    public void setUserLpDetailNo(String userLpDetailNo) {
        this.userLpDetailNo = userLpDetailNo;
    }

    @Basic
    @Column(name = "UserID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "UserNo")
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "OccurTime")
    public Timestamp getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Timestamp occurTime) {
        this.occurTime = occurTime;
    }

    @Basic
    @Column(name = "OriginalAmount")
    public Integer getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Integer originalAmount) {
        this.originalAmount = originalAmount;
    }

    @Basic
    @Column(name = "AcquiredAmount")
    public Integer getAcquiredAmount() {
        return acquiredAmount;
    }

    public void setAcquiredAmount(Integer acquiredAmount) {
        this.acquiredAmount = acquiredAmount;
    }

    @Basic
    @Column(name = "LossAmount")
    public Integer getLossAmount() {
        return lossAmount;
    }

    public void setLossAmount(Integer lossAmount) {
        this.lossAmount = lossAmount;
    }

    @Basic
    @Column(name = "CurrentAmount")
    public Integer getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(Integer currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Basic
    @Column(name = "ReasonType")
    public String getReasonType() {
        return reasonType;
    }

    public void setReasonType(String reasonType) {
        this.reasonType = reasonType;
    }

    @Basic
    @Column(name = "MatchRecordID")
    public String getMatchRecordId() {
        return matchRecordId;
    }

    public void setMatchRecordId(String matchRecordId) {
        this.matchRecordId = matchRecordId;
    }

    @Basic
    @Column(name = "MatchRecordNo")
    public String getMatchRecordNo() {
        return matchRecordNo;
    }

    public void setMatchRecordNo(String matchRecordNo) {
        this.matchRecordNo = matchRecordNo;
    }

    @Basic
    @Column(name = "OrderRecordID")
    public String getOrderRecordId() {
        return orderRecordId;
    }

    public void setOrderRecordId(String orderRecordId) {
        this.orderRecordId = orderRecordId;
    }

    @Basic
    @Column(name = "OrderRecordNo")
    public String getOrderRecordNo() {
        return orderRecordNo;
    }

    public void setOrderRecordNo(String orderRecordNo) {
        this.orderRecordNo = orderRecordNo;
    }

    @Basic
    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "CreateUser")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "LastUpdTime")
    public Timestamp getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(Timestamp lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }

    @Basic
    @Column(name = "LastUpdUser")
    public String getLastUpdUser() {
        return lastUpdUser;
    }

    public void setLastUpdUser(String lastUpdUser) {
        this.lastUpdUser = lastUpdUser;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "IsValid")
    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "UserLPDetail{" +
                "userLpDetailId='" + userLpDetailId + '\'' +
                ", userLpDetailNo='" + userLpDetailNo + '\'' +
                ", userId='" + userId + '\'' +
                ", userNo='" + userNo + '\'' +
                ", occurTime=" + occurTime +
                ", originalAmount=" + originalAmount +
                ", acquiredAmount=" + acquiredAmount +
                ", lossAmount=" + lossAmount +
                ", currentAmount=" + currentAmount +
                ", reasonType='" + reasonType + '\'' +
                ", matchRecordId='" + matchRecordId + '\'' +
                ", matchRecordNo='" + matchRecordNo + '\'' +
                ", orderRecordId='" + orderRecordId + '\'' +
                ", orderRecordNo='" + orderRecordNo + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", remark='" + remark + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
