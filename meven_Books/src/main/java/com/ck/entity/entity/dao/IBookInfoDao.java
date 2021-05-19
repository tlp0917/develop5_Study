package com.ck.entity.entity.dao;

import com.ck.entity.entity.entity.BookInfo;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

public interface IBookInfoDao {
    //查询
    //@Select("select * from bookinfo2")
    public List<BookInfo> queryBookInfo(Map map);
    //添加图书
    @Insert("insert into bookinfo2 values(null,#{bname},#{price},#{booktype.btid},#{dtime}.#{imgurl},#{state})")
    public void addBook(BookInfo bookInfo);
}
