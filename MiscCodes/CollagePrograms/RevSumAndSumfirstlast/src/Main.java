import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("enter the number : ");
            int number = scanner.nextInt();

            System.out.println("::::::::::::::::enter the desirable value :::::::::::::::::::");
            System.out.println("1 . reverse of the number ");
            System.out.println("2 . sum of the digits");
            System.out.println("3 . sum of the first and last digit ");
            System.out.println("0 . exit");
            int option = scanner.nextInt();

            switch (option){
                case 1 : reverse(number);
                            break;
                case 2 :
                    System.out.println("sum of digits is : " + sumDigit(number));
                            break;
                case 3 : sum(number);
                            break;
                case 0 : return;
            }

        }


    }

    public static void reverse(int number) {
        int rev = 0;
        int remainder = 0;
        while (number != 0) {
            remainder = number % 10;
            rev = rev * 10 + remainder ;
            number /= 10;
        }
        System.out.println("the reverse of the number is " + rev);

    }

    public static int sumDigit(int number){
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

    public static void sum(int number){
        int last = number % 10 ;

        while (number >= 10 ){
            number /= 10 ;
        }

        int total = last + number ;

        System.out.println("sum of the first and last digit is " + total);
    }
}