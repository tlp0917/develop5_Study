package com.ck.entity.entity.dao;

import com.ck.entity.entity.entity.Role;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IRoleDao {
    @Select("select * from t_role")
   @ResultMap("selectrole")
    public List<Role> queryrole();
}
