package com.spring1.springapp1.service.impl;

import com.spring1.springapp1.dto.UsersDto;
import com.spring1.springapp1.models.Users;
import com.spring1.springapp1.repositories.UsersRepository;
import com.spring1.springapp1.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsersServiceImpl implements UsersService {

    private UsersRepository usersRepository;

    //@Autowired
    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<UsersDto> findAllUsers() {
        List<Users>
    }


}
