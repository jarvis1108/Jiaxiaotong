package com.dxtwangxiao.strongestsuperscholar.module.mall.dao;

import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.OrderRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: meiyu
 * @Date: 2018/7/5 11:52
 * @description 订单数据访问层
 */
@Repository
public interface OrderRecordRepository extends CrudRepository<OrderRecord, String>,JpaRepository<OrderRecord, String>,JpaSpecificationExecutor<OrderRecord> {

    /**
     * 查询所有订单记录
     *
     * @return 订单记录列表
     */
    List<OrderRecord> findAll();

    /**
     * 分页查询订单记录
     *
     * @param pageable 分页对象
     * @return 订单列表
     */
    Page<OrderRecord> findAll(Pageable pageable);

    /**
     * 根据用户ID查询其订单记录
     *
     * @param userId 用户ID
     * @return 该用户订单记录列表
     */
    List<OrderRecord> findAllByUserId(String userId);

    /**
     * 根据用户id和商品id来查询订单记录
     *
     * @param userId    用户id
     * @param productId 商品id
     * @return 订单记录列表
     */
    List<OrderRecord> findAllByUserIdAndProductId(String userId, String productId);

    /**
     * 根据用户id和购买方式查询订单记录
     *
     * @param userId      用户id
     * @param purchaseWay 购买方式，0代表人民币，1代表金币
     * @return 订单记录列表
     */
    Page<OrderRecord> findAllByUserIdAndPurchaseWay(String userId, Byte purchaseWay, Pageable pageable);

    /**
     * 添加、更新、删除订单记录
     *
     * @param orderRecord 订单记录
     * @return 订单记录
     */
    OrderRecord save(OrderRecord orderRecord);

    /**
     * 根据订单Id获取订单记录
     *
     * @param orderRecordId 订单Id
     * @return
     */
    OrderRecord findByOrderRecordId(String orderRecordId);
}