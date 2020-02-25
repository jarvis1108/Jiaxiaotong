package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserRelInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.User;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserRelInfo;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.RankService;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 排名服务类
 *
 * @author lh
 * @date 2018.09.11
 */
@Service
public class RankServiceImpl implements RankService {

    @Autowired
    private UserRelInfoRepository userRelInfoRepository;

    @Autowired
    private UserRepository userRepository;

    /**
     * 获得世界排名的用户信息列表
     *
     * @return 用户信息列表
     */
    @Override
    public List<UserDTO> getWorldRank() {
        // 1.得到经验值排名前20的用户相关信息
        final int totalNumber = 20;
        Pageable pageable = PageRequest.of(0, totalNumber);
        Page<UserRelInfo> page = userRelInfoRepository.findByOrderByExperienceDesc(pageable);
        List<UserRelInfo> userRelInfoList = page.getContent();

        // 2.根据userId得到user对象，并组装成userDTO对象
        List<UserDTO> userDTOList = new ArrayList<>();
        for (UserRelInfo userRelInfo : userRelInfoList) {
            UserDTO userDTO = new UserDTO();
            User user = userRepository.findUserByUserId(userRelInfo.getUserId());
            BeanUtils.copyProperties(userRelInfo, userDTO);
            BeanUtils.copyProperties(user, userDTO);

            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    /**
     * 根据经验值排名，得到某一用户的排名名次
     *
     * @param userId 用户Id
     * @return 排名名次
     */
    public long getUserRank(String userId) throws StrongestScholarException {
        UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);
        if (userRelInfo == null)
            throw new StrongestScholarException(CommonError.USER_NOT_EXIST.getCode(), CommonError.USER_NOT_EXIST.getMessage());

        Integer experience = userRelInfoRepository.findByUserId(userId).getExperience();
        return userRelInfoRepository.countByExperienceGreaterThan(experience) + 1;
    }
}
