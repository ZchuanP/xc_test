package com.example.demo.web.util;


import com.example.demo.web.CodeEnum;

import java.io.Serializable;

/**
 * 返回结果类
 */
public  class Result<Object>   implements Serializable {
    private  String msg;
    private Object data;
    private String code;

    public void Result(String msg, String code, Object data){
        this.msg = msg;
        this.code = code;
        this.data = data;
    }
    public void Result(){
        this.msg = CodeEnum.SUCCESS.getMessage();
        this.code = CodeEnum.SUCCESS.getMessage();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
