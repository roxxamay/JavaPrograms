
public class isPrime {
    public static void main(String[] args) {

        int count = 0 ;
        for(int i = 10 ; i<= 50 ;i++){
            if(is_prime(i)){
                count++;
                System.out.println("number " + i + " is prime number ");
            }
            if(count == 3){
                System.out.println("exiting from loop");
                break ;
            }
        }
        
    }

    public static boolean is_prime(int n){
        if(n==1){
            return false ;
        }

        for(int i = 2 ; i <= n/2 ; i ++){
            if(n % i == 0 ){
                return false ;
            }
        }

        return true ;

    }
}
