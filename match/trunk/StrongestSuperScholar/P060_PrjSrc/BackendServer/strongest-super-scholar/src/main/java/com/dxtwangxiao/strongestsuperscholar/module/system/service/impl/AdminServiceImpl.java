package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.system.dao.AdminRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.Admin;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.AdminService;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 程志强
 * @date 2018/11/6 14:39
 * @Description TODO
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public Admin login(String account, String pwd) {
        if(account == null || pwd == null){
            throw new StrongestScholarException("E_201811061441_57_011","用户名和密码不能为空");
        }
        return adminRepository.findByAccountAndAdminPsw(account,pwd);
    }
}
