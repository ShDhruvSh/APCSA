/**
 * GoldenRectangle
 * This program is a sub class of the Rectangle class.
 * Authors: Dhruv Sharma
 * Date: 1/9/2020
 * On My Honor: DS
 **/

public class GoldenRectangle extends Rectangle {

    public static final double RATIO = (1 + Math.sqrt(5))/2.0;

    //default constructor
    //sets the (x,y) location to (0,0), the height to 100,
    //and the width to an appropriate value so that the
    //rectangle is golden.
    public GoldenRectangle()
    {
        super(0,0,100,(int)(100*RATIO));
    }

    //second constructor
    //sets the location to (x,y)
    //the orientation can be either 'W' for Wide or 'L' for Long
    //set the width and height to the appropriate values so that the
    //rectangle is Golden and in the right orientation
    public GoldenRectangle(int x, int y, int shortSide, char orientation)
    {
        setLocation(x,y);
        if(orientation == 'W')
        {
            setSize(shortSide, (int)(shortSide*RATIO));
        }
        else
        {
            setSize((int)(shortSide*RATIO), shortSide);
        }
    }

    //returns a NEW GoldenRectangle (without changing the original one).
    //this new golden rectangle will be the rectangle that results from //partitioning the original golden rectangle into a square and a
    //rectangle. (See diagram below)
    public GoldenRectangle getNextGoldenRectangle()
    {
        int w = getWidth();
        int h = getHeight();

        if (w > h) //short side is height/ratio, orientation is L
        {
            return new GoldenRectangle(getX(), getY(), (int)(h/RATIO), 'L');
        }
        else //short side width/ratio, orientation is now W
        {
            return new GoldenRectangle(getX(), getY(), (int) (w/RATIO), 'W');
        }
    }





}
