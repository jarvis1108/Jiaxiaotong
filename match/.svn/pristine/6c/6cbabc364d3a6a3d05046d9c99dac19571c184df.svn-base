package com.dxtwangxiao.strongestsuperscholar.module.base.service.Impl;

import com.dxtwangxiao.strongestsuperscholar.module.base.dao.GradePhaseInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.GradePhaseInfo;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.GradePhaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 年级阶段基本信息 服务实现类
 * <p>
 * Created by Devin
 * 2018-07-13 下午 04:50
 */
@Service
public class GradePhaseInfoServiceImpl implements GradePhaseInfoService {

    @Autowired
    private GradePhaseInfoRepository gradePhaseInfoRepository;

    /**
     * 获取所有年级阶段基本信息
     *
     * @return 年级阶段信息
     */
    @Override
    public List<GradePhaseInfo> findAll() {
        return gradePhaseInfoRepository.findAll();
    }
}
