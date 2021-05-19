package com.ck.entity.entity.service.impl;

import com.ck.entity.entity.entity.BookInfo;
import com.ck.entity.entity.dao.IBookInfoDao;
import com.ck.entity.entity.service.IBookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void addBook(BookInfo bookInfo) {
        bookInfoDao.equals(bookInfoDao);
    }
}
