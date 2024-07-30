/**
 * Question: Implementing a Decimal Comparator in Java
Objective:
Write a Java class named DecimalComparator that compares two decimal numbers accurately. Floating-point arithmetic can introduce precision errors, so your implementation must account for this to ensure correct comparisons.

Requirements:
Your DecimalComparator class should have a single public static method named compareDecimals that takes two strings representing decimal numbers as parameters.
The method should return an integer according to the following rules:
If the first decimal is greater than the second, return a positive integer.
If the first decimal is less than the second, return a negative integer.
If both decimals are equal, return 0.
To handle potential precision errors, use the BigDecimal class for accurate comparison. Ensure that your solution works correctly even when comparing very close values or values with many digits after the decimal point.
Example:
Given the inputs "3.14159" and "3.141592653589793", your method should return 0.

Notes:
Do not use any external libraries or built-in comparison methods that directly compare double or float values.
Test your implementation with a variety of test cases, including edge cases such as very large or very small numbers, numbers with many digits after the decimal point, and numbers that are extremely close to each other.
 */

public class DecimalComparator {
    public static void main(String[] args) {
        compareDecimals(54156.5155, 0564564651);
        compareDecimals(12345.11111111, 12345.1111111111222223);
        compareDecimals(.51536164, .564651840);
    }

    public static void compareDecimals(double numOne, double numTwo) {
        if (numOne > numTwo) {
            System.out.println(numOne + " is Greater");
        }else if (numOne < numTwo) {
            System.out.println(numTwo + " is greater ");
        } else {
            System.out.println(numOne + " is equal to " + numTwo);
        }
    }
}
