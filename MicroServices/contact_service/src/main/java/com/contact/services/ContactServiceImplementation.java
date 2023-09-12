package com.contact.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImplementation implements ContactService {

    List<Contact> list = List.of(
        new Contact(1L , "mk@gmail.com" , "Mohit" , 1111L),
        new Contact(2L , "ro@gmail.com" , "Rohan" , 2222L),
        new Contact(3L , "rohan@gmail.com" , "rohan" , 2222L),
        new Contact(1L , "vk@gmail.com" , "Vivek" , 3333L)
    );

    @Override
    public List<Contact> getContacts(Long uid) {
        return list.stream().filter(contact->
            contact.getUid().equals(uid)).collect(Collectors.toList());
    }
    
}
