package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.question;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.ErrorMultipleQuestion;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.ErrorMultipleQuestionService;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 错题模块控制器
 * <p>
 * Created By Xiaohe
 * 2018-09-09 下午 20.00
 */
@RestController
@RequestMapping("/api/v1/qst/errorQuestion")
public class ErrorQuestionController {

    @Autowired
    private ErrorMultipleQuestionService errorMultipleQuestionService;

    /**
     * 根据用户UserId查询错题
     *
     * @param request http请求
     * @return responseInfo
     */
    @GetMapping("/list")
    public ResponseInfo getErrorQuestionList(HttpServletRequest request) throws StrongestScholarException {
        JSONObject jsonObject = new JSONObject();
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        try {
            JSONObject reqParam = requestInfo.getReqParam();
            String userId = reqParam.getString("userId");

            // 获取选择题错题列表
            List<ErrorMultipleQuestion> errorMultipleQuestionList = errorMultipleQuestionService.getByUserId(userId);
            jsonObject.put("errorMultipleQuestionList", errorMultipleQuestionList);
            return new ResponseInfo(requestInfo, jsonObject);
        } catch (Exception e) {
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }
    }
}
