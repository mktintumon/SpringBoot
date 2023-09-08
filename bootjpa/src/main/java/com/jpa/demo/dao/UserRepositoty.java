package com.jpa.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.demo.entities.User;

public interface UserRepositoty extends CrudRepository<User, Integer>{
	// automatic implementation
	// custom query(derived a/c our need)
}
