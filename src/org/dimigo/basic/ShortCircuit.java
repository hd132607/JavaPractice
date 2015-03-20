package org.dimigo.basic;

/**
 * Created by Timo on 15. 3. 20..
 */
public class ShortCircuit {
    public static void main(String argv[])
    {
        String school = "디미고";
        int grade = 2;
        int ban = 6;
        String name = "김자바";

        System.out.println(school+grade+ban+name);
        System.out.println(grade+ban+school+name);

        System.out.println(""+grade+ban+school+name);
    }
}
