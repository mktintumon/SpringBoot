package com.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // @Bean
    // public UserDetailsService userDetailsService(){
    //     UserDetails user1 =  User.builder()
    //                             .username("mohit")
    //                             .password(passwordEncoder().encode("abc123"))
    //                             .roles("USER")
    //                             .build();

    //     UserDetails user2 =  User.builder()
    //                             .username("sanket")
    //                             .password(passwordEncoder().encode("xyz123"))
    //                             .roles("USER")
    //                             .build();

    //     UserDetails admin =  User.builder()
    //                             .username("admin")
    //                             .password(passwordEncoder().encode("admin"))
    //                             .roles("ADMIN")
    //                             .build();

    //     return new InMemoryUserDetailsManager(user1 , user2 , admin);
    // }

    
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
    
}
