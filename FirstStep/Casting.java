public class Casting {
    public static void main(String[] args) {
        
        //init into byte
        byte myMinByte = Byte.MIN_VALUE ;

        byte myNewByteValue = (byte)( myMinByte / 2 ) ;             //casting into byte
        System.out.println("myNewByteValue casted no : " + myNewByteValue );

        //explain casting 

        short myNewShortValue = (short)( Short.MIN_VALUE / 2 );             //casting into short
        System.out.println("myNewByteValue casted no : " + myNewShortValue );       
    }
}
