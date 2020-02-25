package com.dxtwangxiao.strongestsuperscholar.module.base.entity;



import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**

/**
 * @Author: meiyu
 * @Date: 2018/7/13 14:44
 * 课程信息表实体
 */
@Entity
@Table(name = "t_BSD_CourseInfo")
public class CourseInfo {
    private String courseId;
    private String courseNo;
    private String courseCode;
    private String courseName;
    private String courseShortName;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "CourseId")
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    @Basic
    @Column(name = "CourseNo")
    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }
    @Basic
    @Column(name = "Coursecode")
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    @Basic
    @Column(name = "CourseName")
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    @Basic
    @Column(name = "CourseShortName")
    public String getCourseShortName() {
        return courseShortName;
    }

    public void setCourseShortName(String courseShortName) {
        this.courseShortName = courseShortName;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseInfo that = (CourseInfo) o;
        return Objects.equals(courseId, that.courseId) && Objects.equals(courseNo, that.courseNo) && Objects.equals(courseCode, that.courseCode) && Objects.equals(courseName, that.courseName) && Objects.equals(courseShortName, that.courseShortName) && Objects.equals(createTime, that.createTime) && Objects.equals(createUser, that.createUser) && Objects.equals(lastUpdTime, that.lastUpdTime) && Objects.equals(lastUpdUser, that.lastUpdUser) && Objects.equals(isValid, that.isValid) && Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(courseId, courseNo, courseCode, courseName, courseShortName, createTime, createUser, lastUpdTime, lastUpdUser, isValid, remark);
    }
}
