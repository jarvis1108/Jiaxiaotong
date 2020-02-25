package com.dxtwangxiao.strongestsuperscholar.module.mall.entity;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * 商品信息表
 * <p>
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_MAL_ProductInfo")
public class ProductInfo {

    private String productId;
    private String productNo;
    private String productName;
    private Integer productValue;
    private String productImage;
    private String productDesc;
    private Double productPrice;
    private String productType;
    private String unitOfNumerator;
    private String unitOfDenominator;
    private Byte paymentType;
    private Date beginTime;
    private Date endTime;
    private Date createTime;
    private String createUser;
    private Date lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    public ProductInfo(){

    }

    public ProductInfo(String productId,String productNo,String productName,Integer productValue,String productImage,
                       String productDesc,String productType,Double productPrice,String unitOfNumerator,String unitOfDenominator,
                       Byte paymentType,Date beginTime,Date endTime,Date createTime,String createUser,Date lastUpdTime,
                       String lastUpdUser,Byte isValid,String remark){
        this.productId=productId;
        this.productNo=productNo;
        this.productName=productName;
        this.productValue=productValue;
        this.productImage=productImage;
        this.productDesc=productDesc;
        this.productPrice=productPrice;
        this.productType=productType;
        this.unitOfNumerator=unitOfNumerator;
        this.unitOfDenominator=unitOfDenominator;
        this.paymentType=paymentType;
        this.beginTime=beginTime;
        this.endTime=endTime;
        this.createTime=createTime;
        this.createUser=createUser;
        this.lastUpdTime=lastUpdTime;
        this.lastUpdUser=lastUpdUser;
        this.isValid=isValid;
        this.remark=remark;
    }

    @Id
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
    @Column(name = "ProductName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "ProductValue")
    public Integer getProductValue() {
        return productValue;
    }

    public void setProductValue(Integer productValue) {
        this.productValue = productValue;
    }

    @Basic
    @Column(name = "ProductImage")
    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    @Basic
    @Column(name = "ProductDesc")
    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Basic
    @Column(name = "ProductPrice")
    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "UnitOfNumerator")
    public String getUnitOfNumerator() {
        return unitOfNumerator;
    }

    public void setUnitOfNumerator(String basicAccountingUnit) {
        this.unitOfNumerator = basicAccountingUnit;
    }

    @Basic
    @Column(name = "UnitOfDenominator")
    public String getUnitOfDenominator() {
        return unitOfDenominator;
    }

    public void setUnitOfDenominator(String basicAccountingUnit) {
        this.unitOfDenominator = basicAccountingUnit;
    }

    @Basic
    @Column(name = "ProductType")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "PaymentType")
    public Byte getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Byte paymentType) {
        this.paymentType = paymentType;
    }

    @Basic
    @Column(name = "BeginTime")
    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    @Basic
    @Column(name = "EndTime")
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "CreateTime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
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
    public Date getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(Date lastUpdTime) {
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
        return "ProductInfo{" +
                "productId='" + productId + '\'' +
                ", productNo='" + productNo + '\'' +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", unitOfNumerator='" + unitOfNumerator + '\'' +
                ", unitOfDenominator='" + unitOfDenominator + '\'' +
                ", productPrice=" + productPrice +
                ", productType='" + productType + '\'' +
                ", paymentType=" + paymentType +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}