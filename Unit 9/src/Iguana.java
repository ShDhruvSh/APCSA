/**
 * Iguana
 * This program is a concrete class that defines an Iguana.
 * Authors: Dhruv Sharma
 * Date: 1/30/2020
 * On My Honor: DS
 **/

public class Iguana implements Pet, TherapyAnimal
{
    public void changeName(String name)
    {
        System.out.println("Names not allowed. Iguanas do not have names."); //no access to Mammal's change name
    }

    public void snuggle() //prints out "snuggle snuggle"
    {
        System.out.println("snuggle snuggle");
    }
}
