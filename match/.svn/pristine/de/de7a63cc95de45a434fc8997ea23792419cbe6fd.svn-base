package com.dxtwangxiao.strongestsuperscholar.module.mall.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.ScholarshipRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.Scholarship;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 奖学金服务实现类
 * <p>
 * Created by 孙伟浩 on 2018/9/26.
 */
@Service
public class ScholarshipServiceImpl implements ScholarshipService {

    @Autowired
    private ScholarshipRepository scholarshipRepository;

    /**
     * 获取奖学金列表
     *
     * @return 奖学金列表
     */
    @Override
    public List<Scholarship> listScholarship() {
        return (List<Scholarship>) scholarshipRepository.findAll();
    }
}
