package com.accp.Aexamination.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class invitation implements Serializable {
    private Integer invitationId;

    private String invitationText;

    private Integer userId;

    private Date invitationDate;

    private String invitationImg;

    private List<top>  topList; //顶表
    
    private List<trample> trampleList;  //踩表
    
    private  String headline;   //标题
    
    private user us;//用户对象

    
    public user getUs() {
		return us;
	}

	public void setUs(user us) {
		this.us = us;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public List<top> getTopList() {
		return topList;
	}

	public void setTopList(List<top> topList) {
		this.topList = topList;
	}

	public List<trample> getTrampleList() {
		return trampleList;
	}

	public void setTrampleList(List<trample> trampleList) {
		this.trampleList = trampleList;
	}

	public Integer getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(Integer invitationId) {
        this.invitationId = invitationId;
    }

    public String getInvitationText() {
        return invitationText;
    }

    public void setInvitationText(String invitationText) {
        this.invitationText = invitationText == null ? null : invitationText.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getInvitationDate() {
        return invitationDate;
    }

    public void setInvitationDate(Date invitationDate) {
        this.invitationDate = invitationDate;
    }

    public String getInvitationImg() {
        return invitationImg;
    }

    public void setInvitationImg(String invitationImg) {
        this.invitationImg = invitationImg == null ? null : invitationImg.trim();
    }
}