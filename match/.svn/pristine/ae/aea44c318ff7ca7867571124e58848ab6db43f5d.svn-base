package com.dxtwangxiao.strongestsuperscholar.module.community.service;

import com.dxtwangxiao.strongestsuperscholar.module.community.vo.SpecialTrainingVO;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;

import java.util.List;

/**
 * @Auther: 程志强
 * @Date: 2018/9/10 13:24
 * @Description:
 */
public interface SpecialTrainingVOService {
    List<SpecialTrainingVO> getSpecialTrainingMembers(String lastUserId);

    List<SpecialTrainingVO> getSpecialTrainingMembers(Integer currentPage, Integer pageSize,String lastUserId);

    void createNewMember(String userId,String lastUserId) throws StrongestScholarException;

    SpecialTrainingVO getSpecialTrainingByUserId(String userId);

}
