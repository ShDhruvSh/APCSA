/**
 * ClockDriver
 * This program is a driver of the Clock class.
 * Authors: Dhruv Sharma
 * Date: 1/12/2020
 * On My Honor: DS
 **/

import java.util.*;

public class ClockDriver {
    public static void main(String[] args) {

        Clock c;

        Scanner s = new Scanner(System.in);

        System.out.print("Would you like the result printed in 12 or 24 hour time? ");

        int input = s.nextInt();

        //use Clock if regular clock or MilitaryClock if military clock
        if (input == 12)
        {
            c = new Clock();

        }
        else
        {
            c = new MilitaryClock();

        }
        System.out.println(c.getTime());

        c.setHour(2);
        c.setMin(27); //set hour min
        c.setAMPM(false);

        System.out.println(c.getTime()); //get time

    }
}
