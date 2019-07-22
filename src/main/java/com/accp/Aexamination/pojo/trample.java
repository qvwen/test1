package com.accp.Aexamination.pojo;

import java.io.Serializable;

public class trample implements Serializable {
    private Integer trampleId;

    private Integer userId;

    private Integer id;

    private static final long serialVersionUID = 1L;

    public Integer getTrampleId() {
        return trampleId;
    }

    public void setTrampleId(Integer trampleId) {
        this.trampleId = trampleId;
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