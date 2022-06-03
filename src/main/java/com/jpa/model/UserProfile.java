package com.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String phone;
    private String gender;
    private String city;
    private String state;
    private String country;

    @OneToOne
    @JoinColumn(name = "user_id",referencedColumnName = "userId")
    private User user;


}
