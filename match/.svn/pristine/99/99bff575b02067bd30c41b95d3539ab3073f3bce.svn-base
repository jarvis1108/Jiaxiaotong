package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceForLibVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Author lh
 * @Date 2018.09.07
 */
@Repository
public interface QuestionMultipleChoiceForLibVORepository extends CrudRepository<QuestionMultipleChoiceForLibVO, String> {

    Page<QuestionMultipleChoiceForLibVO> findAllByQuestionLibIdOrderByCreateTimeAsc(String questionLibId, Pageable pageable);

    QuestionMultipleChoiceForLibVO findByQuestionForLibId(String questionForLibId);
}
