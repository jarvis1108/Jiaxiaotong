package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.base.dao.LevelExperienceRepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.LevelExperience;
import com.dxtwangxiao.strongestsuperscholar.module.community.vo.SpecialTrainingVO;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserRelInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserRelInfo;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.UserRelInfoService;
import com.dxtwangxiao.strongestsuperscholar.web.util.UpdateUtil;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 用户相关信息服务接口
 * <p>
 * Created by Devin
 * 2018-07-25 下午 03:40
 */
@Service
public class UserRelInfoServiceImpl implements UserRelInfoService {

	@Autowired
	private UserRelInfoRepository userRelInfoRepository;

	@Autowired
	private LevelExperienceRepository levelExperienceRepository;

	/**
	 * 更新用户相关信息的经验值
	 *
	 * @param userId     用户Id
	 * @param experience 用户经验值
	 * @return
	 */
	@Override
	@Transactional
	public UserRelInfo addExperience(String userId, Integer experience) {
		UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);

		Integer curExperience = userRelInfo.getExperience() + experience;
		LevelExperience levelExperience = levelExperienceRepository.findByMinExperienceLessThanEqualAndMaxExperienceGreaterThan(curExperience, curExperience);
		userRelInfo.setExperience(curExperience);
		userRelInfo.setExternalLevel(levelExperience.getLevel());

		return userRelInfoRepository.save(userRelInfo);
	}

	/**
	 * 根据用户Id获取用户相关信息
	 *
	 * @param userId 用户Id
	 * @return
	 */
	@Override
	public UserRelInfo getByUserId(String userId) {
		return userRelInfoRepository.findByUserId(userId);
	}

	/**
	 * 更新用户相关信息
	 *
	 * @param userRelInfo 待更新用户信息
	 * @return
	 */
	@Override
	public UserRelInfo updateUser(UserRelInfo userRelInfo) {
		return userRelInfoRepository.save(userRelInfo);
	}
}
