package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Application is running successfully inside Docker!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from your Dockerized Spring Boot app!";
    }
}
