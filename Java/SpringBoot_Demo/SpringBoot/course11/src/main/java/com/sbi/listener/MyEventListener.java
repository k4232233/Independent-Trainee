package com.sbi.listener;

import com.sbi.diyEvent.MyEvent;
import com.sbi.pojo.User;
import org.springframework.context.ApplicationListener;

/*
 * 监听自定义事件
 * 实现：ApplicationListener<E extends ApplicationEvent> 接口
 * */
public class MyEventListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        // 把事件中的信息获取到
        User user = event.getUser();
        // 处理事件，实际项目中可以通知别的微服务或者处理其他逻辑等等
        System.out.println("用户名：" + user.getName());
        System.out.println("密码：" + user.getPwd());
    }
}

