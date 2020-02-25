package com.dxtwangxiao.questionchecktool.entity;

import java.util.Date;

public class Knowledge {
    private String knowledgeID;

    private String treeNodeNo;

    private String initID;

    private String initNo;

    private Byte isCorrect;

    private String knowledgeParentID;

    private String subjectID;

    private String content;

    private Integer nodeLevel;

    private String fromCrawlerID;

    private String fromCrawlerKnowledgeID;

    private Byte isLeaf;

    private Date createTime;

    private String createUser;

    private Date lastUpdTime;

    private String lastUpdUser;

    private String remark;

    private Byte isValid;

    public String getKnowledgeID() {
        return knowledgeID;
    }

    public void setKnowledgeID(String knowledgeID) {
        this.knowledgeID = knowledgeID == null ? null : knowledgeID.trim();
    }

    public String getTreeNodeNo() {
        return treeNodeNo;
    }

    public void setTreeNodeNo(String treeNodeNo) {
        this.treeNodeNo = treeNodeNo == null ? null : treeNodeNo.trim();
    }

    public String getInitID() {
        return initID;
    }

    public void setInitID(String initID) {
        this.initID = initID == null ? null : initID.trim();
    }

    public String getInitNo() {
        return initNo;
    }

    public void setInitNo(String initNo) {
        this.initNo = initNo == null ? null : initNo.trim();
    }

    public Byte getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Byte isCorrect) {
        this.isCorrect = isCorrect;
    }

    public String getKnowledgeParentID() {
        return knowledgeParentID;
    }

    public void setKnowledgeParentID(String knowledgeParentID) {
        this.knowledgeParentID = knowledgeParentID == null ? null : knowledgeParentID.trim();
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID == null ? null : subjectID.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getNodeLevel() {
        return nodeLevel;
    }

    public void setNodeLevel(Integer nodeLevel) {
        this.nodeLevel = nodeLevel;
    }

    public Byte getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Byte isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(Date lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }

    public String getLastUpdUser() {
        return lastUpdUser;
    }

    public void setLastUpdUser(String lastUpdUser) {
        this.lastUpdUser = lastUpdUser == null ? null : lastUpdUser.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    public String getFromCrawlerID() {
        return fromCrawlerID;
    }

    public void setFromCrawlerID(String fromCrawlerID) {
        this.fromCrawlerID = fromCrawlerID;
    }

    public String getFromCrawlerKnowledgeID() {
        return fromCrawlerKnowledgeID;
    }

    public void setFromCrawlerKnowledgeID(String fromCrawlerKnowledgeID) {
        this.fromCrawlerKnowledgeID = fromCrawlerKnowledgeID;
    }
}