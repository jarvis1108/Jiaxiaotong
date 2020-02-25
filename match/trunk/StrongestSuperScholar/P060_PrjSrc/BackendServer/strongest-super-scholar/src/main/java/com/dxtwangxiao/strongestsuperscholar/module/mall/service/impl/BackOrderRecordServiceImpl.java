package com.dxtwangxiao.strongestsuperscholar.module.mall.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.BackOrderRecordVORepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.OrderRecordRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.ProductInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.OrderRecord;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ProductInfo;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.BackOrderRecordService;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.BackOrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
 * @author 程志强
 * @date 2018/10/18 22:06
 * @Description TODO
 */
@Service
public class BackOrderRecordServiceImpl implements BackOrderRecordService {
    @Autowired
    BackOrderRecordVORepository backOrderRecordVORepository;
    @Autowired
    OrderRecordRepository orderRecordRepository;
    @Autowired
    ProductInfoRepository productInfoRepository;

    /**
     * 查询所有的订单记录信息（分页）
     *
     * @return
     */
    @Override
    public Page<BackOrderRecordVO> listOrderRecords(Integer curPage, Integer pageSize, JSONObject reqParam) {
        Specification<BackOrderRecordVO> specification = new Specification<BackOrderRecordVO>() {
            @Override
            public Predicate toPredicate(Root<BackOrderRecordVO> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();

                if(reqParam != null){
                    //限定条件,根据订单号查询，根据微信名的模糊搜索
                    if(reqParam.get("orderRecordID") != null){
                        predicates.add(criteriaBuilder.equal(root.get("orderRecordID").as(String.class),reqParam.getString("orderRecordID")));
                    }
                    if(reqParam.get("wechatName") != null){
                        predicates.add(criteriaBuilder.like(root.get("wechatName").as(String.class),"%" + reqParam.getString("wechatName") + "%"));
                    }
                }
                if(predicates.size() == 0){
                    return null;
                }
                Predicate[] tp = new Predicate[predicates.size()];
                return criteriaBuilder.and(predicates.toArray(tp));
            }
        };
        Pageable pageable;
        if (curPage == null||pageSize == null){
            pageable = PageRequest.of(1, Constants.PAGE_SIZE);
        }else {
            pageable = PageRequest.of(curPage - 1, pageSize);
        }
        return backOrderRecordVORepository.findAll(specification,pageable);

    }

    public void delete(String orderRecordID){
        if(null == orderRecordID){
            throw new StrongestScholarException("E_201810142030_57_011","传入的id为空");
        }
        orderRecordRepository.deleteById(orderRecordID);
    }

    public void updateOrderRecord(OrderRecord orderRecord){
        if(null == orderRecord){
            throw new StrongestScholarException("E_201810142041_57_012","传入的orderRecord为空");
        }
        orderRecordRepository.save(orderRecord);
    }

    public void updateProductInfo(ProductInfo productInfo){
        if(null == productInfo){
            throw new StrongestScholarException("E_201810192233_57_015","传入的productID为空");
        }
        productInfoRepository.save(productInfo);
    }

    @Override
    public BackOrderRecordVO findByOrderRecordId(String orderRecordID) {
        if(orderRecordID == null){
            throw new StrongestScholarException("E_201810182232_57_011","orderRecordID为空");
        }
        return backOrderRecordVORepository.findByOrderRecordID(orderRecordID);
    }

    @Override
    public OrderRecord getOrderRecordById(String orderRecordID){
        if(orderRecordID == null){
            throw new StrongestScholarException("E_201810182241_57_012","orderRecordID为空");
        }
        return orderRecordRepository.findByOrderRecordId(orderRecordID);
    }

    @Override
    public ProductInfo getProductById(String productId) {
        if(productId == null){
            throw new StrongestScholarException("E_201810192229_57_011","传入的id为空");
        }
        return productInfoRepository.findByProductId(productId);
    }
}
