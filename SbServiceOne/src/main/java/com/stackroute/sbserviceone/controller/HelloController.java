package com.stackroute.sbserviceone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class HelloController {
    // @Value to get value from application.yml
    @Value("${app.message}")
    private String message;
    // method to return message
    @GetMapping("hello")
    public String message(){
        return message;
    }
}