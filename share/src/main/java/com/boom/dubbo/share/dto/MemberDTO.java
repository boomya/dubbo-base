package com.boom.dubbo.share.dto;

import java.io.Serializable;

/**
 * Created by jiangshan on 16/6/15.
 */
public class MemberDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
