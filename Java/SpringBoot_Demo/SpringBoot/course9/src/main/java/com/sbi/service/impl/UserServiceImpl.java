package com.sbi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sbi.entity.User;
import com.sbi.mapper.UserMapper;
import com.sbi.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

}
