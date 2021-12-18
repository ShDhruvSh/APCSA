/**
 * DiceProbability
 * This program explores declaring, constructing and accessing arrays using histograms.
 * Authors: Dhruv Sharma
 * Date: 2/10/2020
 * On My Honor: DS
 **/

import java.util.*;

public class DiceProbability {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int[] sumCount = new int[11]; //array with 11 spaces
        int r1, r2; //both dice
        int sum; //sum of both dice
        int numChosen;
        int optionChosen;
        for(int i = 0; i < 11; i++) //initialize all values of array to 0
        {
            sumCount[i] = 0;
        }

        System.out.print("How many times do you want to roll the dice? ");
        numChosen = s.nextInt();

        if (numChosen > 0)
        {

            for (int i = 0; i < numChosen; i++) //roll the dices numChosen times and increment the value of the corresponding index according to the rolled value
            {
                r1 = r.nextInt(6) + 1;
                r2 = r.nextInt(6) + 1;
                sum = r1 + r2;
                sumCount[sum - 2]++;
            }

            System.out.print("Input the number you want to know the percentage of times rolled, or input 0 to quit. ");
            optionChosen = s.nextInt();

            while (optionChosen > 1 && optionChosen < 13) //only loop if optionChosen is from 2 to 12
            {
                System.out.println(((sumCount[optionChosen - 2] * 1.0 / numChosen) * 100.0) + "%");
                System.out.print("Input the number you want to know the percentage of times rolled, or input 0 to quit. ");
                optionChosen = s.nextInt();

            }
        }
    }
}
