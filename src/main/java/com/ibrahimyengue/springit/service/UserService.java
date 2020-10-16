package com.ibrahimyengue.springit.service;

import com.ibrahimyengue.springit.entity.User;

import java.util.Optional;

public interface UserService {
    User register(User user);
    User save(User user);
    void saveUsers(User... users);
    Optional<User> findByEmailAndActivationCode(String email, String activationCode);
    void sendActivationEmail(User user);
    void sendWelcomeEmail(User user);
}
