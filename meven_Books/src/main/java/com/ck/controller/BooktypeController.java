package com.ck.controller;

import com.ck.entity.Booktype;
import com.ck.service.IBooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BooktypeController {
    @Autowired
    private IBooktypeService booktypeService;
    @RequestMapping("querytype")
    public String queryType(ModelMap map){
        System.out.println("hhhhhhhhh");
        System.out.println("123456");
        List<Booktype> booktypeList = booktypeService.queryBooktype();
        System.out.println(booktypeList);
        map.put("typelist",booktypeList);
        return "p_add";
    }
    //根据id查询图书类型
    public String querytypeByid(int btid){
        Booktype booktype = booktypeService.queryBooktypeByid(btid);
        return "p_list";
    }
}

