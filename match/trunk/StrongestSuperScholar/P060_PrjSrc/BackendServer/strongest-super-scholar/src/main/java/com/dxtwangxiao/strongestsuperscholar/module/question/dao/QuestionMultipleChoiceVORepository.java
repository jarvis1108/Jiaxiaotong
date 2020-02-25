package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * 选择题视图对象 数据访问层
 * <p>
 * Created By Devin
 * 2018-08-30 下午 02:43
 */
@Repository
public interface QuestionMultipleChoiceVORepository extends PagingAndSortingRepository<QuestionMultipleChoiceVO, String>, JpaSpecificationExecutor<QuestionMultipleChoiceVO> {

    /**
     * 根据科目id，分页查询，获取选择题列表（用于知识练兵场）
     *
     * @param subjectId 科目id
     * @return 试题列表
     */
    Page<QuestionMultipleChoiceVO> findBySubjectId(String subjectId, Pageable pageable);

    /**
     * 分页查询，获取题目列表，用户匹配对战等
     *
     * @param pageable 分页参数
     * @return
     */
    //Page<QuestionMultipleChoiceVO> findAll(Pageable pageable);

    /**
     * 获取视图中记录行数
     *
     * @return 所有记录行数
     */
    //long count();

    /**
     * 根据科目Id计算行数
     *
     * @param subjectId 科目Id
     * @return
     */
    long countAllBySubjectId(String subjectId);
}