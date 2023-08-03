class OverloadingCalculationOne{
    void sum(int a ,long b ){
        System.out.println(a+b);
    }

    void sum(int a ,int b ,int c ){
        System.out.println(a+b+c);
    }
}


public class Main {
    public static void main(String[] args) {
        OverloadingCalculationOne obj = new OverloadingCalculationOne();

        obj.sum(20 ,20);
        obj.sum(20 ,20 ,20);
    }
}