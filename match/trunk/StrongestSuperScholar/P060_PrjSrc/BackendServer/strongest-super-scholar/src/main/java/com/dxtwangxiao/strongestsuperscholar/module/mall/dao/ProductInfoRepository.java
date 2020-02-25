package com.dxtwangxiao.strongestsuperscholar.module.mall.dao;

import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 商品信息数据访问层
 * <p>
 * Created by meiyu
 * 2018/7/5 11:52
 */
@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>,JpaSpecificationExecutor<ProductInfo> {

    /**
     * 查找所有商品
     *
     * @return 商品信息列表
     */
    List<ProductInfo> findAll();

    /**
     * 分页查询商品信息列表
     *
     * @param pageable 分页对象
     * @return 商品信息列表
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 根据商品类型查询商品列表
     *
     * @param productType 商品类型，A1:现金买金币, A2:现金买学点-普通学点, A3:现金买学点-日卡, A4:现金买学点-月卡, A5:现金买学点-年卡, B1:金币兑学点, B2:金币兑实物（礼品）, B3:金币兑虚拟物品（指道具，如双倍金币卡）
     * @return 指定商品信息列表
     */
    List<ProductInfo> findAllByProductType(String productType);

    /**
     * 根据商品ID查询商品信息
     *
     * @param productId 待查询商品ID
     * @return 商品信息
     */
    ProductInfo findByProductId(String productId);

    /**
     * 保存、更新、删除商品信息
     *
     * @param productInfo 商品信息
     * @return 商品信息
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 根据商品支付类型查询商品列表
     *
     * @param payType 支付方式，0表示人民币，1表示金币，2表示都支持
     * @return
     */
    List<ProductInfo> findAllByPaymentType(Byte payType);

    /**
     * 根据商品是否有效获取商品信息列表
     *
     * @param isValid 是否有效：0表示无效，1表示有效
     * @return 商品信息列表
     */
    List<ProductInfo> findAllByIsValid(Byte isValid);
}