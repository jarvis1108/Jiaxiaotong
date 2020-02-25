package com.dxtwangxiao.strongestsuperscholar.module.system.dao;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserCoinDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户金币流水明细数据访问层
 * <p>
 * Created by Devin
 * 2018-06-25 下午 03:09
 */
@Repository
public interface UserCoinDetailRepository extends CrudRepository<UserCoinDetail, String> {

    /**
     * 创建、更新用户金币明细表
     *
     * @param userCoinDetail 用户金币明细
     * @return
     */
    UserCoinDetail save(UserCoinDetail userCoinDetail);
    /**
     * 功能描述: 通过userId查找当前用户的所有金币明细
     *
     * @param: userId 用户id
     * @param: pageAble page信息
     * @auther: 程志强
     * @date: 2018/10/18 10:48
     */
    Page<UserCoinDetail> findByUserId(String userId, Pageable pageable);
}
