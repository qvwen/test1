package com.accp.Aexamination.dao;

import com.accp.Aexamination.pojo.follow_up;

public interface follow_upMapper {
    int deleteByPrimaryKey(Integer followUpId);

    int insert(follow_up record);

    int insertSelective(follow_up record);

    follow_up selectByPrimaryKey(Integer followUpId);

    int updateByPrimaryKeySelective(follow_up record);

    int updateByPrimaryKey(follow_up record);
}