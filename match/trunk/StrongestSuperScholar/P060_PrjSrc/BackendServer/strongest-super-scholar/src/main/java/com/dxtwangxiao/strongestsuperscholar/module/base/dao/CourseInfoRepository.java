package com.dxtwangxiao.strongestsuperscholar.module.base.dao;

import com.dxtwangxiao.strongestsuperscholar.module.base.entity.CourseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 孙伟浩 on 2018/10/22.
 */
@Repository
public interface CourseInfoRepository extends JpaRepository<CourseInfo, String> {

    CourseInfo findByCourseShortName(String courseShortName);
}
