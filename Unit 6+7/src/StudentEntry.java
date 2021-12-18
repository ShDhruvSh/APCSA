/**
 * StudentEntry
 * This program allows the user to enter information about 2 students and compare this information.
 * Authors: Dhruv Sharma
 * Date: 12/12/2019
 * On My Honor: DS
 **/

import java.util.*;

public class StudentEntry {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //First Student
        System.out.println("Please enter the data for the first student: ");
        System.out.print("Last Name: ");
        String lastName1 = s.nextLine();

        System.out.print("First Name: ");
        String firstName1 = s.nextLine();

        System.out.print("Gender: ");
        char gender1 = s.nextLine().charAt(0);

        System.out.print("SSN: ");
        String SSN1 = s.nextLine();

        //Second Student
        System.out.println("Please enter the data for the second student: ");
        System.out.print("Last Name: ");
        String lastName2 = s.nextLine();

        System.out.print("First Name: ");
        String firstName2 = s.nextLine();

        System.out.print("Gender: ");
        char gender2 = s.nextLine().charAt(0);

        System.out.print("SSN: ");
        String SSN2 = s.nextLine();


        Student st1 = new Student(firstName1, lastName1, gender1, SSN1); //Student 1
        Student st2 = new Student(firstName2, lastName2, gender2, SSN2); //Student 2


        if (st1.equals(st2))
        {
            System.out.println("Same students");
        }
        else
        {
            System.out.println("Different students");
        }



    }
}
