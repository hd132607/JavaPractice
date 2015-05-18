package org.dimigo.oop;

/**
 * Created by codertimo on 15. 5. 18..
 */
public class Snack {
    private String name;
    private String company;
    private int price;
    private int number;

    public Snack()
    {}

    public Snack(String name, String company, int price, int number)
    {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printSnack()
    {
        System.out.println("이름 :"+name);
        System.out.println("제조사 :" + company);
        System.out.println("가격 :"+String.format("%,d",price));
        System.out.println("갯수 :"+number+"개\n");
    }

    public int calPrice()
    {
        return price*number;
    }
}
