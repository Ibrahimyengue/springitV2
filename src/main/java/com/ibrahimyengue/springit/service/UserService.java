package com.ibrahimyengue.springit.service;

import com.ibrahimyengue.springit.entity.User;

public interface UserService {
    User register(User user);
    User save(User user);
    void saveUsers(User... users);
}
