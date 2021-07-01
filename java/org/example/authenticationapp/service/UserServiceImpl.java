package org.example.authenticationapp.service;

import org.example.authenticationapp.dao.RoleDao;
import org.example.authenticationapp.dao.UserDao;
import org.example.authenticationapp.model.Role;
import org.example.authenticationapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    private final RoleDao roleDao;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserDao userDao, RoleDao roleDao, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userDao = userDao;
        this.roleDao = roleDao;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public void save(User user) {
        long leftLimit = 1L;
        long rightLimit = 10000L;

        Long id = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        user.setId(id);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);
    }


    public List<User> AllUser()
    {
        return userDao.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
