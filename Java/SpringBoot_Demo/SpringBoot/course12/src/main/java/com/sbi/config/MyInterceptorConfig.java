package com.sbi.config;

import com.sbi.Interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyInterceptorConfig extends WebMvcConfigurationSupport {
    /*
    * 继承 WebMvcConfigurationSupport 类的方式可以用在前后端分离的项目中，后台不需要访问静态资源
    * */
    @Override
    protected void addInterceptors(InterceptorRegistry registry){
        //添加自定义的拦截器，添加要拦截的请求
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    /*
    * 用来指定静态资源不被拦截，否则继承WebMvcConfigurationSupport这种方式会导致静态资源无法直接访问
    * */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }
}

/*
* 第二种直接访问静态资源
* 实现 WebMvcConfigure 接口
* */
// class MyInterceptorConfig2 implements WebMvcConfigurer {
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 实现WebMvcConfigurer不会导致静态资源被拦截
//        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
//    }
//}
