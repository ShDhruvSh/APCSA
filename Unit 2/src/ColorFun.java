/**
 * ColorFun
 * This program draws a family of stick figures with color.
 * Authors: Dhruv Sharma
 * Date: 9/24/2019
 * On My Honor: DS
 **/

import java.applet.Applet;
import java.awt.*;
public class ColorFun extends Applet {
    public void paint(Graphics g) {

        StickFigurePrimitive bob = new StickFigurePrimitive(); //using StickFigurePrimitive constructor to define bob
        bob.setColor(255, 200, 150); //sets the rgb color of the stick figure
        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob

        bob.translate(50); //move stick person to the right 50 units
        bob.getDarker(); //make person darker 20 units
        bob.draw(g); // draw bob
    }
}

