//If there are no matching type arguments in the method,
// and each method promotes similar number of arguments, there
// will be ambiguity

class OverloadingCalculationThree{
    void sum(int a , long b){
        System.out.println("a method invoked");
    }

    void sum(long a , int b){
        System.out.println("b method invoked");
    }
}


public class Main {
    public static void main(String[] args) {
        OverloadingCalculationThree obj = new OverloadingCalculationThree();

        obj.sum(20 , 20);
    }
}