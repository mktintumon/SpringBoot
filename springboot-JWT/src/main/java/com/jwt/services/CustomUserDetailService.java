package com.jwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.jwt.entities.User;
import com.jwt.repository.UserRepository;


@Service
public class CustomUserDetailService implements UserDetailsService{

    @Autowired
    public UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        User user = userRepository.findByEmail(username)
                                  .orElseThrow(()->new RuntimeException("username not found!!!"));
        
        return user;
    }
    
}
