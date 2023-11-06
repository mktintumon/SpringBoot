package com.example.testing.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.testing.services.PersonService;

@RestController
public class PersonController {
    private PersonService personService;

    public ResponseEntity<?> getAllPersons(){
        return ResponseEntity.ok(this.personService.getAllPersons());
    }
}
