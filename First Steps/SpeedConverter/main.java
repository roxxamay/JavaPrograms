
public class main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.50);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.50);
    }   
}
