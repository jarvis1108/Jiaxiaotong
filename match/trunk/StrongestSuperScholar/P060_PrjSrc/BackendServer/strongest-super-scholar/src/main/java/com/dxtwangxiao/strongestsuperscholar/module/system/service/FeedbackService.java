package com.dxtwangxiao.strongestsuperscholar.module.system.service;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.Feedback;

/**
 * 意见反馈服务接口
 * <p>
 * Created By Devin
 * 2018-09-25 上午 09:45
 */
public interface FeedbackService {

    /**
     * 添加一条意见反馈
     *
     * @param userId  用户id
     * @param content 反馈内容
     * @return 保存后的意见反馈信息
     */
    Feedback create(String userId, String content);
}
