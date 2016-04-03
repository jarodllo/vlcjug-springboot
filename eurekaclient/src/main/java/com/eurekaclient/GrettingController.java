package com.eurekaclient;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jarodllo on 27/2/16.
 */
@Controller
public class GrettingController {

    @Autowired
    protected UserService userService;


    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/greeting")
    public String greeting(Model model) {

        List<User> users= userService.findAll();

        model.addAttribute("users", users);

        return "greetingAll";
    }

    @RequestMapping("/greeting/{id}")
    public String greeting(Model model, @PathVariable Long id) {

        User user = userService.findUser(id);

        model.addAttribute("user", user);

        return "greeting";
    }



}
