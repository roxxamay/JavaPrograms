public class DigitSum {
    public static void main(String[] args) {
        getDigitSum(5643);
        getDigitSum(2);
        getDigitSum(-3543541);
        getDigitSum(00054);
    }
    
    public static int getDigitSum(int number) {
        if (number < 0 || number < 10) {
            System.out.println("Invalid number");
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }
        System.out.println("sum of digits : " + sum);
        return sum;
    }
}
