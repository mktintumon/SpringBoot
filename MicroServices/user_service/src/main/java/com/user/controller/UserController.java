package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/{uid}")
    public User getUser(@PathVariable("uid") Long uid){
        User user = this.userService.getUsers(uid);

        // replace -> (localhost:9002/contacts)  BY (contact-services)
        List<Contact> contacts = 
            this.restTemplate.getForObject("http://contact-service/contacts/users/" + user.getUid(), List.class);

        user.setContacts(contacts);

        return user; 
    }
}
