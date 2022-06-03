package com.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


}
