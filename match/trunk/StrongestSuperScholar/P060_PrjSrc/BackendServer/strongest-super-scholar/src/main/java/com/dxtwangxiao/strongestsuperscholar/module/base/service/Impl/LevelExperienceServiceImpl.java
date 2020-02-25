package com.dxtwangxiao.strongestsuperscholar.module.base.service.Impl;

import com.dxtwangxiao.strongestsuperscholar.module.base.dao.LevelExperienceRepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.LevelExperience;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.LevelExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 等级经验服务实现
 * <p>
 * Created By Devin
 * 2018-08-27 下午 07:10
 */
@Service
public class LevelExperienceServiceImpl implements LevelExperienceService {

    @Autowired
    private LevelExperienceRepository levelExperienceRepository;

    /**
     * 根据经验值获其对应的等级经验信息
     *
     * @param experience 经验值
     * @return 相应等级经验信息
     */
    @Override
    public LevelExperience getByExperience(Integer experience) {
        return levelExperienceRepository.findByMinExperienceLessThanEqualAndMaxExperienceGreaterThan(experience, experience);
    }
}
