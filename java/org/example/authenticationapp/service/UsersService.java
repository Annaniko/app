package org.example.authenticationapp.service;

import org.example.authenticationapp.model.Users;

import java.util.List;

public interface UsersService {
    void save(Users users);

    List<Users> AllUsers();

    Users findByUsername(String username);


    void update(Long id, Users users);
    void remove(Long id);
}
