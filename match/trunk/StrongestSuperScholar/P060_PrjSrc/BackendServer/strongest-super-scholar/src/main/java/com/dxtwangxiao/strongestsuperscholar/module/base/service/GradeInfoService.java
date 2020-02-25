package com.dxtwangxiao.strongestsuperscholar.module.base.service;

import com.dxtwangxiao.strongestsuperscholar.module.base.entity.GradeInfo;

/**
 * Created by 孙伟浩 on 2018/10/22.
 */
public interface GradeInfoService {

    /**
      * 通过年级简称获取ID
      *
      * @param  gradeShortName 年级简称
      * @return
      */
    String findIdByGradeShortName(String gradeShortName);
}
