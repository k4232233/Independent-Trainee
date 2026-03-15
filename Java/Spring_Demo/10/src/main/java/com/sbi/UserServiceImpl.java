package com.sbi;

//业务接口实现类
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");

    }

    @Override
    public void upadte() {
        System.out.println("修改用户");

    }

    @Override
    public void search() {
        System.out.println("查找用户");

    }
}
