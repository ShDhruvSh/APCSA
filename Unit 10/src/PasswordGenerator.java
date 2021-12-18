import java.util.*;

public class PasswordGenerator {
    private int digits;
    private String prefix;
    private int numPass;

    public PasswordGenerator(int d, String p)
    {
        digits = d;
        prefix = p;
    }
    public PasswordGenerator(int d)
    {
        digits = d;
        prefix = "A";
    }

    public String pwGen()
    {
        Random r = new Random();
        numPass++;
        String stNums = "";
        for(int i = 0; i < digits; i++)
        {
            stNums += r.nextInt(10);
        }
        return prefix + stNums;
    }

    public int pwCount()
    {
        return numPass;
    }
}
