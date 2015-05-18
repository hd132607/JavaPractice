package org.dimigo.basic;

/**
 * Created by Timo on 15. 3. 23..
 */
public class IfElse {
    public static void main(String argv[])
    {
        //0-6 유아기
        //7-12 아동기
        //13-15 사춘기
        //16-24 청년기

        int age = 18;

        if(age>=0 && age <=6)
            System.out.println("유아기");
        else if(age <13)
            System.out.println("아동기");
        else if(age <16)
            System.out.println("사춘기");
        else if(age <24)
            System.out.println("청년기");
        else
            System.out.println("성인입니다");

        int i=5;
        if(i>10)
            if(i<10)
                System.out.println("10보다 크로 100보다 작은 수");
        else
                System.out.println("10보다 작거나 같다");


    }
}
