

public class CalculateIntrest {
    public static void main(String[] args) {
        for (int Rate = 2; Rate <= 8; Rate++) {
            System.out.println("intrest is equalls to " + intrest(10000, Rate));

        }

        for(int Rate = 8 ;Rate >= 2 ; Rate --){
            System.out.println( "intrest is equalls to " + intrest(10000, Rate));
        }
    }   

    private static double intrest(double amount , double intrestRate){

        return (amount*(intrestRate/100));
    }
}
