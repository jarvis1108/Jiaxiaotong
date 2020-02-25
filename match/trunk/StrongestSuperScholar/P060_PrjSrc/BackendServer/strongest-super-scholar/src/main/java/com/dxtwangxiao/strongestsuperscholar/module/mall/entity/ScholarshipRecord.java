package com.dxtwangxiao.strongestsuperscholar.module.mall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 奖学金兑换记录
 * <p>
 * Created by 孙伟浩 on 2018/9/18.
 */
@Entity
@Table(name = "t_MAL_ScholarshipRecord")
public class ScholarshipRecord {

    @Id
    @Column(name = "ScholarshipRecordID")
    private String scholarshipRecordId;

    @Column(name = "ScholarshipRecordNo")
    private String scholarshipRecordNo;

    @Column(name = "ScholarshipRecordCode")
    private String scholarshipRecordCode;

    @Column(name = "UserID")
    private String userId;

    @Column(name = "ScholarshipID")
    private String scholarshipId;

    @Column(name = "CreateUser")
    private String createUser;

    @Column(name = "CreateTime")
    private Timestamp createTime;

    @Column(name = "LastUpdTime")
    private Timestamp lastUpdTime;

    @Column(name = "LastUpdUser")
    private Timestamp lastUpdUser;

    @Column(name = "IsValid")
    private Byte isValid;

    @Column(name = "Remark")
    private String remark;

    public String getScholarshipRecordId() {
        return scholarshipRecordId;
    }

    public void setScholarshipRecordId(String scholarshipRecordId) {
        this.scholarshipRecordId = scholarshipRecordId;
    }

    public String getScholarshipRecordNo() {
        return scholarshipRecordNo;
    }

    public void setScholarshipRecordNo(String scholarshipRecordNo) {
        this.scholarshipRecordNo = scholarshipRecordNo;
    }

    public String getScholarshipRecordCode() {
        return scholarshipRecordCode;
    }

    public void setScholarshipRecordCode(String scholarshipRecordCode) {
        this.scholarshipRecordCode = scholarshipRecordCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(String scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(Timestamp lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }

    public Timestamp getLastUpdUser() {
        return lastUpdUser;
    }

    public void setLastUpdUser(Timestamp lastUpdUser) {
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
        return "ScholarshipRecord{" +
                "scholarshipRecordId='" + scholarshipRecordId + '\'' +
                ", scholarshipRecordNo='" + scholarshipRecordNo + '\'' +
                ", scholarshipRecordCode='" + scholarshipRecordCode + '\'' +
                ", userId='" + userId + '\'' +
                ", scholarshipId='" + scholarshipId + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser=" + lastUpdUser +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
