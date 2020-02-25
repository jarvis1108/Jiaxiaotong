package com.dxtwangxiao.strongestsuperscholar.module.system.dao;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserGPDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户绩点流水明细数据访问层
 * <p>
 * Created by Devin
 * 2018-06-25 下午 03:15
 */
@Repository
public interface UserGPDetailRepository extends CrudRepository<UserGPDetail, String> {

    /**
     * 创建、更新用户绩点流水明细表
     *
     * @param userGPDetail 用户绩点流水明细表
     * @return 用户绩点流水明细表
     */
    UserGPDetail save(UserGPDetail userGPDetail);

    /**
     * 功能描述: 通过userId查询用户绩点明细
     *
     * @param: userId，用户id
     * @param: Pageable page信息
     * @auther: 程志强
     * @date: 2018/10/18 10:55
     */
    Page<UserGPDetail> findByUserId(String userId, Pageable pageable);
}
