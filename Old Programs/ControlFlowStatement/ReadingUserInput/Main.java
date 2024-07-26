import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter of the BIRTH year : ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();      //handle the next line character [enter key error]

            System.out.println("Enter Your Name : ");
            String name = scanner.nextLine();
            int age = 2023 - yearOfBirth ;

            if(age > 0 && age <=100){
                System.out.println("Your name is " + name + " and your age is " + age);

            }
            else{
                System.out.println("Invalid year");
            }
            
        }else{
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();

        
    }
        
}
