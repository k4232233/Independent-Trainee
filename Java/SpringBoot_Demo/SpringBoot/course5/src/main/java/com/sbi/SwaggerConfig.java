package com.sbi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        // 创建一个swagger的bean实例
        return new Docket(DocumentationType.SWAGGER_2)
                //指定构建api文档的详细信息的方法:apiIfo()
                .apiInfo(apiInfo())

                //配置接口信息
                .select()//设置扫描接口
                // 指定要生成api接口的包路径，这里把controller作为包路径，生成controller中的所有接口
                .apis(RequestHandlerSelectors.basePackage("com.sbi.controller"))
                .paths(PathSelectors.any())
                .build();

    }


    //api文档基本信息设置
    private ApiInfo apiInfo(){

        Contact contact = new Contact("huiyi", "huiyi.asia", "@qq.com");
        return new ApiInfoBuilder()
                //标题
                .title("Swagger-接口文档-测试")
                //描述
                .description("一个swagger的demo")
                //跳转链接
//                .termsOfServiceUrl("http://blog.huiyi.asia")
                //版本
                .version("1.0")
                //联系方式
                .contact(contact)
                //构建
                .build();
    }

}
