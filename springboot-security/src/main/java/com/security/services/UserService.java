package com.security.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.security.models.User;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService(){
        list.add(new User("Mohit" , "abc123" , "mk@gmail.com"));
        list.add(new User("Jatin" , "xyz123" , "ja@gmail.com"));
        list.add(new User("Ayush" , "pqr123" , "ay@gmail.com"));
    }


    // Get all users
    public List<User> getAllUsers(){
        return this.list;
    }

    //Get single users
    public User getUser(String username){
        return this.list.stream().filter(user->
            user.getUsername().equals(username)
        ).findAny().orElse(null);
    }

    // create users
    public User createUser(User user){
        this.list.add(user);
        return user;
    }
}
