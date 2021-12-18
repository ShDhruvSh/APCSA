/**
 * CharacterBox
 * This program prints lines of *1234567890* after the user's input.
 * Authors: Dhruv Sharma
 * Date: 11/19/2019
 * On My Honor: DS
 **/

import java.util.*;

public class CharacterBox {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("The following is being executed by while loops:");

        System.out.print("Please enter the number of rows you desire. ");
        int numLines = s.nextInt();

        System.out.print("Please enter your input: ");
        s.nextLine();
        String input = s.nextLine();
        String bigStr = input;
        int numLineCounter; //counter used in for and while loops

        if (numLines == 1) //one row only
        {
            System.out.println("************");
        }
        else if (numLines == 2) //two rows only
        {
            System.out.println("************");
            System.out.println("************");
        }
        else if (numLines > 2) //more than 2 rows
        {
            numLineCounter = numLines-2;
            System.out.println("************");
            while (numLineCounter > 0)
            {
                bigStr += "0123456789"; //big string will contain characters necessary for output (and maybe more)
                numLineCounter--;
            }
            numLineCounter = numLines-2; //number of lines besides asterisks lines

            int i = 0;
            while (numLineCounter > 0)
            {
                System.out.print("*");
                System.out.print(bigStr.substring(i,i+10)); //substringing the 10 characters for current line
                System.out.println("*");

                i += 10; //next substring will be that of next ten characters
                numLineCounter--; //reduce while loop counter by one
            }
            System.out.println("************");
            System.out.println();
        }




        System.out.println("The following is being executed by for loops:");
        System.out.print("Please enter the number of rows you desire. ");
        numLines = s.nextInt();

        System.out.print("Please enter your input: ");
        s.nextLine();
        input = s.nextLine();
        bigStr = input;

        if (numLines == 1)
        {
            System.out.println("************");
        }
        else if (numLines == 2)
        {
            System.out.println("************");
            System.out.println("************");
        }
        else if (numLines > 2)
        {
            System.out.println("************");
            for (numLineCounter = numLines-2; numLineCounter > 0; numLineCounter--)
            {
                bigStr += "0123456789";
            }

            int i = 0;
            for (numLineCounter = numLines-2; numLineCounter > 0; numLineCounter--)
            {
                System.out.print("*");
                System.out.print(bigStr.substring(i,i+10));
                System.out.println("*");

                i += 10;
            }
            System.out.println("************");
        }
    }
}