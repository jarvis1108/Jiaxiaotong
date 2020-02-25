package com.dxtwangxiao.strongestsuperscholar.module.match.dao;

import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordUser;
import com.dxtwangxiao.strongestsuperscholar.web.util.MathUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author meiyu
 * 对战记录参与用户
 */
@Repository
public interface MatchRecordUserRepository extends CrudRepository<MatchRecordUser, String> {

    MatchRecordUser save(MatchRecordUser matchRecordUser);

    Page<MatchRecordUser> findAll(Pageable pageable);

    List<MatchRecordUser> findAll();

    MatchRecordUser findByMatchRecordIdAndUserId(String matchId, String userId);

    MatchRecordUser findByMatchRecordUserId(String matchId);

}
