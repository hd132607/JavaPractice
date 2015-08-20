package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 20..
 */
public class Triangle extends Figure{
    private int height;
    private int width;

    public Triangle(int width, int height)
    {
        super(0,0);
        this.width = width;
        this.height = height;
    }
    public Triangle(int centerX, int centerY, int width, int height)
    {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }
    protected double calcArea()
    {
        return width*height/2;
    }
}
