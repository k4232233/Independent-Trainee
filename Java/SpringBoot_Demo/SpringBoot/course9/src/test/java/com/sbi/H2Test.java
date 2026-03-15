package com.sbi;

import com.sbi.entity.User;
import com.sbi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class H2Test {
    @Autowired(required = true)
    private UserService userService;

    @Test
    public void Test1(){
        User user = new User();
        user.setId(1);
        user.setUsername("绘");
        user.setPwd("123456");
        user.setSalary(10000);
        boolean flag = userService.save(user);
        System.out.println(flag?"插入成功":"插入失败");

    }

    @Test
    public void Test2(){
        List<User> users = userService.list();
        System.out.println(users);
    }
}
