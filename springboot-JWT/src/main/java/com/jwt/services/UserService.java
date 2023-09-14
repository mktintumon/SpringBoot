package com.jwt.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.jwt.models.User;

@Service
public class UserService {
    List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString() , "Robin" , "ro@yahoo.in"));
        store.add(new User(UUID.randomUUID().toString() , "Marsh" , "ma@yahoo.in"));
        store.add(new User(UUID.randomUUID().toString() , "Sunita" , "su@yahoo.in"));
        store.add(new User(UUID.randomUUID().toString() , "Manisha" , "ma@yahoo.in"));
        store.add(new User(UUID.randomUUID().toString() , "John" , "jo@yahoo.in"));
    }

    public List<User> getUsers(){
        return this.store;
    }

    
}
