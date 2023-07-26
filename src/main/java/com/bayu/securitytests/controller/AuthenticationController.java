package com.bayu.securitytests.controller;

import com.bayu.securitytests.dto.RegistrationDTO;
import com.bayu.securitytests.model.ApplicationUser;
import com.bayu.securitytests.service.AuthenticationService;
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
