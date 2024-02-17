package com.spring2.springapp2.config;

import com.spring2.springapp2.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    CommandLineRunner commandLineRunner(UserRepository repository ){
        return args -> {

        };
    }
}
