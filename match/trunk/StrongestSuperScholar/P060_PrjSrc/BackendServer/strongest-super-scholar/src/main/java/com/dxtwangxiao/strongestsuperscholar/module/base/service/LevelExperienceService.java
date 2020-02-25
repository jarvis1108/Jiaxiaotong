package com.dxtwangxiao.strongestsuperscholar.module.base.service;

import com.dxtwangxiao.strongestsuperscholar.module.base.entity.LevelExperience;

/**
 * 等级经验服务 接口
 * <p>
 * Created By Devin
 * 2018-08-27 下午 07:09
 */
public interface LevelExperienceService {
    /**
     * 根据经验获取等级经验记录
     *
     * @param experience 经验值
     * @return
     */
    LevelExperience getByExperience(Integer experience);
}
