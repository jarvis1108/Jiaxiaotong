package com.dxtwangxiao.strongestsuperscholar.module.mall.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author 程志强
 * @date 2018/10/18 20:14
 * @Description TODO
 */
@Entity
@Table(name = "V_BackOrderRecord")
public class BackOrderRecordVO {

    private String orderRecordID;
    private String productName;
    private Integer productAmount;
    private Double productPrice;
    private Double sumPrice;
    private Double actualSumPrice;
    private Byte purchaseWay;
    private String wechatName;
    private String userId;
    private Timestamp createTime;
    private Byte isValid;
    private String status;

    @Id
    @Column(name = "OrderRecordID")
    public String getOrderRecordID() {
        return orderRecordID;
    }

    public void setOrderRecordID(String orderRecordID) {
        this.orderRecordID = orderRecordID;
    }

    @Column(name = "ProductName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Column(name = "ProductAmount")
    public Integer getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

    @Column(name = "ProductPrice")
    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Column(name = "SumPrice")
    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    @Column(name = "ActualSumPrice")
    public Double getActualSumPrice() {
        return actualSumPrice;
    }

    public void setActualSumPrice(Double actualSumPrice) {
        this.actualSumPrice = actualSumPrice;
    }

    @Column(name = "PurchaseWay")
    public Byte getPurchaseWay() {
        return purchaseWay;
    }

    public void setPurchaseWay(Byte purchaseWay) {
        this.purchaseWay = purchaseWay;
    }

    @Column(name = "WechatName")
    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }

    @Column(name = "userID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Column(name = "IsValid")
    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BackOrderRecordVO{" +
                "orderRecordID='" + orderRecordID + '\'' +
                ", productName='" + productName + '\'' +
                ", productAmount=" + productAmount +
                ", productPrice=" + productPrice +
                ", sumPrice=" + sumPrice +
                ", actualSumPrice=" + actualSumPrice +
                ", purchaseWay=" + purchaseWay +
                ", wechatName='" + wechatName + '\'' +
                ", userId='" + userId + '\'' +
                ", createTime=" + createTime +
                ", isValid=" + isValid +
                ", status='" + status + '\'' +
                '}';
    }
}
