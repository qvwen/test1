package com.accp.Aexamination.dao;

import java.util.List;

import com.accp.Aexamination.pojo.top;

public interface topMapper {
    int deleteByPrimaryKey(Integer topId);

    int insert(top record);

    int insertSelective(top record);

    List<top> selectByPrimaryKey(Integer topId);

    int updateByPrimaryKeySelective(top record);

    int updateByPrimaryKey(top record);
}