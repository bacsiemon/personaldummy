package com.spring1.springapp1.repositories;

import com.spring1.springapp1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


// JpaRepository provides CRUD methods to get data from database, then turn them into objects for use
// Allows to type custom methods, which will be automatically turned into custom queries
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByFullName(String name);
}
