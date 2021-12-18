/**
 * RoomCalculator
 * This program creates an application that reads in from the user the length and width and name of a DormRoom, creates that new DormRoom, and prints out the object created and the specs of the new dorm room.
 * Authors: Dhruv Sharma
 * Date: 12/9/2019
 * On My Honor: DS
 **/

import java.util.*;

public class RoomCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DormRoom d;


        System.out.print("Enter a name, or hit return to use default name \"Room\": ");
        String roomName = s.nextLine();

        System.out.print("Would you like to use default dimension of 10 and 15? (y/n): ");
        String defaultDim = s.nextLine(); //yes or no


        if (roomName.equals("")) //blank
        {
            if (defaultDim.equals("y")) //blank and yes
            {
                d = new DormRoom();
            }
            else //blank and no
            {
                System.out.print("Enter a width: ");
                double width = s.nextInt();
                s.nextLine();
                System.out.print("Enter a length: ");
                double length = s.nextInt();

                d = new DormRoom(width, length);
            }
        }
        else //not blank
        {
            if (defaultDim.equals("y")) //not blank and yes
            {
                d = new DormRoom(roomName);
            }
            else //not blank and no
            {
                System.out.print("Enter a width: ");
                double width = s.nextInt();
                s.nextLine();
                System.out.print("Enter a length: ");
                double length = s.nextInt();

                d = new DormRoom(width, length, roomName);
            }
        }

        System.out.println(d.getName()+ ": Width " + d.getWidth() + " Length " + d.getLength());
        System.out.println(d.getName()+ " Width: " + d.getWidth() + " Length: " + d.getLength() + " Area: " + d.getArea());



    }
}
