package com.auto.consumer.controller;

import com.iauto.provider.autoconfigure.factory.IConnectionFactory;
import com.iauto.provider.service.UserService;
import com.iauto.provider.service.entiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IConnectionFactory factory;
    @Autowired
    private UserService userService;

    @GetMapping("fa")
    public String test() {
        return factory.connectionInfo();
    }

    @GetMapping("user")
    public User getUser() {
        return userService.getUser();
    }

}
