package com.project.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner{

    private ContactRepository contactRepository;

    private DemoLoader(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.contactRepository.save(new Contact("Mohit", "Kumar", "mk@gmail.com"));
    }

    
}
