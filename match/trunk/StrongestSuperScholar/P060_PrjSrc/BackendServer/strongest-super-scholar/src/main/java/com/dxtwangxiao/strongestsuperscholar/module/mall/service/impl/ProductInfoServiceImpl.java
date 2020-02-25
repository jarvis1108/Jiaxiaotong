package com.dxtwangxiao.strongestsuperscholar.module.mall.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.ProductInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ProductInfo;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品信息服务 实现类
 * <p>
 * Created by Devin
 * 2018-09-015 PM 03:47
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    /**
     * 获取条件过滤后的分页商品列表
     *
     * @param  pageable 分页信息
     * @param reqParam 过滤条件
     * @return  商品列表
     */
    @Override
    public Page<ProductInfo> selectedProductList(Pageable pageable, JSONObject reqParam) {
        Specification<ProductInfo> specification = new Specification<ProductInfo>() {
            @Override
            public Predicate toPredicate(Root<ProductInfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> productList = new ArrayList<>();

                //商品类型
                if (reqParam.getString("productType") != null) {
                    productList.add(criteriaBuilder.equal(root.get("productType").as(String.class), reqParam.getString("productType")));
                }
                //支付类型
                if (reqParam.getByte("paymentType") != null) {
                    productList.add(criteriaBuilder.equal(root.get("paymentType").as(Byte.class), reqParam.getString("paymentType")));
                }
                //商品是否有效
                if (reqParam.getByte("isValid") != null) {
                    productList.add(criteriaBuilder.equal(root.get("isValid").as(Byte.class), reqParam.getString("isValid")));
                }

                if (productList.size() == 0) {
                    return null;
                }

                Predicate[] tP = new Predicate[productList.size()];
                return criteriaBuilder.and(productList.toArray(tP));
            }
        };
        // 分页, 排序
        return productInfoRepository.findAll(specification,pageable);
    }

    /**
     * 新增商品
     *
     * @param productInfo 商品
     */
    @Override
    public void saveProduct(ProductInfo productInfo){
        productInfoRepository.save(productInfo);
    }

    /**
     * 获取所有商品信息列表
     *
     * @return 商品信息列表
     */
    @Override
    public List<ProductInfo> getAll(){
        return productInfoRepository.findAll();
    }

    /**
     * 分页获取所有商品信息列表
     *
     * @return 商品信息列表
     */
    @Override
    public Page<ProductInfo> getAllByPage(Pageable pageable){
        return productInfoRepository.findAll(pageable);
    }

    /**
     * 根据支付方式获取商品信息列表
     *
     * @param paymentType 支付方式：0表示人民币，1表示金币，2表示都支持
     * @return 商品信息列表
     */
    @Override
    public List<ProductInfo> getByPaymentType(Byte paymentType) {
        return productInfoRepository.findAllByPaymentType(paymentType);
    }

    /**
     * 根据商品是否有效获取商品信息列表
     *
     * @param isValid 是否有效：0表示无效，1表示有效
     * @return 商品信息列表
     */
    @Override
    public List<ProductInfo> getByIsValid(Byte isValid){
        return productInfoRepository.findAllByIsValid(isValid);
    }

    /**
     * 根据商品类型获取商品信息列表
     *
     * @param productType
     * @return 商品信息列表
     */
    public List<ProductInfo> getByProductType(String productType){
        return productInfoRepository.findAllByProductType(productType);
    }

    /**
     * 根据商品Id获取商品信息
     *
     * @param productInfoId 商品Id
     * @return 商品信息
     */
    @Override
    public ProductInfo getProductById(String productInfoId) {
        return productInfoRepository.findByProductId(productInfoId);
    }

    /**
     * 更新商品信息
     *
     * @param productInfo 更新的商品
     * @return
     */
    @Override
    public void updateProductInfo(ProductInfo productInfo) {
        productInfoRepository.saveAndFlush(productInfo);
    }
}
