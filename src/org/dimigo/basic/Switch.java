package org.dimigo.basic;

/**
 * Created by Timo on 15. 3. 23..
 */
public class Switch {
    public static void main(String argv[])
    {
        String season = "봄";

        switch (season)
        {
            case "봄":
                System.out.println("따듯하네요");
                break;
            case "여름":
                System.out.println("덥네요");
                break;
            case "가을":
                System.out.println("서늘하네요");
                break;
            case "겨울":
                System.out.println("춥네요");
                break;
            default:
                System.out.println("무슨 날씨지??");

        }
    }
}
