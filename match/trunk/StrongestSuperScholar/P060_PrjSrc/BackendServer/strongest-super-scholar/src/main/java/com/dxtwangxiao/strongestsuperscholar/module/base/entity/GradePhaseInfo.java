package com.dxtwangxiao.strongestsuperscholar.module.base.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 年级阶段基本信息表
 * <p>
 * Created by shenhao
 * 2018\7\13 0013
 */
@Entity
@Table(name = "t_BSD_GradePhaseInfo")
public class GradePhaseInfo {
    private String gradePhaseId;
    private String gradePhaseNo;
    private String gradePhaseCode;
    private String gradePhaseName;
    private String gradePhaseShortName;
    private String description;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "GradePhaseId")
    public String getGradePhaseId() {
        return gradePhaseId;
    }

    public void setGradePhaseId(String gradePhaseId) {
        this.gradePhaseId = gradePhaseId;
    }

    @Basic
    @Column(name = "GradePhaseNo")
    public String getGradePhaseNo() {
        return gradePhaseNo;
    }

    public void setGradePhaseNo(String gradePhaseNo) {
        this.gradePhaseNo = gradePhaseNo;
    }

    @Basic
    @Column(name = "GradePhaseCode")
    public String getGradePhaseCode() {
        return gradePhaseCode;
    }

    public void setGradePhaseCode(String gradePhaseCode) {
        this.gradePhaseCode = gradePhaseCode;
    }

    @Basic
    @Column(name = "GradePhaseName")
    public String getGradePhaseName() {
        return gradePhaseName;
    }

    public void setGradePhaseName(String gradePhaseName) {
        this.gradePhaseName = gradePhaseName;
    }

    @Basic
    @Column(name = "GradePhaseShortName")
    public String getGradePhaseShortName() {
        return gradePhaseShortName;
    }

    public void setGradePhaseShortName(String gradePhaseShortName) {
        this.gradePhaseShortName = gradePhaseShortName;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "GradePhaseInfo{" +
                "gradePhaseId='" + gradePhaseId + '\'' +
                ", gradePhaseNo='" + gradePhaseNo + '\'' +
                ", gradePhaseCode='" + gradePhaseCode + '\'' +
                ", gradePhaseName='" + gradePhaseName + '\'' +
                ", gradePhaseShortName='" + gradePhaseShortName + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
