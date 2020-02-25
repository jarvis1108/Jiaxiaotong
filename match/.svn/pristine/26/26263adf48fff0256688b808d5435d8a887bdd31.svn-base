package com.dxtwangxiao.strongestsuperscholar.module.system.service;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.MatchSetting;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.QuestionSetting;

/**
 * Created by 孙伟浩 on 2018/10/17.
 */
public interface RuleSettingService {



    /**
      * 获取当前问题设定
      *
      * @param
      * @return
      */
    QuestionSetting findQS();


    /**
      * 获取当前战局设定
      *
      * @param
      * @return
      */
    MatchSetting findMS();


    /**
      * 更新问题设定
      *
      * @param questionNumber 战局中出题数目
      * @return
      */
    QuestionSetting updateQS(Integer questionNumber);

    /**
      * 更新战局设定
      *
      * @param maxMatchCount 最大匹配次数
      * @param maxMatchTime 最长匹配时间
      * @return
      */
    MatchSetting updateMS(Integer maxMatchCount, Integer maxMatchTime);
}
