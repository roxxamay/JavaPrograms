

public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }   
    public static boolean isPerfectNumber(int number){
        int sumOfProperDivisor = 0 ;
        if(number > 0 ){
            for(int i = 1 ; number > i ; i++ ){
                if(number % i == 0 ){
                    sumOfProperDivisor += i ;
                }
            }
             return (sumOfProperDivisor == number);

        }
        return false ;
    } 
}
