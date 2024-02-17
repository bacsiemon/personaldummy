package com.spring2.springapp2.controller;

import com.spring2.springapp2.service.UserService;
import com.spring2.springapp2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping //restful endpoint
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
