public class Expression {
    public static void main(String[] args) {
        //int numbers
        
        int myFirstNumber = ( 10 + 5 ) + ( 2 * 10 ) ;
        int mySecondNumber = 12 ;
        int myThirdNumber = 23 ;

        //totaling
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber ;

        System.out.println("myTotal is : " + myTotal);

        //challange
        //100 less than myTotal
        int myLastOne = 100 - myTotal ;
        //printing myLast
        System.out.println("myLastOne : " + myLastOne);
    }
}
