package com.hrms.model;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:18
 */
public class section extends staff{
    private String secId;
    private String ename;
    private int num;
    private String charge;

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

    @Override
    public String toString() {
        return "section{" +
                "secId='" + secId + '\'' +
                ", ename='" + ename + '\'' +
                ", num=" + num +
                ", charge='" + charge + '\'' +
                '}';
    }
}
