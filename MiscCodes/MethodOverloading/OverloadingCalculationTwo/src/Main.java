class OverloadingCalculationTwo{
    void sum(int a ,int b){
        System.out.println("int arg method invoked");
    }

    void sum(long a ,long b){
        System.out.println("long arg method invoked");
    }
}

public class Main {
    public static void main(String[] args) {
        OverloadingCalculationTwo obj = new OverloadingCalculationTwo() ;
        obj.sum(20,20);
    }
}