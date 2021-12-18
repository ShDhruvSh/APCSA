/**
 * PermutationDriver
 * This program is a driver for the PermutationGenerator class.
 * Authors: Dhruv Sharma
 * Date: 3/7/2020
 * On My Honor: DS
 **/

import java.util.*;

public class PermutationDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many permutations would you like to see? ");
        int userRuns = s.nextInt();
        PermutationGenerator p = new PermutationGenerator();

        for(int i = 0; i < userRuns; i++) //generates number of permutations according to user input
        {
            System.out.print("\n[");
            ArrayList<String> generatedPermttn = p.generatePermutation();
            for (int j = 0; j < 10; j++) //prints contents of generatedPermttn
            {
                System.out.print(generatedPermttn.get(j));
                if (j != 9)
                {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
        }
    }
}
