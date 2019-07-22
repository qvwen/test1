package com.accp.Aexamination.dao;

import java.util.List;

import com.accp.Aexamination.pojo.trample;

public interface trampleMapper {
    int deleteByPrimaryKey(Integer trampleId);

    int insert(trample record);

    int insertSelective(trample record);

    List<trample> selectByPrimaryKey(Integer trampleId);

    int updateByPrimaryKeySelective(trample record);

    int updateByPrimaryKey(trample record);
}