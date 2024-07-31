//tell me every thing in detail about method overloading

public class FeetAndInchesToCentimeters {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(64545);
        calcFeetAndInchesToCentimeters(545, 54654);
        calcFeetAndInchesToCentimeters(-41, 55);
        calcFeetAndInchesToCentimeters(-454);
        calcFeetAndInchesToCentimeters(45415, -545);
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(157);
    }
    
    public static long calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        } else {
            System.out.println(feet + "feet "+ inches + "inches = " + (long) ((feet * 12 * 2.54) + (inches * 2.54)) + "cm");

            return (long) ((feet * 12 * 2.54) + (inches * 2.54));
        }
    }
    public static long calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0 ) {
            return - 1;
        } else {
            System.out.println(((int ) inches / 12) + "feet   " + ((int) inches % 12) + "inches");
            return calcFeetAndInchesToCentimeters(((int ) inches / 12) , ((int) inches % 12));
        }
    }
    
}
