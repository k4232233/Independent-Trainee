package com.sbi;

/*
* 现实角色：房东，出租房子
* 被代理的角色
* */
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
