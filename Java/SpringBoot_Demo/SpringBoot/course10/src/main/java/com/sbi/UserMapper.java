package com.sbi;

import org.apache.ibatis.annotations.Insert;

public interface UserMapper {
    @Insert("insert into user_tb (id,username,pwd,salary) values (#{id},#{username},#{pwd},#{salary})")
    Integer insert(User user);
}
