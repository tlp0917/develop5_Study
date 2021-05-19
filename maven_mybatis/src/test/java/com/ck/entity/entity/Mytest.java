package com.ck.entity.entity;

import com.ck.entity.entity.dao.ISusheDaoImpl;
import com.ck.entity.entity.entity.City;
import org.junit.Test;

import java.util.List;

public class Mytest {
@Test
    public void test1(){
    ISusheDaoImpl iSusheDao = new ISusheDaoImpl();
    List<City> queryall = iSusheDao.queryall();
    System.out.println(queryall);

}
}
