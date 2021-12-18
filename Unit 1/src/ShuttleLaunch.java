/**
 *Program name: Shuttle Launch
 *File name: ShuttleLaunch.java
 *Program description: The program will check weather conditions and output true if the space shuttle may launch and false if it may not.
 *Your Name(s): Dhruv Sharma
 *Initials: DS
 */

public class ShuttleLaunch {
    public static void main(String[] args) {
        //initial values
        double curTemp = 99.0;
        double cloudCover = 0.25;
        boolean isRaining = true;
        int timeSinceLastLightning = 45;
        double windSpeed = 34.0;
        boolean overrideIsOn = true;

        //calculating boolean ranges for initial values
        boolean tempOK = 32.0 < curTemp && curTemp < 100;
        boolean cloudOK = cloudCover <= 0.48 && !isRaining || cloudCover <= 0.25;
        boolean lightningOK = timeSinceLastLightning >= 45.0;
        boolean windOK = windSpeed <= 34.0;

        //checking if launching
        System.out.print((tempOK &&
                cloudOK &&
                lightningOK &&
                windOK)
                || overrideIsOn);

        /*the current temperature is above freezing and below 100 degrees Fahrenheit, exclusive
        the current cloud cover is less than 48% or the current cloud cover is less than 25% if it is raining, inclusive
        there has not been any lightning in the area for at least 45 minutes, inclusive
        the current wind speed is below 34 knots, inclusive*/

    }
}
