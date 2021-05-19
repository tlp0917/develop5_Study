package com.ck.entity.entity.entity;

public class Role {
    private int r_id;
    private String r_name;
    private String r_backer;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_backer() {
        return r_backer;
    }

    public void setR_backer(String r_backer) {
        this.r_backer = r_backer;
    }

    public Role(int r_id, String r_name, String r_backer) {
        this.r_id = r_id;
        this.r_name = r_name;
        this.r_backer = r_backer;
    }

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{" +
                "r_id=" + r_id +
                ", r_name='" + r_name + '\'' +
                ", r_backer='" + r_backer + '\'' +
                '}';
    }
}
