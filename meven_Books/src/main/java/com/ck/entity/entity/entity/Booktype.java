package com.ck.entity.entity.entity;

import java.util.List;

public class Booktype {
    private int btid;
    private String btname;
    //一种图书类型对应多种图书
    private List<BookInfo> bookInfoList;

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

    public List<BookInfo> getBookInfoList() {
        return bookInfoList;
    }

    public void setBookInfoList(List<BookInfo> bookInfoList) {
        this.bookInfoList = bookInfoList;
    }

    public Booktype(int btid, String btname, List<BookInfo> bookInfoList) {
        this.btid = btid;
        this.btname = btname;
        this.bookInfoList = bookInfoList;
    }

    public Booktype() {
    }

    @Override
    public String toString() {
        return "Booktype{" +
                "btid=" + btid +
                ", btname='" + btname + '\'' +
                ", bookInfoList=" + bookInfoList +
                '}';
    }
}
