package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.user;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserCoinDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserGPDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserLPDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.BackUserDetaiService;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/18 11:13
 * @Description 用户金币、学点、绩点明细信息查询
 */
@RestController
@RequestMapping("/api/v1/bam/user/userDetail")
public class UserDetailController {
    @Autowired
    BackUserDetaiService backUserDetaiService;

    /**
     * 功能描述: 获取某用户的金币明细
     *
     * @param:
     * @return:
     */
    @GetMapping("/userCoinDetails")
    public ResponseInfo getUserCoinDetails(HttpServletRequest request){
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        JSONObject pageInfo = requestInfo.getReqPageInfo();
        Integer pageSize = pageInfo.getInteger("pageSize");
        Integer curPage = pageInfo.getInteger("curPage");

        String userId = requestInfo.getReqParam().getString("userId");

        Page<UserCoinDetail> userCoinDetailList = backUserDetaiService.findCoinDetailByUserId(userId,pageSize,curPage);
        return new ResponseInfo(requestInfo,userCoinDetailList);
    }

    /**
     * 功能描述: 获取某用户的绩点明细
     *
     * @param:
     * @return:
     */
    @GetMapping("/userGPDetails")
    public ResponseInfo getUserGPDetails(HttpServletRequest request){
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        JSONObject pageInfo = requestInfo.getReqPageInfo();
        Integer pageSize = pageInfo.getInteger("pageSize");
        Integer curPage = pageInfo.getInteger("curPage");

        String userId = requestInfo.getReqParam().getString("userId");

        Page<UserGPDetail> userGPDetailList = backUserDetaiService.findGPDetailByUserId(userId,pageSize,curPage);
        return new ResponseInfo(requestInfo,userGPDetailList);
    }

    /**
     * 功能描述: 获取某用户的学点明细
     *
     * @param:
     * @return:
     */
    @GetMapping("/userLPDetails")
    public ResponseInfo getUserLPDetails(HttpServletRequest request){
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        JSONObject pageInfo = requestInfo.getReqPageInfo();
        Integer pageSize = pageInfo.getInteger("pageSize");
        Integer curPage = pageInfo.getInteger("curPage");

        String userId = requestInfo.getReqParam().getString("userId");

        Page<UserLPDetail> userLpDetailList = backUserDetaiService.findLPDetailByUserId(userId,pageSize,curPage);
        return new ResponseInfo(requestInfo,userLpDetailList);
    }

}
