class CalcCube{
    static int cube(int x) {
        return x * x * x;
    }


}

public class Main {
    public static void main(String[] args) {
        int result = CalcCube.cube(5) ;
        System.out.println("result = " +result );
    }
}