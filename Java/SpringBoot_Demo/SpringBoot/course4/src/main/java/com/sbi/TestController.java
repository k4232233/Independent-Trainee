package com.sbi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test", produces = "application/json;charset=UTF-8")
public class TestController {


/*  @RequestMapping注解
    value 属性：指定请求的实际地址，value 可以省略不写
    method 属性：指定请求的类型，主要有 GET、PUT、POST、DELETE，默认为 GET
    produces属性：指定返回内容类型，如 produces = “application/json; charset=UTF-8”
    */

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User testGet() {
        return new User(1, "小黑", "123456");
    }

    /*
        @PathVariable
        获取restfull 风格的 url携带的参数
        需要保证 url 中的参数和方法接收参数一致
    * */
    @GetMapping("/user/{id}")
    public String testPathVariable(@PathVariable Integer id) {
        System.out.println("获取到的id为:" + id);
        return "success";
    }

    /*
    * 不一致时
     用@PathVariable 中的 value 属性来指定对应关系
     */
    @RequestMapping("/user/{idd}")
    public String testPathVariableDiff(@PathVariable(value = "idd") String id) {
        System.out.println("获取id为：" + id);
        return id;
    }

    /*
     * @RequestParam 是从 request 里面获取参数值
     * http://localhost:8080/user?id=1
     * */
    @RequestMapping("/user")
    public String testRequestParam(@RequestParam String name) {
        System.out.println("名字：" + name);
        return name;
    }

    /*
        不一致
        required 属性：true 表示该参数必须要传，否则就会报 404 错误，false 表示可有可无。
        defaultValue 属性：默认值，表示如果请求中没有同名参数时的默认值*/
    @RequestMapping("/user/huiyi")
    public String testRequestParamDiff(@RequestParam(value = "idd", required = false) Integer id) {
        System.out.println("id为：" + id);
        return "ok";
    }


    /*
     * @PostMapping
     * 获取多个参数
     * */

    @PostMapping("/from1")
    public String testForm(@RequestParam String name, @RequestParam String pass) {
        System.out.println("name=" + name);
        System.out.println("password=" + pass);
        return "ok";
    }

    /*
    * 创建了实体类
    * 直接使用
    * */
    @PostMapping("/from2")
    public String testForm2(String name,String pass){
        System.out.println("name=" + name);
        System.out.println("password=" + pass);
        return "ok";
    }

    /*
    * @RequestBody 注解用于接收前端传来的实体，接收参数也是对应的实体
    * */
    @PostMapping("/form3")
    public User testForm3(@RequestBody User user){
        System.out.println("name="+user.getName());
        System.out.println("password="+user.getPassword());
        System.out.println("id="+user.getId());
        return user;
    }
}
