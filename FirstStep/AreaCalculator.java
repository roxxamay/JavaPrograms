/**
 * Question: Implementing Area Calculation with Method Overloading
Objective:
Design and implement a Java class named AreaCalculator that calculates areas for various shapes. Your implementation should utilize method overloading to handle different types of shapes (e.g., circle, rectangle, triangle). Each shape will have its own area calculation logic within overloaded methods.

Requirements:
Class Design: Create a class named AreaCalculator.
Method Overloading: Implement overloaded methods for calculating the area of different shapes. At least three shapes must be included (circle, rectangle, and triangle).
A method for calculating the area of a circle, taking the radius as a parameter.
A method for calculating the area of a rectangle, taking length and width as parameters.
A method for calculating the area of a triangle, taking the base and height as parameters.
Shape Parameters: Ensure that each method signature is unique and correctly reflects the shape it calculates the area for.
Output: Each method should return the calculated area as a double value.
Example Usage: Provide example usage of your AreaCalculator class in the form of a main method or separate test cases to demonstrate how to calculate the area of each shape.
Notes:
Consider edge cases such as negative values for dimensions. Handle these appropriately within your methods.
Use descriptive variable names and ensure your code is clean and well-commented.
Submission Guidelines:
Submit your Java source code file (AreaCalculator.java) containing the implementation of the AreaCalculator class along with any additional comments explaining your design choices or challenging aspects of the problem.
 */

public class AreaCalculator {
    public static void main(String[] args) {
        calcArea(31563);
        calcArea(23151, 5233);
        calcArea(351, 241, 352);
    }
    
    public static long calcArea(double length, double breadth) {
        if (length < 0 || breadth < 0 ) {
            System.out.println("invalid value");
            return -1;
        }
        System.out.println("Area of rectangle : " + (long)(length * breadth));
        return (long)(length * breadth);
    }

    public static long calcArea(double radius) {
        if (radius < 0) {
            System.out.println("invalid value");
            return -1;
        }
        System.out.println("Area of Circle : " + (long)(3.14 * radius * radius));
        return (long) (3.14 * radius * radius);
    }

    public static long calcArea(double sideOne, double sideTwo, double sideThree) {
        if (sideOne < 0 || sideTwo < 0 || sideThree < 0 ) {
            return -1;
        }
        double s = sideOne + sideTwo + sideThree ;
        System.out.println(
                "Area of Triangl : " + (long) (Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree))));
        return (long) (Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree)));
    }
}