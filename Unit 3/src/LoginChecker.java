/**
 * LoginChecker
 * This program reads in a username and password from a file and checks if it is correct.
 * Authors: Dhruv Sharma
 * Date: 10/22/2019
 * On My Honor: DS
 **/

import java.util.Scanner; //Make the Scanner class available
import java.io.FileNotFoundException; //Make this exception available
import java.io.File; //Make the File class available
public class LoginChecker {
    public static void main(String[] args) throws FileNotFoundException
//must state that this program may
    // throw an exception
    // if the file is not found
    {
        Scanner keyboard;
        Scanner inFile;
        String userN;
        String passW;
        String fromFile;

//read in a word from the keyboard and print to the screen
        keyboard = new Scanner(System.in);
        System.out.print("Please enter your username and password for verification. \n" +
                "Be sure to enter one of the following valid usernames: \n" +
                "george jerry elaine kramer user\n" +
                "Enter username: ");

        userN = keyboard.nextLine(); //type in usernaame

        System.out.print("Enter password: "); //ask for password

        passW  = keyboard.nextLine(); //type in password

//read in a word from the file and print to the screen
//****Open up a file rather than System.in****
        inFile = new Scanner(new File("usernames.txt"));
        fromFile = inFile.nextLine();

        System.out.println(fromFile);

        System.out.println("Valid? " + (fromFile.equals(userN+passW)));

    } }
