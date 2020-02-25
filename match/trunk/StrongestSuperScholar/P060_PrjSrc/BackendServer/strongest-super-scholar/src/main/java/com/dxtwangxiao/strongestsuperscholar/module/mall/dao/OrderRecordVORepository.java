package com.dxtwangxiao.strongestsuperscholar.module.mall.dao;

import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.OrderRecordVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 订单记录视图对象 数据访问层
 * <p>
 * Created By Devin
 * 2018-09-01 下午 07:53
 */
public interface OrderRecordVORepository extends CrudRepository<OrderRecordVO, String> {

    /**
     * 根据用户Id和购买方式分页查询，获取其订单记录
     *
     * @param userId      用户Id
     * @param purchaseWay 购买方式，0表示人民币（充值记录），1表示金币（兑换记录）
     * @return
     */
    Page<OrderRecordVO> findByUserIdAndPurchaseWayOrderByCreateTimeDesc(String userId, Byte purchaseWay, Pageable pageable);

    List<OrderRecordVO> findAll();

    Page<OrderRecordVO> findAll(Pageable pageable);
}
