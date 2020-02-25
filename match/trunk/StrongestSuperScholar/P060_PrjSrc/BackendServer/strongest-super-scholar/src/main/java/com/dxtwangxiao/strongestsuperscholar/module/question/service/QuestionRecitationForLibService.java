package com.dxtwangxiao.strongestsuperscholar.module.question.service;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal.QuestionRecitationForLib;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionRecitationForLibVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by 孙伟浩 on 2018/9/6.
 */


public interface QuestionRecitationForLibService {

    /**
     * 存储上传题目
     *
     * @param questionRecitationForLib 上传的背诵题目
     * @return
     */
    void saveQuestionRecitationForLib(QuestionRecitationForLib questionRecitationForLib);

    /**
     * 删除背诵题目
     *
     * @param questionRecitationForLibId 要删除的背诵题目Id
     * @return
     */
    void deleteQuestionRecitationForLib(String questionRecitationForLibId);

    /**
     * 更新背诵题目
     *
     * @param  questionRecitationForLib 更新的背诵题目
     * @return
     */
    void updateQuestionRecitationForLib(QuestionRecitationForLib questionRecitationForLib);


    /**
      * 根据Id查找背诵题目
      *
      * @param  questionRecitationForLibId 背诵题目Id
      * @return 存在时返回背诵题目,否则返回null
      */
    QuestionRecitationForLib findQuestionRecitationForLibById(String questionRecitationForLibId);


    /**
     *
     *
     * @param  reqParam 搜索参数
     * @return 背诵题表现层实体列表
     */
    Page<QuestionRecitationForLibVO> search(Pageable pageable, JSONObject reqParam);


    /**
     * 根据Id查询
     *
     * @param   recitationQuestionForLibId  id
     * @return  背诵题表现层实体
     */
    QuestionRecitationForLibVO findRecitationForLibById(String recitationQuestionForLibId);
}
