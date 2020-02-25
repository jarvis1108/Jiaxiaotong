package com.dxtwangxiao.strongestsuperscholar.module.match.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_MTH_MatchRecordQuestion")
public class MatchRecordQuestion {
    private String matchRecordQuestionId;
    private String matchRecordId;
    private String matchRecordNo;
    private Integer questionIndex;
    private String questionId;
    private String questionNo;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "MatchRecordQuestionID")
    public String getMatchRecordQuestionId() {
        return matchRecordQuestionId;
    }

    public void setMatchRecordQuestionId(String matchRecordQuestionId) {
        this.matchRecordQuestionId = matchRecordQuestionId;
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
    @Column(name = "QuestionIndex")
    public Integer getQuestionIndex() {
        return questionIndex;
    }

    public void setQuestionIndex(Integer questionIndex) {
        this.questionIndex = questionIndex;
    }

    @Basic
    @Column(name = "QuestionID")
    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    @Basic
    @Column(name = "QuestionNo")
    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
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
        MatchRecordQuestion that = (MatchRecordQuestion) o;
        return Objects.equals(matchRecordQuestionId, that.matchRecordQuestionId) &&
                Objects.equals(matchRecordId, that.matchRecordId) &&
                Objects.equals(matchRecordNo, that.matchRecordNo) &&
                Objects.equals(questionIndex, that.questionIndex) &&
                Objects.equals(questionId, that.questionId) &&
                Objects.equals(questionNo, that.questionNo) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(lastUpdTime, that.lastUpdTime) &&
                Objects.equals(lastUpdUser, that.lastUpdUser) &&
                Objects.equals(isValid, that.isValid) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(matchRecordQuestionId, matchRecordId, matchRecordNo, questionIndex, questionId, questionNo, createTime, createUser, lastUpdTime, lastUpdUser, isValid, remark);
    }
}
