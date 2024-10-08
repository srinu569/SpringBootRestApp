package com.allvy.user.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allvy.user.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
