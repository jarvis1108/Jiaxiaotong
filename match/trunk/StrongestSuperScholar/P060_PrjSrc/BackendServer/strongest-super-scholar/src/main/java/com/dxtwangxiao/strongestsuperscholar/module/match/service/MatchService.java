package com.dxtwangxiao.strongestsuperscholar.module.match.service;

import com.dxtwangxiao.strongestsuperscholar.web.dto.MatchRecordDTO;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;

import java.util.Iterator;
import java.util.Map;

/**
 * 战局服务接口
 * <p>
 * Created By Devin
 * 2018-09-04 下午 03:08
 */
public interface MatchService {

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
     * @return
     */
    UserDTO finish(String matchId, String userId, Integer coin, Integer learningPoint, Integer gradePoint, Integer experience, Integer isWin);

    /**
     * 创建战局
     *
     * @param userId    占据创建者Id
     * @param matchType 战局类型，0：匹配对战；1：好友对战；2：群PK；
     * @return 创建后的战局信息
     */
    MatchRecordDTO createMatchRecord(String userId, Byte matchType);

    /**
     * 生成知识练兵场战局
     *
     * @param userId    战局创建用户Id
     * @param subjectId 科目Id
     * @return 创建后的战局信息
     */
    MatchRecordDTO createExercise(String userId, String subjectId);

    /**
     * 为指定战局添加用户
     *
     * @param matchId   战局ID
     * @param userDTO   用户信息
     * @param isCreator 是否是战局创建者，1表示是，0表示不是
     */
    void addUser(String matchId, UserDTO userDTO, Byte isCreator);

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
    void saveLpConsumeRecord(String matchId, String userId, Integer questionIndex, String userAnswer, Integer amount, Byte isTrue);

    /**
     * 根据战局ID获取某一战局记录
     *
     * @param matchId 战局ID
     * @return 战局记录
     */
    MatchRecordDTO getMatchByMatchId(String matchId);

    /**
     * 根据用户Id获取其所在的战局
     *
     * @param userId 用户Id
     * @return
     */
    MatchRecordDTO getMatchByUserId(String userId);

    /**
     * 根据战局Id删除战局
     *
     * @param matchId 战局Id
     */
    void removeMatchByMatchId(String matchId);

    /**
     * 增加战局中答完当前题的人数
     *
     * @param matchId 战局ID
     * @return
     */
    void addAnsweredCountForMatch(String matchId);

    /**
     * 初始化答题人数为零
     *
     * @param matchId 战局ID
     * @return
     */
    void initAnsweredCountForMatch(String matchId);

    /**
     * 初始化请求出题用户数目为0
     *
     * @param matchId 战局Id
     */
    void initRequestQuestionCount(String matchId);

    /**
     * 增加战局中请求出题的人数
     *
     * @param matchId 战局Id
     */
    void addRequestQuestionCount(String matchId);

    /**
     * 记录用户分数信息
     *
     * @param matchId 战局Id
     * @param userId  用户Id
     * @param score   分数
     */
    void addScore(String matchId, String userId, int score);

    /**
     * 好友对战及群PK过程中，非战局创建者退出，删除战局用户信息
     *
     * @param userId  退出用户id
     * @param matchId 战局id
     */
    void removeUser(String userId, String matchId);
}
