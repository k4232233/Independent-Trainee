package com.sbi;

/*
* 客户：一般客户都会去找代理
* 使用代理角色来进行一些操作
* */
public class Client {
    public static void main(String[] args) {
        //房东要租房
        Host host = new Host();
        //中介帮助房东
        Proxy proxy = new Proxy(host);
        //客户（你）去找中介
        proxy.rent();
    }
}

/*
静态代理的好处:
1.可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情 .
2.公共的业务由代理来完成 . 实现了业务的分工 ,
3.公共业务发生扩展时变得更加集中和方便 .
缺点 :
类多了 , 多了代理类 , 工作量变大了 . 开发效率降低 .
*
* 解决：动态代理
* */
