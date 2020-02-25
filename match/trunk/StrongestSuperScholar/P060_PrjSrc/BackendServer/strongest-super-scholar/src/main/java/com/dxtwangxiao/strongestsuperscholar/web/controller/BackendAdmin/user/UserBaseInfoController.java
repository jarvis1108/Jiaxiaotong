package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.user;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.BackUserBaseInfoService;
import com.dxtwangxiao.strongestsuperscholar.module.system.vo.BackUserBaseInfo;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/11 22:05
 * @Description 后台管理系统 用户管理 基本信息数据
 */
@RestController
@RequestMapping("/api/v1/bam/user/userBaseInfo")
public class UserBaseInfoController {
    @Autowired
    BackUserBaseInfoService backUserBaseInfoService;

    /**
     * 功能描述: 获得所有基础信息
     *
     * @auther: 程志强
     * @date: 2018/10/12 0:14
     */
    @GetMapping("/list")
    public ResponseInfo checkAll(HttpServletRequest request) throws StrongestScholarException{
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        JSONObject pageInfo = requestInfo.getReqPageInfo();
        Integer pageSize = pageInfo.getInteger("pageSize");
        Integer curPage = pageInfo.getInteger("curPage");

        JSONObject reqParam = requestInfo.getReqParam();

        Page<BackUserBaseInfo> membersList = backUserBaseInfoService.getAllUserBaseInfos(curPage,pageSize,reqParam);
        //该处可能会需要筛选重复的userId,只保留一个userId的数据，留下loginTime最新的那一项。
        return new ResponseInfo(requestInfo,membersList);
    }
    /**
     * 功能描述: 更新某条数据
     *
     * @auther: 程志强
     * @date: 2018/10/12 0:49
     */
    @PostMapping("/update/{userId}")
    public ResponseInfo updateInfo(@PathVariable("userId")String userId, @RequestBody RequestInfo requestInfo) throws StrongestScholarException {

        JSONObject reqParam = requestInfo.getReqParam();

        //根据当前用户id以及reqParam传入的数据，更新当前用户的信息
        backUserBaseInfoService.updateUserBaseInfo(userId,reqParam);

        return new ResponseInfo(requestInfo,backUserBaseInfoService.getBackUserBaseInfoByUserId(userId));
    }

    /**
     * 功能描述: 将该用户冻结或者解冻，具体根据输入的值决定
     *
     * @auther: 程志强
     * @date: 2018/10/12 0:50
     */
    @PostMapping("/lock/{userId}")
    public ResponseInfo lockOrUnlock(@PathVariable("userId")String userId, @RequestBody RequestInfo requestInfo) throws StrongestScholarException{

        JSONObject reqParam = requestInfo.getReqParam();

        backUserBaseInfoService.lockOrUnlockUser(userId,reqParam);

        return new ResponseInfo(requestInfo,backUserBaseInfoService.getBackUserBaseInfoByUserId(userId));
    }
}