package com.dxtwangxiao.strongestsuperscholar.module.mall.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 订单记录实体类
 */
@Entity
@Table(name = "t_MAL_OrderRecord")
public class OrderRecord {
    private String orderRecordId;
    private String orderRecordNo;
    private String userId;
    private String productId;
    private String productNo;
    private Integer productAmount;
    private Double unit;
    private Double sumPrice;
    private Double actualSumPrice;
    private Byte purchaseWay;
    private String status;
    private String instruction;
    private Timestamp subscribeTime;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    public OrderRecord(){

    }

    public OrderRecord(String orderRecordId,String orderRecordNo,String userId,String productId,String productNo,
                       Integer productAmount,Double unit,Double sumPrice,Double actualSumPrice,Byte purchaseWay,
                       String status,String instruction,Timestamp subscribeTime,Timestamp createTime,String createUser,
                       Timestamp lastUpdTime,String lastUpdUser,Byte isValid,String remark){
        this.orderRecordId=orderRecordId;
        this.orderRecordNo=orderRecordNo;
        this.userId=userId;
        this.productId=productId;
        this.productNo=productNo;
        this.productAmount=productAmount;
        this.unit=unit;
        this.sumPrice=sumPrice;
        this.actualSumPrice=actualSumPrice;
        this.purchaseWay=purchaseWay;
        this.status=status;
        this.instruction=instruction;
        this.subscribeTime=subscribeTime;
        this.createTime=createTime;
        this.createUser=createUser;
        this.lastUpdTime=lastUpdTime;
        this.lastUpdUser=lastUpdUser;
        this.isValid=isValid;
        this.remark=remark;
    }

    @Id
    @Column(name = "OrderRecordID")
    public String getOrderRecordId() {
        return orderRecordId;
    }

    public void setOrderRecordId(String orderRecordId) {
        this.orderRecordId = orderRecordId;
    }

    @Basic
    @Column(name = "OrderRecordNo")
    public String getOrderRecordNo() {
        return orderRecordNo;
    }

    public void setOrderRecordNo(String orderRecordNo) {
        this.orderRecordNo = orderRecordNo;
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
    @Column(name = "ProductID")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "ProductNo")
    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    @Basic
    @Column(name = "ProductAmount")
    public Integer getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

    @Basic
    @Column(name = "Unit")
    public Double getUnit() {
        return unit;
    }

    public void setUnit(Double unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "SumPrice")
    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    @Basic
    @Column(name = "ActualSumPrice")
    public Double getActualSumPrice() {
        return actualSumPrice;
    }

    public void setActualSumPrice(Double actualSumPrice) {
        this.actualSumPrice = actualSumPrice;
    }

    @Basic
    @Column(name = "PurchaseWay")
    public Byte getPurchaseWay() {
        return purchaseWay;
    }

    public void setPurchaseWay(Byte purchaseWay) {
        this.purchaseWay = purchaseWay;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "Instruction")
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Basic
    @Column(name = "SubscribeTime")
    public Timestamp getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Timestamp subscribeTime) {
        this.subscribeTime = subscribeTime;
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
        return "OrderRecord{" +
                "orderRecordId='" + orderRecordId + '\'' +
                ", orderRecordNo='" + orderRecordNo + '\'' +
                ", userId='" + userId + '\'' +
                ", productId='" + productId + '\'' +
                ", productNo='" + productNo + '\'' +
                ", productAmount=" + productAmount +
                ", unit='" + unit + '\'' +
                ", sumPrice=" + sumPrice +
                ", actualSumPrice=" + actualSumPrice +
                ", purchaseWay=" + purchaseWay +
                ", status='" + status + '\'' +
                ", instruction='" + instruction + '\'' +
                ", subscribeTime=" + subscribeTime +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
