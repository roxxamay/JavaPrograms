public class Main {

    public static void main(String[] args) {
        sum(324876);
    }

    private static void sum(int number){
        int last = number % 10 ;
        
        while (number >= 10 ){
            number /= 10 ;
       }

       int total = last + number ;

       System.out.println("sum of the first and last digit is " + total);
    }
}
