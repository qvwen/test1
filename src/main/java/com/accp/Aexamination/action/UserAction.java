package com.accp.Aexamination.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.Aexamination.biz.userBiz;
import com.accp.Aexamination.pojo.user;

@RestController
@RequestMapping("/API")
public class UserAction {
	@Resource
	private userBiz biz;
   @PostMapping("getUser/{ac}/{pwd}")
   public Map<String, Object>  getUser(@PathVariable String ac,@PathVariable String pwd,HttpSession session){
	   Map<String,Object> map = new HashMap<String, Object>();
	   user use = biz.getUser(ac,pwd);
	   if(use!=null) {
		   session.setAttribute("user",use);
		   map.put("code",200);
		   map.put("mag","µ«¬Ω≥…π¶!");
	   }else {
		   map.put("code",500);
		   map.put("mag","’À∫≈ªÚ√‹¬Î¥ÌŒÛ");
	   }
	   return map;
   }
}
