
public class sharedDigit {
    public static void main(String[] args) {

        
        System.out.println(hasSharedDigit(9, 90));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 93));
        System.out.println(hasSharedDigit(77, 17));
        System.out.println(hasSharedDigit(74, 47));
    }

    public static boolean hasSharedDigit(int firstNumber , int secondNumber){
        if((firstNumber >= 10 && firstNumber <=99) ||(secondNumber >=10 && secondNumber <= 99)){
            int firstNumberLastDigit = firstNumber % 10 ;
            int secondNumberLastDigit = secondNumber % 10 ;


            int firstNumberFirstDigit = firstNumber /= 10 ;
            int secondNumberFirstDigit = firstNumber /=10 ;

            return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberLastDigit) || (firstNumberLastDigit == secondNumberFirstDigit) || (firstNumberLastDigit == secondNumberLastDigit)) ;
        }
        else{
            System.out.println("Invalid Input");
            return false ;
        }
    }
}
