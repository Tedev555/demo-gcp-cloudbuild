package com.example.demogcpcloudbuild;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String greeting() {
        return "Greetings from Spring Boot!";
    }
}
