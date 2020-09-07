package com.xuyj.springboot.controller;

import com.xuyj.springboot.entity.User;
import com.xuyj.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userRepository.findOne(id);
    }
    @GetMapping("/user")
    public User insertUser(User user){
       return userRepository.save(user);
    }
}
