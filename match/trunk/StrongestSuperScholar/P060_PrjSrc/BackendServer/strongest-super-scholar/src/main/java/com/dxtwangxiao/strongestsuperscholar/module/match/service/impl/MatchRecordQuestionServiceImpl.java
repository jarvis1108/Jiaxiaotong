package com.dxtwangxiao.strongestsuperscholar.module.match.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.match.dao.MatchRecordQuestionRepository;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordQuestion;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchRecordQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By Devin
 * 2018-09-11 下午 08:08
 */
@Service
public class MatchRecordQuestionServiceImpl implements MatchRecordQuestionService {
	@Autowired
	private MatchRecordQuestionRepository matchRecordQuestionRepository;


	@Override
	public MatchRecordQuestion save(MatchRecordQuestion matchRecordQuestion) {
		return matchRecordQuestionRepository.save(matchRecordQuestion);
	}
}
