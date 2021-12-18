/**
Dhruv Sharma
CS@Mines High School Programming Competition
**/

import java.util.*;
import java.lang.*;


public class RentDivision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> subtractRent = new ArrayList<Integer>();
        int subtract;
        int totSubtract = 0;

        int totRent; //including all expenditures
        boolean notPossible = false;

        int numPeople = s.nextInt();
        s.nextLine();

        for(int i = 0; i < numPeople; i++) //put all non-rent expenditures in subtractRent
        {
            subtract = s.nextInt();
            subtractRent.add(i, subtract);
            totSubtract += subtract;
            if(i != numPeople-1)
            {
                s.nextLine();
            }
        }
        totRent = s.nextInt() + totSubtract;


        for(int i = 0; i < numPeople; i++) //check if not possible
        {
            if(((int)Math.ceil(((double)totRent/numPeople))-subtractRent.get(i)) < 0)
            {
                System.out.println("not possible");
                notPossible = true;
                break;
            }
        }
        for(int i = 0; i < numPeople; i++) //sout rent values for each person
        {
            if(((int)Math.ceil(((double)totRent/numPeople))-subtractRent.get(i)) >= 0 && !notPossible)
            {
                System.out.println((int)Math.ceil(((double)totRent/(double)numPeople))-subtractRent.get(i));
            }
        }

    }
}
