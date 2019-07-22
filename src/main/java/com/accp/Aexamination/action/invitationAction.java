package com.accp.Aexamination.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.Aexamination.biz.invitationBiz;
import com.accp.Aexamination.pojo.invitation;
import com.accp.Aexamination.pojo.top;
import com.accp.Aexamination.pojo.trample;
import com.accp.Aexamination.pojo.user;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/inv")
public class invitationAction {
	@Resource
	private invitationBiz inbiz;

	@GetMapping("getin/{pa}/{size}")
	public PageInfo findInd(@PathVariable Integer pa, @PathVariable Integer size) {
		return inbiz.findInvit(pa,size);
	}
	@GetMapping("getinss/{id}")
	public invitation getInd(@PathVariable Integer id) {
		return inbiz.getinvitation(id);
	}
	
	@PostMapping("add")
	public Map<String, Object> addinvittion(@RequestBody invitation inss,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		user us = (user) session.getAttribute("user");
		inss.setUserId(us.getUserId());
		Integer i = inbiz.add(inss);
		if (i != 0) {
			map.put("code", 200);
			map.put("mag", "新增成功!");
		} else {
			map.put("code", 500);
			map.put("mag", "新增失败!");
		}
		return map;
	}
	@GetMapping("addtop/{id}")
	public Map<String, Object> addTop(@PathVariable Integer id, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		user us = (user) session.getAttribute("user");
		if(us!=null) {
			top to = new top();
			to.setId(id);
			to.setUserId(us.getUserId());
			Integer i = inbiz.addtop(to);
			if (i != 0) {
				map.put("code", 200);
				map.put("mag", "新成功!");
			} else {
				map.put("code", 500);
				map.put("mag", "新增失败!");
				map.put("mag", "新增失败1!");
			}
		}else {
					map.put("code", 400);
					map.put("mag", "请登陆!");
		}
		return map;
	}
	@GetMapping("addTramp/{id}")
	public Map<String, Object> addTramp(@PathVariable Integer id, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		user us = (user) session.getAttribute("user");
		if(us!=null) {
			trample to = new trample();
			to.setId(id);
			to.setUserId(us.getUserId());
			Integer i = inbiz.addTramp(to);
			if (i != 0) {
				map.put("code", 200);
				map.put("mag", "新增成功!");
			} else {
				map.put("code", 500);
				map.put("mag", "新增失败!");
			}
		}else {
					map.put("code", 400);
					map.put("mag", "请登陆!");
		}
		return map;
	}
	
}
