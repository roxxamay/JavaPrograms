public class PrimitiveTypeChallange {
    public static void main(String[] args) {
        
        //creating a byte var
        byte MyByteValue = Byte.MAX_VALUE ;
        
        //create a short variable
        short myShortValue = Short.MAX_VALUE ;

        //create a int variable
        int myIntvalue = Integer.MAX_VALUE ;

        //createing a Long i.e equals 50000 + 10 * sum of all
        long myLongvalue = 50000 + 10 * ( MyByteValue + myShortValue + myIntvalue );
        System.out.println("myLongValue : " + myLongvalue );

        //extra stuff
        short myShortTotal = (short)(5000 + 10 * ( MyByteValue + myShortValue + myIntvalue ));
        System.out.println("myShortTotal  :  " + myShortTotal);
    }
}
