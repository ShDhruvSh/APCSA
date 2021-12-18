/**
 * FlashCardDriver2
 * This program is the driver for the SortedFlashCards class.
 * Authors: Dhruv Sharma
 * Date: 2/27/2020
 * On My Honor: DS
 **/

import java.util.Scanner;               //Make the Scanner class available
import java.io.FileNotFoundException;   //Make this exception available
import java.io.File;                    //Make the File class available

public class FlashCardDriver2
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner console;
		Scanner inFile;
		String question;
		String fileName;
		String answer;

		FlashCards fc;
		fc = new SortedFlashCards();
		console = new Scanner(System.in);


		//load the question file
		System.out.print("Enter the Question File: ");
		fileName = console.nextLine();
		inFile = new Scanner(new File(fileName));
		while(inFile.hasNextLine())
		{
			question = inFile.nextLine();
			answer = inFile.nextLine();
			fc.addCard(question, answer);
		}

		fc.printFlashCards();



		String guess;
		//Ask the questions and compare the answers
		for(int i=0;i<50;i++)
		{
			System.out.println("Question: " + fc.getQuestion(i));
			guess=console.nextLine();
			if(guess.equals(fc.getAnswer(i)))
				System.out.println("You're correct!!");
			else System.out.println("Sorry, the answer is: " + fc.getAnswer(i));
		}

		/* Asks the user all the questions in alphabetical order by question and compares the results */

	}
}