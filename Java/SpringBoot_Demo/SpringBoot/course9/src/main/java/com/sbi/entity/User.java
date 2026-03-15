package com.sbi.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/*
* 实体类
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_user")
@Component
public class User {
    private Integer id;
    private String username;
    private String pwd;
    // 以分为单位,避免浮点运算精度丢失问题
    private Integer salary;

    //封装数据
    public void setSalary(Integer salary){
        this.salary = salary * 100;
    }

}
