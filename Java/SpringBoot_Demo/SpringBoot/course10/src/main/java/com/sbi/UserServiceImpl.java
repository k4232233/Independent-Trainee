package com.sbi;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/*
* 基本上在 service 层处理业务逻辑的时候都要加上事务
* 事务中的每一步操作都必须成功执行，只要有发生异常就回退到事务开始未进行操作的状态
* */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    @Override
    @Transactional
    public void isertUser(User user) {
        //插入用户信息
        userMapper.insert(user);
        //手动抛出异常
        throw new RuntimeException();
    }

}
