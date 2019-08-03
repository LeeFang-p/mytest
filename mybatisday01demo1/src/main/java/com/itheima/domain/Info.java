package com.itheima.domain;

public class Info {
    private Integer cid;
    private String cname;

    @Override
    public String toString() {
        return "Info{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Info() {
    }

    public Info(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
}
