package com.iauto.provider.service.impl;

import com.iauto.provider.service.UserService;
import com.iauto.provider.service.config.UserConfig;
import com.iauto.provider.service.entiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserConfig config;
    public User getUser() {
        return User.builder()
                .age(config.getAge())
                .name(config.getName())
                .idCard(config.getIdCard())
                .build();
    }
}
