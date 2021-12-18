/**
 * PointGuess
 * This program allows the user to input a min and max point. It picks between the min and max and asks the user to
 * input a guess point value. The program checks it the inputted value is correct or not. It then outputs the distance
 * between the points.
 * Authors: Dhruv Sharma
 * Date: 9/21/2019
 * On My Honor: DS
 **/

import java.util.Random;
import java.util.Scanner;
import java.awt.*;

public class PointGuess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Min:");
        int min = s.nextInt(); //prompt user to input min
        System.out.print("Max:");
        int max = s.nextInt(); //prompt user to input max

        Random r = new Random();
        int realX = r.nextInt(max-min+1)+min; //random number between or including min and max for x-coordinate of real point
        int realY = r.nextInt(max-min+1)+min; //random number between or including min and max for y-coordinate of real point
        Point realPoint = new Point(realX,realY);


        System.out.print("Guess: ");
        System.out.print("x:");
        int guessX = s.nextInt(); //prompt user to input guess for x-value of point
        System.out.print("y:");
        int guessY = s.nextInt(); //prompt user to input guess for y-value of point
        Point guess = new Point(guessX,guessY);

        System.out.println(guess.equals(realPoint)); //output if user is correct or not
        System.out.println("Ans:"+realX+","+realY); //displays real point
        System.out.print(guess.distance(realPoint)); //display real distance




    }
}
