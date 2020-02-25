package com.dxtwangxiao.strongestsuperscholar.module.question.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "V_QuestionMultipleChoice")
public class QuestionMultipleChoiceVO implements Serializable {

    @Id
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

    @Column(name = "GradeID")
    private String gradeId;

    @Column(name = "GradeName")
    private String gradeName;

    @Column(name = "GradeShortName")
    private String gradeShortName;

    @Column(name = "QuestionTypeName")
    private String questionTypeName;

    @Column(name = "RecommendTime")
    private String recommendTime;

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

    public String getCourseShortName() {
        return courseShortName;
    }

    public void setCourseShortName(String courseShortName) {
        this.courseShortName = courseShortName;
    }

    public String getGradeShortName() {
        return gradeShortName;
    }

    public void setGradeShortName(String gradeShortName) {
        this.gradeShortName = gradeShortName;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(String recommendTime) {
        this.recommendTime = recommendTime;
    }
}
