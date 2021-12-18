/**
 * LockerCombination
 * This program outputs one set of random locker combinations for 5 years.
 * Authors: Dhruv Sharma
 * Date: 9/17/2019
 * On My Honor: DS
 **/

import java.util.Random;

public class LockerCombination {
    public static void main(String[] args) {

        Random x = new Random();

        //Year A
        System.out.print(x.nextInt(50)); //print number from 0-49
        System.out.print('-'); //print dash
        System.out.print(x.nextInt(10)); //print number from 0-9
        System.out.print('-');
        System.out.println(x.nextInt(50));

        //Year B
        System.out.print(x.nextInt(50));
        System.out.print('-');
        System.out.print(x.nextInt(10)+10);
        System.out.print('-');
        System.out.println(x.nextInt(50));

        //Year C
        System.out.print(x.nextInt(50));
        System.out.print('-');
        System.out.print(x.nextInt(10)+20);
        System.out.print('-');
        System.out.println(x.nextInt(50));

        //Year D
        System.out.print(x.nextInt(50));
        System.out.print('-');
        System.out.print(x.nextInt(10)+30);
        System.out.print('-');
        System.out.println(x.nextInt(50));

        //Year E
        System.out.print(x.nextInt(50));
        System.out.print('-');
        System.out.print(x.nextInt(10)+40);
        System.out.print('-');
        System.out.println(x.nextInt(50));

    }
}

