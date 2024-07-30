/**
 * Problem Statement
Implement a function named feetToCentimeters that accepts one parameter, feet, and returns the equivalent length in centimeters.

Signature
public int feetToCentimeters(int feet);
Example
Given the integer feet = 10, the function should return 304.8.

Constraints
The input feet will be within the range [1, 2^31 - 1].
The value of each pixel in the input image is either black or white, represented by 0 or 1, respectively.
Explanation
Write a Java method within the FeetToCentimeters class to convert a height from feet to centimeters. One foot is equal to 30.48 centimeters.

Note
Your solution should handle edge cases such as negative inputs or inputs outside the specified range.
 */

public class FeetToCentimeters {
    public static void main(String[] args) {
        feetToCentimeters(53465);
        feetToCentimeters(56455651);
    }

    public static void feetToCentimeters(int feet) {
        System.out.println(feet + "feet is equual to " + (feet * 30.48) + "cm");
    }
}
