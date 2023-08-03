

public class DayOfTheWeekChallange {
    public static void main(String[] args) {
        DayName(0);
        DayName(1);
        DayName(2);
        DayName(3);
        DayName(4);
        DayName(5);
        DayName(6);
        DayName(7);

    }   
    
    public static void DayName(int DayNumber){
        switch(DayNumber)
        {
            case 1:
                    System.out.println("it is monday");
                    break ;
            
            case 2:
                    System.out.println("it is tuesday");
                    break;
            case 3:
                    System.out.println("it is wednesday");
                    break;
            case 4:
                    System.out.println("it is Thursday");
                    break;

            case 5:
                    System.out.println("it is friday");
                    break;
            case 6:
                    System.out.println("it is saturday");
                    break;

            case 0:
                    System.out.println("it is sunday");
                    break;

            default : System.out.println("not valid");
                        break ;
        }   

    }
}
