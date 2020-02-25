package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.base;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.GradeInfoVOService;
import com.dxtwangxiao.strongestsuperscholar.module.base.vo.GradeInfoVO;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 年级信息 控制器
 * <p>
 * Created By Devin
 * 2018-08-31 上午 10:16
 */
@RestController
@RequestMapping("/api/v1/base/gradeInfo")
public class GradeInfoController {

    @Autowired
    private GradeInfoVOService gradeInfoVOService;

    /**
     * 获取所有年级信息列表
     *
     * @param request http请求
     * @return
     */
    @GetMapping("/list")
    public ResponseInfo listGradeInfo(HttpServletRequest request) {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject jsonObject = new JSONObject();

        List<GradeInfoVO> gradeInfoVOList = gradeInfoVOService.getAll();
        jsonObject.put("gradeInfoList", gradeInfoVOList);

        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 根据年级阶段Id获取年级信息列表
     *
     * @param gradePhaseId 年级阶段Id
     * @param request      http请求
     * @return
     */
    @GetMapping("/list/{gradePhaseId}")
    public ResponseInfo listByGradePhaseId(@PathVariable("gradePhaseId") String gradePhaseId, HttpServletRequest request) {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject jsonObject = new JSONObject();

        List<GradeInfoVO> gradeInfoVOList = gradeInfoVOService.getByGradePhaseId(gradePhaseId);
        jsonObject.put("gradeInfoList", gradeInfoVOList);

        return new ResponseInfo(requestInfo, jsonObject);
    }
}
