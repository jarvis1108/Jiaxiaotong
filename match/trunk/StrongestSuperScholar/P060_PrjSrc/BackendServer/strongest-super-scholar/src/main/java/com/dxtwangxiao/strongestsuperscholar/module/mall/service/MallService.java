package com.dxtwangxiao.strongestsuperscholar.module.mall.service;

import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.OrderRecord;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.BackOrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.OrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;

import java.util.List;

/**
 * 商城服务接口
 * <p>
 * Created By Devin
 * 2018-09-01 下午 04:42
 */
public interface MallService {

	/**
	 * 充值（花费人民币进行金币或者学点充值）
	 *
	 * @param userId    用户Id
	 * @param productId 商品Id
	 * @param amount    商品数量
	 * @return
	 */
	UserDTO recharge(String userId, String productId, Integer amount);


	/**
	 * 兑换金币
	 *
	 * @param userId    用户Id
	 * @param productId 商品Id
	 * @param amount    商品数量
	 * @return
	 */
	UserDTO exchange(String userId, String productId, Integer amount) throws StrongestScholarException;

	/**
	 * 根据用户Id和购买方式获取其订单记录，默认显示第一页，每页10条数据
	 *
	 * @param userId      用户Id
	 * @param purchaseWay 购买方式，0表示人民币（充值记录），1表示金币（兑换记录）
	 * @return 订单记录视图列表
	 */
	List<OrderRecordVO> listOrderRecords(String userId, Byte purchaseWay, Integer curPage, Integer pageSize);
}
