public class DayOfWeek {
    public static void main(String[] args) {
        printDayOfWeek(5);
        printDayOfWeek(15);
        printDayOfWeek(2);
        printDayOfWeek(6);
        printDayOfWeek(0);
        printDayOfWeek(-5);
    }
    
    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("it is Sunday");
                break;
            case 1:
                System.out.println("it is monday");
                break;
            case 2:
                System.out.println("it is tuesday");
                break;
            case 3:
                System.out.println("it is wednesday");
                break;
            case 4:
                System.out.println("it is thursday");
                break;
            case 5:
                System.out.println("it is friday");
                break;
            case 6:
                System.out.println("it is saturday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}
