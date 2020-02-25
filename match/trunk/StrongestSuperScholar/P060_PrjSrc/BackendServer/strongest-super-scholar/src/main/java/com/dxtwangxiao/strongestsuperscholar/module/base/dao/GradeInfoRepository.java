package com.dxtwangxiao.strongestsuperscholar.module.base.dao;

import com.dxtwangxiao.strongestsuperscholar.module.base.entity.GradeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 孙伟浩 on 2018/10/22.
 */
@Repository
public interface GradeInfoRepository extends JpaRepository<GradeInfo, String> {

    GradeInfo findByGradeShortName(String gradeShortName);
}
