package com.dxtwangxiao.strongestsuperscholar.module.system.service;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserCoinDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserGPDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserLPDetail;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/18 11:15
 * @Description 用户金币、绩点、学点明细信息查询
 */
public interface BackUserDetaiService {

    /**
     * 功能描述: 根据用户id查询用户金币明细
     * @param:
     * @return:
     */
    Page<UserCoinDetail> findCoinDetailByUserId(String userID, Integer pageSize, Integer currentPage);

    /**
     * 功能描述: 根据用户id查询用户绩点明细
     * @param:
     * @return:
     */
    Page<UserGPDetail> findGPDetailByUserId(String userID, Integer pageSize, Integer currentPage);
    /**
     * 功能描述: 根据用户id查询用户学点明细
     * @param:
     * @return:
     */
    Page<UserLPDetail> findLPDetailByUserId(String userId, Integer pageSize, Integer currentPage);
}
