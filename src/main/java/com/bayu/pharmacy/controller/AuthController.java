package com.bayu.pharmacy.controller;

import com.bayu.pharmacy.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
