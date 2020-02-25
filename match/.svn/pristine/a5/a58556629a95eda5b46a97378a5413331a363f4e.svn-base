package com.dxtwangxiao.strongestsuperscholar.module.system.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 意见反馈表
 * <p>
 * Created By Devin
 * 2018-09-25 上午 09:38
 */
@Entity
@Table(name = "t_SYS_Feedback")
public class Feedback {

    @Id
    @Column(name = "FeedbackID")
    private String feedbackId;

    @Column(name = "FeedbackNo")
    private String feedbackNo;

    @Column(name = "userID")
    private String userId;

    @Column(name = "Content")
    private String content;

    @Column(name = "CreateTime")
    private Date createTime;

    @Column(name = "CreateUser")
    private String createUser;

    @Column(name = "LastUpdTime")
    private Date lastUpdTime;

    @Column(name = "LastUpdUser")
    private String lastUpdUser;

    @Column(name = "Remark")
    private String remark;

    @Column(name = "IsValid")
    private Byte isValid;

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedbackNo() {
        return feedbackNo;
    }

    public void setFeedbackNo(String feedbackNo) {
        this.feedbackNo = feedbackNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId='" + feedbackId + '\'' +
                ", feedbackNo='" + feedbackNo + '\'' +
                ", userId='" + userId + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", remark='" + remark + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
