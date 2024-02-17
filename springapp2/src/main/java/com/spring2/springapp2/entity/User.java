package com.spring2.springapp2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
// Entity is a single instance of a domain object saved into the database as a record.
// It has some attributes that we represent as columns in our tables.
@Table
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String username;
    private String password, fullName;
    private boolean admin;
}
