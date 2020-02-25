package com.dxtwangxiao.strongestsuperscholar.module.base.service.Impl;

import com.dxtwangxiao.strongestsuperscholar.module.base.dao.SubjectRepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.Subject;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.SubjectService;
import com.dxtwangxiao.strongestsuperscholar.web.dto.SubjectDTO;
import com.dxtwangxiao.strongestsuperscholar.web.util.MathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Devin
 * 2018-09-03 下午 08:03
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    /**
     * 根据年级阶段Id和年级Id获取科目信息
     *
     * @param gradePhaseId 年级阶段Id
     * @param gradeId      年级Id
     * @return
     */
    @Override
    public List<SubjectDTO> getByGrade(String gradePhaseId, String gradeId) {
        List<Subject> subjectList = subjectRepository.findByGradePhaseIdAndGradeId(gradePhaseId, gradeId);
        List<SubjectDTO> subjectDTOList = new ArrayList<>();
        for (Subject subject : subjectList) {
            SubjectDTO subjectDTO = new SubjectDTO(subject);
            subjectDTOList.add(subjectDTO);
        }
        return subjectDTOList;
    }
}
