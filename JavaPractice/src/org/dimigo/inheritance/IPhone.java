package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 28..
 */
public class IPhone extends SmartPhone {


    public IPhone(String model, String company, int price) {
        super(model, company, price);
    }

    public IPhone() {
    }


    public void pay() {
        System.out.println("Apple pay로 결재합니다.");
    }
    public void useAirDrop()
    {
        System.out.println("AirDrop 기능을 사용합니다.");
    }
}
