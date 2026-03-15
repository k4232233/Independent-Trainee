package com.sbi.controller;

import com.sbi.JsonResult;
import com.sbi.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/swagger")
@Api("swagger接口文档")
public class UserController {

    @GetMapping("/get/{id}")
    @ApiOperation("根据用户id获取用户信息")
    public JsonResult<User> testGet(@PathVariable @ApiParam("用户唯一标识") int id){
        User user = new User(id,"测试","123456");
        return new JsonResult(user);
    }
}
