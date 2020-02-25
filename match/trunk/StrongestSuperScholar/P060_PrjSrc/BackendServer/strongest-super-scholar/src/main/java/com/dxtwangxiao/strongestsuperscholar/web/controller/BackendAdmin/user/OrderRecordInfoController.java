package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.user;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.OrderRecord;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ProductInfo;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.BackOrderRecordService;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.BackOrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/12 19:15
 * @Description 后台管理系统 用户订单记录管理
 */
@RestController
@RequestMapping("/api/v1/bam/user/orderRecord")
public class OrderRecordInfoController {
    @Autowired
    BackOrderRecordService backOrderRecordService;

    @GetMapping("/list")
    public ResponseInfo checkAll(HttpServletRequest request) throws StrongestScholarException{
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        JSONObject pageInfo = requestInfo.getReqPageInfo();
        Integer pageSize = pageInfo.getInteger("pageSize");
        Integer curPage = pageInfo.getInteger("curPage");

        JSONObject reqParam = requestInfo.getReqParam();

        Page<BackOrderRecordVO> list = backOrderRecordService.listOrderRecords(curPage,pageSize,reqParam);
        return new ResponseInfo(requestInfo,list);
    }

    /**
     * 功能描述: 删除某一行的消费记录
     *
     * @param: 当前行的主键ID
     * @auther: 程志强
     * @date: 2018/10/12 18:44
     */

    @PostMapping("/delete/{orderRecordID}")
    public ResponseInfo deleteInfo(@PathVariable("orderRecordID") String orderRecordID,@RequestBody RequestInfo requestInfo)throws StrongestScholarException{
        if(orderRecordID == null){
            throw new StrongestScholarException("E_201810121556_57_014","传入的信息id为空");
        }
        backOrderRecordService.delete(orderRecordID);
        return new ResponseInfo(requestInfo,"删除成功");
    }

    /**
     * 功能描述: 更新某一行的订单记录
     *
     * @param: 当前行的主键ID
     * @auther: 程志强
     * @date: 2018/10/12 18:44
     */

    @PostMapping("/update/{orderRecordID}")
    public ResponseInfo updateInfo(@PathVariable("orderRecordID") String orderRecordID,@RequestBody RequestInfo requestInfo)throws StrongestScholarException{
        JSONObject reqParam = requestInfo.getReqParam();
        if(reqParam == null){
            return new ResponseInfo(requestInfo,null);
        }
        //根据orderRecordID获取当前的orderRecord，然后根据reqParam传入的参数，将新的值覆盖原有orderRecord，实现更新
        OrderRecord orderRecord = backOrderRecordService.getOrderRecordById(orderRecordID);
        if(reqParam.getInteger("productAmount") != null){
            orderRecord.setProductAmount(reqParam.getInteger("productAmount"));
        }
        if(reqParam.getDouble("sumPrice") != null){
            orderRecord.setSumPrice(reqParam.getDouble("sumPrice"));
        }
        if(reqParam.getDouble("actualSumPrice") != null){
            orderRecord.setActualSumPrice(reqParam.getDouble("actualSumPrice"));
        }
        if(reqParam.getByte("purchaseWay") != null){
            orderRecord.setPurchaseWay(reqParam.getByte("purchaseWay"));
        }
        if(reqParam.getString("status") != null){
            orderRecord.setStatus(reqParam.getString("status"));
        }
        if(reqParam.getByte("isValid") != null){
            orderRecord.setIsValid(reqParam.getByte("isValid"));
        }

        String productId = orderRecord.getProductId();
        ProductInfo productInfo = backOrderRecordService.getProductById(productId);
        if(reqParam.getString("productName") != null){
            productInfo.setProductName(reqParam.getString("productName"));
        }
        if(reqParam.getDouble("productPrice") != null){
            productInfo.setProductPrice(reqParam.getDouble("productPrice"));
        }

        backOrderRecordService.updateOrderRecord(orderRecord);
        backOrderRecordService.updateProductInfo(productInfo);

        BackOrderRecordVO backOrderRecordVO = backOrderRecordService.findByOrderRecordId(orderRecordID);
        return new ResponseInfo(requestInfo,backOrderRecordVO);
    }

}