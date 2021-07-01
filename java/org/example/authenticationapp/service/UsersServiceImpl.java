package org.example.authenticationapp.service;

import org.example.authenticationapp.dao.UsersDao;
import org.example.authenticationapp.model.Users;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UsersServiceImpl implements UsersService {
    private final UsersDao usersDao;

    public UsersServiceImpl(UsersDao usersDao) {

        this.usersDao = usersDao;
    }

    @Override
    public void save(Users users) {
        //UsersDao.save(users);
    }

    @Override
    public List<Users> AllUsers()
    {
        return usersDao.findAll();
    }

    @Override
    public Users findByUsername(String username) {
        return usersDao.findByUsername(username);
    }

    @Override
    public void update(Long id, Users users) {
        Users dbUsers = usersDao.findById(id).orElse(new Users());
        dbUsers.setPassword(users.getPassword());
        dbUsers.setUsername(users.getUsername());
        usersDao.save(dbUsers);
    }

    @Override
    public void remove(Long id) {
        usersDao.deleteById(id);
    }

}
