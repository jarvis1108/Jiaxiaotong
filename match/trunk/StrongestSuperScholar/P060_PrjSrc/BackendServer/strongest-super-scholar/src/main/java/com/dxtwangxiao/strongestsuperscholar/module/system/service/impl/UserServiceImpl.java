package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.base.dao.GradePhaseInfoRelRepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.dao.LevelExperienceRepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.GradePhaseInfoRel;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.LevelExperience;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserRelInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.User;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserRelInfo;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.UserService;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 用户服务接口实现类
 * <p>
 * Created by Devin
 * 2018-06-25 下午 03:46
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRelInfoRepository userRelInfoRepository;

    @Autowired
    private GradePhaseInfoRelRepository gradePhaseInfoRelRepository;

    @Autowired
    private LevelExperienceRepository levelExperienceRepository;

    /**
     * 根据用户Id获取用户信息
     *
     * @param userId 用户Id
     * @return
     */
    @Override
    public UserDTO getUserDTOById(String userId) {
        User user = userRepository.findUserByUserId(userId);
        if (user == null) {
            return null;
        } else {
            UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);
            LevelExperience levelExperience = levelExperienceRepository.findByLevel(userRelInfo.getExternalLevel());
            UserDTO userDTO = new UserDTO();
            userDTO.setUpgradeExperience(levelExperience.getMaxExperience());
            BeanUtils.copyProperties(user, userDTO);
            BeanUtils.copyProperties(userRelInfo, userDTO);

            return userDTO;
        }
    }

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
    @Override
    @Transactional
    public UserDTO createUser(String nickName, String openid, String unionId, String avatarUrl, String gender, String city, String gradePhaseId, String gradeId) {
        GradePhaseInfoRel gradePhaseInfoRel = gradePhaseInfoRelRepository.findByGradePhaseIdAndGradeId(gradePhaseId, gradeId);
        LevelExperience levelExperience = levelExperienceRepository.findByLevel(1);
        User user = new User();
        user.setUserId(UUIDUtil.getUUID());
        user.setUserNo(user.getUserId());
        user.setOpenid(openid);
        user.setUnionId(unionId);
        user.setCity(city);
        user.setSex(gender);
        user.setWechatName(nickName);
        user.setHeadImage(avatarUrl);
        user.setCreateTime(new Timestamp(new Date().getTime()));
        user.setIsValid(Byte.valueOf("1"));
        userRepository.save(user);

        UserRelInfo userRelInfo = new UserRelInfo();
        userRelInfo.setUserId(user.getUserId());
        userRelInfo.setUserNo(user.getUserNo());
        userRelInfo.setCoin(0);
        userRelInfo.setGradePoint(0);
        userRelInfo.setLearningPoint(0);
        userRelInfo.setInternalLevel(gradePhaseInfoRel.getInternalLevel());
        userRelInfo.setMatchSumCount(0);
        userRelInfo.setMatchWinCount(0);
        userRelInfo.setMatchLoseCount(0);
        userRelInfo.setMatchDogFallCount(0);
        userRelInfo.setExperience(0);
        userRelInfo.setExternalLevel(1);
        userRelInfo.setCreateTime(user.getCreateTime());
        userRelInfo.setIsValid(Byte.valueOf("1"));
        userRelInfoRepository.save(userRelInfo);

        UserDTO userDTO = new UserDTO();
        userDTO.setUpgradeExperience(levelExperience.getMaxExperience());
        BeanUtils.copyProperties(user, userDTO);
        BeanUtils.copyProperties(userRelInfo, userDTO);

        return userDTO;
    }

    /**
     * 根据openid获取用户信息
     *
     * @param openid 用户openid
     * @return
     */
    @Override
    public UserDTO getUserDTOByOpenid(String openid) {
        User user = userRepository.findByOpenid(openid);
        if (user != null) {
            UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(user.getUserId());
            LevelExperience levelExperience = levelExperienceRepository.findByLevel(userRelInfo.getExternalLevel());
            UserDTO userDTO = new UserDTO();
            userDTO.setUpgradeExperience(levelExperience.getMaxExperience());
            BeanUtils.copyProperties(user, userDTO);
            BeanUtils.copyProperties(userRelInfo, userDTO);

            return userDTO;
        }

        return null;
    }
}