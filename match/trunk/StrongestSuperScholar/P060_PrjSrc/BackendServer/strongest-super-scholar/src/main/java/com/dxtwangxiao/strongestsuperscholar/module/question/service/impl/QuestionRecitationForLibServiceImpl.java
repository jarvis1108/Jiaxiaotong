package com.dxtwangxiao.strongestsuperscholar.module.question.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.dao.QuestionRecitationForLibRepository;
import com.dxtwangxiao.strongestsuperscholar.module.question.dao.QuestionRecitationForLibVORepository;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal.QuestionRecitationForLib;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionRecitationForLibService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionRecitationForLibVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;

/**
 * Created by 孙伟浩 on 2018/9/6.
 */
@Service
public class QuestionRecitationForLibServiceImpl implements QuestionRecitationForLibService {

    @Autowired
    private QuestionRecitationForLibRepository questionRecitationForLibRepository;
    
    @Autowired
    private QuestionRecitationForLibVORepository questionRecitationForLibVORepository;

    /**
     * 存储上传题目
     *
     * @param questionRecitationForLib 上传的背诵题目
     * @return
     */
    @Override
    public void saveQuestionRecitationForLib(QuestionRecitationForLib questionRecitationForLib){
        questionRecitationForLibRepository.saveAndFlush(questionRecitationForLib);
    }

    /**
     * 删除背诵题目
     *
     * @param questionRecitationForLibId 要删除的背诵题目Id
     * @return
     */
    @Override
    public void deleteQuestionRecitationForLib(String questionRecitationForLibId){
        questionRecitationForLibRepository.deleteById(questionRecitationForLibId);
    }

    /**
     * 更新背诵题目
     *
     * @param  questionRecitationForLib 更新的背诵题目
     * @return
     */
    @Override
    public void updateQuestionRecitationForLib(QuestionRecitationForLib questionRecitationForLib){
        questionRecitationForLibRepository.saveAndFlush(questionRecitationForLib);
    }

    /**
     * 根据Id查找背诵题目
     *
     * @param  questionRecitationForLibId 背诵题目Id
     * @return 存在时返回背诵题目,否则返回null
     */
    @Override
    public QuestionRecitationForLib findQuestionRecitationForLibById(String questionRecitationForLibId){
        return questionRecitationForLibRepository.findById(questionRecitationForLibId).orElse(null);
    }

    /**
     *
     *
     * @param  reqParam 搜索参数
     * @return 背诵题表现层实体列表
     */
    @Override
    public Page<QuestionRecitationForLibVO> search(Pageable pageable, JSONObject reqParam){


        Specification<QuestionRecitationForLibVO> specification = new Specification<QuestionRecitationForLibVO>() {
                    @Override
                    public Predicate toPredicate(Root<QuestionRecitationForLibVO> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                        List<Predicate> predicates = new ArrayList<Predicate>();

                        if (reqParam == null){
                            return null;
                        }

                        //私有题库限定
                        if (reqParam.get("questionLibId") != null  && !reqParam.getString("questionLibId").trim().isEmpty()){
                            predicates.add(criteriaBuilder.equal(root.get("questionLibID").as(String.class),reqParam.getString("questionLibId")));
                        }

                        //知识点限定
                        if (reqParam.get("knowledgeId") != null && !reqParam.getString("knowledgeId").trim().isEmpty()) {
                            predicates.add(criteriaBuilder.equal(root.get("knowledgeID").as(String.class), reqParam.getString("knowledgeId")));
                        }

                        //学科限定
                        if (reqParam.get("subjectId") != null && !reqParam.getString("subjectId").trim().isEmpty()) {
                            predicates.add(criteriaBuilder.equal(root.get("subjectID").as(String.class), reqParam.getString("subjectId")));
                        }

                        //年级限定
                        if (reqParam.get("gradeId") != null && !reqParam.getString("gradeId").trim().isEmpty()) {
                            predicates.add(criteriaBuilder.equal(root.get("gradeID").as(String.class), reqParam.getString("gradeId")));
                        }

                        //课程限定
                        if (reqParam.get("courseId") != null && !reqParam.getString("courseId").trim().isEmpty()) {
                            predicates.add(criteriaBuilder.equal(root.get("courseID").as(String.class), reqParam.getString("courseId")));
                        }
                        //问题级别限定
                        if (reqParam.get("minQuestionLevel") != null
                                && ( reqParam.getString("maxQuestionLevel").trim().isEmpty() || reqParam.get("maxQuestionLevel") == null)  && !reqParam.getString("minQuestionLevel").trim().isEmpty()) {
                            predicates.add(criteriaBuilder.greaterThan(root.get("questionLevel").as(Integer.class), reqParam.getInteger("minQuestionLevel")));
                        }
                        if (reqParam.get("maxQuestionLevel") != null
                                && ( reqParam.getString("minQuestionLevel").trim().isEmpty() || reqParam.get("minQuestionLevel") == null)  && !reqParam.getString("maxQuestionLevel").trim().isEmpty()) {
                            predicates.add(criteriaBuilder.lessThan(root.get("questionLevel").as(Integer.class), reqParam.getInteger("maxQuestionLevel")));
                        }
                        if (reqParam.get("minQuestionLevel") != null && reqParam.get("maxQuestionLevel") == null
                                && !reqParam.getString("minQuestionLevel").trim().isEmpty() && !reqParam.getString("maxQuestionLevel").trim().isEmpty()) {
                            predicates.add(criteriaBuilder.between(root.get("questionLevel").as(Integer.class), reqParam.getInteger("minQuestionLevel"), reqParam.getInteger("maxQuestionLevel")));
                        }
                        //难度系数限定
                        if (reqParam.get("minDifficulty") != null && !reqParam.getString("minDifficulty").trim().isEmpty()
                                && (reqParam.get("maxDifficulty") == null || reqParam.getString("maxDifficulty").trim().isEmpty())) {
                            predicates.add(criteriaBuilder.greaterThan(root.get("difficulty").as(Double.class), reqParam.getDouble("minDifficulty")));
                        }
                        if (reqParam.get("maxDifficulty") != null && !reqParam.getString("maxDifficulty").trim().isEmpty()
                                && (reqParam.get("minDifficulty") == null || reqParam.getString("minDifficulty").trim().isEmpty())) {
                            predicates.add(criteriaBuilder.lessThan(root.get("difficulty").as(Double.class), reqParam.getDouble("maxDifficulty")));
                        }
                        if (reqParam.get("minDifficulty") != null && reqParam.get("maxDifficulty") != null
                                && !reqParam.getString("minDifficulty").trim().isEmpty() && !reqParam.getString("maxDifficulty").trim().isEmpty()) {
                            predicates.add(criteriaBuilder.between(root.get("difficulty").as(Double.class), reqParam.getDouble("minDifficulty"), reqParam.getDouble("maxDifficulty")));
                        }


                        //是否节选
                        if (reqParam.get("isPartial") != null && !reqParam.getString("isPartial").trim().isEmpty()) {
                            predicates.add(criteriaBuilder.equal(root.get("isPartial").as(Byte.class), reqParam.getByte("isPartial")));
                        }

                        if (predicates.size() == 0){
                            return null;
                        }

                        Predicate[] p = new Predicate[predicates.size()];
                        return criteriaBuilder.and(predicates.toArray(p));
                    }
                };

        //随机获取一定数目
        /*if (reqParam != null && reqParam.get("count") != null){
            Map<Integer,String> map = new HashMap<Integer, String>();
            List<QuestionRecitationForLibVO> randomRecords = new ArrayList<>();
            int count = reqParam.getInteger("count");

            //返回全部数据
            if (count >= questionRecitationForLibVOList.size()){
                return questionRecitationForLibVOList;
            }

            //返回随机数目数据
            while (map.size() < count){
                int randInt = (int) (Math.random() * questionRecitationForLibVOList.size());
                if (! map.containsKey(randInt)){
                    map.put(randInt,"");
                    randomRecords.add(questionRecitationForLibVOList.get(randInt));
                }
            }
            return randomRecords;

        }*/

        return questionRecitationForLibVORepository.findAll(specification,pageable);
    }


    /**
     * 根据Id查询
     *
     * @param   recitationQuestionForLibId  id
     * @return  背诵题表现层实体
     */
    @Override
    public QuestionRecitationForLibVO findRecitationForLibById(String recitationQuestionForLibId){
        return questionRecitationForLibVORepository.findById(recitationQuestionForLibId).orElse(null);
    }
}
