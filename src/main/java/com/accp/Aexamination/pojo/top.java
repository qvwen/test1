package com.accp.Aexamination.pojo;

import java.io.Serializable;

public class top implements Serializable {
    private Integer topId;

    private Integer userId;

    private Integer id;

    private static final long serialVersionUID = 1L;

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}