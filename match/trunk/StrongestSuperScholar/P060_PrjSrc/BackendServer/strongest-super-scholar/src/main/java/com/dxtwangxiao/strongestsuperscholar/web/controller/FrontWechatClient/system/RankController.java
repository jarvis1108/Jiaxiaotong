package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.system;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.RankService;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/v1/sys/rank")
public class RankController {

    @Autowired
    private RankService rankService;

    /**
     * 根据经验值获取用户排名信息及当前世界排名
     *
     * @param request http请求
     * @return
     * @throws StrongestScholarException
     */
    @GetMapping("/getWorldRank")
    public ResponseInfo getWorldRank(HttpServletRequest request) throws StrongestScholarException {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject reqParam = requestInfo.getReqParam();
        String userId = reqParam.getString("userId");

        long userRank = rankService.getUserRank(userId);
        List<UserDTO> users = rankService.getWorldRank();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userRank", userRank);
        jsonObject.put("users", users);

        return new ResponseInfo(requestInfo, jsonObject);
    }
}