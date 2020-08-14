package com.sli.controller;

import com.sli.entity.User;
import com.sli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/get")
    public List<User> getUsers(){
        System.out.println(userService.selectAllUserAndDeptAndRole());
        return userService.selectAllUserAndDeptAndRole();
    }
}
