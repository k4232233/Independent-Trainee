package com.sbi;

import lombok.Data;

/*
* 定义返回的统一 json 结构
* */
@Data
public class JsonResult {
    protected String code;
    protected String msg;

    public JsonResult() {
        this.code = "200";
        this.msg = "ok";
    }

    public JsonResult (String code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
