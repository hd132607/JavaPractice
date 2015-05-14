package org.dimigo.oop;

/**
 * Created by codertimo on 2015. 4. 17..
 * org.dimigo.oop
 * <p>
 * 1. 개요 :
 * 2. 작성일 : ${date}
 *
 * @version : 1.0
 * @auther : JunseongKim
 */
public class Car2 {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;

    public Car2(String newcompany, String newmodel, String newcolor, int newmaxSpeed, int newprice){
        company = newcompany;
        model = newmodel;
        color = newcolor;
        maxSpeed = newmaxSpeed;
        price = newprice;
    }
    public Car2()
    {
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }
}
