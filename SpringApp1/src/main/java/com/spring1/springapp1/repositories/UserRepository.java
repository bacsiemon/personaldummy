package com.spring1.springapp1.repositories;

import com.spring1.springapp1.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, String> {
    Optional<Users> findByFullName(String name);
}
