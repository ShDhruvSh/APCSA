/**
 * TreasureHunt
 * This program defines the TreasureHunt class.
 * Authors: Dhruv Sharma
 * Date: 3/29/2020
 * On My Honor: DS
 **/

import java.util.*;

public class TreasureHunt
{
	//2D char array
	private char[][] treasureGrid; //main array
	private char[][] markedTreasureGrid; //array with marked locations

	//int to keep track of the number of guesses
	private int numGuess;


	//The constructor should initialize the 2D array to be 3 rows by 5 cols.
	//It should randomly place a 'G' into the 2D array (this will be the gold)
	//Initialize variable that holds the number of guesses
	public TreasureHunt()
	{
		Random r = new Random();

		treasureGrid = new char[3][5];
		markedTreasureGrid = new char[3][5];

		int i = r.nextInt(3);
		int j = r.nextInt(5);

		treasureGrid[i][j] = 'G';
		for(int p = 0; p < 3; p++)
		{
			for(int q = 0; q < 5; q++)
			{
				if (p != i && q != j)
				{
					if(r.nextInt(3) == 0)
					{
						treasureGrid[p][q] = 'M';
					}
				}
				//System.out.println(p + " " + q + " " + treasureGrid[p][q]); //answer key - remove // at beginning of line
			}
		}
		numGuess = 0;
	}

	//Increments the number of guesses.
	//Places number of adjacent mines in the location if the guess is not correct.
	//Returns true if the row and col passed in is the location of the gold
	//Returns false if the row and col are out of bounds or not the location
	//of the gold.
	public boolean isGold(int row, int col)
	{
		if(row > -1 && row < 3 && col > -1 && col < 5)
		{
			int mineCount = 0;
			numGuess++;
			if(treasureGrid[row][col] == 'G')
			{
				return true;
			}
			else if(treasureGrid[row][col] != 'M')
			{
				for(int i = row-1; i <= row+1; i++)
				{
					for(int j = col-1; j <= col+1; j++)
					{
						if((i != row || j != col) && (i >= 0 && i <= 2 && j >= 0 && j <= 4))
						{
							if(treasureGrid[i][j] == 'M')
							{
								mineCount++;
							}
						}
					}
				}
				treasureGrid[row][col] = (char)(mineCount + '0');
			}
			return false;
		}
		else
		{
			return false;
		}
	}

	//Returns true if the row and col passed in is the location of the mine
	//Returns false if the row and col are out of bounds or not the location
	//of the mine.
	public boolean isMine(int row, int col)
	{
		if(row > -1 && row < 3 && col > -1 && col < 5)
		{
			if(treasureGrid[row][col] == 'M')
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	//returns the number of guesses
	public int getNumGuesses()
	{
		return numGuess;
	}

	//Prints the board
	//Does not print the 'G'
	//Prints M if mine parameter is true
	public void printBoard(boolean mine)
	{
		for(int r = 0; r < 3; r++)
		{
			for(int c = 0; c < 5; c++)
			{
				if(treasureGrid[r][c] >= '0' && treasureGrid[r][c] <= '8')
				{
					System.out.print(treasureGrid[r][c]);
				}
				else if(mine && treasureGrid[r][c] == 'M')
				{
					System.out.print(treasureGrid[r][c]);
				}
				else if(markedTreasureGrid[r][c] == 'K')
				{
					System.out.print(markedTreasureGrid[r][c]);
				}
				else
				{
					System.out.print(" ");
				}
				if(c != 4)
				{
					System.out.print("|");
				}
			}
			System.out.println();
			if(r != 2)
			{
				System.out.println("_________");
			}
		}
		System.out.println();
	}

	public void markMine(int row, int col) //updates markedTreasureGrid array according to user's markings
	{
		if(row > -1 && row < 3 && col > -1 && col < 5)
		{
			markedTreasureGrid[row][col] = 'K';
		}
	}

}
