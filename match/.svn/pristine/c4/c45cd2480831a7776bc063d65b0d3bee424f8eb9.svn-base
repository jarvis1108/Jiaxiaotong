package com.dxtwangxiao.strongestsuperscholar.module.system.dao;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 程志强
 * @date 2018/11/6 14:27
 * @Description TODO
 */
@Repository
public interface AdminRepository extends CrudRepository<Admin,String> {

    Admin findByAccountAndAdminPsw(String account,String psw);

}
