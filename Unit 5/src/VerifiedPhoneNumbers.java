/**
 * VerifiedPhoneNumbers
 * This program outputs if the inputted phone number's format is correct or not.
 * Authors: Dhruv Sharma
 * Date: 11/5/2019
 * On My Honor: DS
 **/

import java.util.Scanner;

public class VerifiedPhoneNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input;

        boolean isValidLength = false;
        boolean isValidSymbols =  false;
        boolean isValidNumber = false;
        boolean isValidAreaCode = false; //default setting to false so that while loop conditions are true so that it can be entered


        while (!(isValidLength && isValidSymbols && isValidNumber && isValidAreaCode))
        {
            System.out.print("Please enter your phone number in the form (123)123-1234 : ");
            input = s.nextLine();

            isValidLength = input.length() == 13;
            if(isValidLength){ //do following code only if isValidLength is true
            isValidSymbols =  input.charAt(0) == '(' && input.charAt(4) == ')' && input.charAt(8) == '-'; //correct format
            isValidNumber = true; //default to true
            isValidAreaCode = input.charAt(1) < '8'; //area code must be less that 800


            for(int i=1;i<input.length();i++)
            {
                if (i!= 4 && i!= 8 && (input.charAt(i) < '0' || input.charAt(i) > '9')) //number must have only numbers (excluding dashes and parenthesis)
                {
                    isValidNumber = false;
                    i = 100; //get out of while loop
                }

            }
            if(!(isValidLength && isValidSymbols && isValidNumber && isValidAreaCode))System.out.println("Invalid entry."); //if any false, output invalid input
        }
        else
            {
                System.out.println("Invalid entry."); //if length is incorrect
            }

        }

        System.out.println("Thanks you for your cooperation.");

    }

}
