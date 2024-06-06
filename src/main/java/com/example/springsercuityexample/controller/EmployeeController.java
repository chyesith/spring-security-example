package com.example.springsercuityexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {



    @GetMapping("/employee/greetings")
    public String greetings() {
        return "Hi Mate";
    }
}
