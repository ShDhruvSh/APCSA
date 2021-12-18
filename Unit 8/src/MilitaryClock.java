/**
 * MilitaryClock
 * This program is a sub class of the Clock class.
 * Authors: Dhruv Sharma
 * Date: 1/12/2020
 * On My Honor: DS
 **/

public class MilitaryClock extends Clock {
    //this constructor is optional.
    //Java would provide a default constructor.
    public MilitaryClock() //default constructor taken from Clock
    {
        super();
    }

    public String getTime() //overridden method of Clock
    {
        String time = super.getTime();
        //01:04:34 PM

        if(time.indexOf("PM") > -1)
        {
            char tens = time.charAt(0);
            char ones = time.charAt(1);
            int tenValue = (tens - '0')*10;
            int onesValue = ones -'0';
            int hour = tenValue + onesValue;
            hour += 12;
            time = hour + time.substring(2);
        }
        time = time.substring(0, time.indexOf(" "));
        //code to turn the String from Clock's getTime()
        //into a String for a 24 hour clock
        return time;
    }
}