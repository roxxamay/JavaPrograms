/**
 * Question: Implementing Equal Sum Checker
Objective:
Create a Java class named EqualSumChecker that checks whether two arrays have equal sums. The class should provide a static method named hasEqualSums(int[] array1, int[] array2) that takes two integer arrays as input and returns a boolean value indicating whether the sum of elements in both arrays is equal.

Requirements:
The method should handle cases where one or both arrays are empty. In such cases, it should return true.
Ensure that the method works correctly even when the arrays contain negative numbers.
Write unit tests to verify the correctness of your implementation against the following test cases:
Two empty arrays should return true.
An array with all zeros and another array with any non-zero values should return true.
Arrays with different sums should return false.
Arrays with the same sum but different orders of elements should return true.
Example:
Given the following inputs:

array1 = {1, 2, 3} and array2 = {3, 2, 1}
array1 = {} and array2 = {}
The method should return true for both cases since the sums of elements in both arrays are equal.

Notes:
Your solution should not modify the input arrays.
Consider edge cases and ensure your method handles them gracefully.
 */

public class EqualSumChecker {
    public static void main(String[] args) {
        int[] arrOne = { 1,3,3, 2, 3 };
        int[] arrTwo = { 3, 2, 1 };
        hasEqualSums(arrOne, arrTwo);
    }

    public static void hasEqualSums(int[] arrOne, int[] arrTwo) {
        int sumArrOne = 0;
        for (int i = 0; i < arrOne.length; i++) {
            sumArrOne = sumArrOne + arrOne[i];
        }
        int sumArrTwo = 0;
        for (int i = 0; i < arrTwo.length; i++) {
            sumArrTwo = sumArrTwo + arrTwo[i];
        }

        if (sumArrOne == sumArrTwo) {
            System.out.println("array one is equal to array two");
        } else {
            System.out.println("array one is not equal to array two");
        }
    }
}
