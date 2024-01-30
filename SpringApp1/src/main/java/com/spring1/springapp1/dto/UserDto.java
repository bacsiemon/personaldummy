package com.spring1.springapp1.dto;


//DTO helps to encapsulate data, allowing devs to return specific fields/data

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    public String username;
    public String password;
    public String fullName;
    public boolean admin;

    public UserDto() {
    }

    public UserDto(String username, String password, String fullName, boolean admin) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.admin = admin;
    }
}
