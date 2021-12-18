/**
 * Square
 * This program is a sub class of the Polygon class that designs a Square.
 * Authors: Dhruv Sharma
 * Date: 1/14/2020
 * On My Honor: DS
 **/

public class Square extends RectangleForPolygon {
    // java will write default constructor for us

    @Override
    public int getPerimeter()
    {
        return (int)(Math.random()*10+1)*4;
    }
}
