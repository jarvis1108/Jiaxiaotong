package com.dxtwangxiao.strongestsuperscholar.module.question.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Devin
 * 2018-06-25 上午 10:39
 */
@Entity
@Table(name = "t_QST_Question")
public class Question {
    private String questionId;
    private String questionNo;
    private String questionCode;
    private String questionTypeId;
    private String knowledgeId;
    private String gradeId;
    private String courseId;
    private String question;
    private String provider;
    private String personInCharge;
    private String reference;
    private Integer questionLevel;
    private Double difficulty;
    private Double coinWeight;
    private Double gpWeight;
    private String questionAnalyze;
    private Integer recommendTime;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;

    public Question() {
    }

    public Question(String questionId, String questionNo, String questionCode, String questionTypeId, String knowledgeId, String gradeId, String courseId, String question, String provider, String personInCharge, String reference, Integer questionLevel, Double difficulty, Double coinWeight, Double gpWeight, String questionAnalyze, Integer recommendTime, Timestamp createTime, String createUser, Timestamp lastUpdTime, String lastUpdUser, Byte isValid, String remark) {
        this.questionId = questionId;
        this.questionNo = questionNo;
        this.questionCode = questionCode;
        this.questionTypeId = questionTypeId;
        this.knowledgeId = knowledgeId;
        this.gradeId = gradeId;
        this.courseId = courseId;
        this.question = question;
        this.provider = provider;
        this.personInCharge = personInCharge;
        this.reference = reference;
        this.questionLevel = questionLevel;
        this.difficulty = difficulty;
        this.coinWeight = coinWeight;
        this.gpWeight = gpWeight;
        this.questionAnalyze = questionAnalyze;
        this.recommendTime = recommendTime;
        this.createTime = createTime;
        this.createUser = createUser;
        this.lastUpdTime = lastUpdTime;
        this.lastUpdUser = lastUpdUser;
        this.isValid = isValid;
        this.remark = remark;
    }

    @Id
    @Column(name = "QuestionID")
    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    @Basic
    @Column(name = "QuestionNo")
    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    @Basic
    @Column(name = "QuestionCode")
    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    @Basic
    @Column(name = "QuestionTypeID")
    public String getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(String questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    @Basic
    @Column(name = "KnowledgeID")
    public String getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
    }


    @Basic
    @Column(name = "Question")
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Basic
    @Column(name = "Provider")
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Basic
    @Column(name = "PersonInCharge")
    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    @Basic
    @Column(name = "Reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Basic
    @Column(name = "QuestionLevel")
    public Integer getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(Integer questionLevel) {
        this.questionLevel = questionLevel;
    }

    @Basic
    @Column(name = "Difficulty")
    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    @Basic
    @Column(name = "CoinWeight")
    public Double getCoinWeight() {
        return coinWeight;
    }

    public void setCoinWeight(Double coinWeight) {
        this.coinWeight = coinWeight;
    }

    @Basic
    @Column(name = "GPWeight")
    public Double getGpWeight() {
        return gpWeight;
    }

    public void setGpWeight(Double gpWeight) {
        this.gpWeight = gpWeight;
    }

    @Basic
    @Column(name = "QuestionAnalyze")
    public String getQuestionAnalyze() {
        return questionAnalyze;
    }

    public void setQuestionAnalyze(String questionAnalyze) {
        this.questionAnalyze = questionAnalyze;
    }

    @Basic
    @Column(name = "RecommendTime")
    public Integer getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Integer recommendTime) {
        this.recommendTime = recommendTime;
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

    @Basic
    @Column(name = "GradeID")
    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }
    @Basic
    @Column(name = "CourseID")
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(getQuestionId(), question1.getQuestionId()) &&
                Objects.equals(getQuestionNo(), question1.getQuestionNo()) &&
                Objects.equals(getQuestionCode(), question1.getQuestionCode()) &&
                Objects.equals(getQuestionTypeId(), question1.getQuestionTypeId()) &&
                Objects.equals(getKnowledgeId(), question1.getKnowledgeId()) &&
                Objects.equals(getGradeId(), question1.getGradeId()) &&
                Objects.equals(getCourseId(), question1.getCourseId()) &&
                Objects.equals(getQuestion(), question1.getQuestion()) &&
                Objects.equals(getProvider(), question1.getProvider()) &&
                Objects.equals(getPersonInCharge(), question1.getPersonInCharge()) &&
                Objects.equals(getReference(), question1.getReference()) &&
                Objects.equals(getQuestionLevel(), question1.getQuestionLevel()) &&
                Objects.equals(getDifficulty(), question1.getDifficulty()) &&
                Objects.equals(getCoinWeight(), question1.getCoinWeight()) &&
                Objects.equals(getGpWeight(), question1.getGpWeight()) &&
                Objects.equals(getQuestionAnalyze(), question1.getQuestionAnalyze()) &&
                Objects.equals(getRecommendTime(), question1.getRecommendTime()) &&
                Objects.equals(getCreateTime(), question1.getCreateTime()) &&
                Objects.equals(getCreateUser(), question1.getCreateUser()) &&
                Objects.equals(getLastUpdTime(), question1.getLastUpdTime()) &&
                Objects.equals(getLastUpdUser(), question1.getLastUpdUser()) &&
                Objects.equals(getIsValid(), question1.getIsValid()) &&
                Objects.equals(getRemark(), question1.getRemark());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestionId(), getQuestionNo(), getQuestionCode(), getQuestionTypeId(), getKnowledgeId(), getGradeId(), getCourseId(), getQuestion(), getProvider(), getPersonInCharge(), getReference(), getQuestionLevel(), getDifficulty(), getCoinWeight(), getGpWeight(), getQuestionAnalyze(), getRecommendTime(), getCreateTime(), getCreateUser(), getLastUpdTime(), getLastUpdUser(), getIsValid(), getRemark());
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId='" + questionId + '\'' +
                ", questionNo='" + questionNo + '\'' +
                ", questionCode='" + questionCode + '\'' +
                ", questionTypeId='" + questionTypeId + '\'' +
                ", knowledgeId='" + knowledgeId + '\'' +
                ", gradeId='" + gradeId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", question='" + question + '\'' +
                ", provider='" + provider + '\'' +
                ", personInCharge='" + personInCharge + '\'' +
                ", reference='" + reference + '\'' +
                ", questionLevel=" + questionLevel +
                ", difficulty=" + difficulty +
                ", coinWeight=" + coinWeight +
                ", gpWeight=" + gpWeight +
                ", questionAnalyze='" + questionAnalyze + '\'' +
                ", recommendTime=" + recommendTime +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                '}';
    }
}
