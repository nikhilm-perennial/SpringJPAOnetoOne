package com.jpa.model;

import javax.persistence.*;

@Entity
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

    public UserProfile() {
    }

    public UserProfile(Integer id, String phone, String gender, String city, String state, String country, User user) {
        this.id = id;
        this.phone = phone;
        this.gender = gender;
        this.city = city;
        this.state = state;
        this.country = country;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", user=" + user +
                '}';
    }
}
