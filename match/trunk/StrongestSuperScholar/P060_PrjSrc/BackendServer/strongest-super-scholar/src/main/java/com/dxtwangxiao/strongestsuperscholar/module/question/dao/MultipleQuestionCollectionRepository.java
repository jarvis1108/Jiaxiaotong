package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.vo.MultipleQuestionCollection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 收藏选择题视图对象 数据访问层
 * <p>
 * Created By Devin
 * 2018-09-04 上午 10:49
 */
@Repository
public interface MultipleQuestionCollectionRepository extends CrudRepository<MultipleQuestionCollection, String> {

    /**
     * 根据用户Id获取其收藏的选择题
     *
     * @param userId 用户Id
     * @return 收藏的选择题列表
     */
    List<MultipleQuestionCollection> findByUserId(String userId);

    /**
     * 根据Id获取收藏的选择题信息
     *
     * @param questionCollectionId 收藏试题Id
     * @return
     */
    MultipleQuestionCollection findByQuestionCollectionId(String questionCollectionId);


    MultipleQuestionCollection findByUserIdAndQuestionId(String userId, String questionId);
}
