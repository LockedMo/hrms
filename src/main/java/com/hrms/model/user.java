package com.hrms.model;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/9 16:18
 */
public class user {
    private String userId;
    private String name;
    private String pwd;
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "user{" +
                "userId='" + userId + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
