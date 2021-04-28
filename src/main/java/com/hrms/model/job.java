package com.hrms.model;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:18
 */
public class job{
    private String jobId;
    private String secId;
    private String jname;
    int num;
    private String ename;


    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }



    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "job{" +
                "jobId='" + jobId + '\'' +
                ", secId='" + secId + '\'' +
                ", jname='" + jname + '\'' +
                ", num=" + num +
                '}';
    }
}
