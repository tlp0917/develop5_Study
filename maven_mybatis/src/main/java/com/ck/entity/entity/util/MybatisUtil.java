package com.ck.entity.entity.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Description：
 * mybatis的工具类
 * @Author：wangcz
 * @Date 2021年03月22日 14:08
 */
public class MybatisUtil {
    private static SqlSessionFactory factory;
    // 把创建数据库对象SqlSessionFactory放在静态块中
    // 让数据库对象只创建一个
    static {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 定义方法获取数据库操作对象SqlSession
     * 需要事务transaction传true，否则传false
     */
    public static SqlSession openSession(boolean transaction){
        return factory.openSession(transaction);
    }

}
