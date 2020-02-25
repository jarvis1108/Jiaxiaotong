package com.dxtwangxiao.strongestsuperscholar.module.match.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.match.dao.LPConsumeRecordRepository;
import com.dxtwangxiao.strongestsuperscholar.module.match.dao.MatchRecordQuestionRepository;
import com.dxtwangxiao.strongestsuperscholar.module.match.dao.MatchRecordRepository;
import com.dxtwangxiao.strongestsuperscholar.module.match.dao.MatchRecordUserRepository;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.LPConsumeRecord;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecord;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordQuestion;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordUser;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchService;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceVO;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.*;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.*;
import com.dxtwangxiao.strongestsuperscholar.web.dto.MatchRecordDTO;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 战局服务实现
 * <p>
 * Created By Devin
 * 2018-09-04 下午 03:10
 */
@Service
public class MatchServiceImpl implements MatchService {

    /**
     * 战局列表，用来进行战局管理服务
     */
    private Map<String, MatchRecordDTO> matchList = new ConcurrentHashMap<>();

    @Autowired
    private UserCoinDetailService userCoinDetailService;
    @Autowired
    private UserGPDetailService userGPDetailService;
    @Autowired
    private UserLPDetailService userLPDetailService;

    @Autowired
    private UserService userService;
    @Autowired
    private UserRelInfoService userRelInfoService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private MatchService matchService;

    @Autowired
    private MatchRecordRepository matchRecordRepository;
    @Autowired
    private MatchRecordUserRepository matchRecordUserRepository;
    @Autowired
    private MatchRecordQuestionRepository matchRecordQuestionRepository;
    @Autowired
    private LPConsumeRecordRepository lpConsumeRecordRepository;

    /**
     * 对战结束后更新用户及战局信息
     *
     * @param matchId       战局Id
     * @param userId        用户Id
     * @param coin          金币数
     * @param learningPoint 学点
     * @param gradePoint    绩点
     * @param experience    经验值
     * @param isWin         是否获胜
     * @return 更新后的用户信息
     */
    @Override
    @Transactional
    public UserDTO finish(String matchId, String userId, Integer coin, Integer learningPoint, Integer gradePoint, Integer experience, Integer isWin) {
        // （1）添加用户金币、学点、绩点明细信息
        UserCoinDetail userCoinDetail = userCoinDetailService.save(matchId, userId, coin);
        UserLPDetail userLPDetail = userLPDetailService.save(matchId, userId, learningPoint);
        UserGPDetail userGPDetail = userGPDetailService.save(matchId, userId, gradePoint);

        // （2）更新用户基本信息
        UserRelInfo userRelInfo = userRelInfoService.getByUserId(userId);
        userRelInfo.setCoin(userCoinDetail.getCurrentAmount() < 0 ? 0 : userCoinDetail.getCurrentAmount());
        userRelInfo.setLearningPoint(userLPDetail.getCurrentAmount() < 0 ? 0 : userLPDetail.getCurrentAmount());
        userRelInfo.setGradePoint(userGPDetail.getCurrentAmount());
        userRelInfo.setMatchSumCount(userRelInfo.getMatchSumCount() + 1);
        if (isWin == 1) {
            userRelInfo.setMatchWinCount(userRelInfo.getMatchWinCount() + 1);
        } else if (isWin == 0) {
            userRelInfo.setMatchLoseCount(userRelInfo.getMatchLoseCount() + 1);
        } else if (isWin == -1) {
            userRelInfo.setMatchDogFallCount(userRelInfo.getMatchDogFallCount() + 1);
        }
        userRelInfoService.updateUser(userRelInfo);
        userRelInfoService.addExperience(userId, experience);

        // （3）更新战局信息
        MatchRecord matchRecord = matchRecordRepository.findByMatchRecordId(matchId);
        matchRecord.setEndTime(new Timestamp(new Date().getTime()));
        Integer matchPeriod = (int) (matchRecord.getEndTime().getTime() - matchRecord.getBeginTime().getTime()) / 1000;
        matchRecord.setMatchPeriod(matchPeriod);
        matchRecordRepository.save(matchRecord);

        // (4) 更新战局用户信息
        MatchRecordUser matchRecordUser = matchRecordUserRepository.findByMatchRecordIdAndUserId(matchId, userId);
        matchRecordUser.setAcquiredLearningPoint(learningPoint);
        matchRecordUser.setAcquiredGradePoint(gradePoint);
        matchRecordUser.setAcquiredGradeCoin(coin);
        matchRecordUser.setLastUpdUser(userId);
        matchRecordUserRepository.save(matchRecordUser);

        // (5) 更新战局状态为-1，表示战局已结束
        matchService.getMatchByMatchId(matchId).setFightStatus(Byte.valueOf("-1"));

        // (6) 获取用户信息，返回给客户端
        return userService.getUserDTOById(userId);
    }

    /**
     * 创建战局
     *
     * @param userId    占据创建者Id
     * @param matchType 战局类型，0：匹配对战；1：好友对战；2：群PK；
     * @return 创建后的战局信息
     */
    @Override
    @Transactional
    public MatchRecordDTO createMatchRecord(String userId, Byte matchType) {
        // 1.创建MatchRecord实例
        MatchRecordDTO matchRecordDTO = new MatchRecordDTO();
        matchRecordDTO.setMatchRecordId(UUIDUtil.getUUID());
        matchRecordDTO.setMatchRecordNo(matchRecordDTO.getMatchRecordId());
        matchRecordDTO.setUserId(userId);
        matchRecordDTO.setMatchType(matchType);
        if (matchType == 0) {                         // 匹配对战
            matchRecordDTO.setUserMaxCount(2);
        } else if (matchType == 1) {                  // 好友PK
            matchRecordDTO.setUserMaxCount(2);
        } else if (matchType == 2) {                  // 群PK
            matchRecordDTO.setUserMaxCount(10);
        }
        matchRecordDTO.setUserFactCount(0);
        matchRecordDTO.setRequestQuestionUserCount(0);
        matchRecordDTO.setAnsweredCount(0);
        matchRecordDTO.setFightStatus(Byte.valueOf("0"));
        matchRecordDTO.setCreateUser(userId);
        matchRecordDTO.setCreateTime(new Timestamp(new Date().getTime()));
        matchRecordDTO.setBeginTime(new Timestamp(new Date().getTime()));

        // 2.保存战局信息到数据库
        MatchRecord matchRecord = new MatchRecord();
        BeanUtils.copyProperties(matchRecordDTO, matchRecord);
        matchRecord.setIsValid(Byte.valueOf("1"));
        matchRecordRepository.save(matchRecord);

        // 3.根据出题设置从数据库中获取相应的题目，并保存到数据库（目前只有选择题）
        List<QuestionMultipleChoiceVO> questionMultipleChoiceVOList = questionService.getRandomQuestions();
        if (questionMultipleChoiceVOList != null && !questionMultipleChoiceVOList.isEmpty()){
            for (int i = 0; i < questionMultipleChoiceVOList.size(); i++) {
                QuestionMultipleChoiceVO questionMultipleChoiceVO = questionMultipleChoiceVOList.get(i);

                MatchRecordQuestion matchRecordQuestion = new MatchRecordQuestion();
                matchRecordQuestion.setMatchRecordQuestionId(UUIDUtil.getUUID());
                matchRecordQuestion.setMatchRecordId(matchRecordDTO.getMatchRecordId());
                matchRecordQuestion.setMatchRecordNo(matchRecordDTO.getMatchRecordNo());
                matchRecordQuestion.setQuestionIndex(i + 1);
                matchRecordQuestion.setQuestionId(questionMultipleChoiceVO.getQuestionId());
                matchRecordQuestion.setQuestionNo(questionMultipleChoiceVO.getQuestionId());
                matchRecordQuestion.setCreateTime(new Timestamp(new Date().getTime()));
                matchRecordQuestion.setCreateUser(userId);
                matchRecordQuestion.setLastUpdUser(userId);
                matchRecordQuestion.setIsValid(Byte.valueOf("1"));

                matchRecordQuestionRepository.save(matchRecordQuestion);
                matchRecordDTO.getQuestionList().add(questionMultipleChoiceVO);
                matchRecordDTO.getMatchRecordQuestionMap().put(i + 1, matchRecordQuestion);
            }
        }
        matchList.put(matchRecordDTO.getMatchRecordId(), matchRecordDTO);
        return matchRecordDTO;
    }

    /**
     * 生成知识练兵场战局
     *
     * @param userId    战局创建用户Id
     * @param subjectId 科目Id
     * @return 创建后的战局信息
     */
    @Override
    @Transactional
    public MatchRecordDTO createExercise(String userId, String subjectId) {
        // 1.创建MatchRecord实例
        MatchRecordDTO matchRecordDTO = new MatchRecordDTO();
        matchRecordDTO.setMatchRecordId(UUIDUtil.getUUID());
        matchRecordDTO.setMatchRecordNo(matchRecordDTO.getMatchRecordId());
        matchRecordDTO.setUserId(userId);
        matchRecordDTO.setMatchType(Byte.valueOf("3"));
        matchRecordDTO.setUserMaxCount(1);
        matchRecordDTO.setUserFactCount(0);
        matchRecordDTO.setFightStatus(Byte.valueOf("1"));
        matchRecordDTO.setCreateUser(userId);
        matchRecordDTO.setCreateTime(new Timestamp(new Date().getTime()));
        matchRecordDTO.setBeginTime(new Timestamp(new Date().getTime()));

        // 2.保存战局信息到数据库
        MatchRecord matchRecord = new MatchRecord();
        BeanUtils.copyProperties(matchRecordDTO, matchRecord);
        matchRecord.setIsValid(Byte.valueOf("1"));
        matchRecordRepository.save(matchRecord);

        // 3.根据出题设置从数据库中获取相应的题目，并保存到数据库（目前只有选择题）
        List<QuestionMultipleChoiceVO> questionMultipleChoiceVOList = questionService.getQuestionsBySubjectId(subjectId);
        if (questionMultipleChoiceVOList != null && !questionMultipleChoiceVOList.isEmpty()){
            for (int i = 0; i < questionMultipleChoiceVOList.size(); i++) {
                QuestionMultipleChoiceVO questionMultipleChoiceVO = questionMultipleChoiceVOList.get(i);

                MatchRecordQuestion matchRecordQuestion = new MatchRecordQuestion();
                matchRecordQuestion.setMatchRecordQuestionId(UUIDUtil.getUUID());
                matchRecordQuestion.setMatchRecordId(matchRecordDTO.getMatchRecordId());
                matchRecordQuestion.setMatchRecordNo(matchRecordDTO.getMatchRecordNo());
                matchRecordQuestion.setQuestionIndex(i + 1);
                matchRecordQuestion.setQuestionId(questionMultipleChoiceVO.getQuestionId());
                matchRecordQuestion.setQuestionNo(questionMultipleChoiceVO.getQuestionId());
                matchRecordQuestion.setCreateTime(new Timestamp(new Date().getTime()));
                matchRecordQuestion.setCreateUser(userId);
                matchRecordQuestion.setLastUpdUser(userId);
                matchRecordQuestion.setIsValid(Byte.valueOf("1"));

                matchRecordQuestionRepository.save(matchRecordQuestion);
                matchRecordDTO.getQuestionList().add(questionMultipleChoiceVO);
                matchRecordDTO.getMatchRecordQuestionMap().put(i + 1, matchRecordQuestion);
            }
        }


        matchList.put(matchRecordDTO.getMatchRecordId(), matchRecordDTO);

        // 4.添加战局用户到数据库
        UserDTO userDTO = userService.getUserDTOById(userId);
        addUser(matchRecordDTO.getMatchRecordId(), userDTO, Byte.valueOf("1"));

        return matchRecordDTO;
    }


    /**
     * 为指定战局添加用户
     *
     * @param matchId   战局ID
     * @param userDTO   用户信息
     * @param isCreator 是否是战局创建者，1表示是，0表示不是
     */
    @Override
    public void addUser(String matchId, UserDTO userDTO, Byte isCreator) {
        MatchRecordDTO matchRecordDTO = matchList.get(matchId);
        matchRecordDTO.getMatchScoreUser().put(userDTO.getUserId(), userDTO);
        matchRecordDTO.getUserList().add(userDTO);

        Integer userCount = matchRecordDTO.getUserFactCount() + 1;
        matchRecordDTO.setUserFactCount(userCount);

        MatchRecordUser matchRecordUser = new MatchRecordUser();
        matchRecordUser.setMatchRecordUserId(UUIDUtil.getUUID());
        matchRecordUser.setMatchRecordId(matchRecordDTO.getMatchRecordId());
        matchRecordUser.setMatchRecordNo(matchRecordDTO.getMatchRecordNo());
        matchRecordUser.setUserId(userDTO.getUserId());
        matchRecordUser.setUserNo(userDTO.getUserNo());
        matchRecordUser.setOriginalGradeCoin(userDTO.getCoin());
        matchRecordUser.setOriginalGradePoint(userDTO.getGradePoint());
        matchRecordUser.setOriginalLearningPoint(userDTO.getLearningPoint());
        matchRecordUser.setAcquiredGradeCoin(0);
        matchRecordUser.setAcquiredGradePoint(0);
        matchRecordUser.setAcquiredLearningPoint(0);
        matchRecordUser.setIsCreator(isCreator);
        matchRecordUser.setCreateTime(new Timestamp(new Date().getTime()));
        matchRecordUser.setCreateUser(userDTO.getUserId());
        matchRecordUser.setLastUpdUser(userDTO.getUserId());
        matchRecordUser.setIsValid(Byte.valueOf("1"));

        matchRecordUserRepository.save(matchRecordUser);
        matchRecordDTO.getMatchRecordUserMap().put(userDTO.getUserId(), matchRecordUser);
        matchList.replace(matchId, matchRecordDTO);
    }

    /**
     * 为战局添加学点消耗记录
     *
     * @param matchId       战局ID
     * @param userId        用户ID
     * @param questionIndex 试题在当前战局中的序号
     * @param userAnswer    用户答案
     * @param amount        学点消耗数量
     * @param isTrue        用户答案是否正确
     */
    @Override
    public void saveLpConsumeRecord(String matchId, String userId, Integer questionIndex, String userAnswer, Integer amount, Byte isTrue) {
        MatchRecordDTO matchRecordDTO = matchList.get(matchId);
        MatchRecordQuestion matchRecordQuestion = matchRecordDTO.getMatchRecordQuestionMap().get(questionIndex);
        MatchRecordUser matchRecordUser = matchRecordDTO.getMatchRecordUserMap().get(userId);

        LPConsumeRecord lpConsumeRecord = new LPConsumeRecord();
        lpConsumeRecord.setLpConsumeRecordId(UUIDUtil.getUUID());
        lpConsumeRecord.setMatchRecordQuestionId(matchRecordQuestion.getMatchRecordQuestionId());
        lpConsumeRecord.setMatchRecordId(matchRecordDTO.getMatchRecordId());
        lpConsumeRecord.setMatchRecordNo(matchRecordDTO.getMatchRecordNo());
        lpConsumeRecord.setMatchRecordUserId(matchRecordUser.getMatchRecordUserId());
        lpConsumeRecord.setQuestionId(matchRecordQuestion.getQuestionId());
        lpConsumeRecord.setQuestionNo(matchRecordQuestion.getQuestionNo());
        lpConsumeRecord.setUserId(matchRecordUser.getUserId());
        lpConsumeRecord.setUserNo(matchRecordUser.getUserNo());
        lpConsumeRecord.setUserAnswer(userAnswer);
        lpConsumeRecord.setAmount(amount);
        lpConsumeRecord.setIsTrue(isTrue);
        lpConsumeRecord.setCreateTime(new Timestamp(new Date().getTime()));
        lpConsumeRecord.setIsValid(Byte.valueOf("1"));

        lpConsumeRecordRepository.save(lpConsumeRecord);
    }

    /**
     * 根据战局ID获取某一战局记录
     *
     * @param matchId 战局ID
     * @return 战局记录
     */
    public MatchRecordDTO getMatchByMatchId(String matchId) {
        return matchList.get(matchId);
    }

    /**
     * 根据用户Id获取其所在的战局
     *
     * @param userId 用户Id
     * @return
     */
    public MatchRecordDTO getMatchByUserId(String userId) {
        Iterator<Map.Entry<String, MatchRecordDTO>> iterator = matchList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, MatchRecordDTO> entry = iterator.next();
            MatchRecordDTO matchRecordDTO = entry.getValue();
            List<UserDTO> userList = matchRecordDTO.getUserList();
            for (UserDTO user : userList) {
                if (user.getUserId().equals(userId)) {
                    return matchRecordDTO;
                }
            }
        }
        return null;
    }

    /**
     * 根据战局Id删除战局
     *
     * @param matchId 战局Id
     */
    public synchronized void removeMatchByMatchId(String matchId) {
        matchList.remove(matchId);
    }

    /**
     * 增加战局中答完当前题的人数
     *
     * @param matchId 战局ID
     * @return
     */
    public synchronized void addAnsweredCountForMatch(String matchId) {
        MatchRecordDTO matchRecordDTO = getMatchByMatchId(matchId);
        matchRecordDTO.setAnsweredCount(matchRecordDTO.getAnsweredCount() + 1);
    }

    /**
     * 初始化答题人数为零
     *
     * @param matchId 战局ID
     * @return
     */
    public synchronized void initAnsweredCountForMatch(String matchId) {
        MatchRecordDTO matchRecordDTO = getMatchByMatchId(matchId);
        matchRecordDTO.setAnsweredCount(0);
    }

    /**
     * 初始化请求出题用户数目为0
     *
     * @param matchId 战局Id
     */
    public synchronized void initRequestQuestionCount(String matchId) {
        MatchRecordDTO matchRecordDTO = matchList.get(matchId);
        matchRecordDTO.setRequestQuestionUserCount(0);
    }

    /**
     * 增加战局中请求出题的人数
     *
     * @param matchId 战局Id
     */
    public synchronized void addRequestQuestionCount(String matchId) {
        MatchRecordDTO matchRecordDTO = matchList.get(matchId);
        matchRecordDTO.setRequestQuestionUserCount(matchRecordDTO.getRequestQuestionUserCount() + 1);
    }

    /**
     * 记录用户分数信息
     *
     * @param matchId 战局Id
     * @param userId  用户Id
     * @param score   分数
     */
    public synchronized void addScore(String matchId, String userId, int score) {
        MatchRecordDTO matchRecordDTO = matchList.get(matchId);
        matchRecordDTO.getMatchScoreMap().put(userId, matchRecordDTO.getMatchScoreMap().get(userId) + score);
    }

    /**
     * 好友对战及群PK过程中，非战局创建者退出，删除战局用户信息
     *
     * @param userId  退出用户id
     * @param matchId 战局id
     */
    @Override
    @Transactional
    public void removeUser(String userId, String matchId) {
        UserDTO userDTO = userService.getUserDTOById(userId);
        MatchRecordDTO match = matchList.get(matchId);

        // 1.设置战局实际用户数量为1
        match.setUserFactCount(1);

        // 2.从数据库中删除战局用户信息
        MatchRecordUser matchRecordUser = match.getMatchRecordUserMap().get(userId);
        matchRecordUserRepository.delete(matchRecordUser);

        // 3.清除相关记录信息
        if (match.getUserList() != null && match.getUserList().contains(userDTO)) {
            match.getUserList().remove(userDTO);
        }

        if (match.getMatchRecordUserMap() != null && match.getMatchRecordUserMap().containsKey(userId)) {
            match.getMatchRecordUserMap().remove(userId);
        }

        if (match.getMatchScoreMap() != null && match.getMatchScoreMap().containsKey(userId)) {
            match.getMatchScoreMap().remove(userId);
        }

        if (match.getMatchScoreUser() != null && match.getMatchScoreUser().containsKey(userId)) {
            match.getMatchScoreUser().remove(userId);
        }
    }
}