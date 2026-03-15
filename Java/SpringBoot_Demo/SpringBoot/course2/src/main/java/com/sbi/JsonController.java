package com.sbi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/user")
    public User getUser() {
        return new User(1L, "小白", "123456");
    }

    @RequestMapping("/list")
    public List<User> userList() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "小黑", "123456"));
        users.add(new User(2L, "小红", "123456"));
        return users;
    }

    @RequestMapping("/map")
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(3L, "小绿", null);
        map.put("作者信息", user);
        map.put("地址", "huiyi.asia");
        map.put("数量", 12);
        return map;
    }
}
