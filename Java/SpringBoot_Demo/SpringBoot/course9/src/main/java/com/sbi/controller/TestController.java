package com.sbi.controller;

import com.sbi.entity.User;
import com.sbi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getById(id);
    }

    @PostMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        System.out.println(userService.save(user)?"ok":"defeat");

    }
}
