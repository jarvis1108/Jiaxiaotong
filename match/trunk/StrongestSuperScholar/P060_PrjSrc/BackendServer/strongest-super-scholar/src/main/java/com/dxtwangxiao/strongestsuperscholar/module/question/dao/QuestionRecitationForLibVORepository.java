package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionRecitationForLibVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 孙伟浩 on 2018/9/7.
 */
@Repository
public interface QuestionRecitationForLibVORepository extends PagingAndSortingRepository<QuestionRecitationForLibVO,String>,JpaSpecificationExecutor<QuestionRecitationForLibVO> {
}
