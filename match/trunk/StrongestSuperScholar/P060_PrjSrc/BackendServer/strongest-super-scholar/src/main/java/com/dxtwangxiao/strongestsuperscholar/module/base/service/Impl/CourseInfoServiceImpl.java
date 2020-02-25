package com.dxtwangxiao.strongestsuperscholar.module.base.service.Impl;

import com.dxtwangxiao.strongestsuperscholar.module.base.dao.CourseInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.CourseInfo;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.CourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 孙伟浩 on 2018/10/22.
 */
@Service
public class CourseInfoServiceImpl implements CourseInfoService {

    @Autowired
    private CourseInfoRepository courseInfoRepository;

    @Override
    public String findIdByCourseShortName(String courseShortName) {
        CourseInfo courseInfo = courseInfoRepository.findByCourseShortName(courseShortName);
        if (courseInfo == null){
            return null;
        }

        return courseInfo.getCourseId();
    }
}
