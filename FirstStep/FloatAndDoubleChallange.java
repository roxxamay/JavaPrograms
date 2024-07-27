public class FloatAndDoubleChallange {
    public static void main(String[] args) {

        //init values
        int myIntValue = 5 / 3 ;
        float myFloatValue = 5f / 3f ;
        double myDoubleValue = 5d / 3d;

        //printing values
        System.out.println("int myIntValue = 5 / 3 : " +myIntValue);
        System.out.println("Float myFloatValue = 5f / 3f : " +myFloatValue);
        System.out.println("double myDoubleValue = 5d / 3d : " +myDoubleValue);

        //v2 
        int myIntValueV2 = 5 / 3 ;
        float myFloatValueV2 = 5f / 3f ;
        double myDoubleValueV2 = 5.00 / 3.00;

        //printing values
        System.out.println("int myIntValueV2 = 5 / 3 : " +myIntValueV2);
        System.out.println("Float myFloatValueV2 = 5f / 3f : " +myFloatValueV2);
        System.out.println("double myDoubleValueV2 = 5.00 / 3.00 : " +myDoubleValueV2);
        //tips alwasy use double in the place of float int java ..... why???
    }
}
