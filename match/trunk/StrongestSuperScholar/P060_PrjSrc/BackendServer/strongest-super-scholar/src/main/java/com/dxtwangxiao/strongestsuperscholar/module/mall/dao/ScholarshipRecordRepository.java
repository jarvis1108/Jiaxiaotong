package com.dxtwangxiao.strongestsuperscholar.module.mall.dao;

import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ScholarshipRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 奖学金兑换记录 数据访问层
 * <p>
 * Created by 孙伟浩 on 2018/9/18.
 */
@Repository
public interface ScholarshipRecordRepository extends CrudRepository<ScholarshipRecord, String> {

    /**
     * 根据用户Id获得其奖学金兑换记录，按创建时间降序排序
     *
     * @param userId 用户Id
     * @return 奖学金列表
     */
    List<ScholarshipRecord> findAllByUserIdOrderByCreateTimeDesc(String userId);


}
