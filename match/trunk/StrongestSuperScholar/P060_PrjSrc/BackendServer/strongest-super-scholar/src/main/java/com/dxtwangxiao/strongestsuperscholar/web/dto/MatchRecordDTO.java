package com.dxtwangxiao.strongestsuperscholar.web.dto;

import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordQuestion;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordUser;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceVO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created By Devin
 * 2018-09-03 下午 07:51
 */
public class MatchRecordDTO implements Serializable {

    /* 战局基本信息 */
    private String matchRecordId;
    private String matchRecordNo;
    private Byte matchType;
    private Timestamp beginTime;
    private Timestamp endTime;
    private Integer matchPeriod;
    private String userId;
    private Byte fightStatus;
    private Integer userMaxCount;
    private Integer userFactCount;
    private String matchRule;
    private Timestamp createTime;
    private String createUser;

    /* 答完当前题目的人数 */
    @JsonIgnore
    private int answeredCount;

    /* 请求出题的人数 */
    @JsonIgnore
    private int requestQuestionUserCount;

    /* 战局得分信息 */
    @JsonIgnore
    private Map<String, Integer> matchScoreMap;

    @JsonIgnore
    private Map<String, UserDTO> matchScoreUser;



    /* 战局用户信息 */
    @JsonIgnore
    private List<UserDTO> userList;

    /* 战局试题信息 */
    @JsonIgnore
    private List<QuestionMultipleChoiceVO> questionList;



    /* 战局试题记录信息 */
    @JsonIgnore
    private Map<Integer, MatchRecordQuestion> matchRecordQuestionMap;

    /* 战局用户记录信息 */
    @JsonIgnore
    private Map<String, MatchRecordUser> matchRecordUserMap;

    {
        answeredCount = 0;
        userList = new ArrayList<>();
        questionList = new ArrayList<>();
        matchRecordQuestionMap = new ConcurrentHashMap<>();
        matchRecordUserMap = new ConcurrentHashMap<>();
        matchScoreMap = new ConcurrentHashMap<>();
        matchScoreUser = new ConcurrentHashMap<>();
    }

    @JsonIgnore
    public Map<String, UserDTO> getMatchScoreUser() {
        return matchScoreUser;
    }

    @JsonIgnore
    public int getAnsweredCount() {
        return answeredCount;
    }

    public void setAnsweredCount(int answeredCount) {
        this.answeredCount = answeredCount;
    }

    @JsonIgnore
    public int getRequestQuestionUserCount() {
        return requestQuestionUserCount;
    }

    public void setRequestQuestionUserCount(int requestQuestionUserCount) {
        this.requestQuestionUserCount = requestQuestionUserCount;
    }

    @JsonIgnore
    public Map<String, Integer> getMatchScoreMap() {
        return matchScoreMap;
    }

    @JsonIgnore
    public List<UserDTO> getUserList() {
        return userList;
    }

    @JsonIgnore
    public List<QuestionMultipleChoiceVO> getQuestionList() {
        return questionList;
    }

    @JsonIgnore
    public Map<Integer, MatchRecordQuestion> getMatchRecordQuestionMap() {
        return matchRecordQuestionMap;
    }

    public void setMatchScoreMap(Map<String, Integer> matchScoreMap) {
        this.matchScoreMap = matchScoreMap;
    }

    public Map<String, MatchRecordUser> getMatchRecordUserMap() {
        return matchRecordUserMap;
    }

    public String getMatchRecordId() {
        return matchRecordId;
    }

    public void setMatchRecordId(String matchRecordId) {
        this.matchRecordId = matchRecordId;
    }

    public String getMatchRecordNo() {
        return matchRecordNo;
    }

    public void setMatchRecordNo(String matchRecordNo) {
        this.matchRecordNo = matchRecordNo;
    }

    public Byte getMatchType() {
        return matchType;
    }

    public void setMatchType(Byte matchType) {
        this.matchType = matchType;
    }

    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getMatchPeriod() {
        return matchPeriod;
    }

    public void setMatchPeriod(Integer matchPeriod) {
        this.matchPeriod = matchPeriod;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Byte getFightStatus() {
        return fightStatus;
    }

    public void setFightStatus(Byte fightStatus) {
        this.fightStatus = fightStatus;
    }

    public Integer getUserMaxCount() {
        return userMaxCount;
    }

    public void setUserMaxCount(Integer userMaxCount) {
        this.userMaxCount = userMaxCount;
    }

    public Integer getUserFactCount() {
        return userFactCount;
    }

    public void setUserFactCount(Integer userFactCount) {
        this.userFactCount = userFactCount;
    }

    public String getMatchRule() {
        return matchRule;
    }

    public void setMatchRule(String matchRule) {
        this.matchRule = matchRule;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}