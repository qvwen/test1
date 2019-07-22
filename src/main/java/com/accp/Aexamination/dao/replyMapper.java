package com.accp.Aexamination.dao;

import com.accp.Aexamination.pojo.reply;

public interface replyMapper {
    int deleteByPrimaryKey(Integer replyId);

    int insert(reply record);

    int insertSelective(reply record);

    reply selectByPrimaryKey(Integer replyId);

    int updateByPrimaryKeySelective(reply record);

    int updateByPrimaryKey(reply record);
}