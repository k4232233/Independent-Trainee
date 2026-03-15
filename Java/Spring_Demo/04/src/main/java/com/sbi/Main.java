package com.sbi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        test1();
        test2();

    }


    public static void test1(){
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      Student student = (Student)context.getBean("student1");
        System.out.println(student.getName());
    }

    public static void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)context.getBean("student3");
        student.show();
    }


}