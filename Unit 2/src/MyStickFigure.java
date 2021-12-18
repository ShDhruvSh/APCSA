/**
 * MyStickFigure
 * This program draws a family of stick figures.
 * Authors: Dhruv Sharma
 * Date: 9/17/2019
 * On My Honor: DS
 **/

import java.applet.Applet;
import java.awt.*;
public class MyStickFigure extends Applet {
    public void paint(Graphics g) {

        double myScale; // scale factor
        int yBase = 250; // y-coordinate of the ground level
        int xCenter = 100; // x-coordinate for center of person1
        int radius = 25; // radius of person1's head
        int ySegment = 50; // one third segment of the person1's body

        //person1
        g.drawOval(xCenter-radius, yBase-3*ySegment-2*radius, 2*radius, 2*radius); //head of person1
        g.drawLine(xCenter-radius,yBase-(2*ySegment+ySegment/2),xCenter,yBase-2*ySegment); //left arm of person1
        g.drawLine(xCenter+radius,yBase-(2*ySegment+ySegment/2),xCenter,yBase-2*ySegment); //right arm of person1
        g.drawLine(xCenter,yBase-3*ySegment,xCenter,yBase-ySegment); //body of person1
        g.drawLine(xCenter-radius,yBase,xCenter,yBase-ySegment); //left leg of person1
        g.drawLine(xCenter+radius,yBase,xCenter,yBase-ySegment); //right leg of person1

        //person2
        myScale = 0.8; // x-coordinate for center of person2
        xCenter = 300; //center of person2
        radius *= myScale; //radius of person2's head
        ySegment *= myScale; // one third segment of the person2's body

        g.drawOval(xCenter-radius, yBase-3*ySegment-2*radius, 2*radius, 2*radius); //head of person2
        g.drawLine(xCenter-radius,yBase-(2*ySegment+ySegment/2),xCenter,yBase-2*ySegment); //left arm of person2
        g.drawLine(xCenter+radius,yBase-(2*ySegment+ySegment/2),xCenter,yBase-2*ySegment); //right arm of person2
        g.drawLine(xCenter,yBase-3*ySegment,xCenter,yBase-ySegment); //body of person2
        g.drawLine(xCenter-radius,yBase,xCenter,yBase-ySegment); //left leg of person2
        g.drawLine(xCenter+radius,yBase,xCenter,yBase-ySegment); //right leg of person2

        //person3
        myScale = 0.3; // x-coordinate for center of person3
        xCenter = 200; //center of person3
        radius *= myScale; //radius of person3's head
        ySegment *= myScale; // one third segment of the person3's body

        g.drawOval(xCenter-radius, yBase-3*ySegment-2*radius, 2*radius, 2*radius);
        g.drawLine(xCenter-radius,yBase-(2*ySegment+ySegment/2),xCenter,yBase-2*ySegment);
        g.drawLine(xCenter+radius,yBase-(2*ySegment+ySegment/2),xCenter,yBase-2*ySegment);
        g.drawLine(xCenter,yBase-3*ySegment,xCenter,yBase-ySegment);
        g.drawLine(xCenter-radius,yBase,xCenter,yBase-ySegment);
        g.drawLine(xCenter+radius,yBase,xCenter,yBase-ySegment);
    }
}
