package com.spring1.springapp1.service;

import com.spring1.springapp1.dto.UsersDto;

import java.util.List;

public interface UsersService {
    List<UsersDto> findAllUsers();
}
