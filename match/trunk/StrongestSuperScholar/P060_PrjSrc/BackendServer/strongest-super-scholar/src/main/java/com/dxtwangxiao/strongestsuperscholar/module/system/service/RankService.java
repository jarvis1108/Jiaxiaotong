package com.dxtwangxiao.strongestsuperscholar.module.system.service;

import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;

import java.util.List;

/**
 * 排名服务类
 *
 * @author lh
 * @date 2018.09.11
 */
public interface RankService {

    /**
     * 获得世界排名的用户信息列表
     *
     * @return 用户排名信息列表
     */
    List<UserDTO> getWorldRank();

    /**
     * 得到某一用户的排名名次
     *
     * @param userId 用户Id
     * @return 排名名次
     */
    long getUserRank(String userId) throws StrongestScholarException;
}