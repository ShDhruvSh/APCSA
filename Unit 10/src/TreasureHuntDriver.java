/**
 * TreasureHuntDriver
 * This program is a driver for the TreasureHunt class.
 * Authors: Dhruv Sharma
 * Date: 3/29/2020
 * On My Honor: DS
 **/

import java.util.Scanner;

public class TreasureHuntDriver
{
	public static void main(String[] args)
	{

		System.out.println("Treasure Hunt!");
		System.out.println("Guess where the gold is!");

		TreasureHunt t = new TreasureHunt();
		Scanner s = new Scanner(System.in);
		int row,col,mOrR;
		boolean found = false;
		boolean mine = false;
		System.out.println();

		do
		{
			t.printBoard(false); //print board without mines

			System.out.print("Would you like to mark a mine (1) or reveal a square (2)? ");
			mOrR = s.nextInt();

			if(mOrR == 2) //if user selected to reveal square
			{
				System.out.println("Please enter your guess of where the gold is.");
				System.out.print("Row (0-2): ");
				row = s.nextInt();
				System.out.print("Col (0-4): ");
				col = s.nextInt();
				s.nextLine();


				found = t.isGold(row, col);
				mine = t.isMine(row, col);

				if(found) {
					System.out.println("You found the gold in just " + t.getNumGuesses() + " tries!");
				}
				else if(mine)
				{
					System.out.println("You hit a mine. You lose.");
					t.printBoard(true); //print board with mines when user has revealed a mine

				}
				else {
					System.out.println("Better keep looking . . .");
				}


			}
			else if(mOrR == 1) //if user selected to mark mine
			{
				System.out.println("Please enter the square you wish to mark as a mine.");
				System.out.print("Row (0-2): ");
				row = s.nextInt();
				System.out.print("Col (0-4): ");
				col = s.nextInt();
				s.nextLine();
				t.markMine(row, col);

			}
		} while (!found && !mine);
	}
}
