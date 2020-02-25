package com.dxtwangxiao.questionchecktool.entity;

import java.util.Date;

public class Subject {
    private String subjectID;

    private String subjectNo;

    private String initID;

    private String initNo;

    private Byte isCorrect;

    private String subjectName;

    private String subjectShortName;

    private String gradePhaseID;

    private String gradeID;

    private String courseID;

    private String bookVerID;

    private String booklet;

    private Date createTime;

    private String createUser;

    private Date lastUpdTime;

    private String lastUpdUser;

    private Byte isValid;

    private String remark;

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID == null ? null : subjectID.trim();
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo == null ? null : subjectNo.trim();
    }

    public String getInitID() {
        return initID;
    }

    public void setInitID(String initID) {
        this.initID = initID == null ? null : initID.trim();
    }

    public String getInitNo() {
        return initNo;
    }

    public void setInitNo(String initNo) {
        this.initNo = initNo == null ? null : initNo.trim();
    }

    public Byte getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Byte isCorrect) {
        this.isCorrect = isCorrect;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public String getSubjectShortName() {
        return subjectShortName;
    }

    public void setSubjectShortName(String subjectShortName) {
        this.subjectShortName = subjectShortName == null ? null : subjectShortName.trim();
    }

    public String getGradePhaseID() {
        return gradePhaseID;
    }

    public void setGradePhaseID(String gradePhaseID) {
        this.gradePhaseID = gradePhaseID == null ? null : gradePhaseID.trim();
    }

    public String getGradeID() {
        return gradeID;
    }

    public void setGradeID(String gradeID) {
        this.gradeID = gradeID == null ? null : gradeID.trim();
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID == null ? null : courseID.trim();
    }

    public String getBookVerID() {
        return bookVerID;
    }

    public void setBookVerID(String bookVerID) {
        this.bookVerID = bookVerID == null ? null : bookVerID.trim();
    }

    public String getBooklet() {
        return booklet;
    }

    public void setBooklet(String booklet) {
        this.booklet = booklet == null ? null : booklet.trim();
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
        this.createUser = createUser == null ? null : createUser.trim();
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
        this.lastUpdUser = lastUpdUser == null ? null : lastUpdUser.trim();
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
        this.remark = remark == null ? null : remark.trim();
    }
}