package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserCoinDetailRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserGPDetailRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserLPDetailRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserCoinDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserGPDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserLPDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.BackUserDetaiService;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/18 11:16
 * @Description 用户金币、学点、绩点明细查询
 */
@Service
public class BackUserDetailServiceImpl implements BackUserDetaiService {
    @Autowired
    UserCoinDetailRepository userCoinDetailRepository;
    @Autowired
    UserGPDetailRepository userGPDetailRepository;
    @Autowired
    UserLPDetailRepository userLPDetailRepository;
    @Override
    public Page<UserCoinDetail> findCoinDetailByUserId(String userID,Integer pageSize, Integer currentPage){
        if(userID == null){
            throw new StrongestScholarException("E_201810181106_57_011","用户id为空");
        }
        Pageable pageable;
        if(pageSize == null || currentPage == null){
            pageable = PageRequest.of(1, Constants.PAGE_SIZE);
        }else {
            pageable = PageRequest.of(currentPage-1,pageSize);
        }
        return userCoinDetailRepository.findByUserId(userID,pageable);
    }

    @Override
    public Page<UserGPDetail> findGPDetailByUserId(String userID, Integer pageSize, Integer currentPage) {
        if(userID == null){
            throw new StrongestScholarException("E_201810181108_57_012","用户id为空");
        }
        Pageable pageable;
        if(pageSize == null || currentPage == null){
            pageable = PageRequest.of(1, Constants.PAGE_SIZE);
        }else {
            pageable = PageRequest.of(currentPage-1,pageSize);
        }
        return userGPDetailRepository.findByUserId(userID,pageable);
    }

    @Override
    public Page<UserLPDetail> findLPDetailByUserId(String userId, Integer pageSize, Integer currentPage) {
        if(userId == null){
            throw new StrongestScholarException("E_201810181109_57_013","用户id为空");
        }
        Pageable pageable;
        if(pageSize == null || currentPage == null){
            pageable = PageRequest.of(1, Constants.PAGE_SIZE);
        }else {
            pageable = PageRequest.of(currentPage-1,pageSize);
        }
        return userLPDetailRepository.findByUserId(userId,pageable);
    }
}
