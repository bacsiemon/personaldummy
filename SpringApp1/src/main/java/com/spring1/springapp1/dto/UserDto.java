package com.spring1.springapp1.dto;

public class UsersDto {
    public String username;
    public String password;
    public String fullName;
    public boolean role;

    public UsersDto() {
    }

    public UsersDto(String username, String password, String fullName, boolean role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
    }
}
