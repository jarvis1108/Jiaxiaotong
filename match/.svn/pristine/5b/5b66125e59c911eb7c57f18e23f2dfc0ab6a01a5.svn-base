package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionCollection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 试题收藏 数据访问层
 * <p>
 * Created By Devin
 * 2018-09-04 上午 10:29
 */
@Repository
public interface QuestionCollectionRepository extends CrudRepository<QuestionCollection, String> {

    QuestionCollection save(QuestionCollection questionCollection);

    QuestionCollection findByQuestionCollectionId(String questionCollectionId);

    QuestionCollection findByUserIdAndQuestionId(String userId, String questionId);
}
