package com.example.britt.myapp;


import java.lang.reflect.Array;
import java.util.List;

/**
 * Create class for a user, with email, score and password.
 */

public class User {
    public String email;
    public Integer score;
    public String password;

    public User() {}

    public User(Integer score, String password, String email) {
        this.password = password;
        this.score = score;
        this.email = email;
    }
}
