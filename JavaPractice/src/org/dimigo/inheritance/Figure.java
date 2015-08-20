package org.dimigo.inheritance;

/**
 * Created by codertimo on 15. 8. 20..
 */
public class Figure {

    private int centerX;
    private int centerY;

    public Figure(int centerX, int centerY)
    {
        this.centerX = centerX;
        this.centerY = centerY;
    }
    protected double calcArea()
    {
        return 0.0;
    }
}
