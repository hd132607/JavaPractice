package org.dimigo.oop;

/**
 * Created by codertimo on 2015. 4. 13..
 * org.dimigo.oop
 * <p>
 * 1. 개요 : Car 객체
 * 2. 작성일 : 2015/4/13
 *
 * @version : 1.0
 * @author  : JunseongKim
 */
public class Car {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;

    public Car(String company, String model, String color, int maxSpeed, int price){
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    public Car()
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
