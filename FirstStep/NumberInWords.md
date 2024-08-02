### Code Explanation

#### Code Before Explanation

```java
public class NumberInWords {
    public static void main(String[] args) {
        printNumberInWords(-21);
        printNumberInWords(0);
        printNumberInWords(9);
        printNumberInWords(10);
    }

    public static void printNumberInWords(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1 :
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}
```

#### Explanation

1. **Class Declaration (`public class NumberInWords`)**:

   -  `public`: Access modifier indicating the class can be accessed from anywhere.
   -  `class`: Keyword used to declare a class.
   -  `NumberInWords`: Name of the class.

2. **Method Declaration (`public static void main(String[] args)`)**:

   -  `public`: Access modifier, meaning the method can be called from anywhere.
   -  `static`: Indicates that the method belongs to the `NumberInWords` class rather than instances of the class.
   -  `void`: Specifies that the method does not return any value.
   -  `main`: The entry point for the application.
   -  `(String[] args)`: Parameter representing command-line arguments passed to the program.

3. **Method Invocation (`printNumberInWords(-21);`, `printNumberInWords(0);`, `printNumberInWords(9);`, `printNumberInWords(10);`)**:

   -  Calls to the `printNumberInWords` method with different integer arguments.

4. **Method Definition (`public static void printNumberInWords(int number)`)**:

   -  `public`: Access modifier.
   -  `static`: Indicates the method is associated with the class itself, not instances of the class.
   -  `void`: Specifies no return value.
   -  `printNumberInWords`: Name of the method.
   -  `(int number)`: Parameter representing the number to be converted to words.

5. **Switch Statement**:

   -  A control flow statement used to select one of many code blocks to execute.
   -  Each `case` corresponds to a possible value of the `number` parameter.
   -  `default`: Executes when none of the cases match the `number`.

6. **System.out.println Statements**:

   -  Prints the string representation of the specified objects to the console.

7. **Break Statement**:
   -  Terminates the switch statement and transfers execution to the statement following the switch block.

#### Comments as Questions and Answers

-  **Q:** What does the `public` keyword do?

   -  **A:** The `public` keyword is an access modifier that allows a class, method, or variable to be accessible from any other class.

-  **Q:** How does the `switch` statement work?
   -  **A:** The `switch` statement evaluates an expression and executes the block of code corresponding to the matching case. If no case matches, the `default` block is executed.

#### Dry Run

Given the inputs `-21`, `0`, `9`, `10`, here's how the code would execute:

1. **For `-21`:**

   -  Since there's no case for negative numbers, it falls to the `default` case, printing `"OTHER"`.

2. **For `0`:**

   -  Matches the `case 0:` block, printing `"ZERO"`.

3. **For `9`:**

   -  Matches the `case 9:` block, printing `"NINE"`.

4. **For `10`:**
   -  Matches the `case 10:` block, printing `"TEN"`.

#### Additional Context

This Java program demonstrates the use of the `switch` statement to convert integers to their word equivalents. It's a simple example of control flow and conditional logic in Java. The program could be expanded to handle a wider range of numbers and improve error handling for invalid inputs.
