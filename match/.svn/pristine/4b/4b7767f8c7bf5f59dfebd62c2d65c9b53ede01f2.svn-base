package com.dxtwangxiao.strongestsuperscholar.module.match.service;

import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordUser;

import java.util.List;

/**
 * Created By Devin
 * 2018-09-11 下午 08:09
 */
public interface MatchRecordUserService {

	MatchRecordUser save(MatchRecordUser matchRecordUser);

	/**
	 * 功能描述: 获得表格t_MTH_MatchRecordUser的所有信息（分页）
	 *
	 * @param: currentPage 当前页面
	 * @Param: pageSize 页面大小
	 * @auther: 程志强
	 * @date: 2018/10/12 18:56
	 */
	List<MatchRecordUser> getAllMatchRecordUserInfos(Integer currentPage,Integer pageSize);

	/**
	 * 功能描述: 删除表格t_MTH_MatchRecordUser的某条数据
	 *
	 * @param: 当前行的主键ID
	 * @auther: 程志强
	 * @date: 2018/10/12 18:58
	 */
	void removeMatchRecordUserInfo(String matchRecordUserId);

	/**
	 * 功能描述: 获得表格t_MTH_MatchRecordUser的某一条数据
	 *
	 * @param: 当前行的主键ID
	 * @return:
	 * @auther: 程志强
	 * @date: 2018/10/12 18:59
	 */
	MatchRecordUser getMatchRecordUserInfoById(String matchRecordUserId);

}
