package com.dxtwangxiao.strongestsuperscholar.module.community.dao;

import com.dxtwangxiao.strongestsuperscholar.module.community.entity.SpecialTraining;
import com.dxtwangxiao.strongestsuperscholar.module.community.vo.SpecialTrainingVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 程志强
 * @Date: 2018/9/10 00:04
 * @Description: SpecialTrainingVO的DAO层
 */
@Repository
public interface SpecialTrainingVORepository extends CrudRepository<SpecialTrainingVO,String> {

    List<SpecialTrainingVO> findAll();
    /**
     * @Description: 根据当前用户的id获取它的所有成员VO数据集合
     */
    List<SpecialTrainingVO> findByLastUserId(String lastUserId);

    Page<SpecialTrainingVO> findByLastUserId(Pageable pageable,String lastUserId);

    SpecialTrainingVO findByUserId(String userId);

}
