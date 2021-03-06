package org.example.authenticationapp.model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Users
{
    @Id
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object get(String id) {
        return id;
    }
}
