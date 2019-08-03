package com.itheima.domain;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class UserInfo implements Serializable {
    private User user;
    private Integer uid;

    public UserInfo() { }

    @Override
    public String toString() {
        return "UserInfo{" +
                "user=" + user +
                ", uid=" + uid +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserInfo(User user, Integer uid) {
        this.user = user;
        this.uid = uid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
