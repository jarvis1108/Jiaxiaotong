package com.dxtwangxiao.strongestsuperscholar.module.system.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 管理员角色
 * <p>
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_SYS_AdminRole")
public class AdminRole {
    private String adminRoleId;//管理员角色ID
    private String adminRoleNo;//管理员角色编码
    private String adminRoleName;//答案
    private String purviewCode;//权限编码
    private Timestamp createTime;//
    private String createUser;//
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
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
    @Column(name = "AdminRoleName")
    public String getAdminRoleName() {
        return adminRoleName;
    }

    public void setAdminRoleName(String adminRoleName) {
        this.adminRoleName = adminRoleName;
    }

    @Basic
    @Column(name = "PurviewCode")
    public String getPurviewCode() {
        return purviewCode;
    }

    public void setPurviewCode(String purviewCode) {
        this.purviewCode = purviewCode;
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
        return "AdminRole{" +
                "adminRoleId='" + adminRoleId + '\'' +
                ", adminRoleNo='" + adminRoleNo + '\'' +
                ", adminRoleName='" + adminRoleName + '\'' +
                ", purviewCode='" + purviewCode + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
