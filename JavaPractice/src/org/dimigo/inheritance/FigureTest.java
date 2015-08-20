package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 20..
 */
public class FigureTest {
    public static void main(String args[])
    {
        Circle c = new Circle(5);
        Triangle t = new Triangle(10,10,5,8);
        Rectangle r = new Rectangle(20,20,5,8);

        System.out.println("원의 넓이 :"+String.format("%.1f",c.calcArea()));
        System.out.println("삼각형의 넓이 :" + String.format("%.1f", t.calcArea()));
        System.out.println("사각형의 넓이 :" + String.format("%.1f", r.calcArea()));

        c.printCenter();t.printCenter();r.printCenter();
        c.moveFigure(5,5);t.moveFigure(5,5);r.moveFigure(5,5);
        System.out.println("-- 중심좌표 이동 (x,y축 5칸씩)");
        c.printCenter();t.printCenter();r.printCenter();


    }
}
