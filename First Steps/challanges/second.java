public class second{
    public static void main(String[] args) {
        int score = 10000 ;
        int level = 8 ;
        int bonus = 200 ;
        boolean gameover = true ;
        int finalScore = 0;
        if(gameover){
           finalScore = score + (level * bonus) ;
           System.out.println(finalScore);
        }

        System.out.println(finalScore);
    }
}