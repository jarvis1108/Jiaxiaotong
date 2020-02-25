package com.dxtwangxiao.strongestsuperscholar.module.base.service;

import com.dxtwangxiao.strongestsuperscholar.module.base.entity.GradePhaseInfo;

import java.util.List;

/**
 * 年级阶段基本信息 服务接口
 * <p>
 * Created by Devin
 * 2018-07-13 下午 04:22
 */
public interface GradePhaseInfoService {

    /**
     * 获取所有年级阶段信息
     *
     * @return 所有年级阶段信息
     */
    List<GradePhaseInfo> findAll();
}
