/**
 * PowersOfTwo
 * This program explores declaring, constructing and accessing arrays.
 * Authors: Dhruv Sharma
 * Date: 2/15/2020
 * On My Honor: DS
 **/

public class PowersOfTwo {
    public static void main(String[] args) {
        int i, j;
        double currVal;

        //using powersOfTwo array
        long arrStartTime = System.currentTimeMillis();
        double[] powersOfTwo = new double[10];

        powersOfTwo[0] = 1;

        for(i = 1; i < 10; i++) //initialize all values of array to 2*valueInPreviousIndex; for loop starts from powersOfTwo[1]
        {
            powersOfTwo[i] = powersOfTwo[i-1]*2;
        }
        for(i = 0; i < 2000000; i++) //run 2 million times
        {
            for(j = 0; j < 10; j++) //plug in array values in currVal
            {
                currVal = powersOfTwo[j];
            }
        }
        long arrEndTime = System.currentTimeMillis();
        double arrTime = arrEndTime - arrStartTime; //time taken for lookup table
        System.out.println("Time taken in milliseconds when using the lookup table method: " + arrTime);


        //using Math.pow
        long powStartTime = System.currentTimeMillis();


        for(i = 0; i < 2000000; i++) //run 2 million times
        {
            for(j = 0; j < 10; j++)
            {
                currVal = Math.pow(2, j);  //plug in Math.pow values in currVal
            }
        }
        long powEndTime = System.currentTimeMillis();
        double powTime = powEndTime - powStartTime; //time taken for Math.pow
        System.out.println("Time taken in milliseconds when using Math.pow: " + powTime);

        if(arrTime < powTime)
        {
            System.out.println("Lookup table is faster.");
        }
        else
        {
            System.out.println("Calculation is faster.");
        }

    }
}
