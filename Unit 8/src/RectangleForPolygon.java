/**
 * RectangleForPolygon
 * This program is a sub class of the Polygon class that designs a Rectangle.
 * Authors: Dhruv Sharma
 * Date: 1/14/2020
 * On My Honor: DS
 **/

public class RectangleForPolygon extends Polygon {
    // java will write default constructor for us

    @Override
    public int getSides()
    {
        return 4;
    }

    @Override
    public int getPerimeter()
    {
        return (int)(Math.random()*10+1)*2 + (int)(Math.random()*10+1)*2;
    }
}
