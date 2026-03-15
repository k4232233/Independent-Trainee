package com.sbi.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
/*
* Component还有三个衍生注解
* @Controller：controller层
* @Service：service层
* @Repository：dao层
* */
@Component("user")
public class User {
    // 相当于配置文件中 <property name="name" value="huiyi"/>
    @Value("huiyi")
    public String name ;

    //提供了set方法，在set方法上添加@value(“值”)
    @Value("绘衣")
    public void setName(String name) {
        this.name = name;
    }



    /*
    * 自动装配的例子
    * @Autowired是按类型自动转配的，不支持id匹配
    * @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
      @Qualifier不能单独使用
    * */

    private Dog dog;

    private Cat cat;
    @Value("2233")
    private String str;

    public String getName() {
        return name;
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public String getStr() {
        return str;
    }
}
