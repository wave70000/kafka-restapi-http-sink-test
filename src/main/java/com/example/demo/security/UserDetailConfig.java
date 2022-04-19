package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserDetailConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        PasswordEncoder encoder = passwordEncoder();

        User.UserBuilder userBuilder = User.builder().passwordEncoder(encoder::encode);
        InMemoryUserDetailsManager inMemoryUserDetailsManager= new InMemoryUserDetailsManager();
        inMemoryUserDetailsManager.createUser(userBuilder.username("user").password("P@ssw0rd").roles("USER").build());
        inMemoryUserDetailsManager.createUser(userBuilder.username("admin").password("P@ssw0rd").roles("USER","ADMIN").build());
        inMemoryUserDetailsManager.createUser(userBuilder.username("kc-client").password("P@ssw0rd").roles("USER","ADMIN").build());
        return inMemoryUserDetailsManager;
    }
}
