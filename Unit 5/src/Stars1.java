/**
 * Stars1
 * This program makes a right triangle made out of an inputted character.
 * Authors: Dhruv Sharma
 * Date: 11/21/2019
 * On My Honor: DS
 **/
import java.util.*;

public class Stars1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int width; //length and width of picture
        String chosenString; //string with char
        char chosenChar;
        int i,j; //loop counters

        System.out.print("Please enter the width of the picture: ");
        width = s.nextInt();

        s.nextLine(); //move next statement to next line

        System.out.print("Please enter the character to use: ");
        chosenString = s.nextLine();

        if (chosenString.length()>=1)
        {
            chosenChar = chosenString.charAt(0);
        }
        else
        {
            chosenChar = '*';
        }

        for (i = 1; i <= width; i++) //number of lines of characters
        {
            for (j = 1; j <= i; j++) //number of characters per line
            {
                System.out.print(chosenChar + " ");
            }
            System.out.println();
        }

    }
}
