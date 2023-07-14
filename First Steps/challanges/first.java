

public class first{
    public static void main(String[] args) {
        double myDouble = 20.00d ;
        double mySecondDouble = 80.00d ;
        double result = ( myDouble + mySecondDouble ) * 100 ;
        double remainder = result % 40.00 ;

        System.out.println("remainder is " + remainder);

        boolean var = remainder == 0 ? true : false ; 

        System.out.println("boolean variable is " + var);

        if(!var){
            System.out.println("got some remainder");
        }
    }
}