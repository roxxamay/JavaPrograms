
public class FloatAndDouble {
    public static void main(String[] args) {
        //for float value

        float myMinFloatValue = Float.MIN_VALUE ;
        float myMaxFloatValue = Float.MAX_VALUE ;

        // now printing the value

        System.out.println("Minimum float value = " + myMinFloatValue);
        System.out.println("Maximum Float Value = " + myMaxFloatValue);

        //now for double value

        double myMinDoubleValue = Double.MIN_VALUE ;
        double myMaxDoubleValue = Double.MAX_VALUE ;

        //now printing the double value

        System.out.println("Minimum Double Value = " + myMinDoubleValue);
        System.out.println("Maximum Double Value = " + myMaxDoubleValue);

        //now casting

        int myIntValue = 10 ;
        
        float myfloatValue = 20.4f ; //or, = (float) 20.4      which is commonly used

        double myDoubleValue =30.4d ;   //or = (double) 30.4   which is commanly used

        //printing the casting value

        System.out.println("my int value = " + myIntValue);
        System.out.println("my float value = " + myfloatValue);
        System.out.println("my double value = " + myDoubleValue);
    }
}
