package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.mall;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.MallService;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.OrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 订单记录控制器
 * <p>
 * Created by Devin
 * 2018-09-01 PM 08:07
 */
@RestController
@RequestMapping("/api/v1/mall/orderRecord")
public class OrderRecordController {

	@Autowired
	private MallService mallService;

	/**
	 * 根据用户Id及购买方式分页查询用户订单记录
	 *
	 * @param request http请求
	 * @return
	 */
	@GetMapping("/list")
	public ResponseInfo getOrderRecordList(HttpServletRequest request) {
		RequestInfo requestInfo = WebUtil.parseGetRequest(request);
		JSONObject reqParam = requestInfo.getReqParam();
		JSONObject reqPageInfo = requestInfo.getReqPageInfo();

		String userId = reqParam.getString("userId");
		Byte purchaseWay = reqParam.getByte("purchaseWay");
		Integer curPage = reqPageInfo.getInteger("curPage");
		Integer pageSize = reqPageInfo.getInteger("pageSize");

		JSONObject jsonObject = new JSONObject();
		List<OrderRecordVO> orderRecordVOList = mallService.listOrderRecords(userId, purchaseWay, curPage, pageSize);
		jsonObject.put("orderRecordList", orderRecordVOList);
		return new ResponseInfo(requestInfo, jsonObject);
	}
}