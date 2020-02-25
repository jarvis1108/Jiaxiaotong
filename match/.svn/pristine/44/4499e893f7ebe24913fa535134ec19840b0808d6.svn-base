package com.dxtwangxiao.strongestsuperscholar.module.community.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_COM_SpecialTraining")
public class SpecialTraining {
    private String specialTrainingId;
    private String specialTrainingName;
    private String userId;
    private String userNo;
    private String lastUserId;
    private String communityRoleId;
    private String treeNodeCode;
    private Byte isLeafNode;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "SpecialTrainingID")
    public String getSpecialTrainingId() {
        return specialTrainingId;
    }

    public void setSpecialTrainingId(String specialTrainingId) {
        this.specialTrainingId = specialTrainingId;
    }

    @Basic
    @Column(name = "SpecialTrainingName")
    public String getSpecialTrainingName() {
        return specialTrainingName;
    }

    public void setSpecialTrainingName(String specialTrainingName) {
        this.specialTrainingName = specialTrainingName;
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
    @Column(name = "UserNo")
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "LastUserID")
    public String getLastUserId() {
        return lastUserId;
    }

    public void setLastUserId(String lastUserId) {
        this.lastUserId = lastUserId;
    }

    @Basic
    @Column(name = "CommunityRoleID")
    public String getCommunityRoleId() {
        return communityRoleId;
    }

    public void setCommunityRoleId(String communityRoleId) {
        this.communityRoleId = communityRoleId;
    }

    @Basic
    @Column(name = "TreeNodeCode")
    public String getTreeNodeCode() {
        return treeNodeCode;
    }

    public void setTreeNodeCode(String treeNodeCode) {
        this.treeNodeCode = treeNodeCode;
    }

    @Basic
    @Column(name = "IsLeafNode")
    public Byte getIsLeafNode() {
        return isLeafNode;
    }

    public void setIsLeafNode(Byte isLeafNode) {
        this.isLeafNode = isLeafNode;
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
        SpecialTraining that = (SpecialTraining) o;
        return Objects.equals(specialTrainingId, that.specialTrainingId) &&
                Objects.equals(specialTrainingName, that.specialTrainingName) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(userNo, that.userNo) &&
                Objects.equals(lastUserId, that.lastUserId) &&
                Objects.equals(communityRoleId, that.communityRoleId) &&
                Objects.equals(treeNodeCode, that.treeNodeCode) &&
                Objects.equals(isLeafNode, that.isLeafNode) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(lastUpdTime, that.lastUpdTime) &&
                Objects.equals(lastUpdUser, that.lastUpdUser) &&
                Objects.equals(isValid, that.isValid) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(specialTrainingId, specialTrainingName, userId, userNo, lastUserId, communityRoleId, treeNodeCode, isLeafNode, createTime, createUser, lastUpdTime, lastUpdUser, isValid, remark);
    }
}
