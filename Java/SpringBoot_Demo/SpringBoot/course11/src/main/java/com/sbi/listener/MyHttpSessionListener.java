package com.sbi.listener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/*
 * 使用HttpSessionListener统计在线用户数的监听器
 * */
@Component
public class MyHttpSessionListener implements HttpSessionListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyHttpSessionListener.class);

    /*
     * 记录在线用户的数量
     * */

    public Integer count = 0;

    @Override
    public synchronized void sessionCreated(HttpSessionEvent httpSessionEvent) {
        httpSessionEvent.getSession().setMaxInactiveInterval(5);
        LOGGER.info("新用户上线了");
        count++;
        httpSessionEvent.getSession().getServletContext().setAttribute("count",count);
    }


    @Override
    public synchronized void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        LOGGER.info("用户下线了");
        count--;
        httpSessionEvent.getSession().getServletContext().setAttribute("count", count);
    }

    }
