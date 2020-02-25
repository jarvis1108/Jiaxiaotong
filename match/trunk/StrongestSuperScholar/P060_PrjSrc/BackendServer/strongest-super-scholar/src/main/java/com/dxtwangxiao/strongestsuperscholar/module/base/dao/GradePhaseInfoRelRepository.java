package com.dxtwangxiao.strongestsuperscholar.module.base.dao;

import com.dxtwangxiao.strongestsuperscholar.module.base.entity.GradePhaseInfoRel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 年级阶段与年级信息关联表数据访问层
 * <p>
 * Created by Devin
 * 2018-07-17 下午 04:30
 */
@Repository
public interface GradePhaseInfoRelRepository extends CrudRepository<GradePhaseInfoRel, String> {

    /**
     * 获取所有年级阶段与年级信息关联列表
     *
     * @return 年级阶段与年级信息关联信息列表
     */
    List<GradePhaseInfoRel> findAll();

    /**
     * 根据年级阶段Id和年级Id获取关联信息
     *
     * @param gradePhaseId 年级阶段Id
     * @param gradeId      年级Id
     * @return
     */
    GradePhaseInfoRel findByGradePhaseIdAndGradeId(String gradePhaseId, String gradeId);

    /**
     * 根据内部等级获取关联信息
     *
     * @param internalLevel 内部等级
     * @return
     */
    GradePhaseInfoRel findByInternalLevel(Integer internalLevel);

    /**
     * 保存或者更新关联信息表
     *
     * @param gradePhaseInfoRel 关联信息表
     * @return 新创建或者修改后的对象信息
     */
    GradePhaseInfoRel save(GradePhaseInfoRel gradePhaseInfoRel);

    List<GradePhaseInfoRel> findByGradePhaseId(String gradePhaseId);
}
