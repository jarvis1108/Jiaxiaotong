package com.dxtwangxiao.strongestsuperscholar.module.system.service;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserLPDetail;

/**
 * 用户学点流水明细服务接口
 * <p>
 * Created by Devin
 * 2018-07-03 上午 10:28
 */
public interface UserLPDetailService {

	/**
	 * 更新用户的学点
	 *
	 * @param matchId       战局Id
	 * @param userId        用户Id
	 * @param learningPoint 学点数量
	 * @return
	 */
	UserLPDetail save(String matchId, String userId, Integer learningPoint);
}
