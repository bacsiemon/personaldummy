package com.spring2.springapp2.service;

import com.spring2.springapp2.user.User;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    public List<User> getUsers(){
        return List.of(
                new User("admin", "123456", "Administratior", false)
        );
    }
}
