package org.dimigo.basic;

/**
 * Created by Timo on 15. 3. 19..
 */
public class ArithmeticOperation {
    public static void main(String argv[])
    {
        int a = 5,b=2;
        double result = (double) a/b;
        System.out.println(result);
     //    result = a/0;

        // 다른 타입간의 연산
        double d = 3.14;
        int i = 10;

        int r = (int)(d + i);
        double r1 = d+i;
        System.out.println(r);
        System.out.println(r1);

        short s1 = 1, s2 = 2;
        short r2 = (short)(s1 + s2);
        int r3 = s1 + s2;

        System.out.println(r2);
        System.out.println(r3);
    }
}
