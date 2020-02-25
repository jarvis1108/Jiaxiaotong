package com.dxtwangxiao.strongestsuperscholar.module.system.dao;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserRelInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 用户相关信息表数据访问层
 * <p>
 * Created by Devin
 * 2018-07-24 上午 10:10
 */
public interface UserRelInfoRepository extends CrudRepository<UserRelInfo, String> {
    /**
     * 创建、更新用户相关信息表
     *
     * @param userRelInfo 用户相关信息
     * @return 创建、更新后的用户相关信息
     */
    UserRelInfo save(UserRelInfo userRelInfo);

    /**
     * 根据用户Id查询用户相关信息表
     *
     * @param userId 用户Id
     * @return 用户相关信息
     */
    UserRelInfo findByUserId(String userId);

    /**
     * 根据经验值排名得到一定数量的用户信息
     *
     * @param pageable 分页信息
     * @return 一定数量的用户信息
     */
    Page<UserRelInfo> findByOrderByExperienceDesc(Pageable pageable);

    /**
     * 计算绩点大于gradePoint的用户数
     *
     * @param gradePoint
     * @return
     */
    long countByGradePointGreaterThan(Integer gradePoint);

    /**
     * 计算经验值大于experience的用户数目
     *
     * @param experience 经验值
     * @return 经验值大于experience的用户数目
     */
    long countByExperienceGreaterThan(Integer experience);
}