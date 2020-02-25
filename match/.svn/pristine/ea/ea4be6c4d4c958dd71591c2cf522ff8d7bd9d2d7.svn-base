package com.dxtwangxiao.strongestsuperscholar.module.base.dao;

import com.dxtwangxiao.strongestsuperscholar.module.base.entity.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 科目 数据访问层
 * <p>
 * Created by Devin
 * 2018-09-03 PM 08:05
 */
@Repository
public interface SubjectRepository extends CrudRepository<Subject, String> {

    /**
     * 根据年级阶段Id和年级Id获取科目列表
     *
     * @param gradePhaseId 年级阶段Id
     * @param gradeId      年级Id
     * @return 科目列表
     */
    List<Subject> findByGradePhaseIdAndGradeId(String gradePhaseId, String gradeId);
}
