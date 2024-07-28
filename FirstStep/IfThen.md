### Code Explanation

#### Comments as Questions and Answers

1. **What is `if-then`?**
   - `if-then` is a conditional statement that executes a block of code if a specified condition evaluates to `true`. It consists of two parts: the condition (`if`) and the block of code to execute if the condition is met (`then`).

2. **Explain all logical operators and operands with syntax and example.**
   - **Logical AND (`&&`):** Returns `true` if both conditions are `true`.
     ```java
     if (condition1 && condition2) { /* Executes if both condition1 and condition2 are true */ }
     ```
   - **Logical OR (`||`):** Returns `true` if either of the conditions is `true`.
     ```java
     if (condition1 || condition2) { /* Executes if either condition1 or condition2 is true */ }
     ```
   - **Bitwise Operator:** Performs bit-level operations on integers. Commonly used bitwise operators include AND (`&`), OR (`|`), XOR (`^`), NOT (`~`), left shift (`<<`), and right shift (`>>`).
   - **Ternary Operator (`?:`):** A shorthand way of writing an `if-else` statement. It takes three operands: a condition, a result for when the condition is `true`, and a result for when the condition is `false`.
     ```java
     variable = (condition) ? value_if_true : value_if_false;
     ```

3. **Explain logical AND, Logical OR, bitwise operator, ternary operator.**
   - **Logical AND (`&&`):** Used to combine two boolean expressions. The expression evaluates to `true` only if both expressions are `true`.
   - **Logical OR (`||`):** Combines two boolean expressions. The expression evaluates to `true` if at least one of the expressions is `true`.
   - **Bitwise Operator:** Operates on the binary representations of integers. Examples include AND (`&`), OR (`|`), XOR (`^`), NOT (`~`), left shift (`<<`), and right shift (`>>`).
   - **Ternary Operator (`?:`):** A concise way to write simple `if-else` statements. It checks a condition and returns one value if the condition is `true` and another value if it is `false`.

#### Line-by-Line Explanation

```java
public class IfThen {
    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not Alien ! ");
            System.out.println("And I am Scared Of Aliens");
        }
        System.out.println("====================================================================================");
        int topScore = 100;

        if(topScore == 100){
            System.out.println("You got the High Score ! ");
        }
        System.out.println("====================================================================================");

        if(topScore != 100){
            System.out.println("You got the High Score ! ");
        }
        System.out.println("====================================================================================");

        if(topScore >= 100){
            System.out.println("You got the High Score ! ");
        }
        System.out.println("====================================================================================");

        topScore = 80;
        if(topScore <= 100){
            System.out.println("You got the High Score ! ");
        }
        System.out.println("====================================================================================");

        int seconTopScore = 60;
        if (topScore > seconTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100 ! ");            
        }
        System.out.println("====================================================================================");

        if((topScore > 90 ) || (seconTopScore <= 90)){
            System.out.println("Either Or Both Of the Condition is true");
            System.out.println("((topScore > 90 ) || (seconTopScore <= 90))");
        }
        System.out.println("====================================================================================");

        int newValue = 50;
        if (newValue == 50 ) {
            System.out.println("is this error ????????? ");
            System.out.println("naa...         int newValue = 50 ;\n" + //
                                "        if (newValue = 50 ) {\n" + //
                                "            System.out.println(\"is this error ????????? \");\n" + //
                                "        }this will give error");
        }
        System.out.println("====================================================================================");

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("        boolean iscar = false ;\n" + //
                                "        if (iscar = true) {\n" + //
                                "            System.out.println(\"This is Not suppose to happen ....!!!!! \");\n" + //
                                "        }");
            System.out.println("This is Not suppose to happen ....!!!!! ");
        }

        boolean wasCar = isCar ? true : false ;

        if (wasCar) {
            System.out.println("wasCar is True ...!!!");
        }
    }
}
```

#### Dry Run

1. Initialize `isAlien` to `false`. Since `isAlien == false` is `true`, print "It is not Alien!" and "And I am Scared Of Aliens".
2. Print separator.
3. Initialize `topScore` to `100`. Since `topScore == 100` is `true`, print "You got the High Score!".
4. Print separator.
5. Since `topScore != 100` is `false`, do nothing.
6. Print separator.
7. Since `topScore >= 100` is `true`, print "You got the High Score!".
8. Print separator.
9. Change `topScore` to `80`. Since `topScore <= 100` is `true`, print "You got the High Score!".
10. Print separator.
11. Check if `topScore > seconTopScore && topScore < 100`. Since `topScore` is `80` and `seconTopScore` is `60`, `topScore > seconTopScore` is `true` but `topScore < 100` is `false`, so the condition is `false`, do nothing.
12. Print separator.
13. Check if `(topScore > 90 ) || (seconTopScore <= 90)`. Since `topScore` is `80` and `seconTopScore` is `60`, `topScore > 90` is `false` but `seconTopScore <= 90` is `true`, so the condition is `true`, print messages.
14. Print separator.
15. Initialize `newValue` to `50`. Since `newValue == 50` is `true`, print "is this error?" and an explanation of why the assignment in the `if` condition causes an error.
16. Print separator.
17. Initialize `isCar` to `false`. Since `isCar = true` is an assignment, not a comparison, it changes `isCar` to `true`, but then tries to print a message saying it shouldn't happen, which is confusing due to the misuse of the assignment operator.
18. Correct the logic by comparing `isCar` to `true` instead of assigning `true` to it. Since `isCar` is now `true`, print "This is Not suppose to happen ....!!!!! ".
19. Print separator.
20. Use the ternary operator to assign `wasCar` based on `isCar`. Since `isCar` is `true`, `wasCar` is also `true`.
21. Since `wasCar` is `true`, print "wasCar is True ...!!!".

#### Additional Context

This code demonstrates various aspects of conditional statements and logical operators in Java. It starts with simple comparisons and gradually introduces more complex conditions involving logical AND (`&&`), logical OR (`||`), and the ternary operator (`?:`). It also highlights the difference between the equality operator (`==`) and the assignment operator (`=`).