public class Loop {
    public static void main(String[] args) {
        System.out.println("10000 at 3% intrest = " + calcIntrest(10000, 3));
        System.out.println( "10000 at 4% intrest = " + calcIntrest(10000, 4));
        System.out.println( "10000 at 5% intrest = " + calcIntrest(10000, 5));
        System.out.println("10000 at 6% intrest = " + calcIntrest(10000, 6));
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> this is for test purpose");

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + "hello!");
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> this is for test purpose");


        for (int i = 2; i < 9; i++) {
        System.out.println("10000 at " +i + "% intrest = " + calcIntrest(10000, i));
            
        }
        
    }
    
    public static double calcIntrest(double amount, double intrestRate) {
        return (amount * (intrestRate / 100));
    }
}
