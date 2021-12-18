/**
 * Mammal
 * This program is an abstract class that defines a Mammal.
 * Authors: Dhruv Sharma
 * Date: 1/30/2020
 * On My Honor: DS
 **/

public abstract class Mammal {
    private String name;

    //Java writes the default constructor name = null

    public void setName(String name) //defines setName to be used in subclasses
    {
        this.name = name;
    }

    public String getName() //returns the name
    {
        return name;
    } 
}
