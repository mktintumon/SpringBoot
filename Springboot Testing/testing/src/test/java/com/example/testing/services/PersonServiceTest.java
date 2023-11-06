package com.example.testing.services;

import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.example.testing.repository.PersonRepo;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    // we dont want to involve our repository for testing
    // As we already tested repository unit
    @Mock
    private PersonRepo personRepo;
    
    private PersonService personService;

    @BeforeEach
    void setUp(){
        // passing fake repo just for testing
        this.personService = new PersonService(this.personRepo);
    }

    @Test
    void testGetAllPersons() {
        personService.getAllPersons();
        verify(personRepo).findAll();
    }
}
