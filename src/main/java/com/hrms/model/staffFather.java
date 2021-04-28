package com.hrms.model;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/20 14:20
 */
public class staffFather extends job{
    private String secId;
    private String ename;
    private int num;
    private String charge;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    private String salId;
    private String level;
    private double money;

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


}
