/**
 * TypeOfKey
 * This program outputs what type of character was inputted by the user.
 * Authors: Dhruv Sharma
 * Date: 11/5/2019
 * On My Honor: DS
 **/

import java.util.*;

public class TypeOfKey {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please input your character:");
        String ch = s.nextLine();

        char input = ch.charAt(0); //converting string to char

        // if vowel
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u')
        {
            System.out.print("vowel ");
        }

        // if letter
        if (input >= 'a' && input <= 'z')
        {
            System.out.println("letter");
        }

        // if number
        else if (input >= '0' && input <= '9')
        {
            System.out.println("number");
        }

        // if symbol
        else if (input == '!' || input == '@' || input == '#' || input == '$' || input == '%' || input == '^' || input == '&' || input == '*')
        {
            System.out.println("symbol");
        }

        // if something else
        else
        {
            System.out.println("unknown");
        }
    }
}
