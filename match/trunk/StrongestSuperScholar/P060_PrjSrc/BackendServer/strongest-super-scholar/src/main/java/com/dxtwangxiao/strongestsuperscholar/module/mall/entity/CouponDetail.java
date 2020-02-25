package com.dxtwangxiao.strongestsuperscholar.module.mall.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 * 优惠券使用明细表
 */
@Entity
@Table(name = "t_MAL_CouponDetail")
public class CouponDetail {
    private String couponExchangeId;
    private String couponExchangeNo;
    private String couponId;
    private String couponNo;
    private String userId;
    private Timestamp beginTime;
    private Timestamp endTime;
    private String couponStatus;
    private String orderRecordId;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "CouponExchangeID")
    public String getCouponExchangeId() {
        return couponExchangeId;
    }

    public void setCouponExchangeId(String couponExchangeId) {
        this.couponExchangeId = couponExchangeId;
    }

    @Basic
    @Column(name = "CouponExchangeNo")
    public String getCouponExchangeNo() {
        return couponExchangeNo;
    }

    public void setCouponExchangeNo(String couponExchangeNo) {
        this.couponExchangeNo = couponExchangeNo;
    }

    @Basic
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
    @Column(name = "UserID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
    @Column(name = "CouponStatus")
    public String getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(String couponStatus) {
        this.couponStatus = couponStatus;
    }

    @Basic
    @Column(name = "OrderRecordId")
    public String getOrderRecordId() {
        return orderRecordId;
    }

    public void setOrderRecordId(String orderRecordId) {
        this.orderRecordId = orderRecordId;
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
        CouponDetail that = (CouponDetail) o;
        return Objects.equals(couponExchangeId, that.couponExchangeId) &&
                Objects.equals(couponExchangeNo, that.couponExchangeNo) &&
                Objects.equals(couponId, that.couponId) &&
                Objects.equals(couponNo, that.couponNo) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(beginTime, that.beginTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(couponStatus, that.couponStatus) &&
                Objects.equals(orderRecordId, that.orderRecordId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(lastUpdTime, that.lastUpdTime) &&
                Objects.equals(lastUpdUser, that.lastUpdUser) &&
                Objects.equals(isValid, that.isValid) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(couponExchangeId, couponExchangeNo, couponId, couponNo, userId, beginTime, endTime, couponStatus, orderRecordId, createTime, createUser, lastUpdTime, lastUpdUser, isValid, remark);
    }
}
