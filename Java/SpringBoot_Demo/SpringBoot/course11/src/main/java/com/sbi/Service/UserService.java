package com.sbi.Service;

import com.sbi.diyEvent.MyEvent;
import com.sbi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service

/*
* 监听Servlet上下文对象
* */
public class UserService {
    /*
    * 获取用户信息
    * */

    public User getUser(){
        // 实际中会根据具体的业务场景，从数据库中查询对应的信息
        return new User(1,"小黑","123456");
    }

    /*
    * 手动发布事件,根据实际业务场景来触发
    * */

    @Autowired
    private ApplicationContext applicationContext;

    public User getUser2(){
        User user = new User(2, "小灰灰", "123456");
        //发布事件
        MyEvent event = new MyEvent(this,user);
        applicationContext.publishEvent(event);
        return user;
    }

}
