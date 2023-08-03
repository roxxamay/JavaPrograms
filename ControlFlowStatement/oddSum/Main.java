class Main{
    public static void main(String arg[]){

        sum(5);

    }

    private static void sum(int number){

        int sum = 0 ;
        for(int i = 1 ; i <= number ; i++){
            if(i % 2==1){
                sum += i ;
                
            }
            
        }
        System.out.println("sum of " + number + " is " + sum );
        
    }
}