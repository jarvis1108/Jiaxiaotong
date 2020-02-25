package com.dxtwangxiao.strongestsuperscholar.module.match.dao;

/**
 * @author meiyu
 * 战局题目记录
 */

import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordQuestion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.sql.Timestamp;
import java.util.List;
@Repository
public interface MatchRecordQuestionRepository extends CrudRepository<MatchRecordQuestion,String> {

    MatchRecordQuestion save(MatchRecordQuestion matchRecordQuestion);

    List<MatchRecordQuestion> findAll();

    @Query("select m from MatchRecordQuestion m")
    Page<MatchRecordQuestion> findAll(Pageable pageable);

    List<MatchRecordQuestion> findAllByMatchRecordId(String matchRecordId);

}
