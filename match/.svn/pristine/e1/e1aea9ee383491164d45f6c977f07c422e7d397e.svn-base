package com.dxtwangxiao.strongestsuperscholar.module.base.dao;

import com.dxtwangxiao.strongestsuperscholar.module.base.entity.LevelExperience;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 等级经验表数据访问层
 * <p>
 * Created By Devin
 * 2018-08-27 下午 06:57
 */
@Repository
public interface LevelExperienceRepository extends CrudRepository<LevelExperience, String> {
    /**
     * 根据经验值获取其对应的等级经验信息
     *
     * @param minExperience 最小经验值
     * @param maxExperience 最大经验值
     * @return 等级经验信息
     */
    LevelExperience findByMinExperienceLessThanEqualAndMaxExperienceGreaterThan(Integer minExperience, Integer maxExperience);

    /**
     * 根据等级获取当前等级经验对应信息
     *
     * @param level 当前等级
     * @return 等级经验信息
     */
    LevelExperience findByLevel(Integer level);
}
