/**
 * SubstringMover
 * This program moves part of a string to another place in the string.
 * Authors: Dhruv Sharma
 * Date: 10/10/2019
 * On My Honor: DS
 **/

public class SubstringMover {
    public static void main(String[] args) {
        String line;
        line = new String("Once upon a time (here we go again), in a land far, far away, there lived an ogre named Pat."); //Print the original line

        String sarcasm = line.substring(line.indexOf("(")-1,line.indexOf(")")+1); //the sarcastic phrase

        line = line.substring(0,line.indexOf("(")-1)+line.substring(line.indexOf(","), line.length()-1)+sarcasm+line.substring(line.length()-1); //New adjusted line

        System.out.println(line); //print new line
    }
}
