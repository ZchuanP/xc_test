package com.example.demo.web.entity;

public class TestReqDto {
    /**
     * 名字
     */
    private String name;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 年龄
     */
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
