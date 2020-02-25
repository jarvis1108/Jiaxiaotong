package com.dxtwangxiao.strongestsuperscholar.module.match.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.match.dao.MatchRecordRepository;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecord;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 占据服务接口实现
 * <p>
 * Created By Devin
 * 2018-09-11 下午 08:02
 */
@Service
public class MatchRecordServiceImpl implements MatchRecordService {

	@Autowired
	private MatchRecordRepository matchRecordRepository;

	/**
	 * 根据战局Id获取战局记录
	 *
	 * @param matchRecordId 战局Id
	 * @return
	 */
	@Override
	public MatchRecord getById(String matchRecordId) {
		return matchRecordRepository.findByMatchRecordId(matchRecordId);
	}

	@Override
	public MatchRecord createMatchRecord(MatchRecord matchRecord) {
		return matchRecordRepository.save(matchRecord);
	}
}
