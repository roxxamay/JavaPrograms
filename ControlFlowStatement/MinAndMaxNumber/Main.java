import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minValue = Integer.MAX_VALUE;       //bcox if we put 0 the default min value will be always zero
        int maxValue = Integer.MIN_VALUE;       //and in java the deafault is also zero

        while(true){
            System.out.println("Enter Number : ");
            boolean asAnInt = scanner.hasNextInt();

            if(asAnInt){
                int number = scanner.nextInt();

                if(number > maxValue){
                    maxValue = number;
                }

                if(number < minValue){
                    minValue = number ;
                }
            }else{
                System.out.println("Invalid Number");
                break;
            }
        }
        System.out.println("MIN Number is " + minValue + " and MAX Number is "+ maxValue);
        scanner.close();
    }
}
