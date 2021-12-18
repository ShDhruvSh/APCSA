/**
 * ActivitySelector
 * This program gives the user the option of converting Celsius to Fahrenheit or Fahrenheit to Celsius. Then, it gives
 * an activity that the user can do according to the temperature.
 * Authors: Dhruv Sharma
 * Date: 11/1/2019
 * On My Honor: DS
 **/

import java.util.*;
public class ActivitySelector {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temp;
        double degFar;

        //prompt user to input f or c
        System.out.println("Welcome to the Activity Selector! Would you like to enter a temperature in Fahrenheit or Celsius? Enter f or c: ");
        String cellOrFar = s.nextLine();

        //prompt user to input temperature
        System.out.println("Will you be indoors or outdoors? Enter i or o: ");
        String indOrOut = s.nextLine();


        //if the temperature is
        if (cellOrFar.equals("c"))
        {
            //prompt user to enter temperature in Celsius
            System.out.println("Please enter the temperature in Celsius: ");
            temp = s.nextInt();

            //convert Celsius to Fahrenheit
            degFar = (9.0/5.0)*temp + 32;
            System.out.print(temp + " degrees Celsius is " + degFar + " degrees Fahrenheit. ");
        }
        else if (cellOrFar.equals("f"))
        {
            //prompt user to enter temperature in Fahrenheit
            System.out.println("Please enter the temperature in Fahrenheit: ");
            temp = s.nextInt();

            degFar = temp;

            //convert Fahrenheit to Celsius
            System.out.print(temp + " degrees Fahrenheit is " + ((5.0/9.0)*(temp - 32))+ " degrees Celsius. ");
        }
        else //if user inputs something besides f or c in for the first question
        {
            degFar = 0;
            System.out.println("You did not enter the requirements correctly!");
            System.exit(0);
        }


        //telling the user what activity they should do according to the temperature outside
        if (degFar >= 85 && (!indOrOut.equals("i")))
        {
            System.out.println("You should go swimming today.");
        }
        else if ((degFar >= 70 && (!indOrOut.equals("i"))))
        {
            System.out.println("You should go play tennis today.");
        }
        else if ((degFar >= 32 && (!indOrOut.equals("i"))))
        {
            System.out.println("You should go play golf today.");
        }
        else if ((degFar >= 0 && (!indOrOut.equals("i"))))
        {
            System.out.println("You should go skiing today.");
        }
        else if ((degFar >= 32) || (indOrOut.equals("i"))) //telling user to go dancing if they are indoors or if they are indoors
        {
            System.out.println("You should go dancing today.");
        }

    }
}
