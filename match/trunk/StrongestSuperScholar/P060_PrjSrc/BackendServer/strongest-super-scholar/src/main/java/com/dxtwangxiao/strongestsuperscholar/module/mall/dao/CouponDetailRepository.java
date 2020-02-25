package com.dxtwangxiao.strongestsuperscholar.module.mall.dao;

import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.CouponDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
*@author: meiyu
*@Date: 2018/7/5 11:53
*@description 优惠券使用表数据访问
*/
@Repository
public interface CouponDetailRepository extends CrudRepository<CouponDetail,String> {

    /**
     * 根据优惠券使用ID查找优惠券使用记录
     * @param couponExchangeId
     * @return
     */
    CouponDetail findByCouponExchangeId(String couponExchangeId);

    /**
     * 根据优惠券ID查找优惠券使用记录
     * @param couponId
     * @return
     */
    List<CouponDetail> findAllByCouponId(String couponId);

    /**
     * 根据用户Id查找优惠券使用记录
     * @param userId
     * @return
     */
    List<CouponDetail> findAllByUserId(String userId);

    /**
     * 根据订单Id查询优惠券使用记录
     * @param orderRecordId
     * @return
     */
    CouponDetail findByOrderRecordId(String orderRecordId);

    /**
     * 分页查询优惠券使用详情列表
     * @param pageable
     * @return
     */
    Page<CouponDetail> findAll(Pageable pageable);

    CouponDetail save(CouponDetail couponDetail);


}
