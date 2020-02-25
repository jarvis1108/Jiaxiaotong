package com.dxtwangxiao.strongestsuperscholar.module.mall.service;

import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.Scholarship;

import java.util.List;

/**
 * 奖学金服务接口
 * <p>
 * Created by 孙伟浩 on 2018/9/26.
 */
public interface ScholarshipService {


    /**
     * 获取奖学金列表
     *
     * @return 奖学金列表
     */
    List<Scholarship> listScholarship();
}