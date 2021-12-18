/**
 * AddressBox
 * This program breaks up a String object into a series of smaller strings called "tokens."
 * Authors: Dhruv Sharma
 * Date: 12/2/2019
 * On My Honor: DS
 **/

import java.util.*;

public class AddressLabels {
    public static void main(String[] args) {
        int i; //for loop counter
        int j = 0; //while space loop counter
        String output; //string containing part of input and spaces

        Scanner s = new Scanner(System.in);

        System.out.print("Please enter your address all on one line. Delineate lines by using the '?' character. ");
        String input = s.nextLine();

        StringTokenizer st = new StringTokenizer(input, "?");

        System.out.print("**************************************** \n" +
                "*                                      * \n");
        for(i=0; i < 3; i++) //prints 3 separate lines
        {
            System.out.print("*  ");
            output = st.nextToken();

            while(j<36) //making sure that asterisk align by printing appropriate number of spaces
            {
                output += " ";
                j = output.length();
            }
            System.out.println(output + "*");
            j = 0; //setting counter of while loop for spaces to 0
        }

        System.out.print("*                                      * \n" +
                "****************************************\n");

    }
}
