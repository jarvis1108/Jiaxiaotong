package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.OrderRecord;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.OrderRecord;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.BackOrderRecordService;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.BackOrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.UpdateUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bam/order")
public class OrderRecordManageController {

    @Autowired
    private BackOrderRecordService backOrderRecordService;

    /**
     * 根据搜索条件获取商品列表
     *
     * @param request http请求
     * @return
     */
    @GetMapping("/list")
    public ResponseInfo OrderRecordSearch(HttpServletRequest request) throws Exception{
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqPageInfo = requestInfo.getReqPageInfo();

        Integer pageSize = reqPageInfo.getInteger("pageSize");
        Integer curPage = reqPageInfo.getInteger("curPage");

        Page<BackOrderRecordVO> backOrderRecordVOList = null;
        try{
            backOrderRecordVOList=backOrderRecordService.listOrderRecords(curPage,pageSize,reqParam);
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }
        return new ResponseInfo(requestInfo, backOrderRecordVOList);
    }

    /**
     * 根据订单Id实现订单是否有效
     *
     * @param orderRecordId 订单Id
     * @param requestInfo       http请求
     * @return
     */
    @PostMapping("isValid/{orderRecordId}")
    public ResponseInfo OrderRecordUpOrDown(@PathVariable("orderRecordId") String orderRecordId, @RequestBody RequestInfo requestInfo){
        JSONObject jsonObject = new JSONObject();

        OrderRecord orderRecord=backOrderRecordService.getOrderRecordById(orderRecordId);
        if(orderRecord.getIsValid().equals((byte) 0)){
            orderRecord.setIsValid((byte) 1);
        }
        else orderRecord.setIsValid((byte) 0);

        backOrderRecordService.updateOrderRecord(orderRecord);

        BackOrderRecordVO backOrderRecordVO= backOrderRecordService.findByOrderRecordId(orderRecordId);
        jsonObject.put("isValid",backOrderRecordVO);

        return new ResponseInfo(requestInfo,jsonObject);
    }

    /**
     * 更新订单
     *
     * @param requestInfo      请求信息
     * @param orderRecordId 订单Id
     * @return responseInfo
     */
    @PostMapping("update/{orderRecordId}")
    public ResponseInfo OrderRecordModify(@PathVariable("orderRecordId") String orderRecordId, @RequestBody RequestInfo requestInfo){
        //从请求中获取参数
        JSONObject reqParam=requestInfo.getReqParam();
        JSONObject reqUserInfo=requestInfo.getReqUserInfo();

        //数据库中的源订单
        OrderRecord oldOrderRecord=backOrderRecordService.getOrderRecordById(orderRecordId);
        //源商品不存在
        if(oldOrderRecord==null){
            return new ResponseInfo(requestInfo,"订单不存在");
        }

        Integer productAmount=reqParam.getInteger("productAmount");
        Byte purchaseWay=reqParam.getByte("purchaseWay");
        String orderStatus=reqParam.getString("status");
        String paymentStatus=reqParam.getString("status");
        Double sumPrice=null;
        //当更改了商品数量之后总价也随之发生变化
        if(productAmount!=null&&(oldOrderRecord.getUnit())!=null){
            sumPrice=productAmount*oldOrderRecord.getUnit();
        }

        try {
            //根据传入修改信息创建新对象
            OrderRecord newOrderRecord = new OrderRecord(orderRecordId, orderRecordId, reqParam.getString("userId"),
                    reqParam.getString("productId"), reqParam.getString("productNo"), productAmount, reqParam.getDouble("unit"),
                    sumPrice, reqParam.getDouble("actualSumPrice"), purchaseWay, orderStatus, reqParam.getString("instruction"),
                    reqParam.getTimestamp("subscribeTime"), reqParam.getTimestamp("createTime"), reqParam.getString("createUser"),
                    reqParam.getTimestamp("lastUpdTime"), reqParam.getString("lastUpdUser"), reqParam.getByte("isValid"),
                    reqParam.getString("remark"));

            //将newOrderRecord的非空属性填充到oldOrderRecord中
            UpdateUtil.copyProperties(newOrderRecord, oldOrderRecord);

            //更新数据库中的数据
            backOrderRecordService.updateOrderRecord(oldOrderRecord);
        }catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }
        BackOrderRecordVO backOrderRecordVO= backOrderRecordService.findByOrderRecordId(orderRecordId);

        return new ResponseInfo(requestInfo,backOrderRecordVO);
    }
}