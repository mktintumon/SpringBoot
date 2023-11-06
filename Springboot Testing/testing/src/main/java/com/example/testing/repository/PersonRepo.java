package com.example.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.testing.entities.Person;


public interface PersonRepo extends JpaRepository<Person , Integer>{
    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.personId = ?1")
    public boolean isPersonExistsById(Integer id);
}
