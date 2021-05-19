package com.ck.dao;

import com.ck.entity.Booktype;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBooktypeDao {

    @Select("select * from booktype2")
    @ResultMap("booktypemapper")
    public List<Booktype> queryall();
}
