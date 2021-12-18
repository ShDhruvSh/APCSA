/**
 * Basketballs
 * This program prints out whether two basketballs from Men's and Women's basketball can fit into a regulation basketball hoop.
 * Authors: Dhruv Sharma and Benjamin Hawley
 * Date: 8/29/2019
 * On My Honor: DS, BH
 **/
public class Basketballs {
    public static void main(String[] args) {
        double mBall = 9.39*2.54; //diameter of Men's Basketball in centimeters
        double wBall = 9.07*2.54; //diameter of Women's Basketball in centimeters
        double dHoop = 22.85*2; //diameter of basketball hoop in centimeters
        System.out.print("Men's Will Fit ");
        System.out.println(mBall*2<=dHoop);//testing if two regulation size Men's basketball are able to fit in the hoop
        System.out.print(dHoop-mBall*2);
        System.out.println(" cm to spare");
        System.out.print("Women's Will Fit ");
        System.out.println(wBall*2<=dHoop);//testing if two regulation size Women's basketball are able to fit in the hoop
        System.out.print(dHoop-wBall*2);
        System.out.println(" cm to spare");
    }
}
