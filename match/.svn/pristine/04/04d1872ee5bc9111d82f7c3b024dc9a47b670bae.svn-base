package com.dxtwangxiao.strongestsuperscholar.module.base.service.Impl;

import com.dxtwangxiao.strongestsuperscholar.module.base.dao.GradeInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.GradeInfo;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.GradeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 孙伟浩 on 2018/10/22.
 */
@Service
public class GradeInfoServiceImpl implements GradeInfoService {

    @Autowired
    private GradeInfoRepository gradeInfoRepository;

    @Override
    public String findIdByGradeShortName(String gradeShortName) {
        GradeInfo gradeInfo = gradeInfoRepository.findByGradeShortName(gradeShortName);
        if (gradeInfo == null){
            return null;
        }

        return gradeInfo.getGradeId();
    }
}
