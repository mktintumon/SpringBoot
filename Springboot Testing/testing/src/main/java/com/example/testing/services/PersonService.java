package com.example.testing.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.testing.entities.Person;
import com.example.testing.repository.PersonRepo;

@Service
public class PersonService {
    private PersonRepo personRepo;

    
    // making this for testing purpose so that out service testing remains isolated from repository
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }


    public List<Person> getAllPersons() {
        return this.personRepo.findAll();
    }


}
