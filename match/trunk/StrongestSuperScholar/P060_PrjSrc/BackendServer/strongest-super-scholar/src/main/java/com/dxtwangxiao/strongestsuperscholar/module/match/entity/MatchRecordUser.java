package com.dxtwangxiao.strongestsuperscholar.module.match.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_MTH_MatchRecordUser")
public class MatchRecordUser {
    private String matchRecordUserId;
    private String matchRecordId;
    private String matchRecordNo;
    private String userId;
    private String userNo;
    private Integer originalGradePoint;
    private int acquiredGradePoint;
    private Integer originalGradeCoin;
    private int acquiredGradeCoin;
    private Integer originalLearningPoint;
    private int acquiredLearningPoint;
    private Byte isCreator;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "MatchRecordUserID")
    public String getMatchRecordUserId() {
        return matchRecordUserId;
    }

    public void setMatchRecordUserId(String matchRecordUserId) {
        this.matchRecordUserId = matchRecordUserId;
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
    @Column(name = "OriginalGradePoint")
    public Integer getOriginalGradePoint() {
        return originalGradePoint;
    }

    public void setOriginalGradePoint(Integer originalGradePoint) {
        this.originalGradePoint = originalGradePoint;
    }

    @Basic
    @Column(name = "AcquiredGradePoint")
    public int getAcquiredGradePoint() {
        return acquiredGradePoint;
    }

    public void setAcquiredGradePoint(int acquiredGradePoint) {
        this.acquiredGradePoint = acquiredGradePoint;
    }

    @Basic
    @Column(name = "OriginalGradeCoin")
    public Integer getOriginalGradeCoin() {
        return originalGradeCoin;
    }

    public void setOriginalGradeCoin(Integer originalGradeCoin) {
        this.originalGradeCoin = originalGradeCoin;
    }

    @Basic
    @Column(name = "AcquiredGradeCoin")
    public int getAcquiredGradeCoin() {
        return acquiredGradeCoin;
    }

    public void setAcquiredGradeCoin(int acquiredGradeCoin) {
        this.acquiredGradeCoin = acquiredGradeCoin;
    }

    @Basic
    @Column(name = "OriginalLearningPoint")
    public Integer getOriginalLearningPoint() {
        return originalLearningPoint;
    }

    public void setOriginalLearningPoint(Integer originalLearningPoint) {
        this.originalLearningPoint = originalLearningPoint;
    }

    @Basic
    @Column(name = "AcquiredLearningPoint")
    public int getAcquiredLearningPoint() {
        return acquiredLearningPoint;
    }

    public void setAcquiredLearningPoint(int acquiredLearningPoint) {
        this.acquiredLearningPoint = acquiredLearningPoint;
    }

    @Basic
    @Column(name = "IsCreator")
    public Byte getIsCreator() {
        return isCreator;
    }

    public void setIsCreator(Byte isCreator) {
        this.isCreator = isCreator;
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
        MatchRecordUser that = (MatchRecordUser) o;
        return acquiredGradePoint == that.acquiredGradePoint &&
                acquiredGradeCoin == that.acquiredGradeCoin &&
                acquiredLearningPoint == that.acquiredLearningPoint &&
                Objects.equals(matchRecordUserId, that.matchRecordUserId) &&
                Objects.equals(matchRecordId, that.matchRecordId) &&
                Objects.equals(matchRecordNo, that.matchRecordNo) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(userNo, that.userNo) &&
                Objects.equals(originalGradePoint, that.originalGradePoint) &&
                Objects.equals(originalGradeCoin, that.originalGradeCoin) &&
                Objects.equals(originalLearningPoint, that.originalLearningPoint) &&
                Objects.equals(isCreator, that.isCreator) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(lastUpdTime, that.lastUpdTime) &&
                Objects.equals(lastUpdUser, that.lastUpdUser) &&
                Objects.equals(isValid, that.isValid) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(matchRecordUserId, matchRecordId, matchRecordNo, userId, userNo, originalGradePoint, acquiredGradePoint, originalGradeCoin, acquiredGradeCoin, originalLearningPoint, acquiredLearningPoint, isCreator, createTime, createUser, lastUpdTime, lastUpdUser, isValid, remark);
    }
}
