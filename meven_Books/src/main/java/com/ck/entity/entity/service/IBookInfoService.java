package com.ck.entity.entity.service;

import com.ck.entity.entity.entity.BookInfo;

import java.util.List;
import java.util.Map;

public interface IBookInfoService {
    public List<BookInfo> querybookInfo(Map map);
    public void addBook(BookInfo bookInfo);

}
