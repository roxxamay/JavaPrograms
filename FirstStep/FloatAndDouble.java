public class FloatAndDouble {
    public static void main(String[] args) {
        //define floating points number with example
        //define single precision number
        float myMinFloatValue = Float.MIN_VALUE ;
        float myMaxFloatValue = Float.MAX_VALUE ;

        //printing the value of min and max of float

        System.out.println("Float Min value = " + myMinFloatValue);
        System.out.println("Float Max value = " + myMaxFloatValue);

        //define double number
        //define double precision number
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE ;

        //printing the value of min and max of Max 

        System.out.println("Double Min Value : " + myMinDoubleValue);
        System.out.println("Double Max Value : " + myMaxDoubleValue);


        // int myIntValue = 5 ;
        // Float myFloatValue = 5.2 ;
        // double myDoubleValue = 5.2 ;
        //these can be written as 
        int myIntValue = 5 ;
        Float myFloatValue = 5.2f ;
        double myDoubleValue = 5.2d ;

        //now casting of these
        int myIntValueCast = 5 ;
        Float myFloatValueCast = (float)5.2 ;
        double myDoubleValueCast = (double)5.2 ;
        
        System.out.println();
        System.out.println("Before Casting : ");
        System.out.println("myIntvalue : " +myIntValue);
        System.out.println("myFloatvalue : " +myFloatValue);
        System.out.println("myDoublevalue : " +myDoubleValue);

        System.out.println();
        System.out.println("After Casting same number : ");
        System.out.println("myIntValueCast : " + myIntValueCast);
        System.out.println("myFloatValueCast : " + myFloatValueCast);
        System.out.println("myDoubleValueCast : " + myDoubleValueCast);

    }
}
