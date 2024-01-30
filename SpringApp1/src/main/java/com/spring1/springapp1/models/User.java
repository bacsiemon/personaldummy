package com.spring1.springapp1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok's annotations
//Lombok will provide necessary methods based on specified annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // This annotation must be added on top of model
@Entity // Will require to use "@Id" to specify an attribute as primary key
@Table(name = "tblUsers")

public class User {
    @Id
    // Can use "@GeneratedValue(strategy = GenerationType.IDENTITY)" annotation to automatically generate an ID
    public String username;
    public String password;
    public String fullName;
    public boolean admin;



    
}
