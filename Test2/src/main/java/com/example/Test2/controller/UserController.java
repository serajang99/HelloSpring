package com.example.Test2.controller;

import com.example.Test2.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUser(Model model){
        model.addAttribute("user", userService.getUserById(1));
        return "users/userList";
    }
}
