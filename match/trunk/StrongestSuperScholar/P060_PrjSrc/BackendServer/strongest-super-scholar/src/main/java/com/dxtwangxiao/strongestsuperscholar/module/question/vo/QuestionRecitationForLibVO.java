package com.dxtwangxiao.strongestsuperscholar.module.question.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Created by 孙伟浩 on 2018/9/7.
 */

@Entity
@Table(name = "V_QuestionRecitationForLib")
public class QuestionRecitationForLibVO {

    @Id
    @Column(name = "QuestionForLibID")
    private String questionForLibID;

    @Column(name = "QuestionForLibNo")
    private String questionForLibNo;

    @Column(name = "QuestionForLibCode")
    private String questionForLibCode;

    @Column(name = "QuestionLibID")
    private String questionLibID;

    @Column(name = "Question")
    private String question;

    @Column(name = "QuestionAnalyze")
    private String questionAnalyze;

    @Column(name = "Answer")
    private String answer;

    @Column(name = "Part")
    private String part;

    @Column(name = "IsPartial")
    private Byte isPartial;

    @Column(name = "Reference")
    private String reference;

    @Column(name = "Difficulty")
    private Double difficulty;

    @Column(name = "CoinWeight")
    private Double coinWeight;

    @Column(name = "GPWeight")
    private Double gpWeight;

    @Column(name = "RecommendTime")
    private Integer recommendTime;

    @Column(name = "QuestionLevel")
    private Integer questionLevel;

    @Column(name = "KnowledgeID")
    private String knowledgeID;

    @Column(name = "KnowledgeContent")
    private String knowledgeContent;

    @Column(name = "SubjectID")
    private String subjectID;

    @Column(name = "SubjectName")
    private String subjectName;

    @Column(name = "SubjectShortName")
    private String subjectShortName;

    @Column(name = "CourseID")
    private String courseID;

    @Column(name = "CourseName")
    private String courseName;

    @Column(name = "CourseShortName")
    private String courseShortName;

    @Column(name = "GradeID")
    private String gradeID;

    @Column(name = "GradeName")
    private String gradeName;

    @Column(name = "GradeShortName")
    private String gradeShortName;

    public Byte getIsPartial() {
        return isPartial;
    }

    public void setIsPartial(Byte isPartial) {
        this.isPartial = isPartial;
    }

    public String getQuestionForLibID() {
        return questionForLibID;
    }

    public void setQuestionForLibID(String questionForLibID) {
        this.questionForLibID = questionForLibID;
    }

    public String getQuestionForLibNo() {
        return questionForLibNo;
    }

    public void setQuestionForLibNo(String questionForLibNo) {
        this.questionForLibNo = questionForLibNo;
    }

    public String getQuestionForLibCode() {
        return questionForLibCode;
    }

    public void setQuestionForLibCode(String questionForLibCode) {
        this.questionForLibCode = questionForLibCode;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public Double getCoinWeight() {
        return coinWeight;
    }

    public void setCoinWeight(double coinWeight) {
        this.coinWeight = coinWeight;
    }

    public Double getGpWeight() {
        return gpWeight;
    }

    public void setGpWeight(double gpWeight) {
        this.gpWeight = gpWeight;
    }

    public Integer getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(int recommendTime) {
        this.recommendTime = recommendTime;
    }

    public Integer getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(int questionLevel) {
        this.questionLevel = questionLevel;
    }

    public String getKnowledgeID() {
        return knowledgeID;
    }

    public void setKnowledgeID(String knowledgeID) {
        this.knowledgeID = knowledgeID;
    }

    public String getKnowledgeContent() {
        return knowledgeContent;
    }

    public void setKnowledgeContent(String knowledgeContent) {
        this.knowledgeContent = knowledgeContent;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
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

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseShortName() {
        return courseShortName;
    }

    public void setCourseShortName(String courseShortName) {
        this.courseShortName = courseShortName;
    }

    public String getGradeID() {
        return gradeID;
    }

    public void setGradeID(String gradeID) {
        this.gradeID = gradeID;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradeShortName() {
        return gradeShortName;
    }

    public void setGradeShortName(String gradeShortName) {
        this.gradeShortName = gradeShortName;
    }

    public String getQuestionLibID() {
        return questionLibID;
    }

    public void setQuestionLibID(String questionLibID) {
        this.questionLibID = questionLibID;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public void setCoinWeight(Double coinWeight) {
        this.coinWeight = coinWeight;
    }

    public void setGpWeight(Double gpWeight) {
        this.gpWeight = gpWeight;
    }

    public void setRecommendTime(Integer recommendTime) {
        this.recommendTime = recommendTime;
    }

    public void setQuestionLevel(Integer questionLevel) {
        this.questionLevel = questionLevel;
    }

    @Override
    public String toString() {
        return "QuestionRecitationForLibVO{" +
                "questionForLibID='" + questionForLibID + '\'' +
                ", questionForLibNo='" + questionForLibNo + '\'' +
                ", questionForLibCode='" + questionForLibCode + '\'' +
                ", questionLibID='" + questionLibID + '\'' +
                ", question='" + question + '\'' +
                ", questionAnalyze='" + questionAnalyze + '\'' +
                ", answer='" + answer + '\'' +
                ", reference='" + reference + '\'' +
                ", difficulty=" + difficulty +
                ", coinWeight=" + coinWeight +
                ", gpWeight=" + gpWeight +
                ", recommendTime=" + recommendTime +
                ", questionLevel=" + questionLevel +
                ", knowledgeID='" + knowledgeID + '\'' +
                ", knowledgeContent='" + knowledgeContent + '\'' +
                ", subjectID='" + subjectID + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectShortName='" + subjectShortName + '\'' +
                ", courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseShortName='" + courseShortName + '\'' +
                ", gradeID='" + gradeID + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", gradeShortName='" + gradeShortName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionRecitationForLibVO that = (QuestionRecitationForLibVO) o;
        return Objects.equals(getQuestionForLibID(), that.getQuestionForLibID()) &&
                Objects.equals(getQuestionForLibNo(), that.getQuestionForLibNo()) &&
                Objects.equals(getQuestionForLibCode(), that.getQuestionForLibCode()) &&
                Objects.equals(getQuestionLibID(), that.getQuestionLibID()) &&
                Objects.equals(getQuestion(), that.getQuestion()) &&
                Objects.equals(getQuestionAnalyze(), that.getQuestionAnalyze()) &&
                Objects.equals(getAnswer(), that.getAnswer()) &&
                Objects.equals(getReference(), that.getReference()) &&
                Objects.equals(getDifficulty(), that.getDifficulty()) &&
                Objects.equals(getCoinWeight(), that.getCoinWeight()) &&
                Objects.equals(getGpWeight(), that.getGpWeight()) &&
                Objects.equals(getRecommendTime(), that.getRecommendTime()) &&
                Objects.equals(getQuestionLevel(), that.getQuestionLevel()) &&
                Objects.equals(getKnowledgeID(), that.getKnowledgeID()) &&
                Objects.equals(getKnowledgeContent(), that.getKnowledgeContent()) &&
                Objects.equals(getSubjectID(), that.getSubjectID()) &&
                Objects.equals(getSubjectName(), that.getSubjectName()) &&
                Objects.equals(getSubjectShortName(), that.getSubjectShortName()) &&
                Objects.equals(getCourseID(), that.getCourseID()) &&
                Objects.equals(getCourseName(), that.getCourseName()) &&
                Objects.equals(getCourseShortName(), that.getCourseShortName()) &&
                Objects.equals(getGradeID(), that.getGradeID()) &&
                Objects.equals(getGradeName(), that.getGradeName()) &&
                Objects.equals(getGradeShortName(), that.getGradeShortName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestionForLibID(), getQuestionForLibNo(), getQuestionForLibCode(), getQuestionLibID(), getQuestion(), getQuestionAnalyze(), getAnswer(), getReference(), getDifficulty(), getCoinWeight(), getGpWeight(), getRecommendTime(), getQuestionLevel(), getKnowledgeID(), getKnowledgeContent(), getSubjectID(), getSubjectName(), getSubjectShortName(), getCourseID(), getCourseName(), getCourseShortName(), getGradeID(), getGradeName(), getGradeShortName());
    }
}
