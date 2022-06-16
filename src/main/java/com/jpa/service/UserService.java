package com.jpa.service;

import com.jpa.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();
}
