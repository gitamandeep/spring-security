package com.unkownkoder.AuthenticationBackend.services;

import com.unkownkoder.AuthenticationBackend.models.ApplicationUser;
import com.unkownkoder.AuthenticationBackend.models.Role;
import com.unkownkoder.AuthenticationBackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("IN THE USER DETAILS SERVICE ");

        return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("USER IS NOT VALID"));
    }
}
