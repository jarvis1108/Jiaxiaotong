package com.dxtwangxiao.strongestsuperscholar.module.system.service;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserGPDetail;

/**
 * 用户绩点流水明细服务接口
 * <p>
 * Created by Devin
 * 2018-07-03 上午 10:40
 */
public interface UserGPDetailService {

	/**
	 * 更新用户绩点流水明细表中用户绩点信息
	 *
	 * @param matchId    战局Id
	 * @param userId     用户Id
	 * @param gradePoint 绩点
	 * @return
	 */
	UserGPDetail save(String matchId, String userId, Integer gradePoint);
}
