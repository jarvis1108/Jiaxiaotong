package com.dxtwangxiao.questionchecktool.service.impl;

import com.dxtwangxiao.questionchecktool.dao.MainMapper;
import com.dxtwangxiao.questionchecktool.entity.Main;
import com.dxtwangxiao.questionchecktool.service.MainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Devin
 * 2018-07-20 上午 11:21
 */
@Service
public class MainServiceImpl implements MainService {

    @Resource
    private MainMapper mainMapper;

    @Override
    public List<Main> getAllMains() {
        return mainMapper.selectAll();
    }
}
