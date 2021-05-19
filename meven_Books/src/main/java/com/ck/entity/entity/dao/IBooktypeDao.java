package com.ck.entity.entity.dao;

import com.ck.entity.entity.entity.Booktype;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBooktypeDao {
    //查询图书类型
    @Select("select * from booktype2")
    public List<Booktype> queryBooktype();

    @Select("select * from booktype2 where btid=#{0}")
    public Booktype queryBooktypeByid(int btid);






}
