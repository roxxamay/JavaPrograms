public class Operators {
    public static void main(String[] args) {
        //Answer the following question
        //what are operators? elobrate with examples.
        //what are operands ? elobrate with examples.
        //what are expression ? elobrate with examples.

        int result = 1 + 3 ;            // 1+3=4
        System.out.println("1 + 3 = " + result );
        int previousResult = result ;
        System.out.println("previousResult = " + previousResult );
        result = result - 1 ;
        System.out.println(" 3 - 1 = " + result );
        System.out.println("previousResult = " + result );

        result = result * 10 ;          // 2 * 10 = 20
        System.out.println("2 * 10 " + result );

        result = result / 5 ;
        System.out.println(" 20 / 5 = " +result);

        result = result % 3 ;
        System.out.println("4 % 3 = " + result );

        //abreviate version

        //result = result + 1 ;
        result++;               // 1 + 1
        System.out.println("result++ : " + result );

        //result = result - 1
        result-- ;
        System.out.println("result-- : " + result );

        //result = result + 2 ;
        result += 2 ;
         System.out.println("result+=2 : " + result);

        //result = result * 10 ;
        result *= 10 ;
        System.out.println("result *= 10 : " + result );

        //result = result / 3
        result /= 3 ;
        System.out.println("result /= 3 : " + result );

        //result =  result - 2 ;
        result -= 2 ;
        System.out.println("result -= 2 " + result );
        
    }
}
