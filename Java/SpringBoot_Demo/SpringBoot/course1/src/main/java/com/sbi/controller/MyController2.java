package com.sbi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class MyController2 {

    @RequestMapping("/springboot")
    public String startSpringBoot(){
        System.out.println("Welcome to the world of Spring Boot");
        return "Welcome to the world of Spring Boot";
    }
}
