package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecord;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchRecordService;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserLPDetailRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserRelInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserLPDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserRelInfo;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.UserLPDetailService;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 用户学点流水明细服务
 * <p>
 * Created by Devin
 * 2018-07-03 上午 10:29
 */
@Service
public class UserLPDetailServiceImpl implements UserLPDetailService {

	@Autowired
	private UserRelInfoRepository userRelInfoRepository;

	@Autowired
	private MatchRecordService matchRecordService;

	@Autowired
	private UserLPDetailRepository userLPDetailRepository;

	/**
	 * 更新用户的学点
	 *
	 * @param matchId       战局Id
	 * @param userId        用户Id
	 * @param learningPoint 学点消耗数量
	 * @return
	 */
	@Override
	@Transactional
	public UserLPDetail save(String matchId, String userId, Integer learningPoint) {
		MatchRecord matchRecord = matchRecordService.getById(matchId);
		UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);

		UserLPDetail userLPDetail = new UserLPDetail();
		userLPDetail.setUserLpDetailId(UUIDUtil.getUUID());
		userLPDetail.setUserLpDetailNo(userLPDetail.getUserLpDetailId());
		userLPDetail.setUserId(userId);
		userLPDetail.setUserNo(userRelInfo.getUserNo());
		userLPDetail.setOccurTime(new Timestamp(new Date().getTime()));
		userLPDetail.setOriginalAmount(userRelInfo.getLearningPoint());
		if (learningPoint >= 0) {
			userLPDetail.setAcquiredAmount(learningPoint);
			userLPDetail.setLossAmount(0);
		} else {
			userLPDetail.setAcquiredAmount(0);
			userLPDetail.setLossAmount(Math.abs(learningPoint));
		}
		Integer currentAmount = userRelInfo.getLearningPoint() + learningPoint;
		userLPDetail.setCurrentAmount(currentAmount);
		userLPDetail.setReasonType("匹配对战");
		userLPDetail.setMatchRecordId(matchId);
		userLPDetail.setMatchRecordNo(matchRecord.getMatchRecordNo());
		userLPDetail.setCreateTime(new Timestamp(new Date().getTime()));
		userLPDetail.setCreateUser(userId);
		userLPDetail.setLastUpdUser(userId);
		userLPDetail.setIsValid(Byte.valueOf("1"));

		return userLPDetailRepository.save(userLPDetail);
	}
}
