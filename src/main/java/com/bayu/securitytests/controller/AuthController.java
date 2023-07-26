package com.bayu.securitytests.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/auth")
@RequiredArgsConstructor
public class AuthController {

//    private final TokenService tokenService;

//    @GetMapping(path = "/token")
//    public String token(Authentication authentication) {
//        return tokenService.generateToken(authentication);
//    }

}
