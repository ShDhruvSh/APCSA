public class Pug {

    //scope type name
    private String name;
    private double age;
    private double weight;
    private int numWrinkles;

    //constructors - initialize instance data
    //scope (public) nameOfClass(<0 or more args>)

    public Pug()
    {
        name = "dog";
        weight = 75;
        numWrinkles = 1000;
    }

    public Pug(String name)
    {
        this();
        this.name = name;
    }

    public Pug(String name, double age, double weight, int numWrinkles)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.numWrinkles = numWrinkles;
    }

    public String getName()
    {
        return name + " is a cutie.";
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getAge()
    {
        return age;
    }

    public void setAge(double age)
    {
        this.age = age;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        if (weight < 75)
        {
            System.out.println("Invalid Age");
        }
        else
        {
            this.weight = weight;
        }
    }

    public int getNumWrinkles()
    {
        return numWrinkles;
    }

    public void setNumWrinkles(int numWrinkles)
    {
        this.numWrinkles = numWrinkles;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
