public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20 ;
        int count= 0 ;

        while(number <= finishNumber)
        {
            
        
            number++;
            if(!IsEvenNumber(number)){
                
                continue ;
            }
            System.out.println("even number is " + number);

            count++;

            

            if (count >= 5) {
                break;
            }

        }
        System.out.println("counter is " + count);

    }

    private static boolean IsEvenNumber(int number){
        if(number % 2 == 0){
            return true ;
        }
        else {
            return false ;
        }
    }
}
