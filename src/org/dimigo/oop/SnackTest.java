package org.dimigo.oop;

import java.util.ArrayList;

/**
 * Created by codertimo on 15. 5. 18..
 */
public class SnackTest {
    public static void main(String args[])
    {
        Snack snacks[];
        int totalPrice=0;
        snacks = new Snack[3];
        snacks[0] = new Snack("새우깡", "농심", 1100, 2);
        snacks[1] = new Snack("곤칲", "크라운", 1200, 1);
        snacks[2] = new Snack("허니버터칩", "농심", 1500, 4);

        for(Snack snack : snacks)
        {
            totalPrice += snack.calPrice();
            snack.printSnack();

        }
        System.out.println(String.format("총 구매 금액 :%,d원",totalPrice));

    }
}
