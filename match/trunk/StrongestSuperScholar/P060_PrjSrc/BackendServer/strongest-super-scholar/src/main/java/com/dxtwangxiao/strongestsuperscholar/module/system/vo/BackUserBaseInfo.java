package com.dxtwangxiao.strongestsuperscholar.module.system.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author 程志强
 * @date 2018/10/11 22:30
 * @Description 后台管理系统 用户管理 基本信息 来自User类的数据和UserRelInfo的数据选取组合
 */
@Entity
@Table(name = "V_BackManagerUserBaseInfo")
public class BackUserBaseInfo {
    private String userId;
    private String wechatName;
    private Timestamp createTime;
    private Timestamp loginTime;
    private Integer learningPoint;
    private Integer gradePoint;
    private Integer coin;
    private Integer matchSumCount;
    private Integer matchWinCount;
    private Integer matchLoseCount;
    private Integer matchDogFallCount;
    private Integer externalLevel; //等级
    private Integer experience;
    private String telephone;
    private Byte isValid;

    @Id
    @Column(name = "userID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "WechatName")
    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }

    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Column(name = "LoginTime")
    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    @Column(name = "LearningPoint")
    public Integer getLearningPoint() {
        return learningPoint;
    }

    public void setLearningPoint(Integer learningPoint) {
        this.learningPoint = learningPoint;
    }

    @Column(name = "GradePoint")
    public Integer getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(Integer gradePoint) {
        this.gradePoint = gradePoint;
    }

    @Column(name = "Coin")
    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    @Column(name = "MatchSumCount")
    public Integer getMatchSumCount() {
        return matchSumCount;
    }

    public void setMatchSumCount(Integer matchSumCount) {
        this.matchSumCount = matchSumCount;
    }

    @Column(name = "MatchWinCount")
    public Integer getMatchWinCount() {
        return matchWinCount;
    }

    public void setMatchWinCount(Integer matchWinCount) {
        this.matchWinCount = matchWinCount;
    }

    @Column(name = "MatchLoseCount")
    public Integer getMatchLoseCount() {
        return matchLoseCount;
    }

    public void setMatchLoseCount(Integer matchLoseCount) {
        this.matchLoseCount = matchLoseCount;
    }

    @Column(name = "MatchDogFallCount")
    public Integer getMatchDogFallCount() {
        return matchDogFallCount;
    }

    public void setMatchDogFallCount(Integer matchDogFallCount) {
        this.matchDogFallCount = matchDogFallCount;
    }

    @Column(name = "ExternalLevel")
    public Integer getExternalLevel() {
        return externalLevel;
    }

    public void setExternalLevel(Integer externalLevel) {
        this.externalLevel = externalLevel;
    }

    @Column(name = "Experience")
    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Column(name = "Telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Column(name = "IsValid")
    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "BackUserBaseInfo{" +
                "userId='" + userId + '\'' +
                ", wechatName='" + wechatName + '\'' +
                ", createTime=" + createTime +
                ", loginTime=" + loginTime +
                ", learningPoint=" + learningPoint +
                ", gradePoint=" + gradePoint +
                ", coin=" + coin +
                ", matchSumCount=" + matchSumCount +
                ", matchWinCount=" + matchWinCount +
                ", matchLoseCount=" + matchLoseCount +
                ", matchDogFallCount=" + matchDogFallCount +
                ", externalLevel=" + externalLevel +
                ", experience=" + experience +
                ", telephone='" + telephone + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
