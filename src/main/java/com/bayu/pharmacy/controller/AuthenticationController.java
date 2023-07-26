package com.bayu.pharmacy.controller;

import com.bayu.pharmacy.dto.RegistrationDTO;
import com.bayu.pharmacy.model.ApplicationUser;
import com.bayu.pharmacy.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping(path = "/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO registrationDTO) {
        return authenticationService.registerUser(
                registrationDTO.getUsername(),
                registrationDTO.getPassword());
    }

}
