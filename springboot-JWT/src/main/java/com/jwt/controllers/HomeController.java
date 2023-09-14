package com.jwt.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jwt.models.User;

import com.jwt.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        System.out.println("Getting all user details...");
        return this.userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getUsername(Principal principal){
        System.out.println("Getting username...");
        return principal.getName();
    }
}
