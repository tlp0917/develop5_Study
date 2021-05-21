package com.ck.service.impl;

import com.ck.dao.IBookInfoDao;
import com.ck.entity.BookInfo;
import com.ck.service.IBookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IBookInfoImpl implements IBookInfoService {
    @Autowired
    private IBookInfoDao bookInfoDao;
    //查询图书
    @Override
    public List<BookInfo> querybookInfo(Map map){

        return bookInfoDao.queryBookInfo(map);
    }

    @Override
    @Transactional
    public void addBook(HashMap map) {
        bookInfoDao.addBook(map);
    }

    @Override
    @Transactional
    public void DeleteBookInfo(int[] bid) {
        bookInfoDao.DeleteBookInfo(bid);
    }


}
