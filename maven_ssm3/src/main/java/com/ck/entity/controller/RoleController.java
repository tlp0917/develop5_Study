package com.ck.entity.controller;

import com.ck.entity.entity.entity.Role;
import com.ck.entity.entity.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    private IRoleService roleService;
    @RequestMapping("queryall")
    public String selectRole(ModelMap map){
        List<Role> roleList = roleService.queryrole();
       map.put("Rlist",roleList);
       return "index";

    }
}
