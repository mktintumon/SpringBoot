package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.services.ContactService;

@RestController
@RequestMapping("/contacts")
public class contactController {
    
    @Autowired
    private ContactService contactService;

    @RequestMapping("/users/{uid}")
    public List<Contact> geContacts(@PathVariable("uid") Long uid){
        return this.contactService.getContacts(uid);
    }
}
