import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("enter the number : ");
            int number = scanner.nextInt();

            System.out.println("::::::::::::::::enter the desirable value :::::::::::::::::::");
            System.out.println("1 . check even number or odd number ");
            System.out.println("2 . check negative number or not ");
            System.out.println("3 . check palindome number or not ");
            System.out.println("4 . check armstrong number or not ");
            System.out.println("5 . check prime number or not ");

            System.out.println("0 . exit");
            int option = scanner.nextInt();

            switch (option){
                case 1 : evenOrOdd(number);
                            break;
                case 2 :negOrPos(number);
                            break;
                case 3 : checkPalindrome(number);
                        break;
                case 4 : checkArmstrong(number);
                        break;
                case 5 : checkPrime(number );
                            break;
                case 0 : return;

                default:
                    System.out.println("Invalid value..........try later");
            }

        }
    }


    private static void evenOrOdd(int number){
        if (number >= 0 ){
            if(number % 10 == 0){
                System.out.println( number + " is even ");
            }else {
                System.out.println(number + " is odd ");
            }
        }else {
            System.out.println("number is negative");
        }
    }

    private static void negOrPos(int number){
        if (number >= 0){
            System.out.println( + number + " is positive");
        }else {
            System.out.println( number + " is negative ");
        }
    }

    private static void checkPalindrome(int number){
        int temp = number ;
        int sum =0 ;
        int rem ;

        while (number > 0){
            rem = number % 10 ;
            sum = (sum * 10 ) + rem ;
            number /= 10 ;
        }
        if (temp == sum){
            System.out.println(temp + " is palindrome number");
        }
        else {
            System.out.println(temp + " is not palindrome number");
        }
    }

    private static void checkArmstrong(int number){
        int temp ;
        int digits = 0 ;
        int last = 0;
        int sum = 0 ;
        temp = number ;

        while (temp > 0){
            temp = temp /10 ;
            digits++;
        }
        temp = number ;

        while (temp > 0){
            last = temp % 10 ;
            sum+= (Math.pow(last,digits));
            temp = temp / 10;
        }

        if (number == sum){
            System.out.println(number + " is Armstrong number");
        }
        else {
            System.out.println(number + " is not Armstrong number ");
        }
    }

    private static void checkPrime(int number){
        if(number == 1){
            System.out.println(number + " is not prime number");
            return;
        }

        for(int i = 2 ; i <= number / 2 ; i ++){
            if(number % i == 0 ){
                System.out.println(number + " is not prime number");
                return;
            }
        }
        System.out.println(number + " is prime number ");
    }
}