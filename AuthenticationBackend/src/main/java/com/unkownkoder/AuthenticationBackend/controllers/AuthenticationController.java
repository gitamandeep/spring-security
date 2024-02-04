package com.unkownkoder.AuthenticationBackend.controllers;

import com.unkownkoder.AuthenticationBackend.dto.LoginResponseDTO;
import com.unkownkoder.AuthenticationBackend.dto.RegistrationDTO;
import com.unkownkoder.AuthenticationBackend.models.ApplicationUser;
import com.unkownkoder.AuthenticationBackend.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO registrationDTO){
        return authenticationService.registerUser(registrationDTO.getUsername(),registrationDTO.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO registrationDTO){
    return authenticationService.loginUser(registrationDTO.getUsername(), registrationDTO.getPassword());
    }

}
