package com.dxtwangxiao.strongestsuperscholar.module.system.dao;

import com.dxtwangxiao.strongestsuperscholar.module.system.entity.Feedback;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 意见反馈数据访问层
 * <p>
 * Created By Devin
 * 2018-09-25 上午 09:43
 */
@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, String> {

    /**
     * 添加意见反馈信息
     *
     * @param feedback 意见反馈
     * @return 保存后的意见反馈信息
     */
    Feedback save(Feedback feedback);
}
