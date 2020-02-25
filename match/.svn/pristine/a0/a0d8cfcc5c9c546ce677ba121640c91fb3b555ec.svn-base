package com.dxtwangxiao.strongestsuperscholar.module.question.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.question.dao.ErrorMultipleQuestionRepository;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.ErrorMultipleQuestion;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.ErrorMultipleQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 错题服务接口实现
 * Created by Xiaohe on 2018/9/9.
 */
@Service
@Transactional
public class ErrorMultipleMultipleQuestionServiceImpl implements ErrorMultipleQuestionService {

    @Autowired
    private ErrorMultipleQuestionRepository errorMultipleQuestionRepository;

    /**
     * 根据用户Id获取其错题列表
     *
     * @param userId 用户Id
     * @return 错题列表
     */
    public List<ErrorMultipleQuestion> getByUserId(String userId) {
        List<ErrorMultipleQuestion> errorMultipleQuestionList = errorMultipleQuestionRepository.findByUserIdOrderByCreateTimeDesc(userId);

        errorMultipleQuestionList = errorMultipleQuestionList.stream()
                .filter(distinctByKey(ErrorMultipleQuestion::getQuestionId))
                .collect(Collectors.toList());
        return errorMultipleQuestionList;
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
