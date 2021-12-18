/**
 * SubstringMover
 * This program helps the user practice typing.
 * Authors: Dhruv Sharma
 * Date: 10/14/2019
 * On My Honor: DS
 **/

import java.util.Scanner;
public class TypingTutor {
    public static void main(String[] args) {
        String line; //Line to be displayed to the user String inLine; //Line read in from the user
        long startTime;
        long stopTime;
        Scanner keyboard = new Scanner(System.in);
        Dictionary wordList;
        double wordsPerMin;
        double time;
        String userLine;
        Dictionary d = new Dictionary();

        line = d.randomWord() + " " + d.randomWord() + " " + d.randomWord() + " " + d.randomWord() + " " + d.randomWord() + " " + d.randomWord();

        //starting right before read in from user
        startTime = System.currentTimeMillis();
        System.out.println(line);

        userLine = keyboard.nextLine(); //read in input from user

        //ending right after enter from user
        stopTime = System.currentTimeMillis();

        System.out.print("Correct line? " + line.equals(userLine)); //check and print if it is userLine is correct

        time = (stopTime-startTime);

        wordsPerMin = (userLine.length())/5.0/(time/1000.0/60.0);
        System.out.println(" WPM: " + wordsPerMin);

    } }
