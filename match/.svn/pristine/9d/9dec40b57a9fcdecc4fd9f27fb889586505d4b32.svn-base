package com.dxtwangxiao.strongestsuperscholar.module.question.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 试题收藏
 * <p>
 * Created By Devin
 * 2018-09-04 上午 10:17
 */
@Entity
@Table(name = "t_QST_QuestionCollection")
public class QuestionCollection {

    @Id
    @Column(name = "QuestionCollectionID")
    private String questionCollectionId;

    @Column(name = "QuestionCollectionNo")
    private String questionCollectionNo;

    @Column(name = "UserID")
    private String userId;

    @Column(name = "QuestionID")
    private String questionId;

    @Column(name = "CreateTime")
    private Date createTime;

    @Column(name = "CreateUser")
    private String createUser;

    @Column(name = "LastUpdTime")
    private Date lastUpdTime;

    @Column(name = "LaseUpdUser")
    private String lastUpdUser;

    @Column(name = "IsValid")
    private Byte isValid;

    @Column(name = "Remark")
    private String remark;

    public String getQuestionCollectionId() {
        return questionCollectionId;
    }

    public void setQuestionCollectionId(String questionCollectionId) {
        this.questionCollectionId = questionCollectionId;
    }

    public String getQuestionCollectionNo() {
        return questionCollectionNo;
    }

    public void setQuestionCollectionNo(String questionCollectionNo) {
        this.questionCollectionNo = questionCollectionNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(Date lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }

    public String getLastUpdUser() {
        return lastUpdUser;
    }

    public void setLastUpdUser(String lastUpdUser) {
        this.lastUpdUser = lastUpdUser;
    }

    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "QuestionCollection{" +
                "questionCollectionId='" + questionCollectionId + '\'' +
                ", questionCollectionNo='" + questionCollectionNo + '\'' +
                ", userId='" + userId + '\'' +
                ", questionId='" + questionId + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
