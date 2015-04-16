package org.dimigo.oop;

/**
 * Created by codertimo on 2015. 4. 16..
 * org.dimigo.oop
 * <p>
 * 1. 개요 :
 * 2. 작성일 : ${date}
 *
 * @version : 1.0
 * @auther : JunseongKim
 */
public class CarTest2 {
    public static void main(String argv[])
    {
        Car genesis = new Car("현재자동차","제네시스","검정색",225,50000000);
        System.out.println("<자동차 목록>");
        System.out.println("제조사명 : "+genesis.getCompany());
        System.out.println("모델명 : "+genesis.getModel());
        System.out.println("색상 : "+genesis.getColor());
        System.out.println("최대속도 : "+genesis.getMaxSpeed());
        System.out.println("가격 : "+String.format("%,d",genesis.getPrice()));

        Car k7 = new Car("기아자동차","K7","흰색",246,40000000);
        System.out.println("<자동차 목록>");
        System.out.println("제조사명 : " + k7.getCompany());
        System.out.println("모델명 : " + k7.getModel());
        System.out.println("색상 : " + k7.getColor());
        System.out.println("최대속도 : " + k7.getMaxSpeed());
        System.out.println("가격 : "+String.format("%,d", k7.getPrice()));

        Car sm7 = new Car("삼성자동차","SM7","회색",200,38000000);
        System.out.println("<자동차 목록>");
        System.out.println("제조사명 : " + sm7.getCompany());
        System.out.println("모델명 : " + sm7.getModel());
        System.out.println("색상 : " + sm7.getColor());
        System.out.println("최대속도 : " + sm7.getMaxSpeed());
        System.out.println("가격 : "+String.format("%,d", sm7.getPrice()));
    }
}
