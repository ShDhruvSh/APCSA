/**
 * Cornershot
 * This program checks to see if a dart hits the red corners of a dartboard.
 * Authors: Dhruv Sharma
 * Date: 9/18/2019
 * On My Honor: DS
 **/

import java.util.Random;
import java.awt.*;

public class Cornershot {
    public static void main(String[] args) {
        Random x = new Random();
        Point p = new Point(x.nextInt(301),x.nextInt(301)); //random point generation
        // Point p = new Point(50, 50); //testing hardcoded points
        System.out.println(p);

        boolean inSquare = p.getX() >= 25 && p.getX() <= 275 && p.getY() >= 25 && p.getY() <= 275; //boolean that sees if random point is in the square

        Point center = new Point(150,150); //center

        int radius = 125; //radius of circle

        boolean bullseye = p.distance(center) <= radius; //boolean that sees if random point is in bullseye

        System.out.println(inSquare && !bullseye); //prints if dart hits a red corner
    }
}
