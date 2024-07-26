public class ByteShortIntLong {

    public static void main(String[] args) {
        
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        //now printing the value

        System.out.println("My Minimum Value = " + myMinValue);
        System.out.println("My Maximum Value =" + myMaxValue);
        

        //now busted max and min numbers

        System.out.println("Busted Minimum Number = " + (myMinValue - 1));
        System.out.println("Busted Maximum Number = " + (myMaxValue + 1));

        //we can also write number using underscore to easy understanding

        int myTestValue = 2_147_483_647;
        System.out.println("Testing underscore with numbers = " + myTestValue);

        //now for the byte types
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte maximum Value = " + myMaxByteValue);

        // now for the Short types

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short maximum Value = " + myMaxShortValue);


        //for declaring and putting value in long container we should use suffix "L" because if we dont use it compiler will treat it like a int value

        long myLongValue = 2349867845L ;
        System.out.println("Testing myLongValue = " + myLongValue);

        // now for the Long types

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long maximum Value = " + myMaxLongValue);

        //now casting

        int myNewValue = (myMinValue / 2) ;

        byte myNewByteValue = (byte) (myMinByteValue / 2 );

        short myNewShortValue = (short) (myMinShortValue / 2 );

        System.out.println("myNewValue = " + myNewValue);
        System.out.println("myNewByteValue = " + myNewByteValue);
        System.out.println("myNewShortValue = " + myNewShortValue);

    }
}