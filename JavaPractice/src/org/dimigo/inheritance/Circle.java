package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 20..
 */
public class Circle extends Figure{
    private int radius;

    public Circle(int radius)
    {
        super(0,0);
        this.radius = radius;
    }
    public Circle(int centerX, int centerY, int radius)
    {
        super(centerX,centerY);
        this.radius =radius;
    }
    protected double calcArea()
    {
        return radius*radius*Math.PI;
    }
    protected void printcenter()
    {
        super.printCenter();
    }
}
