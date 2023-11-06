package com.example.testing.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;
import com.example.testing.entities.Person;

@SpringBootTest
public class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    void testIsPersonExistsById() {
        Person person = new Person(222 , "Mohit" , "Patna");
        personRepo.save(person);

        Boolean actualResult = personRepo.isPersonExistsById(222);
        assertThat(actualResult).isTrue();
    }

    @BeforeEach
    void setUp(){
        System.out.println("Checking DB by setting up...");
    }

    @AfterEach
    void tearDown(){
        System.out.println("shutting down by clearing data...");
        personRepo.deleteById(222);
    }

    
}
