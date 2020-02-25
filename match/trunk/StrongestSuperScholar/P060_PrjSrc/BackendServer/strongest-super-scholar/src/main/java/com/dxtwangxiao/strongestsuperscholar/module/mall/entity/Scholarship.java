package com.dxtwangxiao.strongestsuperscholar.module.mall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * 奖学金
 * <p>
 * Created by 孙伟浩 on 2018/9/26.
 */
@Entity
@Table(name = "t_MAL_Scholarship")
public class Scholarship {

    @Id
    @Column(name = "ScholarshipID")
    private String scholarshipId;

    @Column(name = "ScholarshipNo")
    private String scholarshipNo;

    @Column(name = "ScholarshipCode")
    private String scholarshipCode;

    @Column(name = "ScholarshipName")
    private String scholarshipName;

    @Column(name = "ScholarshipImage")
    private String scholarshipImage;

    @Column(name = "Amount")
    private Integer amount;

    @Column(name = "AcquiredGP")
    private Integer acquiredGP;

    @Column(name = "CreateTime")
    private Timestamp createTime;

    @Column(name = "CreateUser")
    private String createUser;

    @Column(name = "LastUpdTime")
    private Timestamp lastUpdTime;

    @Column(name = "LastUpdUser")
    private String lastUpdUser;

    @Column(name = "IsValid")
    private Byte isValid;

    @Column(name = "Remark")
    private String remark;

    public String getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(String scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getScholarshipNo() {
        return scholarshipNo;
    }

    public void setScholarshipNo(String scholarshipNo) {
        this.scholarshipNo = scholarshipNo;
    }

    public String getScholarshipCode() {
        return scholarshipCode;
    }

    public void setScholarshipCode(String scholarshipCode) {
        this.scholarshipCode = scholarshipCode;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }

    public String getScholarshipImage() {
        return scholarshipImage;
    }

    public void setScholarshipImage(String scholarshipImage) {
        this.scholarshipImage = scholarshipImage;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAcquiredGP() {
        return acquiredGP;
    }

    public void setAcquiredGP(Integer acquiredGP) {
        this.acquiredGP = acquiredGP;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Timestamp getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(Timestamp lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }

    public String getLastUpdUser() {
        return lastUpdUser;
    }

    public void setLastUpdUser(String lastUpdUser) {
        this.lastUpdUser = lastUpdUser;
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
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Scholarship{" +
                "scholarshipId='" + scholarshipId + '\'' +
                ", scholarshipNo='" + scholarshipNo + '\'' +
                ", scholarshipCode='" + scholarshipCode + '\'' +
                ", scholarshipName='" + scholarshipName + '\'' +
                ", scholarshipImage='" + scholarshipImage + '\'' +
                ", amount=" + amount +
                ", acquiredGP=" + acquiredGP +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
