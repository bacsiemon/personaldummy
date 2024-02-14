package com.spring2.springapp2.model;


import lombok.*;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {
    private String username, password, fullName;
    private boolean admin;




}
