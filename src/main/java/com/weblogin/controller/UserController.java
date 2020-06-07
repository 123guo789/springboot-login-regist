package com.weblogin.controller;

import com.weblogin.bean.Result;
import com.weblogin.bean.User;
import com.weblogin.usersevice.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserSevice userService;

//    @RequestMapping({"/","/login.html"})
//    public String index(){
//        return "login.html";
//    }

    @PostMapping(value = "/regist")
    public Result regist(User user){
        return userService.regist(user);
    }

    @PostMapping(value = "/login")
    public Result login(User user){
        return userService.login(user);
    }
}
