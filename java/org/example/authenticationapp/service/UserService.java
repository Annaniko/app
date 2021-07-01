package org.example.authenticationapp.service;

import org.example.authenticationapp.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}