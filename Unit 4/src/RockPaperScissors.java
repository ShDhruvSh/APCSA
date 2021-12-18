/**
 * RockPaperScissors
 * This program uses if statements to play a game of RPS.
 * Authors: Dhruv Sharma
 * Date: 11/1/2019
 * On My Honor: DS
 **/

import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {

        String userWord;
        String computerWord;

        //generating computer's random choice
        Random r = new Random();
        int computer = r.nextInt(3)+1;

        //asking for user input for RPS
        Scanner s = new Scanner(System.in);
        System.out.println("Please the number for you choice of Rock(1), Paper(2), or Scissors(3).");

        int user = s.nextInt();


        //correlate computer generation with string of word
        if (computer == 3)
        {
            computerWord = "Scissors";
        }

        else if (computer == 2)
        {
            computerWord = "Paper";
        }

        else
        {
            computerWord = "Rock";
        }


        //correlate user input with string of word
        if (user == 3)
        {
            userWord = "Scissors";
        }

        else if (user == 2)
        {
            userWord = "Paper";
        }

        else
        {
            userWord = "Rock";
        }


        //if user wins
        if (computer == 3 && user == 1)
        {
            System.out.println("You win! " + userWord + " beats " + computerWord + ".");
        }

        if (computer == 1 && user == 2)
        {
            System.out.println("You win! " + userWord + " beats " + computerWord + ".");
        }


        if (computer == 2 && user == 3)
        {
            System.out.println("You win! " + userWord + " beats " + computerWord + ".");
        }

        //if computer wins
        if (computer == 1 && user == 3)
        {
            System.out.println("You lose! " + computerWord + " beats " + userWord + ".");
        }

        if (computer == 2 && user == 1)
        {
            System.out.println("You lose! " + computerWord + " beats " + userWord + ".");
        }


        if (computer == 3 && user == 2)
        {
            System.out.println("You lose! " + computerWord + " beats " + userWord + ".");
        }

        //if there is a tie
        if (computer == user)
        {
            System.out.println("Its a tie! " + computerWord + " ties with " + userWord + ".");
        }

    }
}
