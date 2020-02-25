package com.dxtwangxiao.questionchecktool.dao;

import com.dxtwangxiao.questionchecktool.entity.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionMapper {

    int updateQuestion(@Param("questionID") String questionID, @Param("questionTitle") String questionTitle, @Param("questionAnalyze") String questionAnalyze, @Param("difficulty") Double difficulty);

    int deleteByPrimaryKey(String questionID);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(String questionID);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);

    List<Question> selectAllQuestions();

    int updateSubjectByQuestionId(@Param("questionID") String questionID, @Param("subjectID") String subjectID);

    int updateKnowledgeByQuestionId(@Param("questionID") String questionID, @Param("knowledgeID") String knowledgeID);
}