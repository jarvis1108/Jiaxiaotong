package com.dxtwangxiao.strongestsuperscholar.module.question.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.dao.QuestionForLibRepository;
import com.dxtwangxiao.strongestsuperscholar.module.question.dao.QuestionMultipleChoiceForLibRepository;
import com.dxtwangxiao.strongestsuperscholar.module.question.dao.QuestionMultipleChoiceForLibVORepository;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal.QuestionForLib;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal.QuestionMultipleChoiceForLib;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionForLibService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceForLibVO;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.UpdateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by 孙伟浩 on 2018/9/6.
 */
@Service
public class QuestionForLibServiceImpl implements QuestionForLibService {

    @Autowired
    private QuestionForLibRepository questionForLibRepository;
    @Autowired
    private QuestionMultipleChoiceForLibRepository questionMultipleChoiceForLibRepository;
    @Autowired
    private QuestionMultipleChoiceForLibVORepository questionMultipleChoiceForLibVORepository;


    /**
     * 增加选择题
     */
    @Transactional
    @Override
    public String addChoice(JSONObject reqParam) throws StrongestScholarException {

        QuestionForLib questionForLib = parse2Qfl(reqParam);
        QuestionMultipleChoiceForLib questionMultipleChoiceForLib = parse2Qmcl(reqParam);

        //设置id
        String questionForLibId = UUIDUtil.getUUID();
        questionForLib.setQuestionForLibId(questionForLibId);
        questionForLib.setQuestionForLibNo(questionForLibId);
        questionForLib.setQuestionForLibCode(questionForLibId);
        questionMultipleChoiceForLib.setQuestionForLibId(questionForLibId);
        questionMultipleChoiceForLib.setQuestionForLibNo(questionForLibId);

        //添加
        questionForLibRepository.save(questionForLib);
        questionMultipleChoiceForLibRepository.save(questionMultipleChoiceForLib);

        return questionForLibId;
    }

    /**
     * 根据题目id删除选择题
     *
     * @param questionForLibId
     * @throws StrongestScholarException
     */
    @Transactional
    @Override
    public void deleteChoice(String questionForLibId) throws StrongestScholarException {
        questionForLibRepository.deleteById(questionForLibId);
        questionMultipleChoiceForLibRepository.deleteById(questionForLibId);
    }

    /**
     * 得到某一私有题库全部选择题
     *
     * @param questionLibId
     * @return
     */
    @Override
    public List<QuestionMultipleChoiceForLibVO> listChoiceByQuestionLibId(String questionLibId, int pageSize, int curPage) {
        Pageable pageable = new PageRequest(curPage, pageSize);
        Page<QuestionMultipleChoiceForLibVO> page =
                questionMultipleChoiceForLibVORepository.findAllByQuestionLibIdOrderByCreateTimeAsc(questionLibId, pageable);

        return page.getContent();
    }

    /**
     * 更新选择题
     */
    @Override
    public void updateChoice(String questionForLibId, JSONObject reqParam) throws StrongestScholarException {
        QuestionForLib targetQfb = findByQuestionForLibId(questionForLibId);
        QuestionMultipleChoiceForLib targetQmcl = findQustionMultipleForLibByQuestionForLibId(questionForLibId);
        QuestionForLib srcQfb = parse2Qfl(reqParam);
        QuestionMultipleChoiceForLib srcQmcl = parse2Qmcl(reqParam);

        UpdateUtil.copyProperties(srcQfb, targetQfb);
        UpdateUtil.copyProperties(srcQmcl, targetQmcl);

        questionForLibRepository.save(targetQfb);
        questionMultipleChoiceForLibRepository.save(targetQmcl);
    }

    /**
     * 根据id得到questionForLib对象
     *
     * @param questionForLibId
     * @return
     */
    @Override
    public QuestionForLib findByQuestionForLibId(String questionForLibId) {
        return questionForLibRepository.findById(questionForLibId).orElse(null);
    }

    /**
     * 根据id得到questionMultipleForLib对象
     *
     * @param questionForLibId
     * @return
     */
    @Override
    public QuestionMultipleChoiceForLib findQustionMultipleForLibByQuestionForLibId(String questionForLibId) {
        return questionMultipleChoiceForLibRepository.findByQuestionForLibId(questionForLibId);
    }

    /**
     * 根据id得到questionMultipleChoiceForLibVO对象
     *
     * @param questionForLibId
     * @return
     */
    @Override
    public QuestionMultipleChoiceForLibVO findQuestionMultipleChoiceForLibVOByQuestionForLibId(String questionForLibId) {
        return questionMultipleChoiceForLibVORepository.findByQuestionForLibId(questionForLibId);
    }

    /**
     * 存储题库题目
     *
     * @param questionForLib 上传的题目
     * @return
     */
    @Override
    public void saveQuestionForLib(QuestionForLib questionForLib) {

        questionForLibRepository.saveAndFlush(questionForLib);
    }

    /**
     * 删除题库题目
     *
     * @param questionForLibId 要删除的题目Id
     * @return
     */
    @Override
    public void deleteQuestionForLib(String questionForLibId) {
        questionForLibRepository.deleteById(questionForLibId);
    }

    /**
     * 更新题库题目
     *
     * @param questionForLib 更新的题目
     * @return
     */
    @Override
    public void updateQuestionForLib(QuestionForLib questionForLib) {
        questionForLibRepository.saveAndFlush(questionForLib);
    }


    /**
     * 根据Id查找题库题目
     *
     * @param questionForLibId 题目Id
     * @return 存在返回题目, 否则返回null
     */
    @Override
    public QuestionForLib findQuestionForLibById(String questionForLibId) {
        return questionForLibRepository.findById(questionForLibId).orElse(null);
    }

    private QuestionForLib parse2Qfl(JSONObject reqParam) {
        String userId = reqParam.getString("userId");
        String gradeId = reqParam.getString("gradeId");
        String courseId = reqParam.getString("courseId");
        String question = reqParam.getString("question");
        Integer time = reqParam.getInteger("time");
        String questionLibId = reqParam.getString("questionLibId");
        Byte isPublic = reqParam.getByte("isPublic");
        String provider = reqParam.getString("getString");
        String personInCharge = reqParam.getString("personInCharge");
        String reference = reqParam.getString("reference");
        Integer questionLevel = reqParam.getInteger("questionLevel");
        Double difficulty = reqParam.getDouble("difficulty");
        Double coinWeight = reqParam.getDouble("coinWeight");
        Double gpWeight = reqParam.getDouble("gpWeight");
        String questionAnalyze = reqParam.getString("questionAnalyze");
        String fromQuestionId = reqParam.getString("fromQuestionId");
        String fromQuestionNo = reqParam.getString("fromQuestionNo");
        String remark = reqParam.getString("remark");
        Byte isFromQuestion = reqParam.getByte("isFromQuestion");

        QuestionForLib questionForLib = new QuestionForLib();
        questionForLib.setQuestionLibId(questionLibId);
        questionForLib.setQuestionLibNo(questionLibId);
        questionForLib.setQuestion(question);
        questionForLib.setProvider(userId);
        questionForLib.setRecommendTime(time);
        questionForLib.setIsPublic(isPublic);
        questionForLib.setProvider(provider);
        questionForLib.setPersonInCharge(personInCharge);
        questionForLib.setReference(reference);
        questionForLib.setQuestionLevel(questionLevel);
        questionForLib.setDifficulty(difficulty);
        questionForLib.setCoinWeight(coinWeight);
        questionForLib.setGpWeight(gpWeight);
        questionForLib.setQuestionAnalyze(questionAnalyze);
        questionForLib.setFromQuestionId(fromQuestionId);
        questionForLib.setFromQuestionNo(fromQuestionNo);
        questionForLib.setRemark(remark);
        questionForLib.setIsFromQuestion(isFromQuestion);
        questionForLib.setCreateUser(userId);
        questionForLib.setLastUpdUser(userId);
        questionForLib.setCreateUser(userId);
        questionForLib.setLastUpdUser(userId);
        questionForLib.setCreateTime(new Timestamp(new Date().getTime()));
        questionForLib.setLastUpdTime(new Timestamp(new Date().getTime()));
        questionForLib.setCourseId(courseId);
        questionForLib.setGradeId(gradeId);

        return questionForLib;
    }

    private QuestionMultipleChoiceForLib parse2Qmcl(JSONObject reqParam) {
        String userId = reqParam.getString("userId");
        String questionLibId = reqParam.getString("questionLibId");
        String fromQuestionId = reqParam.getString("fromQuestionId");
        String fromQuestionNo = reqParam.getString("fromQuestionNo");
        String remark = reqParam.getString("remark");
        String choiceA = reqParam.getString("choiceA");
        String choiceB = reqParam.getString("choiceB");
        String choiceC = reqParam.getString("choiceC");
        String choiceD = reqParam.getString("choiceD");
        String answer = reqParam.getString("answer");

        QuestionMultipleChoiceForLib questionMultipleChoiceForLib = new QuestionMultipleChoiceForLib();
        questionMultipleChoiceForLib.setQuestionLibId(questionLibId);
        questionMultipleChoiceForLib.setQuestionLibNo(questionLibId);
        questionMultipleChoiceForLib.setFromQuestionId(fromQuestionId);
        questionMultipleChoiceForLib.setFromQuestionNo(fromQuestionNo);
        questionMultipleChoiceForLib.setChoiceA(choiceA);
        questionMultipleChoiceForLib.setChoiceB(choiceB);
        questionMultipleChoiceForLib.setChoiceC(choiceC);
        questionMultipleChoiceForLib.setChoiceD(choiceD);
        questionMultipleChoiceForLib.setAnswer(answer);
        questionMultipleChoiceForLib.setRemark(remark);
        questionMultipleChoiceForLib.setCreateUser(userId);
        questionMultipleChoiceForLib.setLastUpdUser(userId);
        questionMultipleChoiceForLib.setCreateTime(new Timestamp(new Date().getTime()));
        questionMultipleChoiceForLib.setLastUpdTime(new Timestamp(new Date().getTime()));

        return questionMultipleChoiceForLib;
    }

    public long getChoiceTotalNum(String questionLibId) {
        return questionMultipleChoiceForLibRepository.countByQuestionLibId(questionLibId);
    }
}
