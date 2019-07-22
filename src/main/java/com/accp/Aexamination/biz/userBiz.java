package com.accp.Aexamination.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.Aexamination.dao.userMapper;
import com.accp.Aexamination.pojo.user;

@Service
public class userBiz {
   @Resource
   private userMapper userdao;
   
   public user getUser(String ac,String pwd) {
	    return userdao.selectByPrimaryKey(ac,pwd);
   }
}
