package com.accp.Aexamination.pojo;

import java.io.Serializable;
import java.util.Date;

public class follow_up implements Serializable {
    private Integer followUpId;

    private Integer userId;

    private String followUpData;

    private Date followUpDate;

    private Integer invitationId;

    private static final long serialVersionUID = 1L;

    public Integer getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(Integer followUpId) {
        this.followUpId = followUpId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFollowUpData() {
        return followUpData;
    }

    public void setFollowUpData(String followUpData) {
        this.followUpData = followUpData == null ? null : followUpData.trim();
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    public Integer getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(Integer invitationId) {
        this.invitationId = invitationId;
    }
}