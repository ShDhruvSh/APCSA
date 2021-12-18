/**
 * HumanPlayer.java
 * This class extends Player to create a human player.
 * Authors: Dhruv Sharma
 * Date: 1/14/2020
 * On My Honor: DS
 **/
//
// 1.3.2006
// by Mr. Daubenmier

/*  */

import java.util.*;

public class HumanPlayer extends Player
{
    public HumanPlayer()
    {

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = s.nextLine();

        super.numPlayers++;
        char ch;
        if (numPlayers == 1) ch = 'X';
        else ch = 'O';

        System.out.println(name + ", you will be " + ch + "\'s.");

        super.setChar(ch);
        super.setName(name);
    }

    public int getMove(TicTacToeBoard board)
    {
        Scanner s = new Scanner(System.in);
        boolean foundMove = false;

        System.out.print(getName() + ", please choose a spot to place your mark (1-9): ");

        int move = 0;
        while (!foundMove)
        {
            move = s.nextInt(); //an alternate to the Random class
            foundMove = board.isEmpty(move);
        }

        System.out.println(move);
        return move;
    }
}