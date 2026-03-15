package com.sbi.listener;

import com.sbi.Service.UserService;
import com.sbi.pojo.User;
import jakarta.servlet.ServletContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/*
 *
 * 1.使用ApplicationListener来初始化一些数据到application域中的监听器
 * 2.使用HttpSessionListener统计在线用户数的监听器
 * 3.监听客户端请求Servlet Request对象
 * */
@Component
public class MyServletContextListener implements ApplicationListener<ContextRefreshedEvent>  {
    @Override
    /*
     * 前端在请求相应数据的时候，我们就可以直接从 application 域中获取信息，减少数据库的压力
     * */
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //先获取到application上下文
        ApplicationContext applicationContext = event.getApplicationContext();
        //获取对应的service
        UserService userService = applicationContext.getBean(UserService.class);
        User user = userService.getUser();
        //获取application域对象，将查到的信息放到application域中
        ServletContext application = applicationContext.getBean(ServletContext.class);
        application.setAttribute("user", user);
    }
}
