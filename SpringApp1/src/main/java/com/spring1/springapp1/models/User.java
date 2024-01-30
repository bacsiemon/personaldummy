package com.spring1.springapp1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "Users")

public class Users {
    @Id
    public String username;
    public String password;
    public String fullName;
    public boolean role;

    public Users() {
    }

    public Users(String username, String password, String fullName, boolean role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
    }

    
}
