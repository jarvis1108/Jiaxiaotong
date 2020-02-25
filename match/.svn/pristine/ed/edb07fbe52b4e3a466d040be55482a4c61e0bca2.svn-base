package com.dxtwangxiao.strongestsuperscholar.module.community.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_COM_CommunityRole")
public class CommunityRole {
    private String communityRoleId;
    private String communityRoleName;
    private String level;
    private String description;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "CommunityRoleID")
    public String getCommunityRoleId() {
        return communityRoleId;
    }

    public void setCommunityRoleId(String communityRoleId) {
        this.communityRoleId = communityRoleId;
    }

    @Basic
    @Column(name = "CommunityRoleName")
    public String getCommunityRoleName() {
        return communityRoleName;
    }

    public void setCommunityRoleName(String communityRoleName) {
        this.communityRoleName = communityRoleName;
    }

    @Basic
    @Column(name = "Level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        CommunityRole that = (CommunityRole) o;
        return Objects.equals(communityRoleId, that.communityRoleId) &&
                Objects.equals(communityRoleName, that.communityRoleName) &&
                Objects.equals(level, that.level) &&
                Objects.equals(description, that.description) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(lastUpdTime, that.lastUpdTime) &&
                Objects.equals(lastUpdUser, that.lastUpdUser) &&
                Objects.equals(isValid, that.isValid) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(communityRoleId, communityRoleName, level, description, createTime, createUser, lastUpdTime, lastUpdUser, isValid, remark);
    }
}
