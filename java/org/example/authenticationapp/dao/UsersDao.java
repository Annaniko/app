package org.example.authenticationapp.dao;

import org.example.authenticationapp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
