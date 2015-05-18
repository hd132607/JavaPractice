package org.dimigo.basic;

/**
 * Created by Timo on 15. 3. 20..
 */
public class Operator {
    public static void main(String argv[])
    {
        int a= 9;
        int b= 10;

        double h_a = 5.8;
        double h_b = 5.4;

        double sum_a = (a+b)*h_a/2;
        double sum_b = a*h_b;
        System.out.println("사다리꼴의 넓이 :"+sum_a);
        System.out.println("평행사변형의 넓이: " + sum_b);
        System.out.println("사다리꼴이 평행사변형보다 " + (sum_a - sum_b) + "더 큽니다");
    }
}
