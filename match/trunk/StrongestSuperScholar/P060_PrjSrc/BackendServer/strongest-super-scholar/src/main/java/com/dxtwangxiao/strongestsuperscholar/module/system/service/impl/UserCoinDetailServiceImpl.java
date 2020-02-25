package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecord;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchRecordService;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserCoinDetailRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserRelInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserCoinDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserRelInfo;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.UserCoinDetailService;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 用户金币明细服务实现类
 * <p>
 * Created by Devin
 * 2018-07-03 上午 10:00
 */
@Service
public class UserCoinDetailServiceImpl implements UserCoinDetailService {

	@Autowired
	private UserCoinDetailRepository userCoinDetailRepository;

	@Autowired
	private UserRelInfoRepository userRelInfoRepository;

	@Autowired
	private MatchRecordService matchRecordService;

	/**
	 * 更新用户金币数
	 *
	 * @param matchId 战局Id
	 * @param userId  用户Id
	 * @param coin    金币数目
	 * @return
	 */
	@Override
	@Transactional
	public UserCoinDetail save(String matchId, String userId, Integer coin) {
		MatchRecord matchRecord = matchRecordService.getById(matchId);
		UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);

		UserCoinDetail userCoinDetail = new UserCoinDetail();
		userCoinDetail.setUserCoinDetailId(UUIDUtil.getUUID());
		userCoinDetail.setUserCoinDetailNo(userCoinDetail.getUserCoinDetailId());
		userCoinDetail.setUserId(userId);
		userCoinDetail.setUserNo(userRelInfo.getUserNo());
		userCoinDetail.setOccurTime(new Timestamp(new Date().getTime()));
		userCoinDetail.setOriginalAmount(userRelInfo.getCoin());
		if (coin >= 0) {
			userCoinDetail.setAcquiredAmount(coin);
			userCoinDetail.setLossAmount(0);
		} else {
			userCoinDetail.setAcquiredAmount(0);
			userCoinDetail.setLossAmount(Math.abs(coin));
		}
		Integer currentAmount = userRelInfo.getCoin() + coin;
		userCoinDetail.setCurrentAmount(currentAmount);
		userCoinDetail.setReasonType("匹配对战");
		userCoinDetail.setMatchRecordId(matchId);
		userCoinDetail.setMatchRecordNo(matchRecord.getMatchRecordNo());
		userCoinDetail.setCreateTime(new Timestamp(new Date().getTime()));
		userCoinDetail.setCreateUser(userId);
		userCoinDetail.setLastUpdUser(userId);
		userCoinDetail.setIsValid(Byte.valueOf("1"));

		return userCoinDetailRepository.save(userCoinDetail);
	}
}
