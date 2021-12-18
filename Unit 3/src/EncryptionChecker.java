/**
 * EncryptionChecker
 * This program allows the user to input a string, encrypt the string, and check and output if the encryption was correct.
 * Authors: Dhruv Sharma
 * Date: 10/27/2019
 * On My Honor: DS
 **/

import java.util.*;

public class EncryptionChecker
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter a 5 letter word to be encrypted: ");
        String input = s.nextLine();

        for(int i = 0; input.length() != 5 && i<2;i++) //check if input was 5 letters long; give 3 attempts to user to input 5 letter word
        {
            System.out.print("You did not enter a word that was 5 letters long! \nPlease enter a 5 letter word to be encrypted: ");
            input = s.nextLine();
        }

        if (input.length() == 5)
        {
            String encrHelper = EncryptionHelper.encode(input); //encrypted string using EncryptionHelper
            System.out.println("The encrypted word is " + encrHelper);

            for(int i = 0; i<5;i++) //loops through 5 times to calculate correct encryption and compare it with EncryptionHelper output
            {
                char c = input.charAt(i); //extracting character at i location
                double encrAscii = Math.pow(c,i+1)%26.0+'a'; //encrypting character

                System.out.print("Character " + (i+1) + ":");
                System.out.print((char)encrAscii==encrHelper.charAt(i)); //print if the EncryptionHelper output is correct
                System.out.print(" ");


            }
        }

    }
}
