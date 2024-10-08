package com.allvy.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.allvy.user.jpa.entity.User;
import com.allvy.user.service.UserService;


@RestController
public class UserRestController {
	
	@Autowired
    private UserService userService;

    @PostMapping("/user/register")
    public String registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
    
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
