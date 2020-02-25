package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal.QuestionMultipleChoiceForLib;

/**
 * @Author lh
 * @Date 2018.09.07
 */
@Repository
public interface QuestionMultipleChoiceForLibRepository extends CrudRepository<QuestionMultipleChoiceForLib, String> {

    @Override
    QuestionMultipleChoiceForLib save(QuestionMultipleChoiceForLib questionForLib);

    @Override
    void deleteById(String questionForLibId);

    long countByQuestionLibId(String questionLibId);

    QuestionMultipleChoiceForLib findByQuestionForLibId(String questionForLibId);
}
