package com.hrms.model;

/**
 * @author mzc
 * @version 1.0
 * @date 2021/4/12 12:19
 */
public class attendance extends staff{
    private String attId;
    private String staId;
    private String reason;
    private String time;
    private String deal;

    public String getAttId() {
        return attId;
    }

    public void setAttId(String attId) {
        this.attId = attId;
    }

    public String getStaId() {
        return staId;
    }

    public void setStaId(String staId) {
        this.staId = staId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }
    @Override
    public String toString() {
        return "attendance{" +
                "attId='" + attId + '\'' +
                ", staId='" + staId + '\'' +
                ", reason='" + reason + '\'' +
                ", time='" + time + '\'' +
                ", deal='" + deal + '\'' +
                '}';
    }


}
