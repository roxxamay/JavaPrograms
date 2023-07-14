

class lastDigitChecker{
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(231, 372, 423));
        System.out.println(hasSameLastDigit(91, 991, 532));
    }
    public static boolean hasSameLastDigit(int firstNumber , int secondNumber , int thirdNumber ){
        if((firstNumber >= 10 && firstNumber <= 1000) && (secondNumber >= 10 && secondNumber <= 1000) || (thirdNumber >=10 && thirdNumber <= 1000)){
            System.out.println("does any of the given number share a last digit (" +firstNumber + "," +secondNumber + "," +thirdNumber +")????????");
            return ((firstNumber % 10 == secondNumber % 10) || (firstNumber % 10 == thirdNumber % 10) || (secondNumber % 10 == thirdNumber % 10 ));
        }

        System.out.println("invalid Input");
        return false ;
    }
}