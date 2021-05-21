package com.ck.service;

import com.ck.entity.BookInfo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public interface IBookInfoService {
    public List<BookInfo> querybookInfo(Map map);
    public void addBook(HashMap map);

    public void DeleteBookInfo(int[] bid);

}
