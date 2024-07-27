public class CharAndBoolean {
    public static void main(String[] args) {
        //answer these questions
        //difference between char and string
        //define char and its size
        //define Unicode and its size , representation
        //define boolean and its size
        
        char myChar = 'D' ;
        char myUnicodeChar = '\u0044' ;

        System.out.println("char myChar = 'D'  : " + myChar);
        System.out.println("char myUnicodeChar = '\u0044' : " + myUnicodeChar);

        //copyright char
        char myCopyrightChar = '\u00A9' ;
        System.out.println("char myCopyrightChar = '\u00A9' : " + myCopyrightChar);
        
        boolean myTrueBooleanValue = true ;
        boolean myfalseBooleanValue = false ;

        boolean isCustomerOverTwentyOne = true ;

        //printing bool
        System.out.println("boolean myTrueBooleanValue = true : " + myTrueBooleanValue);
        System.out.println("boolean myfalseBooleanValue = false : " + myfalseBooleanValue);
        System.out.println("boolean isCustomerOverTwentyOne = true : " + isCustomerOverTwentyOne);
    }
}
