package com.example.JavaSpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello Ram,Good Evening@!@";
    }
}
