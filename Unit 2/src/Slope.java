import java.awt.*;

public class Slope {
    public static void main(String[] args) {
        double slope;
        Point p1 = new Point(2,3);
        Point p2 = new Point(9,5);

        if (p2.getX()-p1.getX()==0)
        {System.out.print("undefined");}
        else
        {slope = (p2.getY()-p1.getY())/(p2.getX()-p1.getX());System.out.println(slope);}

    }
}
