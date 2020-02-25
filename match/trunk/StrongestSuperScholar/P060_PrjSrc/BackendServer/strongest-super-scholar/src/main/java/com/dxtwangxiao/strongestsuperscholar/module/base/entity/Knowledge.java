package com.dxtwangxiao.strongestsuperscholar.module.base.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_BSD_Knowledge")
public class Knowledge {
    private String knowledgeId;
    private String knowledgeParentId;
    private String subjectId;
    private String content;
    private String treeNodeNo;
    private Integer nodeLevel;
    private Byte isLeaf;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private String remark;
    private Byte isValid;

    @Id
    @Column(name = "KnowledgeID")
    public String getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    @Basic
    @Column(name = "KnowledgeParentID")
    public String getKnowledgeParentId() {
        return knowledgeParentId;
    }

    public void setKnowledgeParentId(String knowledgeParentId) {
        this.knowledgeParentId = knowledgeParentId;
    }

    @Basic
    @Column(name = "SubjectID")
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "TreeNodeNo")
    public String getTreeNodeNo() {
        return treeNodeNo;
    }

    public void setTreeNodeNo(String treeNodeNo) {
        this.treeNodeNo = treeNodeNo;
    }

    @Basic
    @Column(name = "NodeLevel")
    public Integer getNodeLevel() {
        return nodeLevel;
    }

    public void setNodeLevel(Integer nodeLevel) {
        this.nodeLevel = nodeLevel;
    }

    @Basic
    @Column(name = "IsLeaf")
    public Byte getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Byte isLeaf) {
        this.isLeaf = isLeaf;
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
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "IsValid")
    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knowledge knowledge = (Knowledge) o;
        return Objects.equals(knowledgeId, knowledge.knowledgeId) &&
                Objects.equals(knowledgeParentId, knowledge.knowledgeParentId) &&
                Objects.equals(subjectId, knowledge.subjectId) &&
                Objects.equals(content, knowledge.content) &&
                Objects.equals(treeNodeNo, knowledge.treeNodeNo) &&
                Objects.equals(nodeLevel, knowledge.nodeLevel) &&
                Objects.equals(isLeaf, knowledge.isLeaf) &&
                Objects.equals(createTime, knowledge.createTime) &&
                Objects.equals(createUser, knowledge.createUser) &&
                Objects.equals(lastUpdTime, knowledge.lastUpdTime) &&
                Objects.equals(lastUpdUser, knowledge.lastUpdUser) &&
                Objects.equals(remark, knowledge.remark) &&
                Objects.equals(isValid, knowledge.isValid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(knowledgeId, knowledgeParentId, subjectId, content, treeNodeNo, nodeLevel, isLeaf, createTime, createUser, lastUpdTime, lastUpdUser, remark, isValid);
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "knowledgeId='" + knowledgeId + '\'' +
                ", knowledgeParentId='" + knowledgeParentId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", content='" + content + '\'' +
                ", treeNodeNo='" + treeNodeNo + '\'' +
                ", nodeLevel=" + nodeLevel +
                ", isLeaf=" + isLeaf +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", remark='" + remark + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
