/**
 * PolygonDriver
 * This program is a driver of the Polygon class.
 * Authors: Dhruv Sharma
 * Date: 1/14/2020
 * On My Honor: DS
 **/

public class PolygonDriver {
    public static void main(String[] args) {
        Polygon p = new Polygon();
        RectangleForPolygon r = new RectangleForPolygon();
        Square s = new Square();
        Pentagon pent = new Pentagon();


        System.out.println(p);
        System.out.println(r);
        System.out.println(s);
        System.out.println(pent);

        System.out.println(p.equals(r));
        System.out.println(p.equals(s));
        System.out.println(p.equals(pent));

    }
}
