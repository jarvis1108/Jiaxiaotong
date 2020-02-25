package com.dxtwangxiao.strongestsuperscholar.module.base.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_BSD_Subject")
public class Subject {
    private String subjectId;
    private String subjectNo;
    private String subjectName;
    private String subjectShortName;
    private String showText;
    private String gradePhaseId;
    private String bookVerId;
    private String gradeId;
    private String courseId;

    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "SubjectID")
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "SubjectNo")
    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    @Basic
    @Column(name = "SubjectName")
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Basic
    @Column(name = "SubjectShortName")
    public String getSubjectShortName() {
        return subjectShortName;
    }

    public void setSubjectShortName(String subjectShortName) {
        this.subjectShortName = subjectShortName;
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
    @Column(name = "GradePhaseId")
    public String getGradePhaseId() {
        return gradePhaseId;
    }

    public void setGradePhaseId(String gradePhaseId) {
        this.gradePhaseId = gradePhaseId;
    }

    @Basic
    @Column(name = "BookVerId")
    public String getBookVerId() {
        return bookVerId;
    }

    public void setBookVerId(String bookVerId) {
        this.bookVerId = bookVerId;
    }

    @Basic
    @Column(name = "GradeId")
    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    @Basic
    @Column(name = "CourseId")
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
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
        return "Subject{" +
                "subjectId='" + subjectId + '\'' +
                ", subjectNo='" + subjectNo + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectShortName='" + subjectShortName + '\'' +
                ", showText='" + showText + '\'' +
                ", gradePhaseId='" + gradePhaseId + '\'' +
                ", bookVerId='" + bookVerId + '\'' +
                ", gradeId='" + gradeId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
