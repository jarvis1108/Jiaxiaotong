package com.dxtwangxiao.strongestsuperscholar.module.base.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 年级阶段与年级信息关联表，同时包含了内部等级信息和展示文本信息
 * <p>
 * Create by shenhao
 * 2018\7\17 0013
 */
@Entity
@Table(name = "t_BSD_GradePhaseInfoRel")
public class GradePhaseInfoRel {
    private String gradePhaseRelId;
    private String gradePhaseId;
    private String gradeId;
    private String showText;
    private Integer internalLevel;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "GradePhaseRelID")
    public String getGradePhaseRelId() {
        return gradePhaseRelId;
    }

    public void setGradePhaseRelId(String gradePhaseRelId) {
        this.gradePhaseRelId = gradePhaseRelId;
    }

    @Basic
    @Column(name = "GradePhaseId")
    public String getGradePhaseId() {
        return gradePhaseId;
    }

    public void setGradePhaseId(String gradePhaseId) {
        this.gradePhaseId = gradePhaseId;
    }

    @Basic
    @Column(name = "GradeID")
    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    @Basic
    @Column(name = "ShowText")
    public String getShowText() {
        return showText;
    }

    public void setShowText(String showText) {
        this.showText = showText;
    }

    @Basic
    @Column(name = "InternalLevel")
    public Integer getInternalLevel() {
        return internalLevel;
    }

    public void setInternalLevel(Integer internalLevel) {
        this.internalLevel = internalLevel;
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
        return "GradePhaseInfoRel{" +
                "gradePhaseRelId='" + gradePhaseRelId + '\'' +
                ", gradePhaseId='" + gradePhaseId + '\'' +
                ", gradeId='" + gradeId + '\'' +
                ", showText='" + showText + '\'' +
                ", internalLevel=" + internalLevel +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
