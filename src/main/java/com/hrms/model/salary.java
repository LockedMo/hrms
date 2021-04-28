package com.hrms.model;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:19
 */
public class salary {
    private String salId;
    private String level;
    private double money;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSalId() {
        return salId;
    }

    public void setSalId(String salId) {
        this.salId = salId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "salary{" +
                "salId='" + salId + '\'' +
                ", level=" + level +
                ", money=" + money +
                '}';
    }
}
