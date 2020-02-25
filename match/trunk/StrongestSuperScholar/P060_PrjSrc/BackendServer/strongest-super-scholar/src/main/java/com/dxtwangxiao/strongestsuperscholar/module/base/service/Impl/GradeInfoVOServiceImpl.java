package com.dxtwangxiao.strongestsuperscholar.module.base.service.Impl;

import com.dxtwangxiao.strongestsuperscholar.module.base.dao.GradeInfoVORepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.GradeInfoVOService;
import com.dxtwangxiao.strongestsuperscholar.module.base.vo.GradeInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 年级信息视图 服务实现
 * <p>
 * Created By Devin
 * 2018-08-31 上午 10:37
 */
@Service
public class GradeInfoVOServiceImpl implements GradeInfoVOService {

    @Autowired
    private GradeInfoVORepository gradeInfoVORepository;

    /**
     * 根据年级阶段Id获取其对应的年级信息列表
     *
     * @param gradePhaseId 年级阶段id
     * @return 年级信息列表
     */
    @Override
    public List<GradeInfoVO> getByGradePhaseId(String gradePhaseId) {
        return gradeInfoVORepository.findByGradePhaseId(gradePhaseId);
    }

    /**
     * 获取所有年级信息列表
     *
     * @return 年级信息列表
     */
    @Override
    public List<GradeInfoVO> getAll() {
        return gradeInfoVORepository.findAll();
    }
}
