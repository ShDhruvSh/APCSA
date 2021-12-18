/**
 * ArrayVsArrayList
 * This program is a driver for the ArrayVsArrayList class.
 * Authors: Dhruv Sharma
 * Date: 4/27/2020
 * On My Honor: DS
 **/


public class UltimateShowdown {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{4,5,6,8};
        ArrayVsArrayList def0 = new ArrayVsArrayList(); //default capacity and zero array
        ArrayVsArrayList def7 = new ArrayVsArrayList(7); //default capacity with 7 at begining
        ArrayVsArrayList inputtedArray = new ArrayVsArrayList(a); //inputted Integer array a

        def0.addAndPrintTime(0, 7);
        System.out.println(def0);
        def0.removeAndPrintTime(0);
        System.out.println(def0);

        def7.addAndPrintTime(0, 7);
        System.out.println(def7);
        def7.removeAndPrintTime(0);
        System.out.println(def7);


        inputtedArray.addAndPrintTime(0, 7);
        System.out.println(inputtedArray);
        inputtedArray.removeAndPrintTime(0);
        System.out.println(inputtedArray);


    }
}
