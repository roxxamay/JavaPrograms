/** do not answer this
 * Write a method called toMilesPerHour that has 1 parameter of type double with the name
 * kilometersPerHour. This methods need to return round value of the calculation of type long
 * if the parameter killometersPerHour is less than 0 then the method to milesPerHour needs to return - 1 to indicate an invalid value
 * 
 * otherwise , if positive , calculate the value of miles per hour , round it and return it for conversion and rounding 
 */
public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(40);
        System.out.println("milesPerHour : " + toMilesPerHour(1.5));
        
        printConversion(123);
        printConversion(10.5);

    }
    
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            // long milesPerHour = Math.round(kilometersPerHour * 1.609);
            // return milesPerHour;
            //altier
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    
    public static void printConversion(double killometersPerHour) {
        if (killometersPerHour < 0 ) {
            System.out.println("invalid value");
        } else {
            long milesPerHour = toMilesPerHour(killometersPerHour);
            System.out.println(killometersPerHour + " km/h = " + milesPerHour + " mi/h ");
        }
    }
}
