package com.spring1.springapp1.service;

import com.spring1.springapp1.dto.UserDto;

import java.util.List;

//Provides repository methods that can be used when need to
//Add a layer of abstraction: only care about what a method does, not how it does.
public interface UserService {
    List<UserDto> findAllUsers();
}
