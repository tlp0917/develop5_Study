package com.ck.entity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pagecontroller {
    @RequestMapping("page")
    public String page(String page){
        return page;
    }
}
