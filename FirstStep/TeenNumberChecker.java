/**
 * Question: Teen Number Checker
Objective:
Write a Java class named TeenNumberChecker that takes an integer as input and returns a string indicating whether the input represents a valid teenage age. A valid teenage age is defined as any integer between 13 and 19, inclusive.

Requirements:
Your program must have a single public static method named isTeenager that accepts an integer as its parameter.
The method should return a string. If the input is within the range of 13 to 19, it should return "Yes". Otherwise, it should return "No".
Example:
Given the following inputs:

isTeenager(15) should return "Yes"
isTeenager(20) should return "No"
Notes:
Ensure your solution handles edge cases such as negative numbers and non-integer inputs appropriately.
Consider adding comments to explain your code, making it easier for others to understand.
 */

public class TeenNumberChecker {
    public static void main(String[] args) {
        isTeen(12);
        isTeen(34);
        isTeen(17);
    }

    public static void isTeen(int age) {
        if (age >= 13 && age <= 18) {
            System.out.println("He/She is teen");
        } else {
            System.out.println("he/she is not teen");
        }
    }
}
