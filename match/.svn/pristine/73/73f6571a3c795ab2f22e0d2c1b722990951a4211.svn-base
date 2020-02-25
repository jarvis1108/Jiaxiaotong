package com.dxtwangxiao.strongestsuperscholar.module.mall.dao;

import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.Coupon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
*@author: meiyu
*@Date: 2018/7/5 11:52
*@description 优惠券数据访问
*/
@Repository
public interface CouponRepository extends CrudRepository<Coupon,String> {

    /**
     * 获取全部优惠券
     * @return 全部优惠券
     */
    List<Coupon> findAll();

    /**
     * 根据couponId 查询
     * @param couponId 优惠券编号
     * @return 返回查到的优惠券
     */
    Coupon findByCouponId(String couponId);

    /**
     * 存储新的优惠券
     * @param coupon 新增的优惠券
     * @return 新增或修改优惠券
     */
    Coupon save(Coupon coupon);

    /**
     * 根据couponID 删除优惠券
     * @param couponId 优惠券编号
     */
    void deleteByCouponId(String couponId);

    /**
     * 分页查询优惠券列表
     * @param pageable
     * @return
     */

    Page<Coupon> findAll(Pageable pageable);



}
