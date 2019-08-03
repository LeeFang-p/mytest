package com.itheima.domain;

import java.util.List;

public class TabInfo {
    private Integer cid;
    private Info info;

    @Override
    public String toString() {
        return "TabInfo{" +
                "cid=" + cid +
                ", info=" + info +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public TabInfo() {
    }

    public TabInfo(Integer cid, Info info) {
        this.cid = cid;
        this.info = info;
    }
}
