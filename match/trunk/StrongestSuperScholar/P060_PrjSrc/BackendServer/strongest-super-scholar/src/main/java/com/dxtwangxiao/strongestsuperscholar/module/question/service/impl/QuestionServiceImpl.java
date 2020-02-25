package com.dxtwangxiao.strongestsuperscholar.module.question.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.base.dao.CourseInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.dao.GradeInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.CourseInfo;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.GradeInfo;
import com.dxtwangxiao.strongestsuperscholar.module.question.dao.*;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.Question;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionCollection;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionMultipleChoice;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionRecitation;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceVO;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.MultipleQuestionCollection;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionRecitationVO;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionVO;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.MathUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.UpdateUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/**
 * 试题服务实现
 * <p>
 * Created By Devin
 * 2018-09-04 上午 10:58
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private MultipleQuestionCollectionRepository multipleQuestionCollectionRepository;

    @Autowired
    private QuestionCollectionRepository questionCollectionRepository;

    @Autowired
    private QuestionMultipleChoiceVORepository questionMultipleChoiceVORepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuestionMultipleChoiceRepository questionMultipleChoiceRepository;

    @Autowired
    private QuestionRecitationRepository questionRecitationRepository;

    @Autowired
    private QuestionRecitationVORepository questionRecitationVORepository;

    @Autowired
    private QuestionMultipleChoiceForLibVORepository questionMultipleChoiceForLibVORepository;

    @Autowired
    private QuestionVORepository questionVORepository;

    @Autowired
    private GradeInfoRepository gradeInfoRepository;

    @Autowired
    private CourseInfoRepository  courseInfoRepository;

    /**
     * 根据用户Id获取其所收藏的选择题
     *
     * @param userId 用户Id
     * @return 题目列表
     */
    @Override
    public List<MultipleQuestionCollection> getCollectionsByUserId(String userId) {
        return multipleQuestionCollectionRepository.findByUserId(userId);
    }

    /**
     * 用户收藏题目
     *
     * @param userId     用户Id
     * @param questionId 试题Id
     * @return
     */
    @Override
    public MultipleQuestionCollection collectQuestion(String userId, String questionId) {
        MultipleQuestionCollection multipleQuestionCollection = multipleQuestionCollectionRepository.findByUserIdAndQuestionId(userId, questionId);
        if (multipleQuestionCollection == null) {
            QuestionCollection questionCollection = new QuestionCollection();
            questionCollection.setQuestionCollectionId(UUIDUtil.getUUID());
            questionCollection.setQuestionCollectionNo(questionCollection.getQuestionCollectionId());
            questionCollection.setUserId(userId);
            questionCollection.setQuestionId(questionId);
            questionCollection.setCreateTime(new Date());
            questionCollection.setIsValid(Byte.valueOf("1"));

            QuestionCollection result = questionCollectionRepository.save(questionCollection);
            if (result != null) {
                return multipleQuestionCollectionRepository.findByQuestionCollectionId(result.getQuestionCollectionId());
            } else {
                return null;
            }
        } else {
            return multipleQuestionCollection;
        }
    }

    /**
     * 用户取消收藏题目
     *
     * @param questionCollectionId 收藏题目Id
     * @return
     */
    @Override
    public Boolean cancelCollection(String questionCollectionId) {
        QuestionCollection questionCollection = questionCollectionRepository.findByQuestionCollectionId(questionCollectionId);
        questionCollection.setIsValid(Byte.valueOf("0"));
        QuestionCollection result = questionCollectionRepository.save(questionCollection);
        return result != null;
    }

    /**
     * 随机获取5道选择题，用户匹配对战等。
     *
     * @return 题目列表
     */
    @Override
    public List<QuestionMultipleChoiceVO> getRandomQuestions() {
        List<QuestionMultipleChoiceVO> result = new ArrayList<>();
        long rows = questionMultipleChoiceVORepository.count();
        if (rows < 5){
            return null;
        }
        List<Integer> randomNumbers = MathUtil.randomNumbers(rows, 5);
        System.out.println(randomNumbers);
        for (Integer number : randomNumbers) {
            Pageable pageable = PageRequest.of(number, 1);
            Page<QuestionMultipleChoiceVO> multipleQuestionPage = questionMultipleChoiceVORepository.findAll(pageable);
            List<QuestionMultipleChoiceVO> pageContent = multipleQuestionPage.getContent();
            System.out.println(pageContent);
            result.addAll(pageContent);
        }
        return result;
    }

    /**
     * 根据科目Id获取10道题目，用于知识练兵场
     *
     * @param subjectId 战局Id
     * @return
     */
    @Override
    public List<QuestionMultipleChoiceVO> getQuestionsBySubjectId(String subjectId) {
        List<QuestionMultipleChoiceVO> result = new ArrayList<>();
        //long rows = questionMultipleChoiceVORepository.countAllBySubjectId(subjectId);
        long rows = questionMultipleChoiceVORepository.count();
        if (rows<10){
            return null;
        }

        List<Integer> randomNumbers = MathUtil.randomNumbers(rows, 10);
        for (Integer number : randomNumbers) {
            Pageable pageable = PageRequest.of(number, 1);
            //Page<QuestionMultipleChoiceVO> multipleQuestionPage = questionMultipleChoiceVORepository.findBySubjectId(subjectId, pageable);
            Page<QuestionMultipleChoiceVO> multipleQuestionPage = questionMultipleChoiceVORepository.findAll(pageable);
            List<QuestionMultipleChoiceVO> pageContent = multipleQuestionPage.getContent();
            result.addAll(pageContent);
        }
        return result;
    }


    /**
     * 存储选择题
     *
     * @param  userId 用户Id
     * @param  reqParam 请求参数
     * @return
     */
    @Override
    public QuestionMultipleChoiceVO saveQuestionMultipleChoice(String userId, JSONObject reqParam) {

        String questionId = UUIDUtil.getUUID();
        String knowledgeId = reqParam.getString("knowledgeId");
        String gradeShortName = reqParam.getString("gradeShortName");
        String courseShortName = reqParam.getString("courseShortName");
        String questionContent = reqParam.getString("question");
        String provider = reqParam.getString("provider");
        String personInCharge = reqParam.getString("personInCharge");
        String reference = reqParam.getString("reference");
        Integer questionLevel = reqParam.getInteger("questionLevel");
        Double difficulty = reqParam.getDouble("difficulty");
        Double coinWeight = reqParam.getDouble("coinWeight");
        Double gpWeight = reqParam.getDouble("gpWeight");
        String questionAnalyze = reqParam.getString("questionAnalyze");
        Integer recommendTime = reqParam.getInteger("recommendTime");
        Timestamp createTime = new Timestamp(System.currentTimeMillis());
        Timestamp lastUpdTime = new Timestamp(System.currentTimeMillis());
        Byte isValid = reqParam.getByte("isValid");
        String remark = reqParam.getString("remark");
        String choiceA = reqParam.getString("choiceA");
        String choiceB = reqParam.getString("choiceB");
        String choiceC = reqParam.getString("choiceC");
        String choiceD = reqParam.getString("choiceD");
        String answer = reqParam.getString("answer");
        String questionTypeName = reqParam.getString("questionTypeName");
        String questionTypeId = "单选题".equals(questionTypeName) ? "3" : "2";

        String gradeId = null;
        if (gradeShortName != null){
            GradeInfo gradeInfo = gradeInfoRepository.findByGradeShortName(gradeShortName);
            if (gradeInfo != null){
                gradeId = gradeInfo.getGradeId();
            }
        }


        String courseId = null;
        if (courseShortName != null){
            CourseInfo courseInfo = courseInfoRepository.findByCourseShortName(courseShortName);
            if (courseInfo != null){
                courseId = courseInfo.getCourseId();
            }
        }

            // 1.存储Question
            Question question = new Question(questionId, questionId, questionId, questionTypeId, knowledgeId, gradeId,
                    courseId, questionContent, provider, personInCharge, reference, questionLevel,
                    difficulty, coinWeight, gpWeight, questionAnalyze, recommendTime,createTime,
                    userId, lastUpdTime, userId, isValid, remark);
           questionRepository.saveAndFlush(question);

            // 2.存储QuestionMultipleChoice
            QuestionMultipleChoice questionMultipleChoice = new QuestionMultipleChoice(questionId, questionId, choiceA,
                    choiceB, choiceC, choiceD, answer, createTime, userId, lastUpdTime, userId,remark, isValid);
            questionMultipleChoiceRepository.saveAndFlush(questionMultipleChoice);


        return findQuestionMultipleChoiceVOById(questionId);
    }

    /**
     * 删除选择题
     *
     * @param questionMultipleChoiceId 选择题Id
     * @return
     */
    @Override
    public void deleteQuestionMultipleChoice(String questionMultipleChoiceId) {
        questionRepository.deleteById(questionMultipleChoiceId);
        questionMultipleChoiceRepository.deleteById(questionMultipleChoiceId);
    }

    /**
     * 更新选择题
     *
     * @param  userId 用户Id
     * @param  reqParam 请求参数
     * @return
     */
    @Override
    public QuestionMultipleChoiceVO updateQuestionMultipleChoice(String questionId, String userId, JSONObject reqParam) {
        // 1.获取请求信息
        String knowledgeId = reqParam.getString("knowledgeId");
        String gradeShortName = reqParam.getString("gradeShortName");
        String courseShortName = reqParam.getString("courseShortName");
        String questionContent = reqParam.getString("question");
        String provider = reqParam.getString("provider");
        String personInCharge = reqParam.getString("personInCharge");
        String reference = reqParam.getString("reference");
        Integer questionLevel = reqParam.getInteger("questionLevel");
        Double difficulty = reqParam.getDouble("difficulty");
        Double coinWeight = reqParam.getDouble("coinWeight");
        Double gpWeight = reqParam.getDouble("gpWeight");
        String questionAnalyze = reqParam.getString("questionAnalyze");
        Integer recommendTime = reqParam.getInteger("recommendTime");
        Timestamp lastUpdTime = new Timestamp(System.currentTimeMillis());
        Byte isValid = reqParam.getByte("isValid");
        String remark = reqParam.getString("remark");
        String choiceA = reqParam.getString("choiceA");
        String choiceB = reqParam.getString("choiceB");
        String choiceC = reqParam.getString("choiceC");
        String choiceD = reqParam.getString("choiceD");
        String answer = reqParam.getString("answer");
        String questionTypeName = reqParam.getString("questionTypeName");
        String questionTypeId = "单选题".equals(questionTypeName) ? "3" : "2";

        String gradeId = null;
        if (gradeShortName != null){
            GradeInfo gradeInfo = gradeInfoRepository.findByGradeShortName(gradeShortName);
            if (gradeInfo != null){
                gradeId = gradeInfo.getGradeId();
            }
        }


        String courseId = null;
        if (courseShortName != null){
            CourseInfo courseInfo = courseInfoRepository.findByCourseShortName(courseShortName);
            if (courseInfo != null){
                courseId = courseInfo.getCourseId();
            }
        }
            Question newQuestion = new Question(questionId, questionId, questionId, questionTypeId, knowledgeId, gradeId,
                    courseId, questionContent, provider, personInCharge, reference, questionLevel,
                    difficulty, coinWeight, gpWeight, questionAnalyze, recommendTime,null,
                    null, lastUpdTime, userId, isValid, remark);

            Question question = questionRepository.findById(questionId).orElse(null);
            // 2.Question不存在
            if (question == null){
                return null;
            }

            // 3.填充空属性
            UpdateUtil.copyProperties(newQuestion, question);

            // 4.更新试题
           questionRepository.saveAndFlush(question);

            // 5.更新QuestionMultipleChoice
            QuestionMultipleChoice newQuestionMultipleChoice = new QuestionMultipleChoice(questionId, questionId, choiceA,
                    choiceB, choiceC, choiceD, answer, null, null, lastUpdTime, userId,remark, isValid);
            QuestionMultipleChoice questionMultipleChoice = questionMultipleChoiceRepository.findById(questionId).orElse(null);
            UpdateUtil.copyProperties(newQuestionMultipleChoice, questionMultipleChoice);
            questionMultipleChoiceRepository.saveAndFlush(questionMultipleChoice);
        return findQuestionMultipleChoiceVOById(questionId);
    }

    /**
     * 存储背诵题
     *
     * @param  userId 用户Id
     * @param  reqParam 请求参数
     * @return
     */
    @Override
    public QuestionRecitationVO saveQuestionRecitation(String userId, JSONObject reqParam) {

        String questionId = UUIDUtil.getUUID();
        String knowledgeId = reqParam.getString("knowledgeId");
        String gradeShortName = reqParam.getString("gradeShortName");
        String courseShortName = reqParam.getString("courseShortName");
        String questionContent = reqParam.getString("question");
        String provider = reqParam.getString("provider");
        String personInCharge = reqParam.getString("personInCharge");
        String reference = reqParam.getString("reference");
        Integer questionLevel = reqParam.getInteger("questionLevel");
        Double difficulty = reqParam.getDouble("difficulty");
        Double coinWeight = reqParam.getDouble("coinWeight");
        Double gpWeight = reqParam.getDouble("gpWeight");
        String questionAnalyze = reqParam.getString("questionAnalyze");
        Integer recommendTime = reqParam.getInteger("recommendTime");
        Timestamp createTime = new Timestamp(System.currentTimeMillis());
        Timestamp lastUpdTime = new Timestamp(System.currentTimeMillis());
        Byte isValid = reqParam.getByte("isValid");
        String remark = reqParam.getString("remark");
        String part = reqParam.getString("part");
        Byte isPartial = reqParam.getByte("isPartial");
        String answer = reqParam.getString("answer");

        String gradeId = null;
        if (gradeShortName != null){
            GradeInfo gradeInfo = gradeInfoRepository.findByGradeShortName(gradeShortName);
            if (gradeInfo != null){
                gradeId = gradeInfo.getGradeId();
            }
        }


        String courseId = null;
        if (courseShortName != null){
            CourseInfo courseInfo = courseInfoRepository.findByCourseShortName(courseShortName);
            if (courseInfo != null){
                courseId = courseInfo.getCourseId();
            }
        }


            // 1.存储Question
            Question question = new Question(questionId, questionId, questionId, "1", knowledgeId, gradeId,
                    courseId, questionContent, provider, personInCharge, reference, questionLevel,
                    difficulty, coinWeight, gpWeight, questionAnalyze, recommendTime,createTime,
                    userId, lastUpdTime, userId, isValid, remark);
            questionRepository.saveAndFlush(question);

            // 2.存储QuestionRecitation
            QuestionRecitation questionRecitation = new QuestionRecitation(questionId, questionId,answer,
                    part, isPartial, createTime, userId, lastUpdTime, userId,remark, isValid);
            questionRecitationRepository.saveAndFlush(questionRecitation);

        return findQuestionRecitationVOById(questionId);
    }

    /**
     * 删除背诵题
     *
     * @param questionRecitationId 背诵题Id
     * @return
     */
    @Override
    public void deleteQuestionRecitation(String questionRecitationId) {
        questionRepository.deleteById(questionRecitationId);
        questionRecitationRepository.deleteById(questionRecitationId);
    }

    /**
     * 更新背诵题
     *
     * @param  userId 用户Id
     * @param  reqParam 请求参数
     * @return
     */
    @Override
    public QuestionRecitationVO updateQuestionRecitation(String questionId, String userId, JSONObject reqParam) {
        // 1.获取请求信息
        String knowledgeId = reqParam.getString("knowledgeId");
        String gradeShortName = reqParam.getString("gradeShortName");
        String courseShortName = reqParam.getString("courseShortName");
        String questionContent = reqParam.getString("question");
        String provider = reqParam.getString("provider");
        String personInCharge = reqParam.getString("personInCharge");
        String reference = reqParam.getString("reference");
        Integer questionLevel = reqParam.getInteger("questionLevel");
        Double difficulty = reqParam.getDouble("difficulty");
        Double coinWeight = reqParam.getDouble("coinWeight");
        Double gpWeight = reqParam.getDouble("gpWeight");
        String questionAnalyze = reqParam.getString("questionAnalyze");
        Integer recommendTime = reqParam.getInteger("recommendTime");
        Timestamp lastUpdTime = new Timestamp(System.currentTimeMillis());
        Byte isValid = reqParam.getByte("isValid");
        String remark = reqParam.getString("remark");
        String part = reqParam.getString("part");
        Byte isPartial = reqParam.getByte("isPartial");
        String answer = reqParam.getString("answer");


        String gradeId = null;
        if (gradeShortName != null){
            GradeInfo gradeInfo = gradeInfoRepository.findByGradeShortName(gradeShortName);
            if (gradeInfo != null){
                gradeId = gradeInfo.getGradeId();
            }
        }


        String courseId = null;
        if (courseShortName != null){
            CourseInfo courseInfo = courseInfoRepository.findByCourseShortName(courseShortName);
            if (courseInfo != null){
                courseId = courseInfo.getCourseId();
            }
        }

            Question newQuestion = new Question(questionId, questionId, questionId, null, knowledgeId, gradeId,
                    courseId, questionContent, provider, personInCharge, reference, questionLevel,
                    difficulty, coinWeight, gpWeight, questionAnalyze, recommendTime,null,
                    null, lastUpdTime, userId, isValid, remark);

            Question question = questionRepository.findById(questionId).orElse(null);
            // 2.Question不存在
            if (question == null){
                return null;
            }

            // 3.填充空属性
            UpdateUtil.copyProperties(newQuestion, question);

            // 4.更新试题
            questionRepository.saveAndFlush(question);

            // 5.更新QuestionRecitation
            QuestionRecitation newQuestionRecitation = new QuestionRecitation(questionId, questionId, answer, part, isPartial, null, null, lastUpdTime, userId,remark, isValid);
            QuestionRecitation questionRecitation = questionRecitationRepository.findById(questionId).orElse(null);
            UpdateUtil.copyProperties(newQuestionRecitation, questionRecitation);
            questionRecitationRepository.saveAndFlush(questionRecitation);
        return findQuestionRecitationVOById(questionId);
    }

    /**
     * 使试题生效
     *
     * @param questionId 试题Id
     * @return
     */
    @Override
    public void validateQuestion(String questionId) {
        Question question = questionRepository.findById(questionId).orElse(null);
        if (question == null) {
            return;
        }
        question.setIsValid(Byte.valueOf("1"));
    }

    /**
     * 使试题失效
     *
     * @param questionId 试题Id
     * @return
     */
    @Override
    public void invalidateQuestion(String questionId) {
        Question question = questionRepository.findById(questionId).orElse(null);
        if (question == null) {
            return;
        }
        question.setIsValid(Byte.valueOf("0"));
    }

    /**
     * 使试题失效
     *
     * @param  questionId 试题Id
     * @return
     */
    @Override
    public Byte changeStatus(String questionId, String userId) {
        Question question = questionRepository.findById(questionId).orElse(null);


        if (question == null){
            return null;
        }
        Byte newStatus = question.getIsValid() == null ? Byte.valueOf("0")
                : Byte.valueOf("0").equals(question.getIsValid()) ? Byte.valueOf("1") : Byte.valueOf("0");
        question.setIsValid(newStatus);

        question.setLastUpdUser(userId);
        question.setLastUpdTime(new Timestamp(System.currentTimeMillis()));
        questionRepository.saveAndFlush(question);

        // 更新背诵题
        if (question.getQuestionTypeId() == "1"){
            QuestionRecitation questionRecitation = questionRecitationRepository.findById(questionId).orElse(null);
            if (questionRecitation != null){
                questionRecitation.setIsValid(newStatus);
                questionRecitation.setLastUpdUser(userId);
                questionRecitation.setLastUpdTime(new Timestamp(System.currentTimeMillis()));
                questionRecitationRepository.saveAndFlush(questionRecitation);
            }
        }
        // 更新选择题
        else if (question.getQuestionTypeId() == "2" || question.getQuestionTypeId() == "3"){
            QuestionMultipleChoice questionMultipleChoice = questionMultipleChoiceRepository.findById(questionId).orElse(null);
            if (questionMultipleChoice != null){
                questionMultipleChoice.setIsValid(newStatus );
                questionMultipleChoice.setLastUpdTime(new Timestamp(System.currentTimeMillis()));
                questionMultipleChoice.setLastUpdUser(userId);
                questionMultipleChoiceRepository.saveAndFlush(questionMultipleChoice);
            }
        }
        return newStatus;
    }

    /**
     * 根据Id寻找选择题表现层对象
     *
     * @param questionId 试题Id
     * @return
     */
    @Override
    public QuestionMultipleChoiceVO findQuestionMultipleChoiceVOById(String questionId) {
        return questionMultipleChoiceVORepository.findById(questionId).orElse(null);
    }

    /**
     * 根据Id寻找背诵题表现层对象
     *
     * @param questionId 试题Id
     * @return
     */
    @Override
    public QuestionRecitationVO findQuestionRecitationVOById(String questionId) {
        return questionRecitationVORepository.findById(questionId).orElse(null);
    }

    /**
     * 获取条件过滤后的分页选择题列表
     *
     * @param pageable 分页信息
     * @param reqParam 过滤条件
     * @return 选择题列表
     */
    @Override
    public Page<QuestionMultipleChoiceVO> listQuestionMultipleChoice(Pageable pageable, JSONObject reqParam) {


        Specification<QuestionMultipleChoiceVO> specification = new Specification<QuestionMultipleChoiceVO>() {
            @Override
            public Predicate toPredicate(Root<QuestionMultipleChoiceVO> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();

                //知识点限定
                if (reqParam.get("knowledgeId") != null && !reqParam.getString("knowledgeId").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("knowledgeId").as(String.class), reqParam.getString("knowledgeId")));
                }

                //学科限定
                if (reqParam.get("subjectId") != null && !reqParam.getString("subjectId").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("subjectId").as(String.class), reqParam.getString("subjectId")));
                }

                //年级限定
                if (reqParam.get("gradeId") != null && !reqParam.getString("gradeId").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("gradeId").as(String.class), reqParam.getString("gradeId")));
                }

                //课程限定
                if (reqParam.get("courseId") != null && !reqParam.getString("courseId").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("courseId").as(String.class), reqParam.getString("courseId")));
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


                if (predicates.size() == 0) {
                    return null;
                }

                Predicate[] tP = new Predicate[predicates.size()];
                return criteriaBuilder.and(predicates.toArray(tP));
            }
        };
        // 分页, 排序
        return questionMultipleChoiceVORepository.findAll(specification, pageable);
    }

    /**
     * 获取条件过滤后的分页背诵题列表
     *
     * @param pageable 分页信息
     * @param reqParam 过滤条件
     * @return 背诵题列表
     */
    @Override
    public Page<QuestionRecitationVO> listQuestionRecitation(Pageable pageable, JSONObject reqParam) {
        Specification<QuestionRecitationVO> specification = new Specification<QuestionRecitationVO>() {
            @Override
            public Predicate toPredicate(Root<QuestionRecitationVO> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();

                //知识点限定
                if (reqParam.get("knowledgeId") != null && !reqParam.getString("knowledgeId").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("knowledgeId").as(String.class), reqParam.getString("knowledgeId")));
                }

                //学科限定
                if (reqParam.get("subjectId") != null && !reqParam.getString("subjectId").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("subjectId").as(String.class), reqParam.getString("subjectId")));
                }

                //年级限定
                if (reqParam.get("gradeId") != null && !reqParam.getString("gradeId").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("gradeId").as(String.class), reqParam.getString("gradeId")));
                }

                //课程限定
                if (reqParam.get("courseId") != null && !reqParam.getString("courseId").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("courseId").as(String.class), reqParam.getString("courseId")));
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


                if (predicates.size() == 0) {
                    return null;
                }

                Predicate[] tP = new Predicate[predicates.size()];
                return criteriaBuilder.and(predicates.toArray(tP));
            }
        };
        // 分页, 排序
        return questionRecitationVORepository.findAll(specification, pageable);
    }

    /**
     * 获取条件过滤后的分页试题列表
     *
     * @param  pageable 分页信息
     * @param  reqParam 过滤参数
     * @return
     */
    @Override
    public Page<QuestionVO> listQuestion(Pageable pageable, JSONObject reqParam) {
        Specification<QuestionVO> specification = new Specification<QuestionVO>() {
            @Override
            public Predicate toPredicate(Root<QuestionVO> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();

                if (reqParam == null){
                    return null;
                }

                //试题类型
                if (reqParam.get("questionTypeName") != null && !reqParam.getString("questionTypeName").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("questionTypeName").as(String.class), reqParam.getString("questionTypeName")));
                }

                //年级限定
                if (reqParam.get("gradeShortName") != null && !reqParam.getString("gradeShortName").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("gradeShortName").as(String.class), reqParam.getString("gradeShortName")));
                }

                //课程限定
                if (reqParam.get("courseShortName") != null && !reqParam.getString("courseShortName").trim().isEmpty()) {
                    predicates.add(criteriaBuilder.equal(root.get("courseShortName").as(String.class), reqParam.getString("courseShortName")));
                }

                //状态限定
                if (reqParam.get("isValid") != null && !reqParam.getString("isValid").trim().isEmpty()){
                    predicates.add(criteriaBuilder.equal(root.get("isValid").as(Byte.class), reqParam.getByte("isValid")));
                }

                //题干模糊搜索
                if (reqParam.get("question") != null && !reqParam.getString("question").trim().isEmpty()){
                    predicates.add(criteriaBuilder.like(root.get("question").as(String.class), "%" + reqParam.getString("question") + "%"));
                }

                if (predicates.size() == 0) {
                    return null;
                }

                Predicate[] tP = new Predicate[predicates.size()];
                return criteriaBuilder.and(predicates.toArray(tP));
            }
        };
        // 分页, 排序
        return questionVORepository.findAll(specification, pageable);
    }

}
