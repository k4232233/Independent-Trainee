package com.sbi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//代表这是一个配置类
@Configuration
//导入合并其他配置类，类似于配置文件中的 inculde 标签
@Import(MyConfig2.class)
public class MyConfig {
    @Bean
    //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    public Dog dog(){
        return new Dog();
    }
}
