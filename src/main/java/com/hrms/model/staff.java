package com.hrms.model;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:18
 */
public class staff extends staffFather{
    private String staId;
    private String tname;
    private String sex;
    private String phoneNumber;
    private String address;
    private String secId;
    private String salId;
    private String jobId;
    private String comment;
    public String getStaId() {
        return staId;
    }

    public void setStaId(String staId) {
        this.staId = staId;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public String getSalId() {
        return salId;
    }

    public void setSalId(String salId) {
        this.salId = salId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "staff{" +
                "staId='" + staId + '\'' +
                ", tname='" + tname + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", secId='" + secId + '\'' +
                ", salId='" + salId + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}
