/**
 * AnimalDriver
 * This program is a driver of the Monkey and Iguana classes.
 * Authors: Dhruv Sharma
 * Date: 1/30/2020
 * On My Honor: DS
 **/

public class AnimalDriver {
    public static void main(String[] args) {
        Monkey m = new Monkey("Bananas");
        Iguana i = new Iguana();

        m.changeName("Mankey"); //changes name from Bananas to Mankey
        i.changeName("Iggy"); //change name of i, but since it is not a pet, it cannot change its name
        i.snuggle();
    }
}
