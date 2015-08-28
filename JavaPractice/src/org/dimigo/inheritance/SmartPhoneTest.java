package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 28..
 */
public class SmartPhoneTest {
    public static void main(String[] args)
    {
        SmartPhone[] phones = {
            new IPhone("iphone 6","apple",700000),
            new Galaxy("galaxy 7","samsung",80000)
    };

        for(SmartPhone sm : phones)
        {
            System.out.println(sm.toString());
            sm.turnOn();
            sm.pay();

            sm.useSpecialFunction();

            sm.turnOff();
            System.out.println();
        }
    }
}
