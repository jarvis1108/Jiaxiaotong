package com.dxtwangxiao.strongestsuperscholar.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * Created By Devin
 * 2018-09-03 下午 07:51
 */
public class UserDTO implements Serializable {

    /* 用户基本信息 */
    private String userId;
    private String userNo;
    private String sex;
    private String wechatName;
    private String city;
    private String telephone;
    private String headImage;
    private String otherInfo;

    /* 用户相关其他信息 */
    private Integer coin;
    private Integer gradePoint;
    private Integer learningPoint;
    private Integer matchSumCount;
    private Integer matchWinCount;
    private Integer matchLoseCount;
    private Integer matchDogFallCount;
    private Integer experience;
    private Integer externalLevel;

    /* 用户下一等级最小经验值 */
    private Integer upgradeExperience;

    @JsonIgnore
    private Integer internalLevel;

    @JsonIgnore
    private String openid;

    public String getUserId() {
        return userId;
    }

    public String getUserNo() {
        return userNo;
    }

    public String getCity() {
        return city;
    }

    public String getSex() {
        return sex;
    }

    public String getWechatName() {
        return wechatName;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getHeadImage() {
        return headImage;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public Integer getCoin() {
        return coin;
    }

    public Integer getGradePoint() {
        return gradePoint;
    }

    public Integer getLearningPoint() {
        return learningPoint;
    }

    public Integer getMatchSumCount() {
        return matchSumCount;
    }

    public Integer getMatchWinCount() {
        return matchWinCount;
    }

    public Integer getMatchLoseCount() {
        return matchLoseCount;
    }

    public Integer getMatchDogFallCount() {
        return matchDogFallCount;
    }

    public Integer getExperience() {
        return experience;
    }

    public Integer getExternalLevel() {
        return externalLevel;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public void setGradePoint(Integer gradePoint) {
        this.gradePoint = gradePoint;
    }

    public void setLearningPoint(Integer learningPoint) {
        this.learningPoint = learningPoint;
    }

    public void setMatchSumCount(Integer matchSumCount) {
        this.matchSumCount = matchSumCount;
    }

    public void setMatchWinCount(Integer matchWinCount) {
        this.matchWinCount = matchWinCount;
    }

    public void setMatchLoseCount(Integer matchLoseCount) {
        this.matchLoseCount = matchLoseCount;
    }

    public void setMatchDogFallCount(Integer matchDogFallCount) {
        this.matchDogFallCount = matchDogFallCount;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public void setExternalLevel(Integer externalLevel) {
        this.externalLevel = externalLevel;
    }

    public Integer getUpgradeExperience() {
        return upgradeExperience;
    }

    public void setUpgradeExperience(Integer upgradeExperience) {
        this.upgradeExperience = upgradeExperience;
    }

    @JsonIgnore
    public Integer getInternalLevel() {
        return internalLevel;
    }

    public void setInternalLevel(Integer internalLevel) {
        this.internalLevel = internalLevel;
    }

    @JsonIgnore
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UserDTO) {
            UserDTO userDTO = (UserDTO) obj;
            return userDTO.getUserId().equals(userId);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId='" + userId + '\'' +
                ", userNo='" + userNo + '\'' +
                ", sex='" + sex + '\'' +
                ", wechatName='" + wechatName + '\'' +
                ", city='" + city + '\'' +
                ", telephone='" + telephone + '\'' +
                ", headImage='" + headImage + '\'' +
                ", otherInfo='" + otherInfo + '\'' +
                ", coin=" + coin +
                ", gradePoint=" + gradePoint +
                ", learningPoint=" + learningPoint +
                ", matchSumCount=" + matchSumCount +
                ", matchWinCount=" + matchWinCount +
                ", matchLoseCount=" + matchLoseCount +
                ", matchDogFallCount=" + matchDogFallCount +
                ", experience=" + experience +
                ", externalLevel=" + externalLevel +
                ", internalLevel=" + internalLevel +
                '}';
    }
}