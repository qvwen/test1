package com.accp.Aexamination.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.Aexamination.pojo.invitation;

public interface invitationMapper {
    int deleteByPrimaryKey(Integer invitationId);

    int insert(invitation record);

    int insertSelective(invitation record);

    List<invitation> selectByPrimaryKey(@Param("invitationId")Integer invitationId);

    int updateByPrimaryKeySelective(invitation record);

    int updateByPrimaryKeyWithBLOBs(invitation record);

    int updateByPrimaryKey(invitation record);
}