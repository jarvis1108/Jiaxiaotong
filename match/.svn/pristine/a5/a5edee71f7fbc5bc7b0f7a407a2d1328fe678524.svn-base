package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.question.entity.Question;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.MatchSettingRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.QuestionSettingRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.MatchSetting;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.QuestionSetting;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.RuleSettingService;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by 孙伟浩 on 2018/10/17.
 */
@Service
public class RuleSettingServiceImpl implements RuleSettingService {

    @Autowired
    private QuestionSettingRepository questionSettingRepository;

    @Autowired
    private MatchSettingRepository matchSettingRepository;

    /**
     * 获取当前问题设定
     *
     * @param
     * @return
     */
    @Override
    public QuestionSetting findQS() {
        List<QuestionSetting> questionSettingList = questionSettingRepository.findAll();
        if (questionSettingList.size() == 0){
            return null;
        }
        return questionSettingList.get(0);
    }


    /**
     * 获取当前战局设定
     *
     * @param
     * @return
     */
    @Override
    public MatchSetting findMS() {
        List<MatchSetting> matchSettingList = matchSettingRepository.findAll();
        if (matchSettingList.size() == 0){
            return null;
        }

        return matchSettingList.get(0);
    }


    /**
     * 更新问题设定
     *
     * @param questionNumber 战局中出题数目
     * @return
     */
    @Override
    public QuestionSetting updateQS(Integer questionNumber) {
        if (questionNumber == null){
            return findQS();
        }

        List<QuestionSetting> questionSettingList = questionSettingRepository.findAll();

        // 1.不存在则新建
        if (questionSettingList.size() == 0){
            QuestionSetting questionSetting = new QuestionSetting();
            questionSetting.setQuestionSettingId(UUID.randomUUID().toString());
            questionSetting.setQuestionNumber(questionNumber);
            questionSettingRepository.saveAndFlush(questionSetting);
            return questionSetting;
        }

        // 2.修改所有的设定
        QuestionSetting questionSetting = new QuestionSetting();
        for (int i = 0; i < questionSettingList.size(); i++) {
            questionSetting = questionSettingList.get(i);
            questionSetting.setQuestionNumber(questionNumber);
            questionSettingRepository.saveAndFlush(questionSetting);
        }
        return questionSetting;
    }


    /**
     * 更新战局设定
     *
     * @param maxMatchCount 最大匹配次数
     * @param maxMatchTime 最长匹配时间
     * @return
     */
    @Override
    public MatchSetting updateMS(Integer maxMatchCount, Integer maxMatchTime) {
        if (maxMatchCount == null && maxMatchTime == null){
            return findMS();
        }

        else if (maxMatchCount == null){
            maxMatchCount = findMS().getMaxMatchCount();
        }

        else if (maxMatchTime == null){
            maxMatchTime = findMS().getMatchTime();
        }

        List<MatchSetting> matchSettingList = matchSettingRepository.findAll();

        // 1.不存在就新建
        if (matchSettingList.size() == 0){
            MatchSetting matchSetting = new MatchSetting();
            matchSetting.setMatchSettingId(UUIDUtil.getUUID());
            matchSetting.setMatchTime(maxMatchTime);
            matchSetting.setMaxMatchCount(maxMatchCount);
            matchSettingRepository.saveAndFlush(matchSetting);
            return matchSetting;
        }

        // 2.修改所有的战局设定
        MatchSetting matchSetting = new MatchSetting();
        for (MatchSetting m : matchSettingList) {
            matchSetting = m;
            matchSetting.setMaxMatchCount(maxMatchCount);
            matchSetting.setMatchTime(maxMatchTime);
            matchSettingRepository.saveAndFlush(matchSetting);
        }
        return matchSetting;
    }
}
