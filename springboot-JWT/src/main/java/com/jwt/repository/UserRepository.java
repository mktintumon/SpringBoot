package com.jwt.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jwt.entities.User;


public interface UserRepository extends JpaRepository<User,String>{
   public Optional<User> findByEmail(String email);
}
