/**
 * Clock
 * This program designs the Clock class.
 * Authors: Dhruv Sharma
 * Date: 1/12/2020
 * On My Honor: DS
 **/

public class Clock {

    private int hour;
    private int min;
    private int sec;
    private boolean isAm;



    public Clock() //default Clock constructor
    {
        hour = 12;
        isAm = true;
    }
//
    public String getTime() //prints out time in string format
    {
        String min = "";
        if(this.min < 10) min = "0"+this.min;
        else min = "" + this.min;

        String sec = "";
        if(this.sec < 10) sec = "0"+this.sec;
        else sec = "" + this.sec;

        String hour = "";
        if(this.hour < 10) hour = "0" + this.hour;
        else hour = "" + this.hour;

        String amPm = "";
        if(isAm) amPm = "AM";
        else amPm = "PM";

        return hour + ":" + min + ":"+ sec + " "+ amPm;
        //12:00:05 AM
    }

    public void setHour(int hour) //sets hour using input
    {
        this.hour = hour;
    }

    public void setMin(int min) //sets minutes using input
    {
        this.min = min;
    }

    public void setSeconds(int seconds)  //sets seconds using input
    {
        sec = seconds;
    }

    public void setAMPM(boolean am)  //sets AM or PM using input
    {
        isAm = am;
    }

    //private methods not shown
}