/**
 * PointToString
 * This generates two random points, converts them into human readable form and checks, and compares their distance from the origin.
 * Authors: Dhruv Sharma
 * Date: 10/22/2019
 * On My Honor: DS
 **/
import java.awt.*;
import java.util.*;


public class PointToString {
    public static void main(String[] args) {
        Random r = new Random();
        String sp1;
        String sp2;

        //random points' coordinates
        int x1 = r.nextInt();
        int y1 = r.nextInt();
        int x2 = r.nextInt();
        int y2 = r.nextInt();



        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);

        sp1 = p1.toString();
        sp2 = p2.toString();

        System.out.println(sp1);
        System.out.println(sp2);

        //sp1 in human readable form
        sp1 = "("+sp1.substring(sp1.indexOf("=")+1,sp1.indexOf("y"))+" "+sp1.substring(sp1.indexOf("y")+2,sp1.indexOf("]"))+")";

        //sp2 in human readable form
        sp2 = "("+sp2.substring(sp2.indexOf("=")+1,sp2.indexOf("y"))+" "+sp2.substring(sp2.indexOf("y")+2,sp2.indexOf("]"))+")";

        //print out point strings in human readable form
        System.out.print(sp1);
        System.out.println(" "+sp2);

        //calculating distance from points to origin
        double d1 = p1.distance(0,0); //distance of p1 from origin
        double d2 = p2.distance(0,0); //distance of p2 from origin
        boolean aGreaterThanB = d1>d2;

        System.out.println("Point A is farther from the origin than Point B:"+ String.valueOf(aGreaterThanB));
        System.out.println("Point B is farther from the origin than Point A:"+ String.valueOf(!aGreaterThanB));



    }
}
