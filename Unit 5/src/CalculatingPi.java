/**
 * CalculatingPi
 * This program uses the Monte Carlo method to estimate Pi.
 * Authors: Dhruv Sharma
 * Date: 11/18/2019
 * On My Honor: DS
 **/

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class CalculatingPi extends Applet {
    public void paint(Graphics g) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        double distance;
        int inCircle = 0;
        double xCoord;
        double yCoord;
        double factor = 0.5; //scale factor so that drawing can fit in window


        g.drawRect(0,0,(int)(factor*500),(int)(factor*500));
        g.drawOval(0,0,(int)(factor*500),(int)(factor*500));

        System.out.print("Welcome to Monte Carlo Pi Calculator! Enter the number of points you would like to throw to calculate pi : ");
        int countPoint = s.nextInt();

        int inSquare = countPoint; //original input value

        while (countPoint>0)
        {
            //random point
            xCoord = r.nextDouble()*500.0;
            yCoord = r.nextDouble()*500.0;

            //draws point
            g.drawOval((int)(factor*xCoord),(int)(factor*yCoord),1,1);

            distance = Math.sqrt((250.0-xCoord)*(250.0-xCoord)+(250.0-yCoord)*(250.0-yCoord)); //distance between (250,250) and point

            if (distance <= 250.0) //increases inCircle counter when point is inside circle
            {
                inCircle++;
            }

            countPoint--; //decreases input so that while loop runs one less time in future (while loop counter decreased by one)
        }


        if (inSquare > 0)
        {
            double calcPi = ((1.0*inCircle/inSquare)*4);
            //g.drawString("I calculated Pi to be " + calcPi + "\n" + "The percent error is " + (((calcPi-Math.PI)/Math.PI)*100),
            //       0,(int)(factor*550)); //text in applet

            g.drawString("I calculated Pi to be " + calcPi,
                    0,(int)(factor*550)); //text in applet
            g.drawString("The percent error is " + (((calcPi-Math.PI)/Math.PI)*100),
                    0,(int)(factor*580)); //text in applet

            System.out.print("I calculated Pi to be " + calcPi + " The percent error is " + (((calcPi-Math.PI)/Math.PI)*100));
        }
    }
}
