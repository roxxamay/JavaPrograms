public class Main {
    public static void main(String[] args) {
        
        int count = 0 ;
        int sum = 0 ;

        for(int i=15 ; i<=1000 ; i++ ){

            if( (i%3==0) && (i%5==0) ){
                sum = sum + i ;
                count++ ;
                System.out.println("Found number " + i);
            }
            if (count == 5) {
                System.out.println("counter is " + count + " exiting loop....");
                break;
            }
        }
        System.out.println("sum is equal to " + sum);
        
    }
}
