package com.dxtwangxiao.questionchecktool.controller;

import com.dxtwangxiao.questionchecktool.util.PersonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 首页控制器
 * <p>
 * Created by Devin
 * 2018-07-11 下午 04:51
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request) throws Exception {
        String username = request.getParameter("username");
        String code = request.getParameter("code");

        String actualName = PersonUtil.getNameByCode(code);
        if (actualName == null) {
            return "false";
        } else if (username.equals(actualName)) {

            String userStr = code + "-" + actualName;
            request.getSession().setAttribute("user", userStr);
            return "success";
        } else {
            return "error";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return "index";
    }
}
