package com.dxtwangxiao.strongestsuperscholar.module.system.dao;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据访问层
 * <p>
 * Created by Devin
 * 2018-06-25 下午 02:47
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {

    /**
     * 保存或者更新用户基本信息
     *
     * @param user 用户实体类对象
     * @return 新创建或者修改后的对象信息
     */
    User save(User user);

    /**
     * 根据用户id进行查询
     *
     * @param userId 带查找用户id
     * @return 所要查询的用户信息
     */
    User findUserByUserId(String userId);

    /**
     * 根据用户id进行查询
     *
     * @param userId 带查找用户id
     * @return 所要查询的用户信息
     */
    User findByUserId(String userId);
    /**
     * 根据openid获取用户信息
     *
     * @param openid 用户openid
     * @return 用户信息
     */
    User findByOpenid(String openid);

    /**
     * 根据unionId获取用户信息
     *
     * @param unionId 用户openid
     * @return 用户信息
     */
    User findByUnionId(String unionId);
}
