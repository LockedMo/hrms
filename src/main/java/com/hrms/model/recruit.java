package com.hrms.model;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:19
 */
public class recruit {
    private String recId;
    private String jobId;
    private int num;
    private String salId;
    private String eduBG;
    private String comment;
    private String jname;
    private double money;

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

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

    public String getEduBG() {
        return eduBG;
    }

    public void setEduBG(String eduBG) {
        this.eduBG = eduBG;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "recruit{" +
                "recId='" + recId + '\'' +
                ", jobId='" + jobId + '\'' +
                ", num=" + num +
                ", salId='" + salId + '\'' +
                ", eduBG='" + eduBG + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }
}
