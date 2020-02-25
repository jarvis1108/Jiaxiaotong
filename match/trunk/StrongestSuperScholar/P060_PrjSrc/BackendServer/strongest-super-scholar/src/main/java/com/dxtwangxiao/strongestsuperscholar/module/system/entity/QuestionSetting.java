package com.dxtwangxiao.strongestsuperscholar.module.system.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 出题设置
 * <p>
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_SYS_QuestionSetting")
public class QuestionSetting {
    private String questionSettingId;//题目设置ID
    private String matchType;//匹配类型
    private String questionTypeId;//试题类型ID
    private Integer questionNumber;//试题数量
    private Integer questionTime;//答题时间，以秒为单位
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private String remark;
    private Byte isValid;

    @Id
    @Column(name = "QuestionSettingID")
    public String getQuestionSettingId() {
        return questionSettingId;
    }

    public void setQuestionSettingId(String questionSettingId) {
        this.questionSettingId = questionSettingId;
    }

    @Basic
    @Column(name = "MatchType")
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @Basic
    @Column(name = "QuestionTypeID")
    public String getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(String questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    @Basic
    @Column(name = "QuestionNumber")
    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

    @Basic
    @Column(name = "QuestionTime")
    public Integer getQuestionTime() {
        return questionTime;
    }

    public void setQuestionTime(Integer questionTime) {
        this.questionTime = questionTime;
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
        return "QuestionSetting{" +
                "questionSettingId='" + questionSettingId + '\'' +
                ", matchType='" + matchType + '\'' +
                ", questionTypeId='" + questionTypeId + '\'' +
                ", questionNumber=" + questionNumber +
                ", questionTime=" + questionTime +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", remark='" + remark + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
