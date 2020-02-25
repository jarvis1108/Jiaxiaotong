package com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @auther: shenhao
 * @descripition: 私有题目库选择题题目表
 * @date 2018\8\15 0015
 */
@Entity
@Table(name = "t_QST_QuestionMultipleChoiceForLib")
public class QuestionMultipleChoiceForLib {
    private String questionForLibId;//试题ID
    private String questionForLibNo;//试题
    private String questionLibId;//私有题库ID
    private String questionLibNo;//题库编码
    private String fromQuestionId;//来自试题ID
    private String fromQuestionNo;//来自试题编码
    private String choiceA;//选项A
    private String choiceB;//选项B
    private String choiceC;//选项C
    private String choiceD;//选项D
    private String answer;//答案：0:A; 1B; 2:C; 3:D
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;//是否有效，1表示有效，0表示无效
    private String remark;//备注说明

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
        return "QuestionMultipleChoiceForLib{" +
                "questionForLibId='" + questionForLibId + '\'' +
                ", questionForLibNo='" + questionForLibNo + '\'' +
                ", questionLibId='" + questionLibId + '\'' +
                ", questionLibNo='" + questionLibNo + '\'' +
                ", fromQuestionId='" + fromQuestionId + '\'' +
                ", fromQuestionNo='" + fromQuestionNo + '\'' +
                ", choiceA='" + choiceA + '\'' +
                ", choiceB='" + choiceB + '\'' +
                ", choiceC='" + choiceC + '\'' +
                ", choiceD='" + choiceD + '\'' +
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
