package com.dxtwangxiao.strongestsuperscholar.module.system.service;

import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;

/**
 * 用户服务接口
 * <p>
 * Created by Devin
 * 2018-06-25 下午 03:40
 */
public interface UserService {

    /**
     * 根据用户Id获取用户信息
     *
     * @param userId 用户id
     * @return 用户信息
     */
    UserDTO getUserDTOById(String userId);

    /**
     * 创建新用户
     *
     * @param nickName     用户昵称
     * @param openid       用户openid
     * @param avatarUrl    用户头像地址
     * @param gender       用户性别，1表示男，2表示女，0表示未知
     * @param city         用户所在城市
     * @param gradePhaseId 年纪阶段Id
     * @param gradeId      年级Id
     * @return 创建后的用户信息
     */
    UserDTO createUser(String nickName, String openid, String unionId, String avatarUrl, String gender, String city, String gradePhaseId, String gradeId);

    /**
     * 根据openid获取用户信息
     *
     * @param openid 用户openid
     * @return 用户信息
     */
    UserDTO getUserDTOByOpenid(String openid);
}