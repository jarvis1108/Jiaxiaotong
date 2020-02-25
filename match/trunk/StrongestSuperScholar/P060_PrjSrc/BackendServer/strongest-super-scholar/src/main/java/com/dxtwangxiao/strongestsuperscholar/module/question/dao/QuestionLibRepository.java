package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionLib;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 孙伟浩 on 2018/9/8.
 */
@Repository
public interface QuestionLibRepository extends JpaRepository<QuestionLib,String> {
}
