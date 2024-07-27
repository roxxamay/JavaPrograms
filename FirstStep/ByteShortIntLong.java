public class ByteShortIntLong {
    public static void main(String[] args) {

        //int

        int myValue = 10000 ;

        //determine range of Int
        int myMinIntValue = Integer.MIN_VALUE ;
        int myMaxIntValue = Integer.MAX_VALUE ;

        //printing min and max of Int

        System.out.println("Int Min Value : " + myMinIntValue);
        System.out.println("Int Max Value : " + myMaxIntValue);
        //busted max min Int number
        System.out.println("Busted Max Int Value : " + (myMaxIntValue + 1 ));           //overflow
        System.out.println("Busted Min Int Value : " + (myMinIntValue - 1 ));           //underflow

        //byte
        byte myMinByteValue = Byte.MIN_VALUE ;
        byte myMaxByteValue = Byte.MAX_VALUE ;

        //printing min and max of byte

        System.out.println("Byte Max Value : " + myMaxByteValue);
        System.out.println("Byte Min Value : " + myMinByteValue);
        //busted min and Min of Byte
        System.out.println("Busted Max Byte Value : " + ( myMaxByteValue + 1 ));
        System.out.println("Busted Min Byte Value : " + ( myMinByteValue - 1 ));

                //short
        short myMinShortValue = Short.MIN_VALUE ;
        short myMaxShortValue = Short.MAX_VALUE ;

        //printing min and max of Short

        System.out.println("Short Max Value : " + myMaxShortValue);
        System.out.println("Short Min Value : " + myMinShortValue);
        //busted min and Min of Short
        System.out.println("Busted Max Short Value : " + ( myMaxShortValue + 1 ));
        System.out.println("Busted Min Short Value : " + ( myMinShortValue - 1 ));


        //long

        long myLongValue = 100L ;

        long myMinLongValue = Long.MIN_VALUE ;
        long myMaxLongValue = Long.MAX_VALUE ;

        //printing min and max of Long

        System.out.println("Long Max Value : " + myMaxLongValue);
        System.out.println("Long Min Value : " + myMinLongValue);
        //busted min and Min of Long
        System.out.println("Busted Max Long Value : " + ( myMaxLongValue + 1 ));
        System.out.println("Busted Min Long Value : " + ( myMinLongValue - 1 ));

        //checking something
        // short bigShortLiteralValue = 32768 ;                  //overflow
        short bigShortLiteralValue = 32767 ;
        System.out.println("bigShortLiteralValue is : " + bigShortLiteralValue);
    }
}
