package com.ck.entity;

import java.util.Date;

public class BookInfo {
    private int bid;
    private String bname ;
    private int price ;
    private int btid ;
    private Date dtime;
    private String imgurl;
    private int state;
    //多种图书对应一种图书类型
    private Booktype booktype;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Booktype getBooktype() {
        return booktype;
    }

    public void setBooktype(Booktype booktype) {
        this.booktype = booktype;
    }

    public BookInfo(int bid, String bname, int price, int btid, Date dtime, String imgurl, int state, Booktype booktype) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.btid = btid;
        this.dtime = dtime;
        this.imgurl = imgurl;
        this.state = state;
        this.booktype = booktype;
    }

    public BookInfo() {
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", btid=" + btid +
                ", dtime=" + dtime +
                ", imgurl='" + imgurl + '\'' +
                ", state=" + state +
                ", booktype=" + booktype +
                '}';
    }
}

