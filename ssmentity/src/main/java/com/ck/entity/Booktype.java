package com.ck.entity;

public class Booktype {
    private int btid;
    private String btname;

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }

    public Booktype(int btid, String btname) {
        this.btid = btid;
        this.btname = btname;
    }

    public Booktype() {
    }

    @Override
    public String toString() {
        return "Booktype{" +
                "btid=" + btid +
                ", btname='" + btname + '\'' +
                '}';
    }
}
