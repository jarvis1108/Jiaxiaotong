package com.dxtwangxiao.strongestsuperscholar.module.match.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_MTH_MatchRecord")
public class MatchRecord {
    private String matchRecordId;
    private String matchRecordNo;
    private Byte matchType;
    private Timestamp beginTime;
    private Timestamp endTime;
    private Integer matchPeriod;
    private String userId;
    private Byte fightStatus;
    private Integer userMaxCount;
    private Integer userFactCount;
    private String matchRule;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
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
    @Column(name = "MatchType")
    public Byte getMatchType() {
        return matchType;
    }

    public void setMatchType(Byte matchType) {
        this.matchType = matchType;
    }

    @Basic
    @Column(name = "BeginTime")
    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    @Basic
    @Column(name = "EndTime")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "MatchPeriod")
    public Integer getMatchPeriod() {
        return matchPeriod;
    }

    public void setMatchPeriod(Integer matchPeriod) {
        this.matchPeriod = matchPeriod;
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
    @Column(name = "FightStatus")
    public Byte getFightStatus() {
        return fightStatus;
    }

    public void setFightStatus(Byte fightStatus) {
        this.fightStatus = fightStatus;
    }

    @Basic
    @Column(name = "UserMaxCount")
    public Integer getUserMaxCount() {
        return userMaxCount;
    }

    public void setUserMaxCount(Integer userMaxCount) {
        this.userMaxCount = userMaxCount;
    }

    @Basic
    @Column(name = "UserFactCount")
    public Integer getUserFactCount() {
        return userFactCount;
    }

    public void setUserFactCount(Integer userFactCount) {
        this.userFactCount = userFactCount;
    }

    @Basic
    @Column(name = "MatchRule")
    public String getMatchRule() {
        return matchRule;
    }

    public void setMatchRule(String matchRule) {
        this.matchRule = matchRule;
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
    @Column(name = "IsValid")
    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchRecord that = (MatchRecord) o;
        return Objects.equals(matchRecordId, that.matchRecordId) &&
                Objects.equals(matchRecordNo, that.matchRecordNo) &&
                Objects.equals(matchType, that.matchType) &&
                Objects.equals(beginTime, that.beginTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(matchPeriod, that.matchPeriod) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(fightStatus, that.fightStatus) &&
                Objects.equals(userMaxCount, that.userMaxCount) &&
                Objects.equals(userFactCount, that.userFactCount) &&
                Objects.equals(matchRule, that.matchRule) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(lastUpdTime, that.lastUpdTime) &&
                Objects.equals(lastUpdUser, that.lastUpdUser) &&
                Objects.equals(isValid, that.isValid) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchRecordId, matchRecordNo, matchType, beginTime, endTime, matchPeriod, userId, fightStatus, userMaxCount, userFactCount, matchRule, createTime, createUser, lastUpdTime, lastUpdUser, isValid, remark);
    }
}