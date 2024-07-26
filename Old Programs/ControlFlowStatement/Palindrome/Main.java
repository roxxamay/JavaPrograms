

public class Main {
    public static void main(String[] args) {

        checkPalindrome(121);
        
    }   
    
    private static void checkPalindrome(int number){
        int temp = number ;
        int sum = 0 ;
        int rem ;

        while(number > 0 ){
            rem = number % 10 ;

            sum = (sum * 10) + rem ;
            
            number /= 10 ;

        }

        if(temp == sum){
            System.out.println(temp + " is palindrome number");
        }
        else{
            System.out.println(temp + " is not palindrome ");
        }
    }
}
