/**
 * Question: Implement a Leap Year Calculator in Java
Objective:
Create a Java application named LeapYearCalculator that determines whether a given year is a leap year or not. A leap year is a year that is divisible by 4, but not by 100 unless it is also divisible by 400. However, years that are only divisible by 100 are not leap years, unless they are also divisible by 400.

For example, the year 2000 was a leap year because it is divisible by both 4 and 400. The year 1900 was not a leap year even though it is divisible by 4, because it is not divisible by 400.

Requirements:
User Input: Your program should prompt the user to enter a year.
Leap Year Calculation: Based on the input year, calculate whether it is a leap year or not according to the rules mentioned above.
Output: Display the result to the user indicating whether the entered year is a leap year or not.
Example:
If the user enters 2020, the program should output: Yes, 2020 is a leap year.

If the user enters 2021, the program should output: No, 2021 is not a leap year.

Notes:
Ensure your program handles invalid inputs gracefully, such as non-numeric characters or negative numbers.
Use appropriate comments throughout your code to explain the logic and any assumptions made
 */

public class LeapYearCalculator {
    public static void main(String[] args) {
        isLeap(1234);
        isLeap(2005);
        isLeap(0152);
        isLeap(2314);
        isLeap(1234);
        isLeap(5432);
        isLeap(2334);
        isLeap(2004);
        isLeap(2008);
        isLeap(1900);
        isLeap(1600);
        isLeap(2000);



    }
    public static void isLeap(int year)
    {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
