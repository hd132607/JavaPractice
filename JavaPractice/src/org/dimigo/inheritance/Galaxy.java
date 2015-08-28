package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 28..
 */
public class Galaxy extends SmartPhone  {
    public Galaxy(String model, String company, int price) {
        super(model, company, price);
    }

    public Galaxy() {
    }

    public void pay()
    {
        System.out.println("삼성페이로 결재합니다.");
    }
    public void useWirelessCharging()
    {
        System.out.println("무선 충전 기능을 이용합니다.");
    }
}
