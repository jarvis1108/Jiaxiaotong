package com.dxtwangxiao.strongestsuperscholar.module.match.dao;

import com.dxtwangxiao.strongestsuperscholar.module.match.entity.LPConsumeRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author meiyu
 * 学点消费记录表
 */
@Repository
public interface LPConsumeRecordRepository extends CrudRepository<LPConsumeRecord,String>{

    LPConsumeRecord save(LPConsumeRecord lpConsumeRecord);

    List<LPConsumeRecord> findAll();

    Page<LPConsumeRecord> findAll(Pageable pageable);

    List<LPConsumeRecord> findByUserId(String userId);

}
