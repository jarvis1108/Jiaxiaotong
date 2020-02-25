package com.dxtwangxiao.strongestsuperscholar.module.system.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.OrderRecord;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserCoinDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserGPDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserLPDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.vo.BackUserBaseInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/11 22:50
 * @Description TODO
 */
public interface BackUserBaseInfoService {
    /**
     * 功能描述: 后台管理系统用户管理部分 基本信息查询（所有数据查询）
     *
     * @param: currentPage 当前页码
     * @param: pageSize    每一页的数据量
     * @return:  获得的当前页数的所有用户基本信息，如有只有一页则为全部数据（UserRelInfo表)
     * @date: 2018/10/11 22:20
     */
    Page<BackUserBaseInfo> getAllUserBaseInfos(Integer currentPage, Integer pageSize, JSONObject reqParam);

    /**
     * 功能描述: 更新某一行的用户数据信息
     *
     * @param:当前行的数据
     * @date: 2018/10/11 22:57
     */
    void updateUserBaseInfo(String userId, JSONObject reqParam);

    /**
     * 功能描述: 冻结和解冻某个用户
     *
     * @param: 当前行的数据
     * @date: 2018/10/11 23:53
     */
    void lockOrUnlockUser(String userId, JSONObject reqParam);

    /**
     * 功能描述: 根据用户id查询用户基础信息
     *
     * @param: userId 用户id
     * @date: 2018/10/13 19:14
     */
    BackUserBaseInfo getBackUserBaseInfoByUserId(String userId);

    /**
     * 功能描述: 添加新的用户金币明细（当后台修改了用户金币信息之后，数据库增加一条金币明细的记录）
     *
     * @param: userId 用户id， originCoin 后台修改之前的金币值， newCoin 后台修改之后的金币值
     * @return:
     * @date: 2018/10/22 21:36
     */
    void saveUserCoinDetail(String userId,Integer originCoin, Integer newCoin);

    /**
     * 功能描述: 添加新的用户绩点明细（当后台修改了用户绩点信息之后，数据库增加一条绩点明细的记录）
     *
     * @param: userId 用户id， originGradePoint 后台修改之前的绩点值， newGradePoint 后台修改之后的绩点值
     * @return:
     * @date: 2018/10/22 21:36
     */
    void saveUserGPDetail(String userId, Integer originGradePoint, Integer newGradePoint);

    /**
     * 功能描述: 添加新的用户学点明细（当后台修改了用户学点信息之后，数据库增加一条学点明细的记录）
     *
     * @param: userId 用户id， originLearningPoint 后台修改之前的学点值， newLearningPoint 后台修改之后的学点值
     * @return:
     * @date: 2018/10/22 21:36
     */
    void saveUserLPDetail(String userId, Integer originLearningPoint ,Integer newLearningPoint);

}
