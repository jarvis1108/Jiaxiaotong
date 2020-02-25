package com.dxtwangxiao.strongestsuperscholar.module.base.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 等级经验关系
 * <p>
 * Created By Devin
 * 2018-08-27 下午 06:47
 */
@Entity
@Table(name = "t_BSD_LevelExperience")
public class LevelExperience {

    private String levelExperienceId;
    private String levelExperienceNo;
    private Integer level;
    private Integer experience;
    private Integer minExperience;
    private Integer maxExperience;
    private Date createTime;
    private String createUser;
    private Date lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "LevelExperienceID")
    public String getLevelExperienceId() {
        return levelExperienceId;
    }

    public void setLevelExperienceId(String levelExperienceId) {
        this.levelExperienceId = levelExperienceId;
    }

    @Basic
    @Column(name = "LevelExperienceNo")
    public String getLevelExperienceNo() {
        return levelExperienceNo;
    }

    public void setLevelExperienceNo(String levelExperienceNo) {
        this.levelExperienceNo = levelExperienceNo;
    }

    @Basic
    @Column(name = "Level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "Experience")
    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Basic
    @Column(name = "MinExperience")
    public Integer getMinExperience() {
        return minExperience;
    }

    public void setMinExperience(Integer minExperience) {
        this.minExperience = minExperience;
    }

    @Basic
    @Column(name = "MaxExperience")
    public Integer getMaxExperience() {
        return maxExperience;
    }

    public void setMaxExperience(Integer maxExperience) {
        this.maxExperience = maxExperience;
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
        return "LevelExperience{" +
                "levelExperienceId='" + levelExperienceId + '\'' +
                ", levelExperienceNo='" + levelExperienceNo + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", minExperience=" + minExperience +
                ", maxExperience=" + maxExperience +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
