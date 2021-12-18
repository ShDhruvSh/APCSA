/**
 * Mammal
 * This program is a concrete class that defines a Monkey.
 * Authors: Dhruv Sharma
 * Date: 1/30/2020
 * On My Honor: DS
 **/


public class Monkey extends Mammal implements Pet
{
    public Monkey(String name) //sets original name
    {
        super.setName(name);
    }

    public void changeName(String name) //changes name from originally defined name to a new name using super's setName
    {
        super.setName(name);
    }
}
