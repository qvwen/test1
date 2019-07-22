package com.accp.Aexamination.pojo;

import java.io.Serializable;

public class user implements Serializable {
    private Integer userId;

    private String userName;

    private String userAc;

    private String userPwd;

 

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAc() {
        return userAc;
    }

    public void setUserAc(String userAc) {
        this.userAc = userAc == null ? null : userAc.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }
}