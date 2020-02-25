package com.dxtwangxiao.strongestsuperscholar.module.base.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**

/**
 * @Author: meiyu
 * @Date: 2018/7/13 14:45
 * 版本信息表实体
 */
@Entity
@Table(name = "t_BSD_BookVerInfo")
public class BookVerInfo {
    private String bookVerId;
    private String bookVerNo;
    private String bookVerCode;
    private String bookVerName;
    private String bookVerShortName;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "BookVerId")
    public String getBookVerId() {
        return bookVerId;
    }

    public void setBookVerId(String bookVerId) {
        this.bookVerId = bookVerId;
    }

    @Basic
    @Column(name = "BookVerNo")
    public String getBookVerNo() {
        return bookVerNo;
    }

    public void setBookVerNo(String bookVerNo) {
        this.bookVerNo = bookVerNo;
    }
    @Basic
    @Column(name = "BookVerCode")
    public String getBookVerCode() {
        return bookVerCode;
    }

    public void setBookVerCode(String bookVerCode) {
        this.bookVerCode = bookVerCode;
    }
    @Basic
    @Column(name = "BookVerName")
    public String getBookVerName() {
        return bookVerName;
    }

    public void setBookVerName(String bookVerName) {
        this.bookVerName = bookVerName;
    }
    @Basic
    @Column(name = "BookVerShortName")
    public String getBookVerShortName() {
        return bookVerShortName;
    }

    public void setBookVerShortName(String bookVerShortName) {
        this.bookVerShortName = bookVerShortName;
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
        BookVerInfo that = (BookVerInfo) o;
        return Objects.equals(bookVerId, that.bookVerId) && Objects.equals(bookVerNo, that.bookVerNo) && Objects.equals(bookVerCode, that.bookVerCode) && Objects.equals(bookVerName, that.bookVerName) && Objects.equals(bookVerShortName, that.bookVerShortName) && Objects.equals(createTime, that.createTime) && Objects.equals(createUser, that.createUser) && Objects.equals(lastUpdTime, that.lastUpdTime) && Objects.equals(lastUpdUser, that.lastUpdUser) && Objects.equals(isValid, that.isValid) && Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookVerId, bookVerNo, bookVerCode, bookVerName, bookVerShortName, createTime, createUser, lastUpdTime, lastUpdUser, isValid, remark);
    }
}
