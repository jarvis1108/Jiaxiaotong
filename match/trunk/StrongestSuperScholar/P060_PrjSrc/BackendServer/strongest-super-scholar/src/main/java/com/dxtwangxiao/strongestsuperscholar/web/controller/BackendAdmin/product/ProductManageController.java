package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.product;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ProductInfo;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.ProductInfoService;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.Constants;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.UpdateUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.sql.Timestamp;

@RestController
@RequestMapping("/api/v1/bam/productManage")
public class ProductManageController {

    @Autowired
    private ProductInfoService productInfoService;

    /**
     * 新增商品
     *
     * @param requestInfo 请求信息
     * @return ResponseInfo
     */
    @PostMapping
    public ResponseInfo savePro(@RequestBody RequestInfo requestInfo) {
        //从请求中获取参数
        JSONObject reqParam = requestInfo.getReqParam();
        //JSONObject reqUserInfo = requestInfo.getReqUserInfo();

        UUID uuid=UUID.randomUUID();
        String productID=uuid.toString();
        String productNo=reqParam.getString("productNo");
        String productName=reqParam.getString("productName");
        String productDesc=reqParam.getString("productDesc");
        String productType=reqParam.getString("productType");
        String unitOfNumerator=reqParam.getString("unitOfNumerator");
        String unitOfDenominator=reqParam.getString("unitOfDenominator");
        Double productPrice=reqParam.getDouble("productPrice");
        Byte paymentType=reqParam.getByte("paymentType");
        Timestamp beginTime = reqParam.getTimestamp("beginTime");
        Timestamp endTime=reqParam.getTimestamp("endTime");
        Byte isValid = reqParam.getByte("isValid");
        
        try {
            //根据传入修改信息创建新对象
            ProductInfo addedProduct = new ProductInfo(productID, productNo, productName, reqParam.getInteger("productValue"),
                    reqParam.getString("productImage"), productDesc, productType, productPrice, unitOfNumerator,
                    unitOfDenominator, paymentType, beginTime, endTime, null, null, null,
                    null, isValid, null);

            productInfoService.saveProduct(addedProduct);
        }catch(Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }

        return new ResponseInfo(requestInfo,productInfoService.getProductById(productID));
    }

    /**
     * 根据商品Id实现商品上下架
     *
     * @param productInfoId 商品Id
     * @param requestInfo       http请求
     * @return
     */
    @PostMapping("upOrDown/{productInfoId}")
    public ResponseInfo ProductUpOrDown(@PathVariable("productInfoId") String productInfoId, @RequestBody RequestInfo requestInfo){
        JSONObject jsonObject = new JSONObject();

        ProductInfo productInfo=productInfoService.getProductById(productInfoId);
        if(productInfo.getIsValid().equals((byte) 0)){
            productInfo.setIsValid((byte) 1);
        }
        else productInfo.setIsValid((byte) 0);

        productInfoService.updateProductInfo(productInfo);
        jsonObject.put("isValid",productInfo);

        return new ResponseInfo(requestInfo,jsonObject);
    }

    /**
     * 更新商品
     *
     * @param requestInfo      请求信息
     * @param productInfoId 商品Id
     * @return responseInfo
     */
    @PostMapping("update/{productInfoId}")
    public ResponseInfo ProductModify(@PathVariable("productInfoId") String productInfoId, @RequestBody RequestInfo requestInfo){
        //从请求中获取参数
        JSONObject reqParam=requestInfo.getReqParam();
        JSONObject reqUserInfo=requestInfo.getReqUserInfo();

        Double productPrice=reqParam.getDouble("productPrice");
        String productType=reqParam.getString("productType");
        Byte paymentType=reqParam.getByte("paymentType");
        String unitOfNumerator=reqParam.getString("unitOfNumerator");
        String unitOfDenominator=reqParam.getString("unitOfDenominator");
        Timestamp beginTime = new Timestamp(System.currentTimeMillis());
        Timestamp endTime = new Timestamp(System.currentTimeMillis());

        //根据传入修改信息创建新对象
        ProductInfo newProductInfo=new ProductInfo(productInfoId,productInfoId,reqParam.getString("productName"),
                reqParam.getInteger("productValue"),reqParam.getString("productImage"),reqParam.getString("productDesc"),
                productType,productPrice,unitOfNumerator, unitOfDenominator,paymentType,beginTime,endTime, reqParam.getDate("createTime"),
                reqParam.getString("createUser"),reqParam.getDate("updateTime"), reqUserInfo.getString("lastUpdUser"),
                reqParam.getByte("isValid"),reqParam.getString("remark"));

        ProductInfo oldProductInfo=productInfoService.getProductById(productInfoId);
        //源商品不存在
        if(oldProductInfo==null){
            return new ResponseInfo(requestInfo,"商品不存在");
        }
        //将newProductInfo的非空属性填充到oldProductInfo中
        UpdateUtil.copyProperties(newProductInfo,oldProductInfo);

        //更新数据库中的数据
        productInfoService.updateProductInfo(oldProductInfo);

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("product",newProductInfo);

        return new ResponseInfo(requestInfo,jsonObject);
    }

    /**
     * 获取所有商品列表或根据搜索条件获取商品列表
     *
     * @param request http请求
     * @return
     */
    @GetMapping("/list")
    public ResponseInfo ProductQuery(HttpServletRequest request) throws Exception{
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqPageInfo = requestInfo.getReqPageInfo();

        Integer pageSize = reqPageInfo.getInteger("pageSize");
        Integer curPage = reqPageInfo.getInteger("curPage");

        Pageable pageable=new PageRequest(curPage - 1, pageSize == null ? Constants.PAGE_SIZE : pageSize);
        Page<ProductInfo> productList = null;
        try{
            Page<ProductInfo> tempList=productInfoService.selectedProductList(pageable,reqParam);

            if(tempList.getSize()==0) {
                productList = productInfoService.getAllByPage(pageable);
            }
            else {
                productList = tempList;
            }
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }
        return new ResponseInfo(requestInfo, productList);
    }

}
