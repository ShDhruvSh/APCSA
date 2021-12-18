/**
 * AnswerProtector
 * This program allows the user to input a username and password and the program will output whether both are correct.
 * or not.
 * Authors: Dhruv Sharma
 * Date: 10/1/2019
 * On My Honor: DS
 **/

import java.util.*;

public class AnswerProtector {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //real username
        String username = new String("admin");

        //real password
        String password = new String("password");

        //input username
        System.out.print("Username:");
        String usernameInput = new String(s.nextLine());

        //input password
        System.out.print("Password:");
        String passwordInput = new String(s.nextLine());

        //prints out of username and password are correct
        System.out.println(username.equals(usernameInput) && password.equals(passwordInput));

        //Ape and Banana
        String apeAndBanana = new String("Ape: \"Is your refrigerator running?\" \n Banana: \"That’s classified.\" ");
        System.out.println(apeAndBanana);


    }
}
