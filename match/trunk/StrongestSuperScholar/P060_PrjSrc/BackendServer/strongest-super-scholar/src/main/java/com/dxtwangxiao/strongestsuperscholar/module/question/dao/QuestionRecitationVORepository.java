package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionRecitationVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by 孙伟浩 on 2018/10/10.
 */
@Repository
public interface QuestionRecitationVORepository extends JpaRepository<QuestionRecitationVO, String>, JpaSpecificationExecutor<QuestionRecitationVO> {
}
