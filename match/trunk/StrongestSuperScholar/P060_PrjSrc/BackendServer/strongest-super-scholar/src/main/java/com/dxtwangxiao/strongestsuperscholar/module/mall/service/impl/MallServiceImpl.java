package com.dxtwangxiao.strongestsuperscholar.module.mall.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.BackOrderRecordVORepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.OrderRecordRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.OrderRecordVORepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.ProductInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.OrderRecord;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ProductInfo;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.MallService;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.BackOrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.OrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.*;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.User;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserCoinDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserLPDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserRelInfo;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * 商城服务实现类
 * <p>
 * Created By Devin
 * 2018-09-01 下午 04:43
 */
@Service
public class MallServiceImpl implements MallService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRelInfoRepository userRelInfoRepository;

	@Autowired
	private ProductInfoRepository productInfoRepository;

	@Autowired
	private OrderRecordRepository orderRecordRepository;

	@Autowired
	private OrderRecordVORepository orderRecordVORepository;

	@Autowired
	private UserCoinDetailRepository userCoinDetailRepository;

	@Autowired
	private UserLPDetailRepository userLPDetailRepository;

	/**
	 * 充值（花费人民币进行金币或者学点充值）
	 *
	 * @param userId    用户Id
	 * @param productId 商品Id
	 * @param amount    商品数量
	 * @return
	 */
	@Override
	@Transactional
	public UserDTO recharge(String userId, String productId, Integer amount) {
		ProductInfo productInfo = productInfoRepository.findByProductId(productId);
		double sumPrice = productInfo.getProductPrice() * amount;

		// 1.添加订单记录
		OrderRecord orderRecord = new OrderRecord();
		orderRecord.setOrderRecordId(UUIDUtil.getUUID());
		orderRecord.setOrderRecordNo(orderRecord.getOrderRecordId());
		orderRecord.setUserId(userId);
		orderRecord.setProductId(productInfo.getProductId());
		orderRecord.setProductNo(productInfo.getProductNo());
		orderRecord.setProductAmount(amount);
		orderRecord.setSumPrice(sumPrice);
		orderRecord.setActualSumPrice(sumPrice);
		orderRecord.setPurchaseWay(Byte.valueOf("0"));
		orderRecord.setStatus("0");
		orderRecord.setSubscribeTime(new Timestamp(new Date().getTime()));
		orderRecord.setCreateTime(new Timestamp(new Date().getTime()));
		orderRecord.setCreateUser(userId);
		orderRecordRepository.save(orderRecord);

		// 2.更新UserRelInfo表信息和用户明细信息
		User user = userRepository.findUserByUserId(userId);
		UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);
		String productType = productInfo.getProductType();
		if (productType.equals("A1")) {  // 现金买金币
			Integer coinAmount = 1000 * amount;

			UserCoinDetail userCoinDetail = new UserCoinDetail();
			userCoinDetail.setUserCoinDetailId(UUIDUtil.getUUID());
			userCoinDetail.setUserCoinDetailNo(userCoinDetail.getUserCoinDetailId());
			userCoinDetail.setUserId(userId);
			userCoinDetail.setUserNo(userRelInfo.getUserNo());
			userCoinDetail.setOccurTime(new Timestamp(new Date().getTime()));
			userCoinDetail.setOriginalAmount(userRelInfo.getCoin());
			userCoinDetail.setAcquiredAmount(coinAmount);
			userCoinDetail.setLossAmount(0);
			Integer currentAmount = userRelInfo.getCoin() + coinAmount;
			userCoinDetail.setCurrentAmount(currentAmount);
			userCoinDetail.setReasonType("金币充值");
			userCoinDetail.setOrderRecordId(orderRecord.getOrderRecordId());
			orderRecord.setOrderRecordNo(orderRecord.getOrderRecordNo());
			userCoinDetail.setCreateTime(new Timestamp(new Date().getTime()));
			userCoinDetail.setCreateUser(userId);
			userCoinDetail.setLastUpdUser(userId);
			userCoinDetail.setIsValid(Byte.valueOf("1"));
			userCoinDetailRepository.save(userCoinDetail);

			userRelInfo.setCoin(currentAmount);
		}

		if (productType.equals("A2")) {  // 现金买学点
			Integer learningPointAmount = 1000 * amount;

			UserLPDetail userLPDetail = new UserLPDetail();
			userLPDetail.setUserLpDetailId(UUIDUtil.getUUID());
			userLPDetail.setUserLpDetailNo(userLPDetail.getUserLpDetailId());
			userLPDetail.setUserId(userId);
			userLPDetail.setUserNo(userRelInfo.getUserNo());
			userLPDetail.setOccurTime(new Timestamp(new Date().getTime()));
			userLPDetail.setOriginalAmount(userRelInfo.getCoin());
			userLPDetail.setAcquiredAmount(learningPointAmount);
			userLPDetail.setLossAmount(0);
			Integer currentAmount = userRelInfo.getCoin() + learningPointAmount;
			userLPDetail.setCurrentAmount(currentAmount);
			userLPDetail.setReasonType("学点充值");
			userLPDetail.setOrderRecordId(orderRecord.getOrderRecordId());
			userLPDetail.setOrderRecordNo(orderRecord.getOrderRecordNo());
			userLPDetail.setCreateTime(new Timestamp(new Date().getTime()));
			userLPDetail.setCreateUser(userId);
			userLPDetail.setLastUpdUser(userId);
			userLPDetail.setIsValid(Byte.valueOf("1"));
			userLPDetailRepository.save(userLPDetail);

			userRelInfo.setLearningPoint(currentAmount);
		}

		userRelInfoRepository.save(userRelInfo);

		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		BeanUtils.copyProperties(userRelInfo, userDTO);
		return userDTO;
	}

	/**
	 * 金币兑换学点
	 *
	 * @param userId    用户Id
	 * @param productId 商品Id
	 * @param amount    商品数量
	 * @return
	 */
	@Override
	@Transactional
	public UserDTO exchange(String userId, String productId, Integer amount) throws StrongestScholarException {
		if (userId == null || productId == null || amount == null) {
			throw new StrongestScholarException(CommonError.REQ_PARAM_ERR.getCode(), CommonError.REQ_PARAM_ERR.getMessage());
		}
		ProductInfo productInfo = productInfoRepository.findByProductId(productId);
		if (productInfo == null) {
			throw new StrongestScholarException("", "无法获取商品信息");
		}
		double sumPrice = productInfo.getProductPrice() * amount;
		int coinConsumed = (int) sumPrice;

		// 1.添加订单记录
		OrderRecord orderRecord = new OrderRecord();
		orderRecord.setOrderRecordId(UUIDUtil.getUUID());
		orderRecord.setOrderRecordNo(orderRecord.getOrderRecordId());
		orderRecord.setUserId(userId);
		orderRecord.setProductId(productInfo.getProductId());
		orderRecord.setProductNo(productInfo.getProductNo());
		orderRecord.setProductAmount(amount);
		orderRecord.setSumPrice(sumPrice);
		orderRecord.setActualSumPrice(sumPrice);
		orderRecord.setPurchaseWay(Byte.valueOf("1"));
		orderRecord.setStatus("1");
		orderRecord.setSubscribeTime(new Timestamp(new Date().getTime()));
		orderRecord.setCreateTime(new Timestamp(new Date().getTime()));
		orderRecord.setCreateUser(userId);
		orderRecordRepository.save(orderRecord);

		// 2.更新UserRelInfo表信息和用户明细信息
		User user = userRepository.findUserByUserId(userId);
		UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);
		String productType = productInfo.getProductType();
		if (productType.equals("B1")) {  // 金币兑换学点
			Integer learningPoint = productInfo.getProductValue() * amount;

			UserCoinDetail userCoinDetail = new UserCoinDetail();
			userCoinDetail.setUserCoinDetailId(UUIDUtil.getUUID());
			userCoinDetail.setUserCoinDetailNo(userCoinDetail.getUserCoinDetailId());
			userCoinDetail.setUserId(userId);
			userCoinDetail.setUserNo(userRelInfo.getUserNo());
			userCoinDetail.setOccurTime(new Timestamp(new Date().getTime()));
			userCoinDetail.setOriginalAmount(userRelInfo.getCoin());
			userCoinDetail.setAcquiredAmount(0);
			userCoinDetail.setLossAmount(coinConsumed);
			Integer currentCoinAmount = userRelInfo.getCoin() - coinConsumed;
			userCoinDetail.setCurrentAmount(currentCoinAmount);
			userCoinDetail.setReasonType("金币兑换学点");
			userCoinDetail.setOrderRecordId(orderRecord.getOrderRecordId());
			userCoinDetail.setOrderRecordNo(orderRecord.getOrderRecordNo());
			userCoinDetail.setCreateTime(new Timestamp(new Date().getTime()));
			userCoinDetail.setCreateUser(userId);
			userCoinDetail.setLastUpdUser(userId);
			userCoinDetail.setIsValid(Byte.valueOf("1"));
			userCoinDetailRepository.save(userCoinDetail);

			UserLPDetail userLPDetail = new UserLPDetail();
			userLPDetail.setUserLpDetailId(UUIDUtil.getUUID());
			userLPDetail.setUserLpDetailNo(userLPDetail.getUserLpDetailId());
			userLPDetail.setUserId(userId);
			userLPDetail.setUserNo(userRelInfo.getUserNo());
			userLPDetail.setOccurTime(new Timestamp(new Date().getTime()));
			userLPDetail.setOriginalAmount(userRelInfo.getCoin());
			userLPDetail.setAcquiredAmount(learningPoint);
			userLPDetail.setLossAmount(0);
			Integer currentLPAmount = userRelInfo.getLearningPoint() + learningPoint;
			userLPDetail.setCurrentAmount(currentLPAmount);
			userLPDetail.setReasonType("金币兑换学点");
			userLPDetail.setOrderRecordId(orderRecord.getOrderRecordId());
			userLPDetail.setOrderRecordNo(orderRecord.getOrderRecordNo());
			userLPDetail.setCreateTime(new Timestamp(new Date().getTime()));
			userLPDetail.setCreateUser(userId);
			userLPDetail.setLastUpdUser(userId);
			userLPDetail.setIsValid(Byte.valueOf("1"));
			userLPDetailRepository.save(userLPDetail);

			userRelInfo.setCoin(currentCoinAmount);
			userRelInfo.setLearningPoint(currentLPAmount);
		}
		userRelInfoRepository.save(userRelInfo);

		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		BeanUtils.copyProperties(userRelInfo, userDTO);
		return userDTO;
	}

	/**
	 * 根据用户Id和购买方式获取其订单记录，默认显示第一页，每页10条数据
	 *
	 * @param userId      用户Id
	 * @param purchaseWay 购买方式，0表示人民币（充值记录），1表示金币（兑换记录）
	 * @return
	 */
	@Override
	public List<OrderRecordVO> listOrderRecords(String userId, Byte purchaseWay, Integer curPage, Integer pageSize) {
		if (userId == null || purchaseWay == null) {
			throw new StrongestScholarException(CommonError.REQ_PARAM_ERR.getCode(), CommonError.REQ_PARAM_ERR.getMessage());
		}
		if (curPage == null) curPage = 1;
		if (pageSize == null) pageSize = 10;
		Pageable pageable = PageRequest.of(curPage - 1, pageSize);
		Page<OrderRecordVO> page = orderRecordVORepository.findByUserIdAndPurchaseWayOrderByCreateTimeDesc(userId, purchaseWay, pageable);
		return page.getContent();
	}

}