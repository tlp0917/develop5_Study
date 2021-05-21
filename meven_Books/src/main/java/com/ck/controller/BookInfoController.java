package com.ck.controller;

import com.ck.entity.BookInfo;
import com.ck.entity.Booktype;
import com.ck.service.IBookInfoService;
import com.ck.service.IBooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class BookInfoController {
    @Autowired
    private IBookInfoService bookInfoService;
    @Autowired
    private IBooktypeService booktypeService;


    @RequestMapping("queryInfo")
    public String queryBookInfo(@RequestParam Map map, ModelMap map1) {
        System.out.println("查询图书！");
        List<BookInfo> infoList = bookInfoService.querybookInfo(map);
        //模糊查询下拉框
        List<Booktype> booktypes = booktypeService.queryBooktype();

        if (map.get("bname") == null) {
            map.put("bname", "");
        }
        if (map.get("booktype") == null) {
            map.put("booktype", "");
        }
        map1.put("infoList", infoList);
        map1.put("condiction", map);
        map1.put("typelist", booktypes);
        return "p_list";
    }

    //文件上传
    @PostMapping("addBookInfo")
    public String addBookInfo(@RequestParam HashMap map, MultipartFile file, HttpSession session) {
        //上传文件并且将上传的文件信息保存到数据库表


        String filename = file.getOriginalFilename();

        String realPath = session.getServletContext().getRealPath("images/book_img/");
        filename = filename.replace(filename.substring(0, filename.lastIndexOf(".")), UUID.randomUUID().toString());
        //定义新的值
        String fnewname = filename;
        filename = realPath + filename;
        try {
            //上传
            file.transferTo(new File(filename));
            map.put("imgurl",fnewname);
            // 将上传文件的信息保存的数据库表
            bookInfoService.addBook(map);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return "redirect:queryInfo";
        }
    }
    //删除
    @RequestMapping("DeleteBook")
    @ResponseBody
    public String DeleteBookInfo(int[] bid){
        System.out.println("hhhhh"+bid);
        try {
            bookInfoService.DeleteBookInfo(bid);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "0";
    }

}