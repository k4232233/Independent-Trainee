package com.sbi;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {

    //returnValue 返回值
    //method被调用的方法
    //args 被调用的方法的对象的参数
    //target 被调用的目标对象
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+objects.getClass().getName()
        +"的"+method.getName()+"方法，"+"返回值："+o
        );
    }
}
