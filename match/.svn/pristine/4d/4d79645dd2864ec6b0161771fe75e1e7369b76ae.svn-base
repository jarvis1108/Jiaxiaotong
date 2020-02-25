package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.system.dao.FeedbackRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.Feedback;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.FeedbackService;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 意见反馈服务实现类
 * <p>
 * Created By Devin
 * 2018-09-25 上午 09:46
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    /**
     * 添加一条意见反馈
     *
     * @param userId  用户id
     * @param content 反馈内容
     * @return 保存后的意见反馈信息
     */
    @Override
    public Feedback create(String userId, String content) {
        Feedback feedback = new Feedback();
        feedback.setFeedbackId(UUIDUtil.getUUID());
        feedback.setFeedbackNo(feedback.getFeedbackId());
        feedback.setUserId(userId);
        feedback.setContent(content);
        feedback.setCreateTime(new Date());
        feedback.setCreateUser(userId);
        feedback.setLastUpdUser(userId);
        feedback.setLastUpdTime(new Date());
        feedback.setIsValid(Byte.valueOf("1"));
        return feedbackRepository.save(feedback);
    }
}