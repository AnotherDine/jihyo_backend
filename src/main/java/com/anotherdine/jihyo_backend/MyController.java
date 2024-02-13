package com.anotherdine.jihyo_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/data")
    public String getData() {
        return "Hello from Spring Boot!";
    }
}