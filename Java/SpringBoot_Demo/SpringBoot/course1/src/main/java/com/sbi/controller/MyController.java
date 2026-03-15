package com.sbi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//控制器
@Controller
public class MyController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello SpringBoot");
        return "welcome SpringBoot";
    }
}
