/**
 * PermutationGenerator
 * This program defines a PermutationGenerator.
 * Authors: Dhruv Sharma
 * Date: 3/7/2020
 * On My Honor: DS
 **/

import java.util.*;

public class PermutationGenerator {
    private ArrayList <String> sortedArr;
    private ArrayList <String> permttnArr;
    private Random r;

    public PermutationGenerator() //initializes instance data
    {
        r = new Random();
        sortedArr = new ArrayList <String>();
        permttnArr = new ArrayList <String>();
    }

    public ArrayList <String> generatePermutation() //generates random permutation of letters A-J
    {
        for(int i = 0; i < permttnArr.size(); i++) //delete all elements in permttnArr
        {
            permttnArr.remove(i);
        }

        sortedArr.add("A");
        sortedArr.add("B");
        sortedArr.add("C");
        sortedArr.add("D");
        sortedArr.add("E");
        sortedArr.add("F");
        sortedArr.add("G");
        sortedArr.add("H");
        sortedArr.add("I");
        sortedArr.add("J");

        int randVal;
        for(int i = 0; i < 10; i++) //filling permttnArr with a random permutation
        {
            randVal = r.nextInt(10-i);
            permttnArr.add(sortedArr.get(randVal));
            sortedArr.remove(randVal);
        }
        return permttnArr;
    }
}
