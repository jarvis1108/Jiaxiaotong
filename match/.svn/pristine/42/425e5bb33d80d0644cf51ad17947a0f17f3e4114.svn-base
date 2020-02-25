package com.dxtwangxiao.strongestsuperscholar.module.community.vo;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.User;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @Auther: 程志强
 * @Date: 2018/9/9 23:35
 * @Description:显示社区视图的实体类
 */
@Entity
@Table(name = "V_CommunityInfo")
public class SpecialTrainingVO {

    @Id
    @Column(name = "UserID")
    private String userId;//用户id

    @Basic
    @Column(name = "WechatName")
    private String wechatName;//微信名，显示

    @Basic
    @Column(name = "LastUserID")
    private String lastUserId;//父节点，显示，即本人

    @Basic
    @Column(name = "CommunityRoleID")
    private String communityRoleId;

    @Basic
    @Column(name = "TreeNodeCode")
    private String treeNodeCode;

    @Basic
    @Column(name = "isLeafNode")
    private Byte isLeafNode;//是否是叶子节点，是否有下属

    @Basic
    @Column(name = "CommunityRoleName")
    private String communityRoleName;//团长，新兵，营长……

    @Basic
    @Column(name = "Level")
    private String level;//等级

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }

    public String getLastUserId() {
        return lastUserId;
    }

    public void setLastUserId(String lastUserId) {
        this.lastUserId = lastUserId;
    }

    public String getCommunityRoleId() {
        return communityRoleId;
    }

    public void setCommunityRoleId(String communityRoleId) {
        this.communityRoleId = communityRoleId;
    }

    public String getTreeNodeCode() {
        return treeNodeCode;
    }

    public void setTreeNodeCode(String treeNodeCode) {
        this.treeNodeCode = treeNodeCode;
    }

    public Byte getIsLeafNode() {
        return isLeafNode;
    }

    public void setIsLeafNode(Byte isLeafNode) {
        this.isLeafNode = isLeafNode;
    }

    public String getCommunityRoleName() {
        return communityRoleName;
    }

    public void setCommunityRoleName(String communityRoleName) {
        this.communityRoleName = communityRoleName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
