package com.dxtwangxiao.strongestsuperscholar.module.system.dao;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserLPDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户学点流水明细数据访问层
 * <p>
 * Created by Devin
 * 2018-06-25 下午 03:16
 */
@Repository
public interface UserLPDetailRepository extends CrudRepository<UserLPDetail, String> {

    /**
     * 创建、更新用户学点流水明细表
     *
     * @param userLPDetail 用户学点流水明细表
     * @return 用户学点流水明细表
     */
    UserLPDetail save(UserLPDetail userLPDetail);
    /**
     * 功能描述: 根据用户id查询当前用户的学点明细
     *
     * @param: userId，用户id
     * @return:
     */
    Page<UserLPDetail> findByUserId(String userId, Pageable pageable);
}

