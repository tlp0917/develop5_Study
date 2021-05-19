package com.ck.entity.entity.dao;

import com.ck.entity.entity.entity.City;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ISusheDao {
    @Select("select * from t_city")
    @ResultMap("querycity")
    public List<City> queryall();
}
