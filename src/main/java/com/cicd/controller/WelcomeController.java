package com.cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to the CI/CD pipeline!");
    }

    @GetMapping("/hurray")
    public ResponseEntity<String> hurrayMessage(){
        return ResponseEntity.ok("Hurray! The CI/CD pipeline is working perfectly!");
    }
}