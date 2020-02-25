package com.dxtwangxiao.questionchecktool.dao;

import com.dxtwangxiao.questionchecktool.entity.QuestionMultipleChoice;
import org.apache.ibatis.annotations.Param;

public interface QuestionMultipleChoiceMapper {
    int deleteByPrimaryKey(String questionID);

    int insert(QuestionMultipleChoice record);

    int insertSelective(QuestionMultipleChoice record);

    QuestionMultipleChoice selectByPrimaryKey(String questionID);

    int updateByPrimaryKeySelective(QuestionMultipleChoice record);

    int updateByPrimaryKey(QuestionMultipleChoice record);

    int updateQuestionMultipleChoice(@Param("questionID") String questionID, @Param("choiceA")String choiceA, @Param("choiceB")String choiceB, @Param("choiceC")String choiceC, @Param("choiceD")String choiceD, @Param("answer")String answer);
}