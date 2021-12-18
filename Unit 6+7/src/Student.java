/**
 * Student
 * This class creates methods to manage information of Students.
 * Authors: Dhruv Sharma
 * Date: 12/12/2019
 * On My Honor: DS
 **/

public class Student {
    private String firstName;
    private String lastName;
    private String roomAssignment;
    private String SSN;
    private char gender;

    public Student(String firstName, String lastName, char gender, String SSN) //default constructor
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.gender = gender;
        this.roomAssignment = "";
    }

    public String getFirstName() // returns a String that is the student's first name
    {
        return firstName;
    }

    public String getLastName() // returns a String that is the student's last name
    {
        return lastName;
    }

    public String getName() // returns a String in the form Smoe, Joe
    {
        return lastName + ", " + firstName;
    }

    public String getSSN() // returns a String that is the student's SSN
    {
        return SSN;
    }

    public char getGender() // returns a character representing the gender of the student
    {
        return gender;
    }
    public String getRoomAssignment() // returns a String with the room assignment of the student
    {
        return roomAssignment;
    }

    public void setRoomAssignment(String s) // sets the current room assignment to a String argument passed in
    {
        roomAssignment = s;
    }

    public boolean equals(Student st) // compares last name, first name, and SSN which all must match to be equal.
    {
        if ((this.firstName.equals(st.getFirstName())) && (this.lastName.equals(st.getLastName())) && (this.SSN.equals(st.getSSN())))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return firstName + ";" + lastName + ";" + SSN + ";" + gender + ";" + roomAssignment;
    }

}

