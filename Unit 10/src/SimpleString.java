/**
 * SimpleString
 * This program defines a SimpleString.
 * Authors: Dhruv Sharma
 * Date: 2/20/2020
 * On My Honor: DS
 **/


public class SimpleString {

    private char[] c;


    public SimpleString() {
        c = new char[0];
    }
    public SimpleString(char[] a) {
        //c = a
        //memory WARNING - user can change string

        //deep copy
        c = new char[a.length];
        for(int i = 0; i < c.length; i++)
        {
            c[i] = a[i];
        }
    }
    public SimpleString(SimpleString str) {
        //deep copy elements from str
        c = new char[str.length()];
        for(int i = 0; i < c.length; i++)
        {
            c[i] = str.charAt(i);
        }
    }

    public SimpleString substring(int from) {
        //make a new char array of size (c.length-from)
        //fill in the boxes
        //make a SimpleString out of it and return

        char[] sub = new char[c.length-from];
        for(int i = from; i < c.length; i++)
        {
            sub[i-from] = c[i]; //copy values from c into sub
        }

        return new SimpleString(sub);
    }
    public SimpleString substring(int from, int to) {
        //make a new char array of size (c.length-from)
        //fill in the boxes
        //make a SimpleString out of it and return

        char[] sub = new char[to-from];
        for(int i = from; i < to; i++)
        {
            sub[i-from] = c[i]; //copy values from c into sub
        }

        return new SimpleString(sub);
    }

    public char charAt(int val) {
        //return char at index
        return c[val];
    }
    public int indexOf(SimpleString myStr) {
        //s.indexOf("hi") returns index where the h is in the first instance of hi
        //return -1
        //find location of myStr in c
        //return that location
        //else return -1

        for(int i = 0; i < c.length; i++)
        {
            if(myStr.charAt(0) == c[i])
            {
                //if the first one matches, loop through the rest to see if they match
                int numMatches = 0;
                for(int j = 0; j < myStr.length() && (i + j) < c.length; j++)
                {
                    if(myStr.charAt(j) == c[i+j])
                    {
                        numMatches++;
                    }
                }

                if(numMatches == myStr.length())
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public SimpleString concat(SimpleString str) {
        char[] khan = new char[c.length + str.length()];

        //copy all of c into khan first
        for(int i = 0; i < c.length; i++)
        {
            khan[i] = c[i];
        }

        //copy all of str into khan second - watch out for SHIFT
        for(int i = 0; i < str.length(); i++) //i is indexes in str
        {
            khan[i + c.length] = str.charAt(i);
        }
        return new SimpleString(khan);
    }
    public String toString() {
        String s = "";
        for(char curr: c)
        {
           s += curr;
        }
        return s;
    }

    public int length() {
        //return length
        return c.length;
    }

}