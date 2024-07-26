public class PrimitiveTypesChallange{
    public static void main(String[] args) {
        byte byteValue = 10 ;
        short shortValue = 20 ;
        int intValue = 30 ;

        long longValue = 50000L + 100L * ( byteValue + shortValue + intValue ) ; 

        System.out.println("Long total" + longValue);
        //now casting
        
        short shortTotal =(short) (50000L + 100L * ( byteValue + shortValue + intValue )) ;
        System.out.println("Short total" + shortTotal);
    }
}