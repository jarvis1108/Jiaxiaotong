package com.dxtwangxiao.strongestsuperscholar.module.question.vo;

import javax.naming.Name;
import javax.persistence.*;

/**
 * Created by 孙伟浩 on 2018/10/10.
 */

@Entity
@Table(name = "V_QuestionRecitation")
public class QuestionRecitationVO {

    @Id
    @Column(name = "QuestionID")
    private String questionId;

    @Basic
    @Column(name = "QuestionNo")
    private String questionNo;

    @Basic
    @Column(name = "QuestionCode")
    private String questionCode;

    @Basic
    @Column(name = "KnowledgeID")
    private String knowledgeId;

    @Basic
    @Column(name = "GradeID")
    private String gradeId;

    @Basic
    @Column(name = "CourseID")
    private String courseId;

    @Basic
    @Column(name = "Question")
    private String question;

    @Basic
    @Column(name = "QuestionAnalyze")
    private String questionAnalyze;

    @Basic
    @Column(name = "QuestionLevel")
    private Integer questionLevel;

    @Basic
    @Column(name = "RecommendTime")
    private Integer recommendTime;

    @Basic
    @Column(name = "CoinWeight")
    private Double coinWeight;

    @Basic
    @Column(name = "GPWeight")
    private Double gpWeight;

    @Basic
    @Column(name = "Difficulty")
    private Double difficulty;

    @Basic
    @Column(name = "Reference")
    private String reference;

    @Basic
    @Column(name = "IsValid")
    private Byte isValid;

    @Basic
    @Column(name = "Answer")
    private String answer;

    @Basic
    @Column(name = "IsPartial")
    private Byte isPartial;

    @Basic
    @Column(name = "Part")
    private String part;

    @Basic
    @Column(name = "KnowledgeContent")
    private String knowledgeContent;

    @Basic
    @Column(name = "GradeName")
    private String gradeName;

    @Basic
    @Column(name = "GradeShortName")
    private String gradeShortName;

    @Basic
    @Column(name = "CourseName")
    private String courseName;

    @Basic
    @Column(name = "CourseShortName")
    private String courseShortName;

    @Basic
    @Column(name = "SubjectID")
    private String subjectId;

    @Basic
    @Column(name = "SubjectName")
    private String subjectName;

    @Basic
    @Column(name = "SubjectShortName")
    private String subjectShortName;

    @Basic
    @Column(name = "QuestionTypeName")
    private String questionTypeName;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestionAnalyze() {
        return questionAnalyze;
    }

    public void setQuestionAnalyze(String questionAnalyze) {
        this.questionAnalyze = questionAnalyze;
    }

    public Integer getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(Integer questionLevel) {
        this.questionLevel = questionLevel;
    }

    public Integer getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Integer recommendTime) {
        this.recommendTime = recommendTime;
    }

    public Double getCoinWeight() {
        return coinWeight;
    }

    public void setCoinWeight(Double coinWeight) {
        this.coinWeight = coinWeight;
    }

    public Double getGpWeight() {
        return gpWeight;
    }

    public void setGpWeight(Double gpWeight) {
        this.gpWeight = gpWeight;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Byte getIsPartial() {
        return isPartial;
    }

    public void setIsPartial(Byte isPartial) {
        this.isPartial = isPartial;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getGradeShortName() {
        return gradeShortName;
    }

    public void setGradeShortName(String gradeShortName) {
        this.gradeShortName = gradeShortName;
    }

    public String getCourseShortName() {
        return courseShortName;
    }

    public void setCourseShortName(String courseShortName) {
        this.courseShortName = courseShortName;
    }

    public String getQuestionTypeName() {
        return questionTypeName;
    }

    public void setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName;
    }

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    public String getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getKnowledgeContent() {
        return knowledgeContent;
    }

    public void setKnowledgeContent(String knowledgeContent) {
        this.knowledgeContent = knowledgeContent;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectShortName() {
        return subjectShortName;
    }

    public void setSubjectShortName(String subjectShortName) {
        this.subjectShortName = subjectShortName;
    }
}
