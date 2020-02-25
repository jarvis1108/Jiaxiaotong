package com.dxtwangxiao.strongestsuperscholar.module.base.service;

/**
 * Created by 孙伟浩 on 2018/10/22.
 */
public interface CourseInfoService {

    /**
      * 通过课程简称获取ID
      *
      * @param  courseShortName 课程简称
      * @return
      */
    String findIdByCourseShortName(String courseShortName);
}
