package project.bean;

import java.util.Date;

public class Movie {
    private String name;
    private String actor;
    private double scores;
    private double time;
    private int saleTicket; //票价
    private int lastTicket; //余票
    private Date startTime; //开始时间

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getSaleTicket() {
        return saleTicket;
    }

    public void setSaleTicket(int saleTicket) {
        this.saleTicket = saleTicket;
    }

    public int getLastTicket() {
        return lastTicket;
    }

    public void setLastTicket(int lastTicket) {
        this.lastTicket = lastTicket;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Movie() {
    }

    public Movie(String name, String actor, double time, int saleTicket, int lastTicket, Date startTime) {
        this.name = name;
        this.actor = actor;
        this.time = time;
        this.saleTicket = saleTicket;
        this.lastTicket = lastTicket;
        this.startTime = startTime;
    }
}
