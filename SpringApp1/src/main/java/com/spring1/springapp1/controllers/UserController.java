package com.spring1.springapp1.controllers;

import com.spring1.springapp1.dto.UserDto;
import com.spring1.springapp1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class UserController {
    private UserService userService;

    @Autowired //don't forget to add "@Service" annotation into ServiceImpl class
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users") //URL of "users"
    public String listUsers(Model model){
        List< UserDto> users = userService.findAllUsers(); // get User from database

        // uses to get data from code
        model.addAttribute("users", users);
        return "users-list"; //HTML file name in resources\templates\

    }
}
