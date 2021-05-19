package com.ck.entity.entity.dao;

import com.ck.entity.entity.entity.City;
import com.ck.entity.entity.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ISusheDaoImpl implements ISusheDao {
    @Override
    public List<City> queryall() {
        SqlSession session = MybatisUtil.openSession(false);
        ISusheDao susheDao = session.getMapper(ISusheDao.class);
        List<City> queryall = susheDao.queryall();
        return queryall;
    }
}
