package com.dxtwangxiao.strongestsuperscholar.module.match.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.match.dao.MatchRecordUserRepository;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordUser;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchRecordUserService;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created By Devin
 * 2018-09-11 下午 08:10
 */
@Service
public class MatchRecordUserServiceImpl implements MatchRecordUserService {

	@Autowired
	private MatchRecordUserRepository matchRecordUserRepository;

	@Transactional
	@Override
	public MatchRecordUser save(MatchRecordUser matchRecordUser) {
			if(null == matchRecordUser){
				throw new StrongestScholarException("E_201810121441_57_011","保存的对战记录用户信息为空");
			}
			return matchRecordUserRepository.save(matchRecordUser);
	}

	@Transactional
	@Override
	public List<MatchRecordUser> getAllMatchRecordUserInfos(Integer currentPage, Integer pageSize) {
		if(currentPage == null || pageSize == null){
			return matchRecordUserRepository.findAll();
		}else {
			Pageable pageable = PageRequest.of(currentPage-1,pageSize);
			Page<MatchRecordUser> matchRecords = matchRecordUserRepository.findAll(pageable);
			return matchRecords.getContent();
		}
	}

	@Transactional
	@Override
	public void removeMatchRecordUserInfo(String matchRecordUserId) {
		if(matchRecordUserId==null){
			throw new StrongestScholarException("E_201810121504_57_013","传入的id为空");
		}
		//此处存在潜在bug，能不能直接删除某一个表格数据，会不会有级联，需不需要把另外加一个涉及matchRecord的也删掉？
		matchRecordUserRepository.deleteById(matchRecordUserId);
	}

	@Transactional
	@Override
	public MatchRecordUser getMatchRecordUserInfoById(String matchRecordUserId) {
		if(matchRecordUserId==null){
			throw new StrongestScholarException("E_201810121504_57_013","传入的id为空");
		}
		return matchRecordUserRepository.findByMatchRecordUserId(matchRecordUserId);
	}
}
