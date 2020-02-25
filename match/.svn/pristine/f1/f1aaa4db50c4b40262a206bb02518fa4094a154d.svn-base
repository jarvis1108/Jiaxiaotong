package com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @auther: shenhao
 * @descripition:           题库题目背诵表
 * @date 2018\8\15 0015
 */
@Entity
@Table(name="t_QST_QuestionRecitationForLib")
public class QuestionRecitationForLib {
    private String questionForLibId;//试题ID
    private String questionForLibNo;//试题
    private String questionLibId;//私有题库ID
    private String questionLibNo;//题库编码
    private String fromQuestionId;//来自试题ID
    private String fromQuestionNo;//来自试题编码
    private String answer;//答案
    private String part;//节选内容
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isPartial;
    private Byte isValid;//是否有效，1表示有效，0表示无效
    private String remark;//备注说明

    public QuestionRecitationForLib(){}

    public QuestionRecitationForLib(String questionForLibId, String questionForLibNo, String questionLibId, String questionLibNo, String fromQuestionId, String fromQuestionNo, String answer, String part, Timestamp createTime, String createUser, Timestamp lastUpdTime, String lastUpdUser, Byte isPartial, Byte isValid, String remark) {
        this.questionForLibId = questionForLibId;
        this.questionForLibNo = questionForLibNo;
        this.questionLibId = questionLibId;
        this.questionLibNo = questionLibNo;
        this.fromQuestionId = fromQuestionId;
        this.fromQuestionNo = fromQuestionNo;
        this.answer = answer;
        this.part = part;
        this.createTime = createTime;
        this.createUser = createUser;
        this.lastUpdTime = lastUpdTime;
        this.lastUpdUser = lastUpdUser;
        this.isPartial = isPartial;
        this.isValid = isValid;
        this.remark = remark;
    }



    @Id
    @Column(name = "QuestionForLibId")
    public String getQuestionForLibId() {
        return questionForLibId;
    }

    public void setQuestionForLibId(String questionForLibId) {
        this.questionForLibId = questionForLibId;
    }

    @Basic
    @Column(name = "QuestionForLibNo")
    public String getQuestionForLibNo() {
        return questionForLibNo;
    }

    public void setQuestionForLibNo(String questionForLibNo) {
        this.questionForLibNo = questionForLibNo;
    }

    @Basic
    @Column(name = "QuestionLibId")
    public String getQuestionLibId() {
        return questionLibId;
    }

    public void setQuestionLibId(String questionLibId) {
        this.questionLibId = questionLibId;
    }

    @Basic
    @Column(name = "QuestionLibNo")
    public String getQuestionLibNo() {
        return questionLibNo;
    }

    public void setQuestionLibNo(String questionLibNo) {
        this.questionLibNo = questionLibNo;
    }

    @Basic
    @Column(name = "FromQuestionId")
    public String getFromQuestionId() {
        return fromQuestionId;
    }

    public void setFromQuestionId(String fromQuestionId) {
        this.fromQuestionId = fromQuestionId;
    }

    @Basic
    @Column(name = "FromQuestionNo")
    public String getFromQuestionNo() {
        return fromQuestionNo;
    }

    public void setFromQuestionNo(String fromQuestionNo) {
        this.fromQuestionNo = fromQuestionNo;
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
    @Column(name = "Part")
    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
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
    @Column(name = "IsPartial")
    public Byte getIsPartial() {
        return isPartial;
    }

    public void setIsPartial(Byte isPartial) {
        this.isPartial = isPartial;
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
    public String toString() {
        return "QuestionRecitationForLib{" +
                "questionForLibId='" + questionForLibId + '\'' +
                ", questionForLibNo='" + questionForLibNo + '\'' +
                ", questionLibId='" + questionLibId + '\'' +
                ", questionLibNo='" + questionLibNo + '\'' +
                ", fromQuestionId='" + fromQuestionId + '\'' +
                ", fromQuestionNo='" + fromQuestionNo + '\'' +
                ", answer='" + answer + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
