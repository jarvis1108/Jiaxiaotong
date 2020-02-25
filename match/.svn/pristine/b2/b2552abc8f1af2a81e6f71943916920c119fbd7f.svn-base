package com.dxtwangxiao.strongestsuperscholar.module.system.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 管理员角色设置
 * <p>
 * Created by Devin
 * 2018-06-25 上午 10:59
 */
@Entity
@Table(name = "t_SYS_AdminPurview")
public class AdminPurview {
    private String adminPurviewId;//管理员角色名ID
    private String adminId;//管理员ID
    private String adminNo;//管理员编码
    private String adminRoleId;//管理员角色ID
    private String adminRoleNo;//管理员角色编码
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "AdminPurviewID")
    public String getAdminPurviewId() {
        return adminPurviewId;
    }

    public void setAdminPurviewId(String adminPurviewId) {
        this.adminPurviewId = adminPurviewId;
    }

    @Basic
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
    @Column(name = "AdminRoleID")
    public String getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(String adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    @Basic
    @Column(name = "AdminRoleNo")
    public String getAdminRoleNo() {
        return adminRoleNo;
    }

    public void setAdminRoleNo(String adminRoleNo) {
        this.adminRoleNo = adminRoleNo;
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
        return "AdminPurview{" +
                "adminPurviewId='" + adminPurviewId + '\'' +
                ", adminId='" + adminId + '\'' +
                ", adminNo='" + adminNo + '\'' +
                ", adminRoleId='" + adminRoleId + '\'' +
                ", adminRoleNo='" + adminRoleNo + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
