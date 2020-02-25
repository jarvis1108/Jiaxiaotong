package com.dxtwangxiao.questionchecktool.dao;

import com.dxtwangxiao.questionchecktool.entity.Main;

import java.util.List;

public interface MainMapper {
    int deleteByPrimaryKey(String initID);

    int insert(Main record);

    int insertSelective(Main record);

    Main selectByPrimaryKey(String initID);

    int updateByPrimaryKeySelective(Main record);

    int updateByPrimaryKey(Main record);

    List<Main> selectAll();

}