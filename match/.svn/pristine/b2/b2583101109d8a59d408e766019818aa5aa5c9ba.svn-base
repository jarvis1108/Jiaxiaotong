package com.dxtwangxiao.strongestsuperscholar.module.question.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_QST_QuestionRecitation")
public class QuestionRecitation {
    private String questionId;
    private String questionNo;
    private String answer;
    private String part;
    private Byte isPartial;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private String remark;
    private Byte isValid;

    public QuestionRecitation() {
    }

    public QuestionRecitation(String questionId, String questionNo, String answer, String part, Byte isPartial, Timestamp createTime, String createUser, Timestamp lastUpdTime, String lastUpdUser, String remark, Byte isValid) {
        this.questionId = questionId;
        this.questionNo = questionNo;
        this.answer = answer;
        this.part = part;
        this.isPartial = isPartial;
        this.createTime = createTime;
        this.createUser = createUser;
        this.lastUpdTime = lastUpdTime;
        this.lastUpdUser = lastUpdUser;
        this.remark = remark;
        this.isValid = isValid;
    }

    @Id
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
    @Column(name = "Answer")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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

    @Basic
    @Column(name = "Part")
    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    @Basic
    @Column(name = "IsPartial")
    public Byte getIsPartial() {
        return isPartial;
    }

    public void setIsPartial(Byte isPartial) {
        this.isPartial = isPartial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionRecitation that = (QuestionRecitation) o;
        return Objects.equals(getQuestionId(), that.getQuestionId()) &&
                Objects.equals(getQuestionNo(), that.getQuestionNo()) &&
                Objects.equals(getAnswer(), that.getAnswer()) &&
                Objects.equals(getPart(), that.getPart()) &&
                Objects.equals(getIsPartial(), that.getIsPartial()) &&
                Objects.equals(getCreateTime(), that.getCreateTime()) &&
                Objects.equals(getCreateUser(), that.getCreateUser()) &&
                Objects.equals(getLastUpdTime(), that.getLastUpdTime()) &&
                Objects.equals(getLastUpdUser(), that.getLastUpdUser()) &&
                Objects.equals(getRemark(), that.getRemark()) &&
                Objects.equals(getIsValid(), that.getIsValid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestionId(), getQuestionNo(), getAnswer(), getPart(), getIsPartial(), getCreateTime(), getCreateUser(), getLastUpdTime(), getLastUpdUser(), getRemark(), getIsValid());
    }

    @Override
    public String toString() {
        return "QuestionRecitation{" +
                "questionId='" + questionId + '\'' +
                ", questionNo='" + questionNo + '\'' +
                ", answer='" + answer + '\'' +
                ", part='" + part + '\'' +
                ", isPartial=" + isPartial +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", remark='" + remark + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
