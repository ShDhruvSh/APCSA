/**
 * MyArrayList
 * This program creates the MyArrayList class.
 * Authors: Dhruv Sharma
 * Date: 3/3/2020 - 40 min. (worked during free block)
 * On My Honor: DS
 **/

public class MyArrayList {

    private Object[] objArr;
    private int numFilled;
    final int  DEFAULT_CAPACITY = 1;

    /* constructs an array list with a DEFAULT_CAPACITY */
    public MyArrayList()
    {
        objArr = new Object[DEFAULT_CAPACITY];
    }
    /* constructs an array list with a capacity that is passed in */
    public MyArrayList(int initialCapacity)
    {
        objArr = new Object[initialCapacity];
    }

    /* returns the size of the array list */
    public int size()
    {
        return numFilled;
    }

    /* returns the Object at position index */
    public Object get(int index)
    {
        return objArr[index];
    }

    /* replaces the element at index with x returns the element formerly at the specified position */
    public Object set(int index, Object newItem)
    {
        Object oldObj = objArr[index];
        objArr[index] = newItem;
        return oldObj;
    }

    /* appends item to the end of the list, returns true */
    public boolean add(Object item)
    {
        if(numFilled == objArr.length)
        {
            doubleCapacity();
        }
        objArr[numFilled] = item;
        numFilled++;
        return true;
    }
    /* inserts item at position index, sliding elements at position index and higher to the right (adds 1 to their indices) and adjusts size */
    public void add(int index, Object item)
    {
        if(numFilled == objArr.length)
        {
            doubleCapacity();
        }

        for(int i = numFilled; i > index; i--)
        {
            objArr[i] = objArr[i-1];
        }

        objArr[index] = item;
        numFilled++;
    }

    /* removes elements from position index sliding elements at position index + 1 and higher to the left (subtracts 1 from their indices) and adjusts size */
    public Object remove(int index)
    {
        Object elem = objArr[index]; //save element
        for(int j = index; j < numFilled-1; j++) //j is buckets
        {
            objArr[j] = objArr[j + 1];
        }
        numFilled--;
        return elem;
    }

    /* doubles the capacity of the Object array */
    private void doubleCapacity()
    {
        //deep copy into a bigger array,
        //then shallow copy back into instance data

        Object[] bigObjArr = new Object[2*objArr.length];
        for(int i = 0; i < objArr.length; i++)
        {
            bigObjArr[i] = objArr[i];
        }

        objArr = bigObjArr;
    }


}
