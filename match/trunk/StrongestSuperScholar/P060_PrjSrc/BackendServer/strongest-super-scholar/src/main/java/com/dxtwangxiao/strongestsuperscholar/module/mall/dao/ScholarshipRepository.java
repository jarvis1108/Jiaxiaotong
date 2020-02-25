package com.dxtwangxiao.strongestsuperscholar.module.mall.dao;

import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.Scholarship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 奖学金 数据访问层
 * <p>
 * Created by 孙伟浩 on 2018/9/26.
 */
@Repository
public interface ScholarshipRepository extends CrudRepository<Scholarship, String> {



    /**
     * 根据id获取奖学金信息
     *
     * @param scholarshipId 奖学金id
     * @return 奖学金信息
     */
    Scholarship findByScholarshipId(String scholarshipId);
}
