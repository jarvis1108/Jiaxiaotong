package com.dxtwangxiao.strongestsuperscholar.module.mall.service;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.OrderRecord;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ProductInfo;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.BackOrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.OrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/18 20:33
 * @Description TODO
 */
public interface BackOrderRecordService {
    /**
     * 查询所有的订单记录信息（分页）
     *
     * @return
     */
    Page<BackOrderRecordVO> listOrderRecords(Integer curPage, Integer pageSize, JSONObject reqParam);

    /**
     * 功能描述: 删除某一行的数据
     *
     * @date: 2018/10/18 22:33
     */
    void delete(String orderRecordID);

    /**
     * 功能描述: 更新订单记录表格的数据
     *
     * @param:
     * @return:
     * @date: 2018/10/22 21:40
     */
    void updateOrderRecord(OrderRecord orderRecord);

    /**
     * 功能描述: 更新产品信息表格的数据
     *
     * @param:
     * @auther: 程志强
     * @date: 2018/10/22 21:41
     */
    void updateProductInfo(ProductInfo productInfo);
    /**
     * 功能描述: 按订单id搜索后台订单信息
     *
     * @auther: 程志强
     * @date: 2018/10/18 22:32
     */
    BackOrderRecordVO findByOrderRecordId(String orderRecordID);

    /**
     * 功能描述: 根据订单id（主键）获取订单信息
     *
     * @param:
     * @date: 2018/10/22 21:41
     */
    OrderRecord getOrderRecordById(String orderRecordID);

    /**
     * 功能描述: 通过产品id获取产品信息
     *
     * @param:
     * @date: 2018/10/22 21:42
     */
    ProductInfo getProductById(String productId);
}
