/**
 * MegaBytes Converter Project
Objective:
Create a Java console application named MegaBytesConverter that allows users to convert bytes to kilobytes (KB) and then to megabytes (MB).

Requirements:
User Input:
Prompt the user to enter a value representing the number of bytes they wish to convert.
Ensure the input is valid (i.e., a positive integer or zero).
Provide feedback to the user if the input is invalid.
Conversion Logic:
Convert the entered byte value to kilobytes (1 KB = 1024 bytes).
Then, convert the result to megabytes (1 MB = 1024 KB).
Output:
Display the converted values to the user in a clear and understandable format.
Example Usage:
Enter the number of bytes: 500000
500 KB = 0.488 MB
Notes:
Use appropriate variable names and add comments to explain your code.
Consider edge cases such as very large inputs and ensure your program handles them gracefully.
Test your program with various inputs to ensure accuracy.
 */


public class MegaBytesConverter {
    public static void main(String[] args) {

        printMB(1238);
        printMB(1564513);
        printMB(124154);
        printMB(14564);
        printMB(125456);


    }
    
    public static long kbToMb(double kb) {
        if (kb < 0) {
            return -1;
        } else {
            return Math.round(kb / 1024);
        }
    }
    
    public static void printMB(double kb) {
        if (kb < 0) {
            System.out.println("invalid value");
        } else {
            long mb = kbToMb(kb);
            System.out.println(kb + " KB = " + mb + " MB ");
        }

    }
}
