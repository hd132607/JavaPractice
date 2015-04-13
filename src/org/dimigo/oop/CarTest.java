package org.dimigo.oop;

/**
 * Created by codertimo on 2015. 4. 13..
 */
public class CarTest {
    public static void main(String argv[])
    {
        Car genesis = new Car();
        genesis.setCompany("현대자동차");
        genesis.setColor("검정색");
        genesis.setMaxSpeed(225);
        genesis.setModel("제네시스");
        genesis.setPrice(50000000);
        System.out.println("<자동차 목록>");
        System.out.println("제조사명 : "+genesis.getCompany());
        System.out.println("모델명 : "+genesis.getModel());
        System.out.println("색상 : "+genesis.getColor());
        System.out.println("최대속도 : "+genesis.getMaxSpeed());
        System.out.println("가격 : "+String.format("%,d",genesis.getPrice()));

        Car k7 = new Car();
        k7.setCompany("기아자동차");
        k7.setColor("흰색");
        k7.setMaxSpeed(246);
        k7.setModel("K7");
        k7.setPrice(400000000);
        System.out.println("<자동차 목록>");
        System.out.println("제조사명 : " + k7.getCompany());
        System.out.println("모델명 : " + k7.getModel());
        System.out.println("색상 : " + k7.getColor());
        System.out.println("최대속도 : " + k7.getMaxSpeed());
        System.out.println("가격 : "+String.format("%,d", k7.getPrice()));

        Car sm7 = new Car();
        sm7.setCompany("삼성자동차");
        sm7.setColor("회색");
        sm7.setMaxSpeed(200);
        sm7.setModel("SM7");
        sm7.setPrice(38000000);
        System.out.println("<자동차 목록>");
        System.out.println("제조사명 : " + sm7.getCompany());
        System.out.println("모델명 : " + sm7.getModel());
        System.out.println("색상 : " + sm7.getColor());
        System.out.println("최대속도 : " + sm7.getMaxSpeed());
        System.out.println("가격 : "+String.format("%,d", sm7.getPrice()));
    }


}
