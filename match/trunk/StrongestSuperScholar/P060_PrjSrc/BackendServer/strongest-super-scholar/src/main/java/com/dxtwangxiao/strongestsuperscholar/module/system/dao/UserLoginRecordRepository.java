package com.dxtwangxiao.strongestsuperscholar.module.system.dao;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserLoginRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/18 18:25
 * @Description TODO
 */
public interface UserLoginRecordRepository extends CrudRepository<UserLoginRecord,String> {
    UserLoginRecord findByUserId(String userId);
}
