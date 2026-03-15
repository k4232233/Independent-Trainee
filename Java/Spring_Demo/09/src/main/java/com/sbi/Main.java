package com.sbi;

/*动态代理*/
/*
* 一个动态代理 , 一般代理某一类业务 , 一个动态代理可以代理多个类，代理的是接口！
*
* */
public class Main {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setRent(host); // 把真实角色放进去
        Rent proxy = (Rent) handler.getProxy();//动态生成对应的代理类
        proxy.rent();

    }
}