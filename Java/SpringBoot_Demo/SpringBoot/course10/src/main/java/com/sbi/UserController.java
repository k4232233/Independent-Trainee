package com.sbi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public String addUser(@RequestBody User user){
            if(null!=user){
                userService.isertUser(user);
                return "ok";
            }else {
                return "false";
            }
    }
}
