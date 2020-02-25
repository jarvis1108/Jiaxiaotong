package com.dxtwangxiao.strongestsuperscholar.module.mall.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 订单记录 视图对象
 * <p>
 * Created By Devin
 * 2018-09-01 下午 07:46
 */
@Entity
@Table(name = "V_OrderRecord")
public class OrderRecordVO {

    @Id
    @Column(name = "OrderRecordID")
    private String orderRecordId;

    @Column(name = "OrderRecordNo")
    private String orderRecordNo;

    @Column(name = "UserID")
    private String userId;

    @Column(name = "PurchaseWay")
    private Byte purchaseWay;

    @Column(name = "ProductID")
    private String productId;

    @Column(name = "ProductNo")
    private String productNo;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "ProductPrice")
    private Double productPrice;

    @Column(name = "ProductImage")
    private String productImage;

    @Column(name = "ProductDesc")
    private String productDesc;

    @Column(name = "SumPrice")
    private Double sumPrice;

    @Column(name = "ActualSumPrice")
    private Double actualSumPrice;

    @Column(name = "CreateTime")
    private Date createTime;

    public String getOrderRecordId() {
        return orderRecordId;
    }

    public void setOrderRecordId(String orderRecordId) {
        this.orderRecordId = orderRecordId;
    }

    public String getOrderRecordNo() {
        return orderRecordNo;
    }

    public void setOrderRecordNo(String orderRecordNo) {
        this.orderRecordNo = orderRecordNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Byte getPurchaseWay() {
        return purchaseWay;
    }

    public void setPurchaseWay(Byte purchaseWay) {
        this.purchaseWay = purchaseWay;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Double getActualSumPrice() {
        return actualSumPrice;
    }

    public void setActualSumPrice(Double actualSumPrice) {
        this.actualSumPrice = actualSumPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderRecordVO{" +
                "orderRecordId='" + orderRecordId + '\'' +
                ", orderRecordNo='" + orderRecordNo + '\'' +
                ", userId='" + userId + '\'' +
                ", purchaseWay=" + purchaseWay +
                ", productId='" + productId + '\'' +
                ", productNo='" + productNo + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productImage='" + productImage + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", sumPrice=" + sumPrice +
                ", actualSumPrice=" + actualSumPrice +
                ", createTime=" + createTime +
                '}';
    }
}