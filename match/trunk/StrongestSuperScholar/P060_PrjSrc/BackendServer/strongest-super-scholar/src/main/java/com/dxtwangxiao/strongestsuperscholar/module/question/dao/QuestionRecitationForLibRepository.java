package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal.QuestionRecitationForLib;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 孙伟浩 on 2018/9/6.
 */
@Repository
public interface QuestionRecitationForLibRepository extends JpaRepository<QuestionRecitationForLib,String> {
}
