package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionRecitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 孙伟浩 on 2018/10/10.
 */
@Repository
public interface QuestionRecitationRepository extends JpaRepository<QuestionRecitation, String> {
}
