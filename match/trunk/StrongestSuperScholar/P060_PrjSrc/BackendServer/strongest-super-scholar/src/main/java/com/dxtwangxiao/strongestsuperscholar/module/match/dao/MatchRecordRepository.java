package com.dxtwangxiao.strongestsuperscholar.module.match.dao;

/**
 * @author meiyu
 * 对战记录
 */

import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface MatchRecordRepository extends CrudRepository<MatchRecord,String> {

    MatchRecord save(MatchRecord matchRecord);

    List<MatchRecord> findAll();

    Page<MatchRecord> findAll(Pageable pageable);

    MatchRecord findByMatchRecordId(String matchId);
}