package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.community;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.community.service.SpecialTrainingVOService;
import com.dxtwangxiao.strongestsuperscholar.module.community.vo.SpecialTrainingVO;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: 程志强
 * @Date: 2018/9/10 00:09
 * @Description: 社区模块的控制层
 */
@RestController
@RequestMapping("/api/v1/community")
public class CommunityController {
    @Autowired
    SpecialTrainingVOService specialTrainingVOService;

    /**
     *
     * 功能描述: 根据id查询当前用户的训练营成员
     *
     * @param: [request]
     * @return: 返回训练营所有成员
     * @auther: 程志强
     * @date: 2018/9/10 19:47
     */
    @GetMapping("/getMembers")
    public ResponseInfo getSpecialTrainingMembers(HttpServletRequest request){
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject pageInfo = requestInfo.getReqPageInfo();

        Integer pageSize = pageInfo.getInteger("pageSize");//获取当前查询的page页面大小
        Integer curPage = pageInfo.getInteger("curPage");//获取当前页码

        JSONObject reqParam = requestInfo.getReqParam();//获得有关用户参数
        String lastUserId = reqParam.getString("userId");

        JSONObject jsonObject = new JSONObject();
        //根据lastUserId，即自己的id，得到训练营所有成员集合
        List<SpecialTrainingVO> membersVOList = specialTrainingVOService.getSpecialTrainingMembers(curPage,pageSize,lastUserId);
        jsonObject.put("membersList",membersVOList);
        return new ResponseInfo(requestInfo,jsonObject);
    }

    @PostMapping("/addMember/{newMember}")
    public ResponseInfo addNewMember(@PathVariable("newMember")String userId,@RequestBody RequestInfo requestInfo) throws StrongestScholarException {
        JSONObject reqParam = requestInfo.getReqParam();
        String lastUserId = reqParam.getString("userId");

        specialTrainingVOService.createNewMember(userId,lastUserId);
        SpecialTrainingVO specialTrainingVO = specialTrainingVOService.getSpecialTrainingByUserId(userId);
        return new ResponseInfo(requestInfo,specialTrainingVO);
    }
}
