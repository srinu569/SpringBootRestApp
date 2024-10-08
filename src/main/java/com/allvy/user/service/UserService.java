package com.allvy.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.allvy.user.jpa.entity.User;
import com.allvy.user.jpa.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;

    @Transactional
    public String registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return "Error: Email already exists!";
        }
        userRepository.save(user);
        return "User registered successfully!";
    }
    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
