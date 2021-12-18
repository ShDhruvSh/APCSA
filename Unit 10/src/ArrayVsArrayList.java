/**
 * ArrayVsArrayList
 * This program defines the ArrayVsArrayList class.
 * Authors: Dhruv Sharma
 * Date: 4/27/2020
 * On My Honor: DS
 **/

import java.util.*;

public class ArrayVsArrayList {

    private int[] intArray;
    private ArrayList<Integer> intArrayList;
    int numFilled = 0;
    public static final int DEFAULT_CAPACITY = 2;

    //inits a zero element ArrayList and a default capacity array
    public ArrayVsArrayList() {
        intArrayList = new ArrayList<>();
        intArray = new int[DEFAULT_CAPACITY];
    }

    //inits the (default capacity)array and ArrayList, and adds a to the front of both.
    public ArrayVsArrayList(Integer a)
    {
        intArrayList = new ArrayList<>();
        intArrayList.add(0, a);
        intArray = new int[DEFAULT_CAPACITY];
        intArray[0] = a;

    }

    //inits the array and the ArrayList to each contain a deep copy of all elements in a
    public ArrayVsArrayList(Integer [] a){
        intArrayList = new ArrayList<>();
        intArray = new int[a.length];

        for(int i = 0; i < a.length; i++)
        {
            intArrayList.add(a[i]);
            intArray[i] = a[i];
        }
    }

    //adds elem at index (grow the array if you have to)
//prints the time it took to add to the ArrayList
//prints the time it took to add to the array (growing counts as part of time)
//prints if the array or ArrayList was faster
    public void addAndPrintTime(int index, Integer elem)
    {
        final long startTimeArrayList = System.currentTimeMillis();
        intArrayList.add(index, elem);


        final long endTimeArrayList = System.currentTimeMillis();
        System.out.println("Total ArrayList add time: " + (endTimeArrayList - startTimeArrayList));

        final long startTimeArray = System.currentTimeMillis();
        int[] intArrayGrow = new int[intArray.length + 1];
        boolean elmFlag = false;
        for(int i = 0; i < intArrayGrow.length; i++)
        {
            if(i == index)
            {
                intArrayGrow[i] = elem;
                elmFlag = true;
            }
            else if(!elmFlag && i != index)
            {
                intArrayGrow[i] = intArray[i];
            }
            else if(elmFlag && i != index)
            {
                intArrayGrow[i] = intArray[i-1];
            }
        }

        final long endTimeArray = System.currentTimeMillis();

        System.out.println("Total array add time: " + (endTimeArray - startTimeArray));
    }

    //remove elem at index
//prints the time it took to remove from the ArrayList
//prints the time it took to remove from the array (growing counts as part of time)
//prints if the array or ArrayList was faster
//prints if the removed array and ArrayList elements matched
//returns the removed element from one of the two
    public Integer removeAndPrintTime(int index)
    {
        final long startTimeArrayList = System.currentTimeMillis();
        int returnInt = intArrayList.remove(index);
        final long endTimeArrayList = System.currentTimeMillis();
        System.out.println("Total ArrayList remove time: " + (endTimeArrayList - startTimeArrayList));

        final long startTimeArray = System.currentTimeMillis();
        for(int i = index; i < intArray.length-1; i++)
        {
            intArray[i]= intArray[i+1];
        }

        final long endTimeArray = System.currentTimeMillis();

        System.out.println("Total array remove time: " + (endTimeArray - startTimeArray));

        return returnInt;
    }

    public String toString()
    {
        String output = intArrayList.toString() + "\n";
        for(int i = 0; i < intArray.length; i++)
        {
            output += intArray[i];
        }
        return output;
    }



}
