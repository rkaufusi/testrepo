package com.rkaufusi.timeclockfullstack.controllers;

import com.rkaufusi.timeclockfullstack.entities.User;
import com.rkaufusi.timeclockfullstack.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
