/**
 * CrossHairs
 * This program draws concentric circles.
 * Authors: Dhruv Sharma
 * Date: 9/17/2019
 * On My Honor: DS
 **/

import java.applet.Applet;
import java.awt.*;
public class CrossHairs extends Applet {

    public void paint(Graphics g){

        //setting color to blue
        g.setColor(Color.BLUE);

        //drawing vertical line down center
        g.drawLine(200, 0, 200, 400);
        //drawing horizontal line across center
        g.drawLine(0, 200, 400, 200);

        //drawing concentric circles
        g.drawOval(0, 0, 400, 400);
        g.drawOval(25, 25, 350, 350);
        g.drawOval(50, 50, 300, 300);
        g.drawOval(75, 75, 250, 250);
        g.drawOval(100, 100, 200, 200);
        g.drawOval(125, 125, 150, 150);
        g.drawOval(150, 150, 100, 100);
        g.drawOval(175, 175, 50, 50);

        //fills in middle circle
        g.fillOval(175, 175, 50, 50);

    }
}
