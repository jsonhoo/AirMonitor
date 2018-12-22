package com.air.monitor.bean;


public class HistoryRecord {
    private String time;
    private String tvoc;
    private String hcho;
    private String temp;
    private String rh;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTvoc() {
        return tvoc;
    }

    public void setTvoc(String tvoc) {
        this.tvoc = tvoc;
    }

    public String getHcho() {
        return hcho;
    }

    public void setHcho(String hcho) {
        this.hcho = hcho;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }
}
