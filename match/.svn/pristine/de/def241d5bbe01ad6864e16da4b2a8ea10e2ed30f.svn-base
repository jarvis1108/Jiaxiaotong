package com.dxtwangxiao.strongestsuperscholar.module.system.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @auther: shenhao
 * @descripition:
 * @date 2018\7\27 0027
 */
@Entity
@Table(name="t_SYS_UserSelectedCourse")
public class UserSelectedCourse {
    private String userSelectedId;//用户已选学科ID
    private String userSelectedNo;//用户已选学科编码
    private String userId;//用户ID
    private String userNo;//用户编码
    private String courseId;//课程ID
    private String subjectId;//科目ID
    private String selectedType;//选择类型,具体A:具体到课程,B:具体到学科
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private String remark;
    private Byte isValid;

    @Id
    @Column(name="UserSelectedId")
    public String getUserSelectedId() {
        return userSelectedId;
    }

    public void setUserSelectedId(String userSelectedId) {
        this.userSelectedId = userSelectedId;
    }
    @Basic
    @Column(name = "UserSelectedNo")
    public String getUserSelectedNo() {
        return userSelectedNo;
    }

    public void setUserSelectedNo(String userSelectedNo) {
        this.userSelectedNo = userSelectedNo;
    }

    @Basic
    @Column(name = "UserId")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Basic
    @Column(name = "UserNo")
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
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
    @Column(name = "SubjectId")
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }
    @Basic
    @Column(name = "SelectedType")
    public String getSelectedType() {
        return selectedType;
    }

    public void setSelectedType(String selectedType) {
        this.selectedType = selectedType;
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
    public String toString() {
        return "UserSelectedCourse{" +
                "userSelectedId='" + userSelectedId + '\'' +
                ", userSelectedNo='" + userSelectedNo + '\'' +
                ", userId='" + userId + '\'' +
                ", userNo='" + userNo + '\'' +
                ", courseId='" + courseId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", selectedType='" + selectedType + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", remark='" + remark + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
