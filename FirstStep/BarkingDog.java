/**
 * Problem Statement:

Implement a simple Java class named BarkingDog. This class should have a method that determines whether the dog barks based on the time of day (morning, afternoon, evening, night). Specifically, the dog barks only during the morning (from 7 AM to 8 AM) and does not bark at any other time of the day.

Requirements:

Class Name: The class must be named BarkingDog.
Method: Implement a method named shouldBark(String hourOfDay) that takes a string parameter representing the current hour of the day and returns a boolean value indicating whether the dog should bark.
The input string will represent the hour of the day in 24-hour format (e.g., "1" for 1 AM, "14" for 2 PM).
Return true if the dog should bark (i.e., between 7 AM and 8 AM), otherwise return false.
 */
public class BarkingDog {
    public static void main(String[] args) {
        //enter the time in 24hr 
        shoudBark(14);
        shoudBark(7);
    }
    
    public static int shoudBark(int hourOfDay) {
        if (hourOfDay >= 7 && hourOfDay <= 8) {
            System.out.println("The Dog Will Bark at : " + hourOfDay);
            return 1;
        } else {
            return 0;
        }
    }
}
