package com.valenciajug.controller;

import java.util.List;
import com.valenciajug.entity.User;
import com.valenciajug.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/user")
    public List<User> user(Model model) {

        List<User> users = userRepository.findAll();

        model.addAttribute("users", users);

        return users;
    }


    @RequestMapping("/user/{id}")
    public User user(Model model, @PathVariable Long id) {

        User user = userRepository.findOne(id);

        model.addAttribute("user", user);

        return user;
    }

}
