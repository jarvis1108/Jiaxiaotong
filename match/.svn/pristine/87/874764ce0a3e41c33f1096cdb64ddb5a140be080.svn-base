package com.dxtwangxiao.strongestsuperscholar.module.system.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 匹配设置
 * <p>
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_SYS_MatchSetting")
public class MatchSetting {
    private String matchSettingId;//匹配设置ID
    private Integer maxMatchCount;//最长匹配次数
    private Integer matchTime;//单次匹配时长，以秒为单位
    private Timestamp createTime;
    private String createUser;
    private String lastUpdUser;
    private Timestamp lastUpdTime;
    private Byte isValid;
    private String remark;

    @Id
    @Column(name = "MatchSettingID")
    public String getMatchSettingId() {
        return matchSettingId;
    }

    public void setMatchSettingId(String matchSettingId) {
        this.matchSettingId = matchSettingId;
    }

    @Basic
    @Column(name = "MaxMatchCount")
    public Integer getMaxMatchCount() {
        return maxMatchCount;
    }

    public void setMaxMatchCount(Integer maxMatchCount) {
        this.maxMatchCount = maxMatchCount;
    }

    @Basic
    @Column(name = "MatchTime")
    public Integer getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Integer matchTime) {
        this.matchTime = matchTime;
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
    @Column(name = "LastUpdUser")
    public String getLastUpdUser() {
        return lastUpdUser;
    }

    public void setLastUpdUser(String lastUpdUser) {
        this.lastUpdUser = lastUpdUser;
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
        return "MatchSetting{" +
                "matchSettingId='" + matchSettingId + '\'' +
                ", maxMatchCount=" + maxMatchCount +
                ", matchTime=" + matchTime +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
