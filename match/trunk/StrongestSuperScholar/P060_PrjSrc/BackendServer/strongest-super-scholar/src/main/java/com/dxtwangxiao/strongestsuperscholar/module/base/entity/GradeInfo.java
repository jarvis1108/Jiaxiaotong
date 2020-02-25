package com.dxtwangxiao.strongestsuperscholar.module.base.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 年级基本信息
 * <p>
 * Created by shenhao
 * 2018\7\13 0013
 */
@Entity
@Table(name = "t_BSD_GradeInfo")
public class GradeInfo {
    private String gradeId;
    private String gradeNo;
    private String gradeCode;
    private String gradeName;
    private String gradeShortName;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;


    @Id
    @Column(name = "GradeId")
    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    @Basic
    @Column(name = "GradeNo")
    public String getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(String gradeNo) {
        this.gradeNo = gradeNo;
    }

    @Basic
    @Column(name = "GradeCode")
    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    @Basic
    @Column(name = "GradeName")
    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    @Basic
    @Column(name = "GradeShortName")
    public String getGradeShortName() {
        return gradeShortName;
    }

    public void setGradeShortName(String gradeShortName) {
        this.gradeShortName = gradeShortName;
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
        return "GradeInfo{" +
                "gradeId='" + gradeId + '\'' +
                ", gradeNo='" + gradeNo + '\'' +
                ", gradeCode='" + gradeCode + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", gradeShortName='" + gradeShortName + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
