package com.user.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;


@Service
public class UserServiceImplementation implements UserService{


    List<User> list = List.of(
        new User(1111L, "Mohit Kumar",  "2345678901"),
        new User(2222L, "Rohan singh",  "5555678901"),
        new User(3333L, "Vivek Mehto",  "9911678901")
    );

    @Override
    public User getUsers(Long id) {
        
        return this.list.stream().filter(user->
            user.getUid().equals(id)).findAny().
        orElse(null);
        
    }
    
}
