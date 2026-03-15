package com.sbi;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* @ApiModel 注解用于实体类，表示对类进行说明，用于参数用实体类接收。
  @ApiModelProperty 注解用于类中属性，表示对 model 属性的说明或者数据操作更改。
*
* */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户实体类")
public class User {

    @ApiModelProperty("用户唯一标识")
    private int id;
    @ApiModelProperty("用户姓名")
    private String name;
    @ApiModelProperty("用户密码")
    private String password;
}
