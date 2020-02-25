package com.dxtwangxiao.strongestsuperscholar.module.match.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_MTH_LPConsumeRecord")
public class LPConsumeRecord {
    private String lpConsumeRecordId;
    private String matchRecordQuestionId;
    private String matchRecordId;
    private String matchRecordNo;
    private String matchRecordUserId;
    private String questionId;
    private String questionNo;
    private String userId;
    private String userNo;
    private Timestamp beginTime;
    private Timestamp endTime;
    private String userAnswer;
    private Integer amount;
    private Byte isTrue;
    private Timestamp createTime;
    private String remark;
    private Byte isValid;

    @Id
    @Column(name = "LPConsumeRecordID")
    public String getLpConsumeRecordId() {
        return lpConsumeRecordId;
    }

    public void setLpConsumeRecordId(String lpConsumeRecordId) {
        this.lpConsumeRecordId = lpConsumeRecordId;
    }

    @Basic
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
    @Column(name = "MatchRecordUserID")
    public String getMatchRecordUserId() {
        return matchRecordUserId;
    }

    public void setMatchRecordUserId(String matchRecordUserId) {
        this.matchRecordUserId = matchRecordUserId;
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
    @Column(name = "UserAnswer")
    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    @Basic
    @Column(name = "Amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "IsTrue")
    public Byte getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(Byte isTrue) {
        this.isTrue = isTrue;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LPConsumeRecord that = (LPConsumeRecord) o;
        return Objects.equals(lpConsumeRecordId, that.lpConsumeRecordId) &&
                Objects.equals(matchRecordQuestionId, that.matchRecordQuestionId) &&
                Objects.equals(matchRecordId, that.matchRecordId) &&
                Objects.equals(matchRecordNo, that.matchRecordNo) &&
                Objects.equals(matchRecordUserId, that.matchRecordUserId) &&
                Objects.equals(questionId, that.questionId) &&
                Objects.equals(questionNo, that.questionNo) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(userNo, that.userNo) &&
                Objects.equals(beginTime, that.beginTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(isTrue, that.isTrue) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(isValid, that.isValid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(lpConsumeRecordId, matchRecordQuestionId, matchRecordId, matchRecordNo, matchRecordUserId, questionId, questionNo, userId, userNo, beginTime, endTime, amount, isTrue, createTime, remark, isValid);
    }
}
