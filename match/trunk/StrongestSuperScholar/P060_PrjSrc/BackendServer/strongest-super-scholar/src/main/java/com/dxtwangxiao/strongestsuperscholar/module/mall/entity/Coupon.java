package com.dxtwangxiao.strongestsuperscholar.module.mall.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_MAL_Coupon")
public class Coupon {
    private String couponId;
    private String couponNo;
    private byte couponType;
    private Integer amount;
    private Timestamp beginTime;
    private Timestamp endTime;
    private Integer periodAmount;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "CouponID")
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    @Basic
    @Column(name = "CouponNo")
    public String getCouponNo() {
        return couponNo;
    }

    public void setCouponNo(String couponNo) {
        this.couponNo = couponNo;
    }

    @Basic
    @Column(name = "CouponType")
    public byte getCouponType() {
        return couponType;
    }

    public void setCouponType(byte couponType) {
        this.couponType = couponType;
    }

    @Basic
    @Column(name = "Amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "BeginTime")
    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    @Basic
    @Column(name = "EndTime")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "PeriodAmount")
    public Integer getPeriodAmount() {
        return periodAmount;
    }

    public void setPeriodAmount(Integer periodAmount) {
        this.periodAmount = periodAmount;
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
        Coupon coupon = (Coupon) o;
        return couponType == coupon.couponType &&
                Objects.equals(couponId, coupon.couponId) &&
                Objects.equals(couponNo, coupon.couponNo) &&
                Objects.equals(amount, coupon.amount) &&
                Objects.equals(beginTime, coupon.beginTime) &&
                Objects.equals(endTime, coupon.endTime) &&
                Objects.equals(periodAmount, coupon.periodAmount) &&
                Objects.equals(createTime, coupon.createTime) &&
                Objects.equals(createUser, coupon.createUser) &&
                Objects.equals(lastUpdTime, coupon.lastUpdTime) &&
                Objects.equals(lastUpdUser, coupon.lastUpdUser) &&
                Objects.equals(isValid, coupon.isValid) &&
                Objects.equals(remark, coupon.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(couponId, couponNo, couponType, amount, beginTime, endTime, periodAmount, createTime, createUser, lastUpdTime, lastUpdUser, isValid, remark);
    }
}
