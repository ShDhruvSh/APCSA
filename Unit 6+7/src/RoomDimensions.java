/**
 * RoomDimensions
 * This program allows the user to change and view the Dorm Room's dimensions.
 * Authors: Dhruv Sharma
 * Date: 12/9/2019
 * On My Honor: DS
 **/

import java.util.*;

public class RoomDimensions {
    public static void main(String[] args) {
        DormRoom d = new DormRoom();
        Scanner s = new Scanner(System.in);
        int inputNum = 1;


        while(inputNum!=6)
        {
            System.out.println("Select an Option: \n" +
                    "-------------------------- \n" +
                    "1. Set Width \n" +
                    "2. Set Length \n" +
                    "3. Set Proportional Width \n" +
                    "4. Set Proportional Length \n" +
                    "5. Print Room Dimensions \n" +
                    "6. Quit\n" +
                    " -------------------------- ");
            inputNum = s.nextInt();
            s.nextLine();

            if (inputNum == 1) //change width
            {
                System.out.println("Enter a Width: ");
                int width = s.nextInt();
                s.nextLine();
                d.setWidth(width);
            }

            else if (inputNum == 2) //change length
            {
                System.out.println("Enter a Length: ");
                int length = s.nextInt();
                s.nextLine();
                d.setLength(length);
            }

            else if (inputNum == 3) //change width without changing area
            {
                System.out.println("Enter a Width (Area will be held constant):");
                int width = s.nextInt();
                s.nextLine();
                d.setProportionalWidth(width);
            }

            else if (inputNum == 4) //change length without changing area
            {
                System.out.println("Enter a Length (Area will be held constant):");
                int length = s.nextInt();
                s.nextLine();
                d.setProportionalLength(length);
            }

            else if (inputNum == 5) //print dimensions
            {
                System.out.println("Room Dimensions: width=" + d.getWidth() + " length=" + d.getLength());
            }

            else if (inputNum == 6); //quit without saying anything

            else //prompt user for a valid input and continue while loop
            {
                System.out.println("Please enter a valid option");
            }
        }


    }
}
