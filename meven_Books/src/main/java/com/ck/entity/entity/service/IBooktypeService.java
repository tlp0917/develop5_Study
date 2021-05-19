package com.ck.entity.entity.service;

import com.ck.entity.entity.entity.Booktype;

import java.util.List;

public interface IBooktypeService {
    public List<Booktype> queryBooktype();

    public Booktype queryBooktypeByid(int btid);



}
