public class calcFeetAndInchesToCentimeter{

    public static double calcFeetAndInchesToCentimeter(double feet,double inches){
        if((feet < 0) || ((inches < 0) && (inches >12))){
            System.out.println("invalid argument");
            return -1 ;
            
        }
        double centimeters = (feet * 12) * 2.54 ;
        centimeters += inches * 2.54 ;
        System.out.println(feet + "feet,"+ inches + "inches = " + centimeters + "cm");

        return centimeters ;

    }


}