package com.dxtwangxiao.strongestsuperscholar.module.system.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 管理员
 * <p>
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_SYS_Admin")
public class Admin {
    private String adminId;//管理员ID
    private String adminNo;//管理员编码
    private String adminName;//管理员名
    private String account;//帐户
    private String adminPsw;//密码
    private Byte userLevel;//用户级别：0：超级管理员，1：一般管理员，2：业务员，3：题库贡献者
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "AdminID")
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "AdminNo")
    public String getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(String adminNo) {
        this.adminNo = adminNo;
    }

    @Basic
    @Column(name = "AdminName")
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Basic
    @Column(name = "Account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "AdminPsw")
    public String getAdminPsw() {
        return adminPsw;
    }

    public void setAdminPsw(String adminPsw) {
        this.adminPsw = adminPsw;
    }

    @Basic
    @Column(name = "UserLevel")
    public Byte getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Byte userLevel) {
        this.userLevel = userLevel;
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
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", adminNo='" + adminNo + '\'' +
                ", adminName='" + adminName + '\'' +
                ", account='" + account + '\'' +
                ", adminPsw='" + adminPsw + '\'' +
                ", userLevel=" + userLevel +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
