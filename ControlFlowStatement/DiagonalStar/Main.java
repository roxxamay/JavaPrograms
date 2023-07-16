public class Main{
    public static void main(String[] args) {
        printSquareStar(7);
        printSquareStar(10);
        printSquareStar(11);
        printSquareStar(7);
        printSquareStar(8);

    }

    public static void printSquareStar(int number){
        if(number < 5 ){
            System.out.println("Invalid Value");
        }else{

            for(int i = 1 ; i <= number ; i++ ){
                for(int j  = 1 ; j <= number ; j++ ){
                    if(i == 1 || (i == number ) || (j == 1) || ( j== number )|| (i+1 == j+1) || (j-1== (number - (i)))){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
