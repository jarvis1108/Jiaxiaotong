package com.dxtwangxiao.strongestsuperscholar.module.base.dao;

import com.dxtwangxiao.strongestsuperscholar.module.base.vo.GradeInfoVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 年级信息视图 数据访问层
 * <p>
 * Created By Devin
 * 2018-08-31 上午 10:35
 */
@Repository
public interface GradeInfoVORepository extends CrudRepository<GradeInfoVO, String> {

    /**
     * 根据年级阶段ID获取其所对应的年级信息
     *
     * @param gradePhaseId 年级信息列表
     * @return
     */
    List<GradeInfoVO> findByGradePhaseId(String gradePhaseId);

    /**
     * 获取所有年级阶段及年级信息
     *
     * @return 年级信息列表
     */
    List<GradeInfoVO> findAll();
}
