package com.example.demo.web;

public enum CodeEnum {

    SUCCESS("100","处理成功"),
    FAIL("500","必填项未填写");

    private String code;
    private String message;

    CodeEnum(String code, String message){

        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
