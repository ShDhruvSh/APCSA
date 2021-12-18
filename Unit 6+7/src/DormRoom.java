/**
 * DormRoom
 * This class creates methods to analyze Dorm Rooms.
 * Authors: Dhruv Sharma
 * Date: 12/9/2019
 * On My Honor: DS
 **/


public class DormRoom
{
    private double myWidth;
    private double myLength;
    private String myName;
    private int maxOccupancy;
    private static final double occupantNeed = 72;


    //constructors

    public DormRoom() //default constructor that sets myWidth and myLength to the default of 10 and 15 respectively, and myName to the default "Room".
    {
        myWidth=10;
        myLength=15;
        myName="Room";
        maxOccupancy = calculateMaxOccupancy();
    }

    public DormRoom(double width, double length) //constructor that sets myWidth and myLength to length and width respectively, and name to the default "Room".
    {
        myWidth = width;
        myLength = length;
        myName = "Room";
        maxOccupancy = calculateMaxOccupancy();
    }

    public DormRoom(String room) //constructor that sets myWidth and myLength values to the default values of 10 and 15, and myName to the value stored in room.
    {
        myWidth = 10;
        myLength = 15;
        myName = room;
        maxOccupancy = calculateMaxOccupancy();
    }

    public DormRoom(double width, double length, String room) //constructor that sets myWidth and myLength to length and width respectively, and myName to the value stored in room.
    {
        myWidth = width;
        myLength = length;
        myName = room;
        maxOccupancy = calculateMaxOccupancy();
    }

    //mutators

    public void setWidth(double newWidth) //sets the width of the room to newWidth, leaving the length unchanged
    {
        myWidth = newWidth;
        maxOccupancy = calculateMaxOccupancy();
    }

    public void setLength(double newLength) //sets the length of the room to newLength, leaving the width unchanged
    {
        myLength = newLength;
        maxOccupancy = calculateMaxOccupancy();
    }

    public void setProportionalWidth(double newWidth) //sets the width of the room to newWidth, leaving the area unchanged (length is changed to compensate)
    {
        myLength = getArea()/newWidth;
        myWidth = newWidth;
    }

    public void setProportionalLength(double newLength) //sets the length of the room to newLength, leaving the area unchanged (width is changed to compensate)
    {
        myWidth = getArea()/newLength;
        myLength = newLength;
    }

    //accessors

    public double getWidth() // returns a double which is the value of myWidth
    {
        return myWidth;
    }

    public double getLength() // returns a double which is the value of myLength
    {
        return myLength;
    }

    public String getName() // returns a String which is the value of myName
    {
        return myName;
    }

    public double getArea() // returns a double which is the area of the Dorm Room
    {
        return myWidth*myLength;
    }

    public String toString() //returns a string which outputs all instance data
    {
        return "Width:" + myWidth + "; Length:" + myLength + "; Name of Dorm Room:" + myName;
    }

    public int getMaxOccupancy() //returns the current maximum occupancy
    {
        return calculateMaxOccupancy();
    }

    //private helper methods

    private int calculateMaxOccupancy() //returns the maximum occupancy this room can hold based on current length and width.
    {
        return (int)(getArea()/occupantNeed);
    }


}