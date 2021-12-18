/**
 * Guess
 * This program allows the user to input a min and max number. It picks between the min and max and asks the user to
 * input a guess value. The program checks it the inputted value is correct or not.
 * Authors: Dhruv Sharma
 * Date: 9/21/2019
 * On My Honor: DS
 **/

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Min:");
        int min = s.nextInt(); //prompt user to input min
        System.out.print("Max:");
        int max = s.nextInt(); //prompt user to input max

        Random r = new Random();
        int realNum = r.nextInt(max-min+1)+min; //random number between or including min and max

        System.out.print("Guess:");
        int guess = s.nextInt(); //prompt user to input guess
        System.out.println(realNum == guess); //output if user is correct or not
        System.out.print("Ans:" + realNum); //display real number




    }
}
