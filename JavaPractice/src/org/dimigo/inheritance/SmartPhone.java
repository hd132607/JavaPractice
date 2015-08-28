package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 28..
 */
public class SmartPhone {

    private String model;
    private String company;
    private int price;

    public SmartPhone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public SmartPhone() {
    }

    public void turnOn(){
        System.out.println(this.model + "의 전원을 켭니다");
    }
    public void turnOff(){
        System.out.println(this.model +"의 전원을 끕니다");
    }
    public void pay(){
        if(this instanceof IPhone)
        {
            IPhone iPhone = (IPhone)this;
            iPhone.pay();
        }
        else if(this instanceof Galaxy)
        {
            Galaxy galaxy = (Galaxy)this;
            galaxy.pay();
        }
    }
    public void useSpecialFunction(){
        if(this instanceof IPhone)
        {
            IPhone iPhone = (IPhone)this;
            iPhone.useAirDrop();
        }
        else if (this instanceof Galaxy)
        {
            Galaxy galaxy = (Galaxy)this;
            galaxy.useWirelessCharging();
        }
    }
    public String toString() {
        return "모델명 : " + this.model + " 제조사 : " + this.company + "가격 : " + this.price + "원";
    }
}
