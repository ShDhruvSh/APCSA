/**
 * StickFigureFamily
 * This program uses a constructor from an external .jar file to draw a family of stick figures.
 * Authors: Dhruv Sharma
 * Date: 9/23/2019
 * On My Honor: DS
 **/

import java.applet.Applet;
import java.awt.*;


public class StickFigureFamily extends Applet {
    public void paint(Graphics g) {
        StickFigurePrimitive bob = new StickFigurePrimitive(); //using StickFigurePrimitive constructor to define bob
        bob.draw(g); // draw bob

        StickFigurePrimitive jill = new StickFigurePrimitive(125, 1.2); //using StickFigurePrimitive constructor to define jill
        jill.draw(g); // draw jill

        StickFigurePrimitive bill = new StickFigurePrimitive(50, 1.5); //using StickFigurePrimitive constructor to define bill
        bill.draw(g); // draw bill

        StickFigurePrimitive phill = new StickFigurePrimitive(275, 0.75); //using StickFigurePrimitive constructor to define phill
        phill.draw(g); // draw phill

        StickFigurePrimitive judy = new StickFigurePrimitive(350, 0.5); //using StickFigurePrimitive constructor to define judy
        judy.draw(g); // draw judy

        StickFigurePrimitive nick = new StickFigurePrimitive(425, 0.1); //using StickFigurePrimitive constructor to define nick
        nick.draw(g); // draw nick

    }
}