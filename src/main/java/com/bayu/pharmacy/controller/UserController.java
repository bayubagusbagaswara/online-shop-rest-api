package com.bayu.pharmacy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
@CrossOrigin("*")
public class UserController {

    @GetMapping(path = "/")
    public String hello() {
        return "User access level";
    }

}
