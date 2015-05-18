package org.dimigo.basic;

/**
 * Created by Timo on 15. 3. 19..
 */
public class Promotion {
    public static void main(String argv[])
    {
        long month_pay = 1700000L;
        int employ = 3;
        int shop_count = 1500;
        long year_pay = month_pay * 12 * shop_count * employ;

       System.out.println(String.format("%,d",year_pay));


    }
}
