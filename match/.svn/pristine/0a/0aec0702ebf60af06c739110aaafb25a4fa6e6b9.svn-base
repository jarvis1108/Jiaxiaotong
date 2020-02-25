package com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @auther: shenhao
 * @descripition: 题库题目表
 * @date 2018\8\15 0015
 */
@Entity
@Table(name = "t_QST_QuestionForLib")
public class QuestionForLib {

    private String questionForLibId;//试题ID
    private String questionForLibNo;//试题
    private String questionForLibCode;//题目编号
    private String questionLibId;//私有题库ID
    private String questionLibNo;//题库编码
    private Byte isPublic;//是否公开：1：公开，0：不公开，默认0
    private String questionTypeID;//试题类型ID
    private String knowledgeId;//知识点ID
    private String courseId;//课程ID
    private String gradeId;//年级ID
    private String question;//问题
    private String provider;//提供者
    private String personInCharge;//负责人
    private String reference;//引用出处
    private Integer questionLevel;//级别
    private Double difficulty;//难度系数
    private Double coinWeight;//金币权值
    private Double gpWeight;//绩点权值
    private String questionAnalyze;//解析
    private Integer recommendTime;//推荐答题时间，以秒为单位
    private String fromQuestionId;//来自试题ID
    private String fromQuestionNo;//来自试题编码
    private Timestamp createTime;
    private String createUser;
    private Timestamp lastUpdTime;
    private String lastUpdUser;
    private Byte isValid;
    private String remark;//备注说明
    private Byte isFromQuestion;//是否来自试题：1：来自试题，0：不是来自试题，默认0

    public QuestionForLib(){}

    public QuestionForLib(String questionForLibId, String questionForLibNo, String questionForLibCode, String questionLibId, String questionLibNo, Byte isPublic, String questionTypeID, String knowledgeId, String courseId, String gradeId, String question, String provider, String personInCharge, String reference, Integer questionLevel, Double difficulty, Double coinWeight, Double gpWeight, String questionAnalyze, Integer recommendTime, String fromQuestionId, String fromQuestionNo, Timestamp createTime, String createUser, Timestamp lastUpdTime, String lastUpdUser, Byte isValid, String remark, Byte isFromQuestion) {
        this.questionForLibId = questionForLibId;
        this.questionForLibNo = questionForLibNo;
        this.questionForLibCode = questionForLibCode;
        this.questionLibId = questionLibId;
        this.questionLibNo = questionLibNo;
        this.isPublic = isPublic;
        this.questionTypeID = questionTypeID;
        this.knowledgeId = knowledgeId;
        this.courseId = courseId;
        this.gradeId = gradeId;
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
        this.fromQuestionId = fromQuestionId;
        this.fromQuestionNo = fromQuestionNo;
        this.createTime = createTime;
        this.createUser = createUser;
        this.lastUpdTime = lastUpdTime;
        this.lastUpdUser = lastUpdUser;
        this.isValid = isValid;
        this.remark = remark;
        this.isFromQuestion = isFromQuestion;
    }

    @Id
    @Column(name = "QuestionForLibId")
    public String getQuestionForLibId() {
        return questionForLibId;
    }

    public void setQuestionForLibId(String questionForLibId) {
        this.questionForLibId = questionForLibId;
    }
    @Basic
    @Column(name = "QuestionForLibNo")
    public String getQuestionForLibNo() {
        return questionForLibNo;
    }

    public void setQuestionForLibNo(String questionForLibNo) {
        this.questionForLibNo = questionForLibNo;
    }
    @Basic
    @Column(name = "QuestionForLibCode")
    public String getQuestionForLibCode() {
        return questionForLibCode;
    }

    public void setQuestionForLibCode(String questionForLibCode) {
        this.questionForLibCode = questionForLibCode;
    }
    @Basic
    @Column(name = "QuestionLibId")
    public String getQuestionLibId() {
        return questionLibId;
    }

    public void setQuestionLibId(String questionLibId) {
        this.questionLibId = questionLibId;
    }
    @Basic
    @Column(name = "QuestionLibNo")
    public String getQuestionLibNo() {
        return questionLibNo;
    }

    public void setQuestionLibNo(String questionLibNo) {
        this.questionLibNo = questionLibNo;
    }
    @Basic
    @Column(name = "IsPublic")
    public Byte getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Byte isPublic) {
        this.isPublic = isPublic;
    }
    @Basic
    @Column(name = "QuestionTypeID")
    public String getQuestionTypeID() {
        return questionTypeID;
    }

    public void setQuestionTypeID(String questionTypeID) {
        this.questionTypeID = questionTypeID;
    }
    @Basic
    @Column(name = "KnowledgeId")
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
    @Column(name = "GpWeight")
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
    @Column(name = "FromQuestionId")
    public String getFromQuestionId() {
        return fromQuestionId;
    }

    public void setFromQuestionId(String fromQuestionId) {
        this.fromQuestionId = fromQuestionId;
    }
    @Basic
    @Column(name = "FromQuestionNo")
    public String getFromQuestionNo() {
        return fromQuestionNo;
    }

    public void setFromQuestionNo(String fromQuestionNo) {
        this.fromQuestionNo = fromQuestionNo;
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
    @Column(name = "IsFromQuestion")
    public Byte getIsFromQuestion() {
        return isFromQuestion;
    }

    public void setIsFromQuestion(Byte isFromQuestion) {
        this.isFromQuestion = isFromQuestion;
    }

    @Basic
    @Column(name = "CourseID")
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    @Basic
    @Column(name = "GradeID")
    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    @Override
    public String toString() {
        return "QuestionForLib{" +
                "questionForLibId='" + questionForLibId + '\'' +
                ", questionForLibNo='" + questionForLibNo + '\'' +
                ", questionForLibCode='" + questionForLibCode + '\'' +
                ", questionLibId='" + questionLibId + '\'' +
                ", questionLibNo='" + questionLibNo + '\'' +
                ", isPublic=" + isPublic +
                ", questionTypeID='" + questionTypeID + '\'' +
                ", knowledgeId='" + knowledgeId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", gradeId='" + gradeId + '\'' +
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
                ", fromQuestionId='" + fromQuestionId + '\'' +
                ", fromQuestionNo='" + fromQuestionNo + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", lastUpdTime=" + lastUpdTime +
                ", lastUpdUser='" + lastUpdUser + '\'' +
                ", isValid=" + isValid +
                ", remark='" + remark + '\'' +
                ", isFromQuestion=" + isFromQuestion +
                '}';
    }
}
