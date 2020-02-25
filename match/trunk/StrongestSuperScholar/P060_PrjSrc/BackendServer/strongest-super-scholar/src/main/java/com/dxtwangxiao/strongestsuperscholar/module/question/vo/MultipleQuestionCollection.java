package com.dxtwangxiao.strongestsuperscholar.module.question.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created By Devin
 * 2018-09-04 上午 10:43
 */
@Entity
@Table(name = "V_MultipleQuestionCollection")
public class MultipleQuestionCollection {
    @Id
    @Column(name = "QuestionCollectionID")
    private String questionCollectionId;

    @Column(name = "QuestionCollectionNo")
    private String questionCollectionNo;

    @Column(name = "UserID")
    private String userId;

    @Column(name = "QuestionID")
    private String questionId;

    @Column(name = "QuestionNo")
    private String questionNo;

    @Column(name = "QuestionCode")
    private String questionCode;

    @Column(name = "Question")
        private String question;

    @Column(name = "ChoiceA")
    private String choiceA;

    @Column(name = "ChoiceB")
    private String choiceB;

    @Column(name = "ChoiceC")
    private String choiceC;

    @Column(name = "ChoiceD")
    private String choiceD;

    @Column(name = "Answer")
    private String answer;

    @Column(name = "Reference")
    private String reference;

    @Column(name = "QuestionLevel")
    private Integer questionLevel;

    @Column(name = "Difficulty")
    private Double difficulty;

    @Column(name = "CoinWeight")
    private Double coinWeight;

    @Column(name = "GPWeight")
    private Double gpWeight;

    @Column(name = "QuestionAnalyze")
    private String questionAnalyze;

    @Column(name = "KnowledgeID")
    private String knowledgeId;

    @Column(name = "Content")
    private String content;

    @Column(name = "SubjectID")
    private String subjectId;

    @Column(name = "SubjectName")
    private String subjectName;

    @Column(name = "SubjectShortName")
    private String subjectShortName;

    @Column(name = "CourseID")
    private String courseId;

    @Column(name = "CourseName")
    private String courseName;

    @Column(name = "CourseShortName")
    private String courseShortName;

    public String getQuestionCollectionId() {
        return questionCollectionId;
    }

    public void setQuestionCollectionId(String questionCollectionId) {
        this.questionCollectionId = questionCollectionId;
    }

    public String getQuestionCollectionNo() {
        return questionCollectionNo;
    }

    public void setQuestionCollectionNo(String questionCollectionNo) {
        this.questionCollectionNo = questionCollectionNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
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

    public Integer getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(Integer questionLevel) {
        this.questionLevel = questionLevel;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
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

    public String getQuestionAnalyze() {
        return questionAnalyze;
    }

    public void setQuestionAnalyze(String questionAnalyze) {
        this.questionAnalyze = questionAnalyze;
    }

    public String getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
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

    @Override
    public String toString() {
        return "MultipleQuestionCollection{" +
                "questionCollectionId='" + questionCollectionId + '\'' +
                ", questionCollectionNo='" + questionCollectionNo + '\'' +
                ", userId='" + userId + '\'' +
                ", questionId='" + questionId + '\'' +
                ", questionNo='" + questionNo + '\'' +
                ", questionCode='" + questionCode + '\'' +
                ", question='" + question + '\'' +
                ", choiceA='" + choiceA + '\'' +
                ", choiceB='" + choiceB + '\'' +
                ", choiceC='" + choiceC + '\'' +
                ", choiceD='" + choiceD + '\'' +
                ", answer='" + answer + '\'' +
                ", reference='" + reference + '\'' +
                ", questionLevel=" + questionLevel +
                ", difficulty=" + difficulty +
                ", coinWeight=" + coinWeight +
                ", gpWeight=" + gpWeight +
                ", questionAnalyze='" + questionAnalyze + '\'' +
                ", knowledgeId='" + knowledgeId + '\'' +
                ", content='" + content + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectShortName='" + subjectShortName + '\'' +
                ", courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseShortName='" + courseShortName + '\'' +
                '}';
    }
}
