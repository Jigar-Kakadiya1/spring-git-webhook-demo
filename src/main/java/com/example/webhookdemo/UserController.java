package com.example.webhookdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String user() {
        return "jigar kakadiya - software engineer - prama";
    }

    @GetMapping("/")
    public String home() {
        return "welcome to home page";
    }
}
