package com.sbi;

/*
* IoC创建无参构造
* 有参构造创建
* */
public class User {
    private String name;

    public User() {
        System.out.println("user无参构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
