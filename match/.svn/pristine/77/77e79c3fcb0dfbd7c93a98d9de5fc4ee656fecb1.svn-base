package com.dxtwangxiao.strongestsuperscholar.module.match.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.match.dao.LPConsumeRecordRepository;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.LPConsumeRecord;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.LPConsumeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By Devin
 * 2018-09-11 下午 08:12
 */
@Service
public class LPConsumeRecordServiceImpl implements LPConsumeRecordService {

	@Autowired
	private LPConsumeRecordRepository lpConsumeRecordRepository;

	@Override
	public LPConsumeRecord save(LPConsumeRecord lpConsumeRecord) {
		return lpConsumeRecordRepository.save(lpConsumeRecord);
	}
}
