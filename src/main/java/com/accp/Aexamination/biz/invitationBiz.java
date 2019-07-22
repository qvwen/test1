package com.accp.Aexamination.biz;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.Aexamination.dao.invitationMapper;
import com.accp.Aexamination.dao.topMapper;
import com.accp.Aexamination.dao.trampleMapper;
import com.accp.Aexamination.dao.userMapper;
import com.accp.Aexamination.pojo.invitation;
import com.accp.Aexamination.pojo.top;
import com.accp.Aexamination.pojo.trample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class invitationBiz {
	@Resource
	private invitationMapper indao;
	@Resource
	private topMapper topdao;
	@Resource
	private trampleMapper trdao;
	@Resource
	private userMapper userdao;
	public PageInfo findInvit(Integer page, Integer size) {
		PageHelper.startPage(page, size);
		List<invitation> Lis = indao.selectByPrimaryKey(null);
		for (int i = 0; i < Lis.size(); i++) {
			Lis.get(i).setTopList(topdao.selectByPrimaryKey(Lis.get(i).getInvitationId()));
			Lis.get(i).setTrampleList(trdao.selectByPrimaryKey(Lis.get(i).getInvitationId()));
			Lis.get(i).setUs(userdao.selectByPrimaryByid(Lis.get(i).getUserId()));
		}
		return new PageInfo<invitation>(Lis);
	}

	public invitation  getinvitation(Integer id) {
		invitation in =  indao.selectByPrimaryKey(id).get(0);
		in.setUs(userdao.selectByPrimaryByid(in.getUserId()));
		in.setTopList(topdao.selectByPrimaryKey(in.getInvitationId()));
		in.setTrampleList(trdao.selectByPrimaryKey(in.getInvitationId()));
		return in;
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public Integer add(invitation inss) {
		return indao.insertSelective(inss);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public Integer addtop(top to) {
		return topdao.insertSelective(to);
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public Integer addTramp(trample to) {
		return  trdao.insertSelective(to);
	}
}
