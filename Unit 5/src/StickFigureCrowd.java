/**
 * StickFigureCrowd
 * This program creates a Stick Figure Crowd.
 * Authors: Dhruv Sharma
 * Date: 11/16/2019
 * On My Honor: DS
 **/

import java.awt.*;
import java.applet.Applet;
import java.util.*;

public class StickFigureCrowd extends Applet {
    public void paint(Graphics g) {

        StickFigurePrimitive stick;
        int i = 1;
        Random r = new Random();

        while(i<=50) // stop while loop after 50 runs
        {
            stick = new StickFigurePrimitive(0,r.nextDouble()+0.5); // sets random scale [0.5, 1.5)
            stick.setColor(r.nextInt(256),r.nextInt(256),r.nextInt(256)); // sets random color
            stick.translate(r.nextInt(500)); // sets x-value of stick figure between 0 and 500
            stick.draw(g);

            i++; // increment index of while loop
        }
    }
}
