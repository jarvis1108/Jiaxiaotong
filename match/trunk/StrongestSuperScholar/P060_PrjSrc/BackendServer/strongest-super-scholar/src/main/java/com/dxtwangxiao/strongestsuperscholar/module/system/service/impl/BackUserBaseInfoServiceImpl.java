package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.*;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.*;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.BackUserBaseInfoService;
import com.dxtwangxiao.strongestsuperscholar.module.system.vo.BackUserBaseInfo;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.Constants;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import javax.xml.ws.ServiceMode;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/11 22:51
 * @Description 后台管理系统 用户基础数据管理服务层
 */
@Service
public class BackUserBaseInfoServiceImpl implements BackUserBaseInfoService {
    @Autowired
    BackUserBaseInfoVORepository backUserBaseInfoVORepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserRelInfoRepository userRelInfoRepository;
    @Autowired
    UserCoinDetailRepository userCoinDetailRepository;
    @Autowired
    UserLPDetailRepository userLPDetailRepository;
    @Autowired
    UserGPDetailRepository userGPDetailRepository;
    @Autowired
    UserLoginRecordRepository userLoginRecordRepository;
    /**
     * 功能描述: 后台管理系统用户管理部分 基本信息查询（所有数据查询）
     *
     * @param: currentPage 当前页码
     * @param: pageSize    每一页的数据量
     * @return:  获得的当前页数的所有用户基本信息，如有只有一页则为全部数据（UserRelInfo表)
     * @auther: 程志强
     * @date: 2018/10/11 22:20
     */
    @Transactional
    @Override
    public Page<BackUserBaseInfo> getAllUserBaseInfos(Integer currentPage, Integer pageSize, JSONObject reqParam) {
        Specification<BackUserBaseInfo> specification = new Specification<BackUserBaseInfo>() {
            @Override
            public Predicate toPredicate(Root<BackUserBaseInfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if(reqParam != null){
                    //条件限定
                    //微信名模糊匹配
                    if(reqParam.get("wechatName") != null){
                        predicates.add(criteriaBuilder.like(root.get("wechatName").as(String.class),"%"+reqParam.getString("wechatName")+"%"));
                    }

                    //学点范围搜索
                    if(reqParam.get("minLearningPoint") != null && reqParam.get("maxLearningPoint") != null){
                        predicates.add(criteriaBuilder.between(root.get("learningPoint").as(Integer.class),reqParam.getInteger("minLearningPoint")-1,reqParam.getInteger("maxLearningPoint")));
                    }
                    if(reqParam.get("minLearningPoint") != null && reqParam.get("maxLearningPoint") == null){
                        predicates.add(criteriaBuilder.greaterThan(root.get("learningPoint").as(Integer.class),reqParam.getInteger("minLearningPoint")-1));
                    }
                    if(reqParam.get("minLearningPoint") == null && reqParam.get("maxLearningPoint") != null){
                        predicates.add(criteriaBuilder.lessThan(root.get("learningPoint").as(Integer.class),reqParam.getInteger("maxLearningPoint")));
                    }

                    //绩点范围搜索
                    if(reqParam.get("minGradePoint") != null && reqParam.get("maxGradePoint") != null){
                        predicates.add(criteriaBuilder.between(root.get("gradePoint").as(Integer.class),reqParam.getInteger("minGradePoint")-1,reqParam.getInteger("maxGradePoint")));
                    }
                    if(reqParam.get("minGradePoint") != null && reqParam.get("maxGradePoint") == null){
                        predicates.add(criteriaBuilder.greaterThan(root.get("gradePoint").as(Integer.class),reqParam.getInteger("minGradePoint")-1));
                    }
                    if(reqParam.get("minGradePoint") == null && reqParam.get("maxGradePoint") != null){
                        predicates.add(criteriaBuilder.lessThan(root.get("gradePoint").as(Integer.class),reqParam.getInteger("maxGradePoint")));
                    }

                    //金币范围搜索
                    if(reqParam.get("minCoin") != null && reqParam.get("maxCoin") != null){
                        predicates.add(criteriaBuilder.between(root.get("coin").as(Integer.class),reqParam.getInteger("minCoin")-1,reqParam.getInteger("maxCoin")));
                    }
                    if(reqParam.get("minCoin") != null && reqParam.get("maxCoin") == null){
                        predicates.add(criteriaBuilder.greaterThan(root.get("coin").as(Integer.class),reqParam.getInteger("minCoin")-1));
                    }
                    if(reqParam.get("minCoin") == null && reqParam.get("maxCoin") != null){
                        predicates.add(criteriaBuilder.lessThan(root.get("coin").as(Integer.class),reqParam.getInteger("maxCoin")));
                    }
                }

                if(predicates.size()==0){
                    return null;
                }
                Predicate[] tp = new Predicate[predicates.size()];
                return criteriaBuilder.and(predicates.toArray(tp));
            }
        };

        List<BackUserBaseInfo> list;
        Pageable pageable;
        if(currentPage == null || pageSize == null){
            pageable = PageRequest.of(1, Constants.PAGE_SIZE);
        }else {
            pageable = PageRequest.of(currentPage - 1, pageSize);
        }

        return backUserBaseInfoVORepository.findAll(specification,pageable);

        //如果表格userLoginRecord不覆盖loginTime数据，则进行筛选
        /*HashMap<String,Timestamp> userLoginList = new HashMap<>();
        for(BackUserBaseInfo temp : list){
            if(!userLoginList.containsKey(temp.getUserId())){
                userLoginList.put(temp.getUserId(),temp.getLoginTime());
            }
        }
        ArrayList<BackUserBaseInfo> results = new ArrayList<>();
        for(String userId : userLoginList.keySet()){
            BackUserBaseInfo subInfo = backUserBaseInfoVORepository.findByUserIdOrderByLoginTimeDesc(userId).get(0);
            results.add(subInfo);
        }
        return results;
        */
    }

    /**
     * 功能描述: 更新某一行的用户数据信息
     *
     * @param:来自前端的当前行数据
     * @auther: 程志强
     * @date: 2018/10/11 22:57
     */
    @Transactional
    @Override
    public void updateUserBaseInfo(String userId,JSONObject reqParam) {
        if(null == userId){
            throw new StrongestScholarException("E_201810112304_57_011","用户id为空");
        }

        UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);

        if(reqParam != null){
            if(reqParam.getInteger("coin") != null){
                //如果管理员修改了coin的值，则为该用户生成新的金币明细记录，下同
                saveUserCoinDetail(userId,userRelInfo.getCoin(),reqParam.getInteger("coin"));
                userRelInfo.setCoin(reqParam.getInteger("coin"));
            }
            if(reqParam.getInteger("gradePoint") != null){
                saveUserGPDetail(userId,userRelInfo.getGradePoint(),reqParam.getInteger("gradePoint"));
                userRelInfo.setGradePoint(reqParam.getInteger("gradePoint"));
            }
            if(reqParam.getInteger("learningPoint") != null){
                saveUserLPDetail(userId,userRelInfo.getLearningPoint(),reqParam.getInteger("learningPoint"));
                userRelInfo.setLearningPoint(reqParam.getInteger("learningPoint"));
            }
            if(reqParam.getInteger("matchSumCount") != null){
                userRelInfo.setMatchSumCount(reqParam.getInteger("matchSumCount"));
            }
            if(reqParam.getInteger("matchWinCount") != null){
                userRelInfo.setMatchWinCount(reqParam.getInteger("matchWinCount"));
            }
            if(reqParam.getInteger("matchLoseCount") != null){
                userRelInfo.setMatchLoseCount(reqParam.getInteger("matchLoseCount"));
            }
            if(reqParam.getInteger("matchDogFallCount") != null){
                userRelInfo.setMatchDogFallCount(reqParam.getInteger("matchDogFallCount"));
            }
            if(reqParam.getInteger("experience") != null){
                userRelInfo.setExperience(reqParam.getInteger("experience"));
            }
            if(reqParam.getInteger("externalLevel") != null){
                userRelInfo.setExternalLevel(reqParam.getInteger("externalLevel"));
            }
        }

        userRelInfoRepository.save(userRelInfo);
    }

    /**
     * 功能描述: 冻结和解冻某个用户
     *
     * @param: 来自前端的当前行数据
     * @auther: 程志强
     * @date: 2018/10/11 23:53
     */
    @Transactional
    @Override
    public void lockOrUnlockUser(String userId, JSONObject reqParam) {
        if(null == userId){
            throw new StrongestScholarException("E_201810112354_57_013","用户id为空");
        }

        Byte isValid = reqParam.getByte("isValid");

        User user = userRepository.findByUserId(userId);
        user.setIsValid(isValid);

        UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);
        userRelInfo.setIsValid(isValid);

        userRelInfoRepository.save(userRelInfo);
        userRepository.save(user);
    }

    /**
     * 功能描述: 根据用户id查询用户基础信息
     *
     * @param: userId 用户id
     * @auther: 程志强
     * @date: 2018/10/13 19:14
     */
    @Transactional
    @Override
    public BackUserBaseInfo getBackUserBaseInfoByUserId(String userId) {
        if(null == userId){
            throw new StrongestScholarException("E_201810120043_57_013","userId为空");
        }

        return backUserBaseInfoVORepository.findByUserId(userId);
        //如果表格userLoginRecord不覆盖loginTime数据，则进行筛选
        //return backUserBaseInfoVORepository.findByUserIdOrderByLoginTimeDesc(userId).get(0);
    }

    //该coin数据为后台管理员直接修改的coin数据，等于修改后的结果currentCoin，和另一个controller中的参数coin不同
    @Override
    public void saveUserCoinDetail(String userId,Integer originCoin, Integer newCoin) {
        UserCoinDetail userCoinDetail = new UserCoinDetail();
        userCoinDetail.setUserCoinDetailId(UUIDUtil.getUUID());
        userCoinDetail.setUserCoinDetailNo(userCoinDetail.getUserCoinDetailId());
        userCoinDetail.setUserId(userId);
        userCoinDetail.setUserNo(userId);
        userCoinDetail.setOccurTime(new Timestamp(new Date().getTime()));
        userCoinDetail.setOriginalAmount(originCoin);
        if (originCoin < newCoin) {
            userCoinDetail.setAcquiredAmount(newCoin - originCoin);
            userCoinDetail.setLossAmount(0);
        } else {
            userCoinDetail.setAcquiredAmount(0);
            userCoinDetail.setLossAmount(originCoin - newCoin);
        }
        userCoinDetail.setCurrentAmount(newCoin);
        userCoinDetail.setReasonType("后台修改");
        userCoinDetail.setCreateTime(new Timestamp(new Date().getTime()));
        userCoinDetail.setCreateUser(userId);
        userCoinDetail.setLastUpdUser(userId);
        userCoinDetail.setIsValid(Byte.valueOf("1"));

        userCoinDetailRepository.save(userCoinDetail);
    }

    @Override
    public void saveUserGPDetail(String userId, Integer originGradePoint, Integer newGradePoint) {
        UserGPDetail userGPDetail = new UserGPDetail();
        userGPDetail.setUserGpDetailId(UUIDUtil.getUUID());
        userGPDetail.setUserGpDetailNo(userGPDetail.getUserGpDetailId());
        userGPDetail.setUserId(userId);
        userGPDetail.setUserNo(userId);
        userGPDetail.setOccurTime(new Timestamp(new Date().getTime()));
        userGPDetail.setOriginalAmount(originGradePoint);
        if (newGradePoint > originGradePoint) {
            userGPDetail.setAcquiredAmount(newGradePoint - originGradePoint);
            userGPDetail.setLossAmount(0);
        } else {
            userGPDetail.setAcquiredAmount(0);
            userGPDetail.setLossAmount(originGradePoint - newGradePoint);
        }
        userGPDetail.setCurrentAmount(newGradePoint);
        userGPDetail.setReasonType("后台修改");
        userGPDetail.setCreateTime(new Timestamp(new Date().getTime()));
        userGPDetail.setCreateUser(userId);
        userGPDetail.setLastUpdUser(userId);
        userGPDetail.setIsValid(Byte.valueOf("1"));

        userGPDetailRepository.save(userGPDetail);
    }

    @Override
    public void saveUserLPDetail(String userId, Integer originLearningPoint, Integer newLearningPoint) {
        UserLPDetail userLPDetail = new UserLPDetail();
        userLPDetail.setUserLpDetailId(UUIDUtil.getUUID());
        userLPDetail.setUserLpDetailNo(userLPDetail.getUserLpDetailId());
        userLPDetail.setUserId(userId);
        userLPDetail.setUserNo(userId);
        userLPDetail.setOccurTime(new Timestamp(new Date().getTime()));
        userLPDetail.setOriginalAmount(originLearningPoint);
        if (originLearningPoint < newLearningPoint) {
            userLPDetail.setAcquiredAmount(newLearningPoint - originLearningPoint);
            userLPDetail.setLossAmount(0);
        } else {
            userLPDetail.setAcquiredAmount(0);
            userLPDetail.setLossAmount(originLearningPoint - newLearningPoint);
        }
        userLPDetail.setCurrentAmount(newLearningPoint);
        userLPDetail.setReasonType("后台修改");
        userLPDetail.setCreateTime(new Timestamp(new Date().getTime()));
        userLPDetail.setCreateUser(userId);
        userLPDetail.setLastUpdUser(userId);
        userLPDetail.setIsValid(Byte.valueOf("1"));

        userLPDetailRepository.save(userLPDetail);
    }
}
