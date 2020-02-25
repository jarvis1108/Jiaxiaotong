package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.system;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.UserService;
import com.dxtwangxiao.strongestsuperscholar.module.wechat.entity.WechatToken;
import com.dxtwangxiao.strongestsuperscholar.module.wechat.service.WechatService;
import com.dxtwangxiao.strongestsuperscholar.web.annotation.NoAuth;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.AesCbcUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.JwtUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 用户控制器
 * <p>
 * Created by Devin
 * 2018-06-29 上午 10:48
 */
@RestController
@RequestMapping("/api/v1/sys/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private WechatService wechatService;

    /**
     * 根据用户id获取用户信息
     *
     * @param userId  用户id
     * @param request http请求
     * @return
     */
    @GetMapping("/{userId}")
    public ResponseInfo getUserInfo(@PathVariable("userId") String userId, HttpServletRequest request) {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject jsonObject = new JSONObject();
        UserDTO userDTO = userService.getUserDTOById(userId);
        jsonObject.put("user", userDTO);
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 通过code获取用户信息
     *
     * @param request http请求
     * @return
     * @throws StrongestScholarException
     */
    @NoAuth
    @GetMapping("/code")
    public ResponseInfo getUserInfoByCode(HttpServletRequest request) throws StrongestScholarException {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject reqParam = requestInfo.getReqParam();
        String code = reqParam.getString("code");

        WechatToken wechatToken = wechatService.getTokenByCode(code);
        if (wechatToken == null || wechatToken.getOpenid() == null) {
            throw new StrongestScholarException(CommonError.WECHAT_CODE_ERROR.getCode(), CommonError.WECHAT_CODE_ERROR.getMessage());
        }
        JSONObject jsonObject = new JSONObject();
        UserDTO userDTO = userService.getUserDTOByOpenid(wechatToken.getOpenid());
        if (userDTO == null) {
            throw new StrongestScholarException(CommonError.USER_NOT_EXIST.getCode(), CommonError.USER_NOT_EXIST.getMessage());
        }
        String token = JwtUtil.generateToken(userDTO.getUserId(), userDTO.getOpenid());

        jsonObject.put("user", userDTO);
        jsonObject.put("token", token);
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 微信小程序，创建新用户
     *
     * @param requestInfo 请求信息
     * @return
     */
    @NoAuth
    @PostMapping
    public ResponseInfo createNewUser(@RequestBody RequestInfo requestInfo) throws Exception{
        JSONObject reqParam = requestInfo.getReqParam();
        String code = reqParam.getString("code");
        String nickName = reqParam.getString("nickName");
        String avatarUrl = reqParam.getString("avatarUrl");
        String gender = reqParam.getString("gender");
        String city = reqParam.getString("city");
        String gradePhaseId = reqParam.getString("gradePhaseId");
        String gradeId = reqParam.getString("gradeId");

        WechatToken wechatToken = wechatService.getTokenByCode(code);
        if (wechatToken == null || wechatToken.getOpenid() == null) {
            throw new StrongestScholarException(CommonError.WECHAT_CODE_ERROR.getCode(), CommonError.WECHAT_CODE_ERROR.getMessage());
        }


        //解密 encryptedData 得到 unionId
        String encryptedData = reqParam.getString("encryptedData");
        String iv = reqParam.getString("iv");
        String decodedData;
        try {
            decodedData = AesCbcUtil.decrypt(encryptedData, wechatToken.getSessionKey(), iv, "UTF-8");
        }
        catch(Exception e) {
            System.out.println("unionId 解析错误");
            throw e;
        }
        JSONObject decodedJson = JSONObject.parseObject(decodedData);
        String unionId = decodedJson.getString("unionId");

        JSONObject jsonObject = new JSONObject();
        UserDTO userDTO = userService.createUser(nickName, wechatToken.getOpenid(), unionId, avatarUrl, gender, city, gradePhaseId, gradeId);
        String token = JwtUtil.generateToken(userDTO.getUserId(), userDTO.getOpenid());

        jsonObject.put("user", userDTO);
        jsonObject.put("token", token);
        return new ResponseInfo(requestInfo, jsonObject);
    }
}
