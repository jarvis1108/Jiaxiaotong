package com.dxtwangxiao.strongestsuperscholar.module.question.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_QST_QuestionMultipleChoice")
public class QuestionMultipleChoice {
    private String questionId;
    private String questionNo;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String answer;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private String remark;
    private Byte isValid;

    public QuestionMultipleChoice() {
    }

    public QuestionMultipleChoice(String questionId, String questionNo, String choiceA, String choiceB, String choiceC, String choiceD, String answer, Timestamp createTime, String createUser, Timestamp lastUpdTime, String lastUpdUser, String remark, Byte isValid) {
        this.questionId = questionId;
        this.questionNo = questionNo;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
        this.answer = answer;
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
    @Column(name = "ChoiceA")
    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    @Basic
    @Column(name = "ChoiceB")
    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    @Basic
    @Column(name = "ChoiceC")
    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    @Basic
    @Column(name = "ChoiceD")
    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionMultipleChoice that = (QuestionMultipleChoice) o;
        return Objects.equals(questionId, that.questionId) &&
                Objects.equals(questionNo, that.questionNo) &&
                Objects.equals(choiceA, that.choiceA) &&
                Objects.equals(choiceB, that.choiceB) &&
                Objects.equals(choiceC, that.choiceC) &&
                Objects.equals(choiceD, that.choiceD) &&
                Objects.equals(answer, that.answer) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(lastUpdTime, that.lastUpdTime) &&
                Objects.equals(lastUpdUser, that.lastUpdUser) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(isValid, that.isValid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(questionId, questionNo, choiceA, choiceB, choiceC, choiceD, answer, createTime, createUser, lastUpdTime, lastUpdUser, remark, isValid);
    }

    @Override
    public String toString() {
        return "QuestionMultipleChoice{" +
                "questionId='" + questionId + '\'' +
                ", questionNo='" + questionNo + '\'' +
                ", choiceA='" + choiceA + '\'' +
                ", choiceB='" + choiceB + '\'' +
                ", choiceC='" + choiceC + '\'' +
                ", choiceD='" + choiceD + '\'' +
                ", answer=" + answer +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", remark='" + remark + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
