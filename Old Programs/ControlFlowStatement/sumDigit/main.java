
public class main {
    public static void main(String[] args) {
        System.out.println("sum of digits of 256 is " + sumDigits(256));
        System.out.println("sum of digits of 534 is " + sumDigits(534));
        System.out.println("sum of digits of 0 is " + sumDigits(0));
        System.out.println("sum of digits of -243 is " + sumDigits(-243));
        System.out.println("sum of digits of 34527895 is " + sumDigits(34527895));

    }   
    
    private static int sumDigits(int number){
        if(number < 10){
            return -1 ;
        }

        int sum = 0 ;
        while(number > 0){
            int digit = number % 10 ;
            sum += digit ;
            number/=10 ;        //same as number = number /10 
        }
        return sum ;
    }
}
