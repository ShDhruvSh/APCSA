/**
 * Pentagon
 * This program is a sub class of the Polygon class that designs a Pentagon.
 * Authors: Dhruv Sharma
 * Date: 1/14/2020
 * On My Honor: DS
 **/

public class Pentagon extends Polygon {
    // java will write default constructor for us

    @Override
    public int getSides()
    {
        return 5;
    }

    @Override
    public int getPerimeter()
    {
        return (int)(Math.random()*10+1) + (int)(Math.random()*10+1) + (int)(Math.random()*10+1) + (int)(Math.random()*10+1) + (int)(Math.random()*10+1);
    }
}
