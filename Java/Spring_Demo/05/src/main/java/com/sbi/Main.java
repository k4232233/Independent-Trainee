package com.sbi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* 1. 组件扫描(component scanning)：spring会自动发现应用上下文中所创建的bean；
  2. 自动装配(autowiring)：spring自动满足bean之间的依赖，也就是我们说的IoC/DI；
  * 使用注解装配Bean
  * @Autowired先byType，@Resource先byName
* */
public class Main {
    public static void main(String[] args) {
            test1();
        }

        public static void test1(){
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            User user = (User) context.getBean("user");
            user.getCat().shout();
            user.getDog().shout();
        }
    }
