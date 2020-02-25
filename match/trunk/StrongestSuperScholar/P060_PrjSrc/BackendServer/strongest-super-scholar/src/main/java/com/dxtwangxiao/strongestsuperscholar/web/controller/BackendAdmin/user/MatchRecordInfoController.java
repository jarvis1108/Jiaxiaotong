package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.user;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordUser;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchRecordUserService;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/11 22:06
 * @Description 后台管理系统 用户管理 用户对战记录
 */
@RestController
@RequestMapping("/api/v1/bam/user/matchRecordUser")
public class MatchRecordInfoController {
    @Autowired
    MatchRecordUserService matchRecordUserService;

    /**
     * 功能描述: 获取所有的对战匹配记录信息
     *
     * @auther: 程志强
     * @date: 2018/10/12 18:42
     */
    @GetMapping("/getInfos")
    public ResponseInfo getMatchRecordUserInfos(HttpServletRequest request) throws StrongestScholarException{
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        JSONObject pageInfo = requestInfo.getReqPageInfo();
        Integer pageSize = pageInfo.getInteger("pageSize");
        Integer curPage = pageInfo.getInteger("curPage");

        JSONObject jsonObject = new JSONObject();
        List<MatchRecordUser> matchRecordUsers = matchRecordUserService.getAllMatchRecordUserInfos(curPage,pageSize);
        jsonObject.put("matchRecordUsersList",matchRecordUsers);
        return new ResponseInfo(requestInfo,jsonObject);
    }


     /**
     *
     * 功能描述: 更新某一行的数据
     *
     * @param: matchRecordUserId,某一行的主键ID
     * @auther: 程志强
     * @date: 2018/10/12 18:43*/


    @PostMapping("/update/{matchRecordUserId}")
    public ResponseInfo updateInfo(@PathVariable("matchRecordUserId")String matchRecordUserId, @RequestBody RequestInfo requestInfo) throws StrongestScholarException{
        JSONObject reqParam = requestInfo.getReqParam();

        //当前将matchRecordUser的所有数据都set了一遍，实际要根据前端需求而定
        MatchRecordUser matchRecordUser = matchRecordUserService.getMatchRecordUserInfoById(matchRecordUserId);
        matchRecordUser.setMatchRecordUserId(reqParam.getString("matchRecordUserId"));
        matchRecordUser.setMatchRecordId(reqParam.getString("matchRecordId"));
        matchRecordUser.setMatchRecordNo(reqParam.getString("matchRecordNo"));
        matchRecordUser.setUserId(reqParam.getString("userId"));
        matchRecordUser.setUserNo(reqParam.getString("userNo"));
        matchRecordUser.setOriginalGradePoint(reqParam.getInteger("originalGradePoint"));
        matchRecordUser.setAcquiredGradePoint(reqParam.getInteger("acquireGradePoint"));
        matchRecordUser.setOriginalGradeCoin(reqParam.getInteger("originalGradeCoin"));
        matchRecordUser.setAcquiredGradeCoin(reqParam.getInteger("acquiredGradeCoin"));
        matchRecordUser.setOriginalLearningPoint(reqParam.getInteger("originalLearningPoint"));
        matchRecordUser.setAcquiredLearningPoint(reqParam.getInteger("acquiredLearningPoint"));
        matchRecordUser.setIsCreator(reqParam.getByte("isCreator"));
        matchRecordUser.setCreateTime(reqParam.getTimestamp("createTime"));
        matchRecordUser.setCreateUser(reqParam.getString("createUser"));
        matchRecordUser.setLastUpdTime(reqParam.getTimestamp("lastUpdTime"));
        matchRecordUser.setLastUpdUser(reqParam.getString("lastUpdUser"));
        matchRecordUser.setIsValid(reqParam.getByte("isValid"));
        matchRecordUser.setRemark(reqParam.getString("remark"));

        matchRecordUserService.save(matchRecordUser);
        return new ResponseInfo(requestInfo,matchRecordUser);
    }

     /**
     * 功能描述: 删除某一行的对战记录
     *、、、、delete是不是应该以matchRecordId来删除？？？存在潜在bug
     * @param: 当前行的主键ID
     * @auther: 程志强
     * @date: 2018/10/12 18:44
     */

    @PostMapping("/delete/{matchRecordUserId}")
    public ResponseInfo deleteInfo(@PathVariable("matchRecordUserId") String matchRecordUserId,@RequestBody RequestInfo requestInfo)throws StrongestScholarException{
        if(matchRecordUserId == null){
            throw new StrongestScholarException("E_201810121556_57_014","传入的信息id为空");
        }
        matchRecordUserService.removeMatchRecordUserInfo(matchRecordUserId);
        return new ResponseInfo(requestInfo,"删除成功");
    }

}