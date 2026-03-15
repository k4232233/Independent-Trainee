package com.sbi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interceptor")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "svg";
    }
}
