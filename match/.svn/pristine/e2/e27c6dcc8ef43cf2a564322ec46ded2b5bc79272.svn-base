package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecord;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchRecordService;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserGPDetailRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserRelInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserGPDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserRelInfo;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.UserGPDetailService;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 用户绩点流水明细服务
 * <p>
 * Created by Devin
 * 2018-07-03 上午 10:29
 */
@Service
public class UserGPDetailServiceImpl implements UserGPDetailService {

	@Autowired
	private UserRelInfoRepository userRelInfoRepository;

	@Autowired
	private MatchRecordService matchRecordService;

	@Autowired
	private UserGPDetailRepository userGPDetailRepository;

	/**
	 * 更新用户绩点流水明细表中用户绩点信息
	 *
	 * @param matchId    战局Id
	 * @param userId     用户Id
	 * @param gradePoint 绩点
	 * @return
	 */
	@Override
	public UserGPDetail save(String matchId, String userId, Integer gradePoint) {
		MatchRecord matchRecord = matchRecordService.getById(matchId);
		UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);

		UserGPDetail userGPDetail = new UserGPDetail();
		userGPDetail.setUserGpDetailId(UUIDUtil.getUUID());
		userGPDetail.setUserGpDetailNo(userGPDetail.getUserGpDetailId());
		userGPDetail.setUserId(userId);
		userGPDetail.setUserNo(userRelInfo.getUserNo());
		userGPDetail.setOccurTime(new Timestamp(new Date().getTime()));
		userGPDetail.setOriginalAmount(userRelInfo.getGradePoint());
		if (gradePoint >= 0) {
			userGPDetail.setAcquiredAmount(gradePoint);
			userGPDetail.setLossAmount(0);
		} else {
			userGPDetail.setAcquiredAmount(0);
			userGPDetail.setLossAmount(Math.abs(gradePoint));
		}
		Integer currentAmount = userRelInfo.getGradePoint() + gradePoint;
		userGPDetail.setCurrentAmount(currentAmount);
		userGPDetail.setReasonType("匹配对战");
		userGPDetail.setMatchRecordId(matchId);
		userGPDetail.setMatchRecordNo(matchRecord.getMatchRecordNo());
		userGPDetail.setCreateTime(new Timestamp(new Date().getTime()));
		userGPDetail.setCreateUser(userId);
		userGPDetail.setLastUpdUser(userId);
		userGPDetail.setIsValid(Byte.valueOf("1"));

		return userGPDetailRepository.save(userGPDetail);
	}
}
