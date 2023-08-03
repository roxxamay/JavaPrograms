class AdderDataType{
    static int add(int a ,int b){
        return a+b ;
    }

    static double add(double a ,double b ){
        return a+b ;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(AdderDataType.add(111 ,111));
        System.out.println(AdderDataType.add(12.3 , 12.5));
    }
}