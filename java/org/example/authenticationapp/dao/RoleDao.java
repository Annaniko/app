package org.example.authenticationapp.dao;

import org.example.authenticationapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}