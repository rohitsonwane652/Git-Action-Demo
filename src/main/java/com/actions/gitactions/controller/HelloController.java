package com.actions.gitactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/getValue")
    public String hello() {
        return "Hello World!";
    }
}
