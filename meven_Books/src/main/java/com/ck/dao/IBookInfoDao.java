package com.ck.dao;

import com.ck.entity.BookInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IBookInfoDao {
    //查询
    //@Select("select * from bookinfo2")
    public List<BookInfo> queryBookInfo(Map map);
    //添加图书
    @Insert("insert into bookinfo2 values(null,#{bname},#{price},#{btid},#{dtime},#{imgurl},#{state})")
    public void addBook(HashMap map);
    //删除
     public void DeleteBookInfo(int[] bid);


     //修改状态
    @Update("update from bookinfo2 where state=#{state}")
    public void UpdateState(int state);

}
