//question to answer
//explain and give the java operator precedence table
//

public class OperatorsChallange {
    public static void main(String[] args) {
        double first = 20.00d ;
        double second = 80.00d ;
        
        double sum = ( first + second ) * 100.00 ;
        System.out.println("the sum is : " +sum);
        int remainder = (int)(sum % 40.00) ;
        System.out.println("the remainder is : " +remainder);


        boolean isRemZero = (remainder == 0 ) ? true : false ;

        System.out.println("Is remainder Is Zero [ 1 = true , 0 = false ]   :   " + isRemZero);

        if (isRemZero == true) {
            System.out.println("there is no remainder ............ ! ");
        }
        else {
            System.out.println("there is some remainders ............. ! ");
        }
        
    }
}
