package com.spring1.springapp1.service.impl;

import com.spring1.springapp1.dto.UserDto;
import com.spring1.springapp1.models.User;
import com.spring1.springapp1.repositories.UserRepository;
import com.spring1.springapp1.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
// Uses to implement the codes required for an interface
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    //Usually Spring will automatically provide "@Autowired" annotation
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> findAllUsers() {
        List<User> users = userRepository.findAll(); // pull data from repository
        return users.stream().map((user) -> mapToUserDto(user)).collect(Collectors.toList()); // "for" loop
    }

    private UserDto mapToUserDto(User user){
        // Add "@Builder" annotation into Dto class if "builder()" method isn't available.
        UserDto dto = UserDto.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .fullName(user.getFullName())
                .admin(user.isAdmin())
                .build();
        return dto;
    }
}
