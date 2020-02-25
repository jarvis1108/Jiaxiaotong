package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.login;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.Admin;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.AdminService;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 程志强
 * @date 2018/11/6 14:43
 * @Description TODO
 */
@RestController
@RequestMapping("/api/v1/bam/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping("/login")
    public ResponseInfo login(@RequestBody RequestInfo requestInfo){
        JSONObject reqParam = requestInfo.getReqParam();
        String account = reqParam.getString("account");
        String pwd = reqParam.getString("adminPsw");
        Admin admin = adminService.login(account,pwd);

        return new ResponseInfo(requestInfo,admin);

    }
}
