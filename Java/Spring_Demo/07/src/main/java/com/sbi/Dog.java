package com.sbi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//将这个类标注为Spring的一个组件，放到容器中！
@Component
public class Dog {
    @Value("小黑")
    public String name;
}
