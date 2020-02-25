package com.dxtwangxiao.strongestsuperscholar.module.base.dao;

import com.dxtwangxiao.strongestsuperscholar.module.base.entity.GradePhaseInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 年级阶段基本信息表数据访问层
 * <p>
 * Created by Devin
 * 2018-07-13 下午 01:50
 */
@Repository
public interface GradePhaseInfoRepository extends CrudRepository<GradePhaseInfo, String> {

    /**
     * 获取所有年级类别
     *
     * @return 年级阶段基本信息列表
     */
    List<GradePhaseInfo> findAll();


    /**
     * 保存或者更新年级阶段基本信息表
     *
     * @param gradePhaseInfo 年级阶段基本信息
     * @return 新创建或者修改后的对象信息
     */
    GradePhaseInfo save(GradePhaseInfo gradePhaseInfo);
}
