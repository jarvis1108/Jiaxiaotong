package com.dxtwangxiao.questionchecktool.dao;

import com.dxtwangxiao.questionchecktool.vo.MultipleChoiceQuestionVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Devin
 * 2018-07-16 下午 05:04
 */
public interface MultipleChoiceQuestionVOMapper {
    List<MultipleChoiceQuestionVO> selectAll();

    List<MultipleChoiceQuestionVO> selectAllQuestions(@Param("gradePhaseName") String gradePhaseName, @Param("courseName") String courseName, @Param("gradeName") String gradeName, @Param("booklet") String booklet, @Param("isCheckPass") String isCheckPass, @Param("initID") String initID);

    MultipleChoiceQuestionVO selectById(String questionID);

    List<String> selectAllInitId();
}
