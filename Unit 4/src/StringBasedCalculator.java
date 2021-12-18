/**
 * StringBasedCalculator
 * This program solves an inputted arithmetic statement.
 * Authors: Dhruv Sharma
 * Date: 11/8/2019
 * On My Honor: DS
 **/

import java.util.*;

public class StringBasedCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter math problem with two numbers separated by spaces:");
        String input = s.nextLine();

        int x = input.charAt(0) - '0'; //1st character is x
        int y = input.charAt(4) - '0'; //5th character is y


        char operation = input.charAt(2);

        if (operation == '+')
        {
            System.out.print(input + " = " + (x + y)); //addition
        }

        if (operation == '-')
        {
            System.out.print(input + " = " + (x - y)); //subtraction
        }

        if (operation == '*')
        {
            System.out.print(input + " = " + (x * y));  //multiplication
        }

        if (operation == '/' && y != 0)
        {
            System.out.print(input + " = " + (1.0*x/y)); //division
        }
        else if (y == 0 && operation == '/')
        {
            System.out.println("Invalid Operation");
        }

    }
}
