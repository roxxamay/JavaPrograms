/**
 * 
 */

public class SumOdd {
    public static void main(String[] args) {
        sumOdd(11, 54);
        sumOdd(1, 0);
        sumOdd(1, 9999);
        sumOdd(1, 555);
        sumOdd(88, 11);
    }
    
    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || start > end) {
            System.out.println("invalid number");
            return -1;
        }
        int sum = 0 ;
        for (int i = start; end > i; i++) {
            sum += i;
        }
        System.out.println("sum of add number from " + start + " to " + end + " is : " + sum);
        return sum ;
    }

    public static boolean isOdd(int number) {
        if (number < 0 ) {
            return false;
        } else if (number % 2 == 1) {
            return true;
        }
        return false;
    }
}
