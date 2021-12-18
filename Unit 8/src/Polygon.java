/**
 * Polygon
 * This program designs the Polygon class.
 * Authors: Dhruv Sharma
 * Date: 1/14/2020
 * On My Honor: DS
 **/

public class Polygon {
    int perimeter;


    // default constructor
    // makes a polygon with 3 sides
    // sets the side lengths to random numbers between 1 and 10
    public Polygon()
    {
        perimeter = (int)(Math.random()*10+1) + (int)(Math.random()*10+1) + (int)(Math.random()*10+1); //[0.0, 1.0]
    }

    // returns the number of sides of the polygon
    public int getSides()
    {
        return 3;
    }

    // returns the perimeter of the polygon
    public int getPerimeter()
    {
        return perimeter;
    }

    // compares two polygons to see if they have the same number of sides
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Polygon)
        {
            return ((Polygon)obj).getSides() == this.getSides();
        }
        else
        {
            return super.equals(obj);
        }
    }

    @Override
    public String toString()
    {
        return (this.getClass() + "").substring(6) + ":" + super.toString() + " Sides: " + getSides() + " Perimeter: " + getPerimeter();
    }

}
