/**
 * CompoundWords
 * This program takes two words from a dictionary, turns them into a compound word, and outputs the length of the
 * compound word.
 * Authors: Dhruv Sharma
 * Date: 10/4/2019
 * On My Honor: DS
 **/
import java.util.*;

public class CompoundWords {
    public static void main(String[] args) {
        String s1; //declare strings for the first word
        String s2; //declare strings for the second word

        Dictionary r = new Dictionary(); //creating a new "Dictionary" constructor
        s1 = r.randomWord(); //first random word
        s2 = r.randomWord(); //second random word

        int totLength = s1.length()+s2.length()+1; //the length of the compound word
        System.out.print(s1+"-"+s2+" Wow! That word is "+totLength+" characters long!"); //print compound word and length


    }
}
