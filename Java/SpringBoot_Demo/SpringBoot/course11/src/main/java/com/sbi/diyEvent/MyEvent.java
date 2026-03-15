package com.sbi.diyEvent;

import com.sbi.pojo.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/*
 * 自定义事件
 * */

@Getter
public class MyEvent extends ApplicationEvent {

    //该对象在实际中就是需要处理的数据
    private User user;

    public MyEvent(Object source, User user) {
        super(source);
        this.user = user;
    }

}
