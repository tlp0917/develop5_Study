package com.ck.controller;

import com.ck.entity.Booktype;
import com.ck.service.IBooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BooktypeController {
    @Autowired
    private IBooktypeService iBooktypeService;
@RequestMapping("selecttype")
@ResponseBody
public List<Booktype> queryall() {
    return iBooktypeService.queryall();
}
}
