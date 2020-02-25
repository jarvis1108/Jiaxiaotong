package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.vo.ErrorMultipleQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 选择题错题 数据访问层
 * <p>
 * Created By Xiaohe
 * 2018-09-09 上午 09:40
 */
@Repository
public interface ErrorMultipleQuestionRepository extends JpaRepository<ErrorMultipleQuestion, String> {

    /**
     * 根据用户Id获取其错题集，并根据时间降序排序
     *
     * @param userId 用户Id
     * @return
     */
    List<ErrorMultipleQuestion> findByUserIdOrderByCreateTimeDesc(String userId);
}
