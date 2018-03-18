package com.example.myluckyblog.controller;

import com.example.myluckyblog.model.User;
import com.example.myluckyblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by yanggm on 2018/3/17 0017
 */

@Controller
@RequestMapping("/t")
public class TestController {
    @Autowired
    UserService userService;
    @RequestMapping("/index")
    public String index(ModelMap map){
        User user=userService.getUserById("1");
        System.out.println(user.getUserName());
        map.put("user",user);
        return "test";
    }

    @RequestMapping("/inserId")
    public String insert(ModelMap map){
        User record = new User();
        record.setUserId("9");
        record.setUserName("李白");
        record.setPassword("8987846");
        int id = userService.insertUserById(record);
        System.out.print(id);
        map.put("user2",record);
        return "test2";
    }
}