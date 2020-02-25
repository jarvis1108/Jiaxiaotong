package com.dxtwangxiao.strongestsuperscholar.module.community.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.community.dao.CommunityRoleRepository;
import com.dxtwangxiao.strongestsuperscholar.module.community.dao.SpecialTrainingRepository;
import com.dxtwangxiao.strongestsuperscholar.module.community.dao.SpecialTrainingVORepository;
import com.dxtwangxiao.strongestsuperscholar.module.community.entity.CommunityRole;
import com.dxtwangxiao.strongestsuperscholar.module.community.entity.SpecialTraining;
import com.dxtwangxiao.strongestsuperscholar.module.community.service.SpecialTrainingVOService;
import com.dxtwangxiao.strongestsuperscholar.module.community.vo.SpecialTrainingVO;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.User;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @Auther: 程志强
 * @Date: 2018/9/10 15:06
 * @Description:
 */
@Service
@Slf4j
public class SpecialTrainingVOServiceImpl implements SpecialTrainingVOService {

	@Autowired
	SpecialTrainingVORepository specialTrainingVORepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	SpecialTrainingRepository specialTrainingRepository;
	@Autowired
	CommunityRoleRepository communityRoleRepository;

	@Transactional
	@Override
	public List<SpecialTrainingVO> getSpecialTrainingMembers(String lastUserId) {
		if(null==lastUserId){
			throw new StrongestScholarException("E_201809122117_57_011","用户id为空");
		}
		return specialTrainingVORepository.findByLastUserId(lastUserId);
	}

	/**
	 * 功能描述: 分页查询某用户的训练营营员，如果不是分页，说明只有一页，则查询所有
	 *
	 * @param: [currentPage, pageSize, lastUserId][当前页码，每页条数大小,父节点id]
	 * @return: java.util.List<com.dxtwangxiao.strongestsuperscholar.module.community.vo.SpecialTrainingVO>
	 * @auther: 程志强
	 * @date: 2018/9/10 16:19
	 */
	@Transactional
	@Override
	public List<SpecialTrainingVO> getSpecialTrainingMembers(Integer currentPage, Integer pageSize, String lastUserId) {
		if(null==lastUserId){
			throw new StrongestScholarException("E_201809122117_57_012","用户id为空");
		}
		if (currentPage == null || pageSize == null) {
			return specialTrainingVORepository.findByLastUserId(lastUserId);
		} else {
			Pageable pageable = PageRequest.of(currentPage - 1, pageSize);
			Page<SpecialTrainingVO> specialTrainingVOs = specialTrainingVORepository.findByLastUserId(pageable, lastUserId);
			return specialTrainingVOs.getContent();
		}
	}

	/**
	 * 功能描述: 添加新的训练营成员
	 *
	 * @param: userId, 要添加的新成员的userId字段
	 * @param: lastUserId, 当前用户的userId字段
	 * @return: void
	 * @auther: 程志强
	 * @date: 2018/9/11 15:29
	 */
	@Transactional
	@Override
	public void createNewMember(String userId, String lastUserId) throws StrongestScholarException {
		if(null==lastUserId){
			throw new StrongestScholarException("E_201809122117_57_013","当前用户id为空");
		}else if(null == userId){
			throw new StrongestScholarException("E_201809122117_57_014","添加的新用户id为空");
		}
		//获取新添加成员的user信息
		User user = userRepository.findUserByUserId(userId);
		//判断该新用户是否已经属于一个训练营了
		if (specialTrainingRepository.findByUserId(userId) != null) {
			throw new StrongestScholarException("E_201809111731_57_011", "该用户已经属于一个训练营了");
		}
		String specialTrainingName = specialTrainingRepository.findByUserId(lastUserId).getSpecialTrainingName();
		//根据参数userId创建新训练营成员，设置默认信息
		SpecialTraining specialTraining = new SpecialTraining();
		specialTraining.setSpecialTrainingId(UUIDUtil.getUUID());
		specialTraining.setSpecialTrainingName(specialTrainingName);
		specialTraining.setUserId(userId);
		specialTraining.setUserNo(user.getUserNo());
		specialTraining.setLastUserId(lastUserId);
		specialTraining.setCommunityRoleId(UUIDUtil.getUUID());
		specialTraining.setIsLeafNode((byte) 1);
		specialTraining.setCreateTime(new Timestamp(new Date().getTime()));
		specialTraining.setLastUpdTime(new Timestamp(new Date().getTime()));
		specialTraining.setIsValid((byte) 1);

		//创建社区角色内容，设置默认信息
		CommunityRole communityRole = new CommunityRole();
		communityRole.setCommunityRoleId(specialTraining.getCommunityRoleId());
		communityRole.setCommunityRoleName("新兵");
		communityRole.setLevel("1");
		communityRole.setCreateTime(new Timestamp(new Date().getTime()));
		communityRole.setLastUpdTime(new Timestamp(new Date().getTime()));
		communityRole.setIsValid((byte) 1);

		if (null == communityRole) {
			throw new StrongestScholarException("E_201807300855_57_011", "社区角色为空");
		}
		if (null == specialTraining) {
			throw new StrongestScholarException("E_201807300855_57_013", "特训营为空");
		}
		specialTrainingRepository.save(specialTraining);
		communityRoleRepository.save(communityRole);
	}

	@Override
	public SpecialTrainingVO getSpecialTrainingByUserId(String userId) {
		if(null == userId){
			throw new StrongestScholarException("E_201809132222_57_011","用户id为空");
		}
		return specialTrainingVORepository.findByUserId(userId);
	}
}
