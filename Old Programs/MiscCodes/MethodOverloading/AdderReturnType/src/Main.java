//In java, method overloading is not possible
// by changing the return type of the method only because
// of ambiguity

class AdderReturnType{
    static int add(int a ,int b){
        return a+b ;

    }

    static double add(int a ,int b){
        return a+b ;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(AdderReturnType.add(11,11));
    }
}