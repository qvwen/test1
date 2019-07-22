package com.accp.Aexamination.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.Aexamination.pojo.user;

public interface userMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(@Param("ac")String ac,@Param("pwd")String pwd);

    user selectByPrimaryByid(Integer id);
    
    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}