package com.ibrahimyengue.springit.service.impl;

import com.ibrahimyengue.springit.entity.User;
import com.ibrahimyengue.springit.repository.UserRepository;
import com.ibrahimyengue.springit.service.MailService;
import com.ibrahimyengue.springit.service.RoleService;
import com.ibrahimyengue.springit.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder encoder;
    private final RoleService roleService;
    private final MailService mailService;


    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder encoder, RoleService roleService, MailService mailService) {
        this.userRepository = userRepository;
        this.encoder = encoder;
        this.roleService = roleService;
        this.mailService = mailService;
    }


    @Override
    public User register(User user) {
        String secret = "{bcrypt}" + encoder.encode(user.getPassword());
        user.setEnabled(false);
        user.setPassword(secret);
        user.setConfirmPassword(secret);
        user.addRole(roleService.findByName("ROLE_USER"));
        user.setActivationCode(UUID.randomUUID().toString());
        save(user);
        sendActivationEmail(user);
        return user;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void sendActivationEmail(User user) {
        mailService.sendActivationEmail(user);
    }

    @Override
    public void sendWelcomeEmail(User user) {
        mailService.sendWelcomeEmail(user);
    }

    @Override
    public Optional<User> findByEmailAndActivationCode(String email, String activationCode) {
        return userRepository.findByEmailAndActivationCode(email,activationCode);
    }

    @Override
    @Transactional
    public void saveUsers(User... users) {
        for (User user : users) {
            logger.info("Saving User: " + user.getFullName());
            userRepository.save(user);
        }
    }
}
