package com.dxtwangxiao.strongestsuperscholar.module.system.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @auther: shenhao
 * @descripition:  用户信息_相关信息部分（主要记录比赛及财富信息）
 * @date 2018\7\24 0024
 */
@Entity
@Table(name="t_SYS_UserRelInfo")
public class UserRelInfo {

    private String userId;//用户ID
    private String userNo;//用户编码
    private Integer coin;//用户金币
    private Integer gradePoint;//用户绩点
    private Integer learningPoint;//用户学点
    private Integer internalLevel;//用户内部等级，系统内部评级
    private Integer  matchSumCount;//比赛总次数
    private Integer  matchWinCount;//比赛赢的次数
    private Integer  matchLoseCount;//比赛输的次数
    private Integer  matchDogFallCount;//比赛输平局的次数
    private Integer  experience;//用户经验值
    private Integer externalLevel;//用户外部等级，展示给客户端
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private String remark;
    private Byte isValid;

    @Id
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
    @Column(name = "Coin")
    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }
    @Basic
    @Column(name = "GradePoint")
    public Integer getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(Integer gradePoint) {
        this.gradePoint = gradePoint;
    }
    @Basic
    @Column(name = "LearningPoint")
    public Integer getLearningPoint() {
        return learningPoint;
    }

    public void setLearningPoint(Integer learningPoint) {
        this.learningPoint = learningPoint;
    }
    @Basic
    @Column(name = "InternalLevel")
    public Integer getInternalLevel() {
        return internalLevel;
    }

    public void setInternalLevel(Integer internalLevel) {
        this.internalLevel = internalLevel;
    }
    @Basic
    @Column(name = "MatchSumCount")
    public Integer getMatchSumCount() {
        return matchSumCount;
    }

    public void setMatchSumCount(Integer matchSumCount) {
        this.matchSumCount = matchSumCount;
    }
    @Basic
    @Column(name = "MatchWinCount")
    public Integer getMatchWinCount() {
        return matchWinCount;
    }

    public void setMatchWinCount(Integer matchWinCount) {
        this.matchWinCount = matchWinCount;
    }
    @Basic
    @Column(name = "MatchLoseCount")
    public Integer getMatchLoseCount() {
        return matchLoseCount;
    }

    public void setMatchLoseCount(Integer matchLoseCount) {
        this.matchLoseCount = matchLoseCount;
    }
    @Basic
    @Column(name = "MatchDogFallCount")
    public Integer getMatchDogFallCount() {
        return matchDogFallCount;
    }

    public void setMatchDogFallCount(Integer matchDogFallCount) {
        this.matchDogFallCount = matchDogFallCount;
    }
    @Basic
    @Column(name = "Experience")
    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
    @Basic
    @Column(name = "ExternalLevel")
    public Integer getExternalLevel() {
        return externalLevel;
    }

    public void setExternalLevel(Integer externalLevel) {
        this.externalLevel = externalLevel;
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
        return "UserRelInfoRepository{" +
                "userId='" + userId + '\'' +
                ", userNo='" + userNo + '\'' +
                ", coin=" + coin +
                ", gradePoint=" + gradePoint +
                ", learningPoint=" + learningPoint +
                ", internalLevel=" + internalLevel +
                ", matchSumCount=" + matchSumCount +
                ", matchWinCount=" + matchWinCount +
                ", matchLoseCount=" + matchLoseCount +
                ", matchDogFallCount=" + matchDogFallCount +
                ", experience=" + experience +
                ", externalLevel=" + externalLevel +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", remark='" + remark + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
