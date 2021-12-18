/**
 * SimpleStringDriver
 * This program runs SimpleString.
 * Authors: Dhruv Sharma
 * Date: 2/20/2020
 * On My Honor: DS
 **/

public class SimpleStringDriver {
    public static void main(String[] args) {

        SimpleString s = new SimpleString(new char[]{'h', 'e', 'l', 'l', 'o', 'h'});
        SimpleString sm = new SimpleString(new char[]{'h', 'i'});

        System.out.println(s.indexOf(sm)); //should output -1

        System.out.println(s.indexOf(s.substring(2,4))); //should output 2

        System.out.println(s.substring(3)); //should output loh
        System.out.println(s.substring(3,4)); //should output l
        System.out.println(sm.concat(s)); //should output hellohhi
    }
}
