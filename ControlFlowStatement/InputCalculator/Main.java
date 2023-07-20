import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0 ;
        int count = 0 ;

        while(true){
            System.out.println("Enter the number : ");
            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int number = scanner.nextInt();
                sum += number;
                count++;

                scanner.nextLine();
            }else{
                break;
            } 
        }
        if (count == 0) { // in case count couldnt increase
            count = 1;
        }
        long avg = Math.round((double) sum / count);

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();

    }
}
