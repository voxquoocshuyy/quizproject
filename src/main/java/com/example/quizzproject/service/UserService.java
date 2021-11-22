package com.example.quizzproject.service;

import com.example.quizzproject.model.User;
import com.example.quizzproject.model.UserPrincipal;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
