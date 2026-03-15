package com.sbi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jsonresult")
public class JsonResultController {

    @RequestMapping("/user")
    public JsonResult<User> getUser(){
        return new JsonResult<>(new User(2L,"小黑","123456"));
    }

    @RequestMapping("/list")
    public JsonResult<List> getUserList(){
        List<User> users = new ArrayList<>();
        users.add(new User(1L,"小白","123456"));
        users.add(new User(2L,"小蓝","123456"));
        users.add(new User(3L,"小紫","123456"));
        return new JsonResult<>(users,"获取用户列表成功");
    }

    @RequestMapping("/map")
    public JsonResult<Map> getUserMap(){
        Map<String,Object> map = new HashMap<>(3);
        User user = new User(4L,"小黄","123456");
        map.put("作者信息",user);
        map.put("地址","asia.huiyi");
        map.put("fans",null);
        return new JsonResult<>(map);
    }
}
