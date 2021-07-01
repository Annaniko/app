package org.example.authenticationapp.controller;

import org.example.authenticationapp.exceptions.NotFoundExceptions;
import org.example.authenticationapp.model.Users;
import org.example.authenticationapp.service.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UsersController {
    private UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("list")
    public List<Users> list(){
        return usersService.AllUsers();
    }

    @GetMapping("{id}")
    public Users getOne(@PathVariable String id){
        return getUsers(id);
    }


    private Users getUsers(String id) {
        return usersService.AllUsers().stream().filter(users -> users.get("id").equals(id)).findFirst().orElseThrow(NotFoundExceptions::new);
    }

    @PostMapping
    public Users create(@RequestBody Users users){
        usersService.save(users);
        return users;
    }

    @PutMapping("{id}")
    public Users update(@PathVariable Long id,@RequestBody Users users){
        usersService.update(id, users);
        return users;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        usersService.remove(id);
    }

}
