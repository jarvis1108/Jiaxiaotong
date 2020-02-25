package com.dxtwangxiao.strongestsuperscholar.module.mall.service;

import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * 商品信息服务 接口
 * <p>
 * Created by Devin
 * 2018-09-015 PM 03:47
 */
public interface ProductInfoService {
    /**
     * 获取条件过滤后的分页商品列表
     *
     * @param  pageable 分页信息
     * @param reqParam 过滤条件
     * @return  商品列表
     */
    Page<ProductInfo> selectedProductList(Pageable pageable, JSONObject reqParam);

    /**
     * 新增商品
     *
     * @param productInfo 商品
     */
    void saveProduct(ProductInfo productInfo);

    /**
     * 获取所有商品信息列表
     *
     * @return 商品信息列表
     */
    List<ProductInfo> getAll();

    /**
     * 分页获取所有商品信息列表
     *
     * @return 商品信息列表
     */
    Page<ProductInfo> getAllByPage(Pageable pageable);

    /**
     * 根据支付方式获取商品信息列表
     *
     * @param paymentType 支付方式：0表示人民币，1表示金币，2表示都支持
     * @return 商品信息列表
     */
    List<ProductInfo> getByPaymentType(Byte paymentType);

    /**
     * 根据商品是否有效获取商品信息列表
     *
     * @param isValid 是否有效：0表示无效，1表示有效
     * @return 商品信息列表
     */
    List<ProductInfo> getByIsValid(Byte isValid);

    /**
     * 根据商品类型获取商品信息列表
     *
     * @param productType
     * @return 商品信息列表
     */
    List<ProductInfo> getByProductType(String productType);

    /**
     * 根据商品Id获取商品信息
     *
     * @param productInfoId 商品Id
     * @return 商品信息
     */
    ProductInfo getProductById(String productInfoId);

    /**
     * 更新商品信息
     *
     * @param productInfo 更新的商品
     * @return
     */
     void updateProductInfo(ProductInfo productInfo);
}
