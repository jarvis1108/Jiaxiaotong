package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.match;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchService;
import com.dxtwangxiao.strongestsuperscholar.web.dto.MatchRecordDTO;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 战局管理 控制器
 * <p>
 * Created By Devin
 * 2018-08-27 下午 04:07
 */
@RestController
@RequestMapping("/api/v1/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    /**
     * 用于对战结束后，更新用户信息
     *
     * @param requestInfo 请求信息
     * @return 返回体
     */
    @PostMapping("/save")
    public ResponseInfo save(@RequestBody RequestInfo requestInfo) {
        JSONObject reqParam = requestInfo.getReqParam();

        String matchId = reqParam.getString("matchId");
        String userId = reqParam.getString("userId");
        Integer coin = reqParam.getInteger("coin");
        Integer learningPoint = reqParam.getInteger("learningPoint");
        Integer gradePoint = reqParam.getInteger("gradePoint");
        Integer experience = reqParam.getInteger("experience");
        Integer isWin = reqParam.getInteger("isWin");

        JSONObject jsonObject = new JSONObject();
        UserDTO userDTO = matchService.finish(matchId, userId, coin, learningPoint, gradePoint, experience, isWin);
        jsonObject.put("user", userDTO);
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 好友对战及群PK，发起者用来生成战局信息，并返回给创建者
     *
     * @param requestInfo 请求信息
     * @return
     */
    @PostMapping("/pk")
    public ResponseInfo pk(@RequestBody RequestInfo requestInfo) {
        JSONObject reqParam = requestInfo.getReqParam();
        String userId = reqParam.getString("userId");
        Byte matchType = reqParam.getByte("matchType");

        MatchRecordDTO matchRecordDTO = matchService.createMatchRecord(userId, matchType);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("match", matchRecordDTO);
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 生成知识练兵场战局及题目信息
     *
     * @param requestInfo 请求信息
     * @return
     */
    @PostMapping("/exercise")
    public ResponseInfo exercise(@RequestBody RequestInfo requestInfo) {
        JSONObject reqParam = requestInfo.getReqParam();
        String userId = reqParam.getString("userId");
        String subjectId = reqParam.getString("subjectId");
        JSONObject jsonObject = new JSONObject();

        MatchRecordDTO matchRecordDTO = matchService.createExercise(userId, subjectId);
        jsonObject.put("matchId", matchRecordDTO.getMatchRecordId());
        jsonObject.put("questionList", matchRecordDTO.getQuestionList());
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 知识练兵场答题过程中，保存学点消耗记录
     *
     * @param requestInfo 请求信息
     * @return
     */
    @PostMapping("/exercise/save")
    public ResponseInfo saveLp(@RequestBody RequestInfo requestInfo) {
        JSONObject reqParam = requestInfo.getReqParam();
        String matchId = reqParam.getString("matchId");
        String userId = reqParam.getString("userId");
        Integer questionIndex = reqParam.getInteger("questionIndex");
        String userAnswer = reqParam.getString("userAnswer");
        Integer amount = reqParam.getInteger("amount");
        Byte isTrue = reqParam.getByte("isTrue");
        matchService.saveLpConsumeRecord(matchId, userId, questionIndex, userAnswer, amount, isTrue);

        return new ResponseInfo(requestInfo, new JSONObject());
    }
}